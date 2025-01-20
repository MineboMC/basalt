package net.minebo.basalt.servers.menu.sub

import net.minebo.basalt.models.server.UniqueServer
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.redis.cache.mutate.UpdateGlobalServerPacket
import net.minebo.basalt.redis.cache.refresh.RefreshServersPacket
import net.minebo.basalt.servers.menu.sub.menus.CheckPluginsMenu
import net.minebo.basalt.servers.menu.sub.menus.SelectRankMenu
import net.minebo.basalt.servers.packets.ServerShutdownPacket
import net.minebo.basalt.servers.packets.ServerWhitelistPacket
import net.minebo.basalt.service.server.UniqueServerService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.Menu
import net.minebo.basalt.util.menu.buttons.SimpleActionButton
import org.bukkit.Material
import org.bukkit.entity.Player

class ServerOptionsMenu(val player: Player, val server: UniqueServer) : Menu(player)
{

    init
    {
        staticSize = 27
        placeholder = true
    }

    override fun getButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()
        buttons[10] = SimpleActionButton(
            Material.ANVIL,
            mutableListOf(" ", Chat.format("&eClick to shut down the server!"), " "),
            Chat.format("&6Restart " + server.displayName),
            0
        ).setBody { player, i, clickType ->
            AsynchronousRedisSender.send(ServerShutdownPacket(server.id))
            player.sendMessage(Chat.format("&8[&eServer Monitor&8] &fSent remote shutdown request to " + server.id))
        }

        buttons[11] = SimpleActionButton(
            Material.PAPER,
            mutableListOf(" ", Chat.format("&eClick to view plugins of the server"), " "),
            Chat.format("&6List Plugins Of " + server.displayName),
            0
        ).setBody { player, i, clickType ->
            CheckPluginsMenu(player, server).updateMenu()
        }

        buttons[12] = SimpleActionButton(
            Material.LADDER,
            mutableListOf(" ", Chat.format("&eClick to whitelist this server!"), " "),
            Chat.format("&6Whitelist " + server.displayName),
            0
        ).setBody { player, i, clickType ->
            AsynchronousRedisSender.send(ServerWhitelistPacket(server.id))
            player.sendMessage(Chat.format("&8[&eServer Monitor&8] &fServer has been whitelisted forcefully"))
        }

        buttons[13] = SimpleActionButton(
            Material.REDSTONE,
            mutableListOf(" ", Chat.format("&eSet rank lock status of the server."), " "),
            Chat.format("&6Set Rank Lock Of " + server.displayName),
            0
        ).setBody { player, i, clickType ->
            val other = !server.lockedWithRank

            server.lockedWithRank = other
            UniqueServerService.save(server)

            AsynchronousRedisSender.send(UpdateGlobalServerPacket(server))
            AsynchronousRedisSender.send(RefreshServersPacket())

            if (other)
            {
                player.sendMessage(Chat.format("&8[&eServer Monitor&8] &fSet rank lock status of " + server.id + " to true"))
            } else
            {
                player.sendMessage(Chat.format("&8[&eServer Monitor&8] &fSet rank lock status of " + server.id + " to false"))
            }

        }

        buttons[14] = SimpleActionButton(
            Material.DIAMOND,
            mutableListOf(" ", Chat.format("&eSet minimum rank required to join the server."), " "),
            Chat.format("&6Set Min Lock Rank Of " + server.displayName),
            0
        ).setBody { player, i, clickType ->
            SelectRankMenu(player, server).updateMenu()
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Editing a Server!"
    }
}
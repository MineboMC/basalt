package net.minebo.basalt.servers.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.models.server.UniqueServer
import net.minebo.basalt.service.server.UniqueServerService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.NetworkUtil
import org.bukkit.entity.Player

object HubCommand : BaseCommand()
{

    @CommandAlias("hub|lobby")
    fun onHub(player: Player)
    {
        val selectedServer: UniqueServer?
        val available = BasaltSpigotPlugin.instance.config.getStringList("hubCommand.priorities")
            .mapNotNull { UniqueServerService.byId(it.lowercase()) }
            .filter { it.online }

        selectedServer = if (BasaltSpigotPlugin.instance.config.getBoolean("hubCommand.loadBalance"))
        {
            available
                .minByOrNull { it.players.size }
        } else
        {
            available.random()
        }

        if (selectedServer == null)
        {
            player.sendMessage(Chat.format("&cUnable to connect you to a hub at this time!"))
            return
        }

        NetworkUtil.send(player, selectedServer.bungeeName)
        player.sendMessage(
            Chat.format(
                BasaltSpigotPlugin.instance.config.getString("hubCommand.connectedMessage")
                    !!.replace("{hub}", selectedServer.displayName)
            )
        )
    }
}
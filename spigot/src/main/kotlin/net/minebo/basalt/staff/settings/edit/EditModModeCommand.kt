package net.minebo.basalt.staff.settings.edit

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandCompletion
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import co.aikar.commands.bukkit.contexts.OnlinePlayer
import net.minebo.basalt.redis.RedisPacketManager
import net.minebo.basalt.serialize.type.ItemStackAdapter
import net.minebo.basalt.staff.settings.edit.menu.EditModModeMenu
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player

class EditModModeCommand : BaseCommand()
{

    @CommandAlias("editmodmode")
    @CommandPermission("basalt.staffmode")
    fun editmodMode(player: Player)
    {
        EditModModeMenu(player).openMenu()
        player.sendMessage(Chat.format("&eYou are now editing your &amod mode"))
        player.sendMessage(Chat.format("&7&oTo save any changes, execute /savemodmode"))
    }


    @CommandAlias("savemodmode")
    @CommandPermission("basalt.staffmode")
    fun savemodmode(player: Player)
    {
        RedisPacketManager.pool.resource.use {
            it.hset(
                "Basalt:ModMode:",
                player.uniqueId.toString(),
                ItemStackAdapter.itemStackArrayToBase64(player.inventory.contents)
            )
        }

        player.sendMessage(Chat.format("&eYou have updated your &amod mode"))
    }

    @CommandAlias("wipemodmode")
    @CommandPermission("basalt.staffmode.admin")
    @CommandCompletion("@players")
    fun wipeModMode(player: Player, @Name("target") target: OnlinePlayer)
    {
        RedisPacketManager.pool.resource.use {
            it.hdel("Basalt:ModMode:", target.player.uniqueId.toString())
        }

        player.sendMessage(Chat.format("&eYou have wiped ${target.player.displayName}&e's &amod mode"))
    }
}
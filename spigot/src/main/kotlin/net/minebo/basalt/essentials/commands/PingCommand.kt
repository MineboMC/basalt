package net.minebo.basalt.essentials.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import co.aikar.commands.annotation.Optional
import co.aikar.commands.bukkit.contexts.OnlinePlayer
import net.minebo.basalt.util.Chat
import org.bukkit.ChatColor
import org.bukkit.entity.Player

class PingCommand : BaseCommand()
{

    @CommandAlias("ping")
    fun ping(player: Player, @Name("target") @Optional target: OnlinePlayer?)
    {
        if (target != null)
        {
            player.sendMessage(Chat.format(target.getPlayer().displayName + "&e's Ping: " + getPingColor(getPlayerPing(target.player)) + getPlayerPing(target.player) + "ms"))
            return
        }

        player.sendMessage(Chat.format("&eYour Ping: " + getPingColor(getPlayerPing(player)) + getPlayerPing(player) + "ms"))
    }

    fun getPingColor(ping: Int): ChatColor {
        return when {
            ping < 50 -> ChatColor.GREEN // Excellent ping
            ping < 150 -> ChatColor.YELLOW // Good ping
            ping < 300 -> ChatColor.GOLD // Average ping
            ping < 500 -> ChatColor.RED // Poor ping
            else -> ChatColor.DARK_RED // Very poor ping
        }
    }

    fun getPlayerPing(player: Player): Int {
        return try {
            val handle = player.javaClass.getMethod("getHandle").invoke(player)
            val pingField = handle.javaClass.getField("ping")
            pingField.getInt(handle)
        } catch (e: Exception) {
            e.printStackTrace()
            -1 // Return -1 if the ping couldn't be fetched
        }
    }

}
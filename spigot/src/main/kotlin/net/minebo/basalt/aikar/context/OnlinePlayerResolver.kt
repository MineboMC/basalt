package net.minebo.basalt.aikar.context

import co.aikar.commands.BukkitCommandExecutionContext
import co.aikar.commands.InvalidCommandArgument
import co.aikar.commands.bukkit.contexts.OnlinePlayer
import co.aikar.commands.contexts.ContextResolver
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.entity.Player

class OnlinePlayerResolver : ContextResolver<OnlinePlayer, BukkitCommandExecutionContext> {
    override fun getContext(c: BukkitCommandExecutionContext): OnlinePlayer {
        val target: Player? = Bukkit.getPlayerExact(c.popFirstArg())
        if (target != null) {
            // Always return OnlinePlayer regardless of vanish
            if (!target.hasMetadata("vanished")) {
                return OnlinePlayer(target)
            }
            throw InvalidCommandArgument("${ChatColor.RED}${c.popFirstArg()} is not online.") // Vanished
        }

        throw InvalidCommandArgument("${ChatColor.RED}${c.popFirstArg()} is not online.")
    }
}
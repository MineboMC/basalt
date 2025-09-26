package net.minebo.basalt.commands

import net.minebo.basalt.motd.MotdManager
import net.minebo.basalt.motd.MotdType
import net.minebo.basalt.util.ColorUtil
import net.md_5.bungee.api.ChatColor
import net.md_5.bungee.api.chat.TextComponent
import net.md_5.bungee.api.CommandSender
import net.md_5.bungee.api.plugin.Command

class MotdCommand : Command("motd") {

    override fun execute(sender: CommandSender, args: Array<out String>) {
        if (!sender.hasPermission("basalt.admin")) {
            sender.sendMessage(TextComponent("${ChatColor.RED}No permission."))
            return
        }

        if (args.isEmpty()) {
            sendUsage(sender)
            return
        }

        when (args[0].lowercase()) {
            "view" -> {
                if (args.size < 2) {
                    sender.sendMessage(TextComponent("${ChatColor.RED}Usage: /motd view <normal|whitelist>"))
                    return
                }
                val type = parseType(args[1]) ?: run {
                    sender.sendMessage(TextComponent("${ChatColor.RED}Unknown motd type: ${args[1]}"))
                    return
                }
                val motd = MotdManager.getMotdString(type)
                sender.sendMessage(TextComponent("${ChatColor.YELLOW}${type.name.lowercase().replaceFirstChar { it.uppercase() }} MOTD is set to: ${ChatColor.WHITE}\"${motd}${ChatColor.WHITE}\""))
            }
            "setline" -> {
                if (args.size < 4) {
                    sender.sendMessage(TextComponent("${ChatColor.RED}Usage: /motd setLine <normal|whitelist> <1|2> <text>"))
                    return
                }
                val type = parseType(args[1]) ?: run {
                    sender.sendMessage(TextComponent("${ChatColor.RED}Unknown motd type: ${args[1]}"))
                    return
                }
                val line = args[2].toIntOrNull()
                if (line == null || line !in 1..2) {
                    sender.sendMessage(TextComponent("${ChatColor.RED}Line must be 1 or 2."))
                    return
                }
                val text = args.drop(3).joinToString(" ")
                MotdManager.setLine(type, line, text)
                sender.sendMessage(TextComponent("${ChatColor.YELLOW}Set line ${ChatColor.WHITE}$line ${ChatColor.YELLOW}of ${ChatColor.WHITE}${type.name.lowercase()} ${ChatColor.YELLOW}to: ${ChatColor.WHITE}\"${ColorUtil.translate(text)}${ChatColor.WHITE}\""))
            }
            else -> sendUsage(sender)
        }
    }

    private fun parseType(input: String): MotdType? = when (input.lowercase()) {
        "normal" -> MotdType.NORMAL
        "whitelist" -> MotdType.WHITELIST
        else -> null
    }

    private fun sendUsage(sender: CommandSender) {
        sender.sendMessage(TextComponent("${ChatColor.YELLOW}MOTD commands:"))
        sender.sendMessage(TextComponent("${ChatColor.GRAY}/motd view <normal|whitelist> ${ChatColor.DARK_GRAY}- ${ChatColor.WHITE}View the MOTD"))
        sender.sendMessage(TextComponent("${ChatColor.GRAY}/motd setLine <normal|whitelist> <1|2> <text> ${ChatColor.DARK_GRAY}- ${ChatColor.WHITE}Set a line"))
    }
}
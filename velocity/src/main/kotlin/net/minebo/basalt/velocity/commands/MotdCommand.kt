package net.minebo.basalt.velocity.commands

import com.velocitypowered.api.command.SimpleCommand
import net.minebo.basalt.velocity.motd.MotdManager
import net.minebo.basalt.velocity.motd.MotdType
import net.minebo.basalt.velocity.util.ColorUtil

class MotdCommand : SimpleCommand {

    override fun execute(invocation: SimpleCommand.Invocation) {
        val source = invocation.source()
        val args = invocation.arguments()

        if (!source.hasPermission("basalt.admin")) {
            source.sendMessage(ColorUtil.translate("&cNo permission."))
            return
        }

        if (args.isEmpty()) {
            sendUsage(source)
            return
        }

        when (args[0].lowercase()) {
            "view" -> {
                if (args.size < 2) {
                    source.sendMessage(ColorUtil.translate("&cUsage: /motd view <normal|whitelist>"))
                    return
                }
                val type = parseType(args[1]) ?: run {
                    source.sendMessage(ColorUtil.translate("&cUnknown motd type: ${args[1]}"))
                    return
                }
                val motd = MotdManager.getMotdComponent(type)
                source.sendMessage(ColorUtil.translate("&e${type.name.lowercase().replaceFirstChar { it.uppercase() }} MOTD is set to:"))
                source.sendMessage(motd)
            }
            "setline" -> {
                if (args.size < 4) {
                    source.sendMessage(ColorUtil.translate("&cUsage: /motd setLine <normal|whitelist> <1|2> <text>"))
                    return
                }
                val type = parseType(args[1]) ?: run {
                    source.sendMessage(ColorUtil.translate("&cUnknown motd type: ${args[1]}"))
                    return
                }
                val line = args[2].toIntOrNull()
                if (line == null || line !in 1..2) {
                    source.sendMessage(ColorUtil.translate("&cLine must be 1 or 2."))
                    return
                }
                val text = args.drop(3).joinToString(" ")
                MotdManager.setLine(type, line, text)
                source.sendMessage(ColorUtil.translate("&eSet line &f$line&e of &f${type.name.lowercase()}&e to:"))
                source.sendMessage(ColorUtil.translate(text))
            }
            else -> sendUsage(source)
        }
    }

    private fun parseType(input: String): MotdType? = when (input.lowercase()) {
        "normal" -> MotdType.NORMAL
        "whitelist" -> MotdType.WHITELIST
        else -> null
    }

    private fun sendUsage(source: com.velocitypowered.api.command.CommandSource) {
        source.sendMessage(ColorUtil.translate("&eMOTD commands:"))
        source.sendMessage(ColorUtil.translate("&7/motd view <normal|whitelist> &8- &fView the MOTD"))
        source.sendMessage(ColorUtil.translate("&7/motd setLine <normal|whitelist> <1|2> <text> &8- &fSet a line"))
    }
}
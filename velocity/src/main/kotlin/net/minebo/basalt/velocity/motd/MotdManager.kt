package net.minebo.basalt.velocity.motd

import net.minebo.basalt.velocity.BasaltVelocityPlugin
import net.minebo.basalt.velocity.util.ColorUtil
import net.kyori.adventure.text.Component

object MotdManager {

    fun getMotdComponent(type: MotdType): Component {
        val cfg = BasaltVelocityPlugin.instance.configuration
        val lines: List<String> = when (type) {
            MotdType.NORMAL -> cfg.motd.normal
            MotdType.WHITELIST -> cfg.motd.whitelist
        }.ifEmpty { listOf("&eWelcome!", "&7Have fun.") }

        return ColorUtil.translate(lines)
    }

    fun setLine(type: MotdType, lineIndex1Based: Int, text: String): Boolean {
        if (lineIndex1Based !in 1..2) return false

        val plugin = BasaltVelocityPlugin.instance
        val current = plugin.configuration

        val updatedLines = when (type) {
            MotdType.NORMAL -> current.motd.normal.toMutableList()
            MotdType.WHITELIST -> current.motd.whitelist.toMutableList()
        }.apply {
            while (size < 2) add("")
            this[lineIndex1Based - 1] = text
        }.toList()

        val newMotd = when (type) {
            MotdType.NORMAL -> current.motd.copy(normal = updatedLines)
            MotdType.WHITELIST -> current.motd.copy(whitelist = updatedLines)
        }

        plugin.configuration = current.copy(motd = newMotd)
        plugin.saveConfig()
        return true
    }
}
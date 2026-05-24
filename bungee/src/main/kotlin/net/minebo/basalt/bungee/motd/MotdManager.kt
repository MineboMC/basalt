package net.minebo.basalt.bungee.motd

import net.minebo.basalt.bungee.BasaltBungeePlugin
import net.minebo.basalt.bungee.util.ColorUtil

object MotdManager {

    private const val KEY_MOTD_NORMAL = "motd.normal"
    private const val KEY_MOTD_WHITELIST = "motd.whitelist"

    fun getMotdString(type: MotdType): String {
        val cfg = BasaltBungeePlugin.instance.configuration
        val lines: List<String> = when (type) {
            MotdType.NORMAL -> cfg.getStringList(KEY_MOTD_NORMAL)
            MotdType.WHITELIST -> cfg.getStringList(KEY_MOTD_WHITELIST)
        }.ifEmpty { listOf("&eWelcome!", "&7Have fun.") }

        return lines.joinToString("\n") { ColorUtil.translate(it) }
    }

    fun setLine(type: MotdType, lineIndex1Based: Int, text: String): Boolean {
        if (lineIndex1Based !in 1..2) return false
        val key = when (type) {
            MotdType.NORMAL -> KEY_MOTD_NORMAL
            MotdType.WHITELIST -> KEY_MOTD_WHITELIST
        }
        val cfg = BasaltBungeePlugin.instance.configuration
        val list = cfg.getStringList(key).toMutableList()
        while (list.size < 2) list.add("")
        list[lineIndex1Based - 1] = text
        cfg.set(key, list)
        BasaltBungeePlugin.instance.saveConfig()
        return true
    }
}
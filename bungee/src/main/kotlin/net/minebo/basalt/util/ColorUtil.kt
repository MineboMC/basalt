package net.minebo.basalt.util

import net.md_5.bungee.api.ChatColor

object ColorUtil {
    private val hexPattern = Regex("(?i)#[0-9a-f]{6}")
    private val spigotHexPattern = Regex("(?i)&x((&[0-9a-f]){6})")

    fun translate(input: String): String {
        // Convert Spigot-style &x&F&F&F&F&F&F into #FFFFFF
        var out = spigotHexPattern.replace(input) { match ->
            val hex = match.groupValues[1].replace("&", "")
            "#$hex"
        }

        // Handle legacy color codes (&a, &l, etc.)
        out = ChatColor.translateAlternateColorCodes('&', out)

        // Handle real hex (#FFFFFF)
        out = hexPattern.replace(out) { match ->
            ChatColor.of(match.value).toString()
        }

        return out
    }
}

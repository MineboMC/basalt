package net.minebo.basalt.velocity.util

import net.kyori.adventure.text.Component
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer

object ColorUtil {
    private val spigotHexPattern = Regex("(?i)&x((&[0-9a-f]){6})")

    private val legacy = LegacyComponentSerializer.builder()
        .character('&')
        .hexColors()
        .build()

    fun translate(input: String): Component {
        val out = spigotHexPattern.replace(input) { match ->
            val hex = match.groupValues[1].replace("&", "")
            "#$hex"
        }
        return legacy.deserialize(out)
    }

    fun translate(input: List<String>): Component {
        return translate(input.joinToString("\n"))
    }

    fun translateToLegacyString(input: String): String {
        return legacy.serialize(translate(input))
    }
}
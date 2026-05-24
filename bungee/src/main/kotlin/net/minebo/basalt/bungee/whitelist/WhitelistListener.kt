package net.minebo.basalt.bungee.whitelist

import net.minebo.basalt.bungee.util.ColorUtil
import net.md_5.bungee.api.chat.TextComponent
import net.md_5.bungee.api.event.LoginEvent
import net.md_5.bungee.api.plugin.Listener
import net.md_5.bungee.event.EventHandler

class WhitelistListener : Listener {

    @EventHandler
    fun onLogin(event: LoginEvent) {
        if (!WhitelistManager.enabled) return

        val uuid = event.connection.uniqueId ?: return

        if (!WhitelistManager.isWhitelisted(uuid)) {
            val reason = WhitelistManager.kickMessage.joinToString("\n") { ColorUtil.translate(it) }
            event.isCancelled = true
            event.setCancelReason(TextComponent(reason))
        }
    }
}
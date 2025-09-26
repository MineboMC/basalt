package net.minebo.basalt.motd

import net.md_5.bungee.api.ServerPing
import net.md_5.bungee.api.chat.BaseComponent
import net.minebo.basalt.whitelist.WhitelistManager
import net.md_5.bungee.api.chat.TextComponent
import net.md_5.bungee.api.connection.Server
import net.md_5.bungee.api.event.ProxyPingEvent
import net.md_5.bungee.api.plugin.Listener
import net.md_5.bungee.event.EventHandler

class MotdListener : Listener {

    @EventHandler
    fun onPing(event: ProxyPingEvent) {
        val type = if (WhitelistManager.enabled) MotdType.WHITELIST else MotdType.NORMAL
        val motd = MotdManager.getMotdString(type)

        val components: Array<BaseComponent> = TextComponent.fromLegacyText(motd)
        event.response.descriptionComponent = TextComponent(*components)
        event.response.version = if (WhitelistManager.enabled) ServerPing.Protocol("Whitelisted", 27875731) else ServerPing.Protocol("Minebo 1.21.8", 772)
    }

}
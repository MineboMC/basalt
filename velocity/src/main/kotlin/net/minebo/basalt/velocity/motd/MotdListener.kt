package net.minebo.basalt.velocity.motd

import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyPingEvent
import net.minebo.basalt.velocity.whitelist.WhitelistManager

class MotdListener {

    @Subscribe
    fun onPing(event: ProxyPingEvent) {
        val type = if (WhitelistManager.enabled) MotdType.WHITELIST else MotdType.NORMAL

        val builder = event.ping.asBuilder()
        builder.description(MotdManager.getMotdComponent(type))

        builder.version(
            if (WhitelistManager.enabled)
                com.velocitypowered.api.network.ProtocolVersion.UNKNOWN.let {
                    com.velocitypowered.api.proxy.server.ServerPing.Version(27875731, "Whitelisted")
                }
            else
                com.velocitypowered.api.proxy.server.ServerPing.Version(772, "Minebo 1.21.8")
        )

        event.ping = builder.build()
    }
}
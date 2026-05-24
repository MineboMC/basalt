package net.minebo.basalt.bungee.listeners

import net.md_5.bungee.api.ChatColor
import net.minebo.basalt.bungee.BasaltBungeePlugin
import net.minebo.basalt.service.expirable.RankGrantService
import net.minebo.basalt.service.profiles.ProfileGameService
import net.md_5.bungee.api.chat.TextComponent
import net.md_5.bungee.api.event.LoginEvent
import net.md_5.bungee.api.event.PlayerDisconnectEvent
import net.md_5.bungee.api.event.ServerConnectEvent
import net.md_5.bungee.api.event.ServerSwitchEvent
import net.md_5.bungee.api.plugin.Listener
import net.md_5.bungee.event.EventHandler
import java.util.concurrent.TimeUnit
import kotlin.collections.iterator

class BungeeListener : Listener {

    private fun sendStaffMessage(message: String) {
        for (player in BasaltBungeePlugin.instance.proxy.players) {
            val profile = ProfileGameService.byId(player.uniqueId) ?: continue
            val rank = profile.getHighestGlobalRank() ?: continue

            if (rank.staff) {
                player.sendMessage(TextComponent(message))
            }
        }
    }

    @EventHandler
    fun switch(event: ServerSwitchEvent) {
        val player = event.player.uniqueId

        val playerRank = ProfileGameService.byId(player)?.getHighestGlobalRank() ?: return
        BasaltBungeePlugin.instance.proxy.scheduler.schedule(BasaltBungeePlugin.instance, {
            if (playerRank.staff && event.from != null) {
                sendStaffMessage("${ChatColor.AQUA}[S] ${ChatColor.RESET}${ChatColor.translateAlternateColorCodes('&', playerRank.color)}${event.player.name} ${ChatColor.DARK_AQUA}joined ${ChatColor.AQUA}${event.player.server.info.name} ${ChatColor.DARK_AQUA}from ${ChatColor.AQUA}${event.from.name}")
            }
        }, 100L, TimeUnit.MILLISECONDS)
    }

    @EventHandler
    fun handlePermissions(event: ServerConnectEvent) {
        val profile = ProfileGameService.byId(event.player.uniqueId) ?: return

        for ((a, b) in profile.getPermissionsExclusivelyGlobal()) {
            if (!b) {
                event.player.setPermission(a, true)
            }
        }
    }

    @EventHandler
    fun login(event: LoginEvent) {
        val player = event.connection.uniqueId

        val playerRank = ProfileGameService.byId(player)?.getHighestGlobalRank() ?: return

        BasaltBungeePlugin.instance.proxy.scheduler.schedule(BasaltBungeePlugin.instance, {
            if (playerRank.staff) {
                sendStaffMessage("${ChatColor.AQUA}[S] ${ChatColor.RESET}${ChatColor.translateAlternateColorCodes('&', playerRank.color)}${event.connection.name} ${ChatColor.DARK_AQUA}connected to the network.")
            }
        }, 100L, TimeUnit.MILLISECONDS)
    }

    @EventHandler
    fun dc(event: PlayerDisconnectEvent) {
        val player = event.player

        val profile = ProfileGameService.byId(player.uniqueId) ?: return

        // false fire
        if (player.isConnected) return

        RankGrantService.recalculatePlayer(profile)

        val playerRank = profile.getHighestGlobalRank()

        BasaltBungeePlugin.instance.proxy.scheduler.schedule(BasaltBungeePlugin.instance, {
            if (playerRank.staff) {
                sendStaffMessage("${ChatColor.AQUA}[S] ${ChatColor.RESET}${ChatColor.translateAlternateColorCodes('&', playerRank.color)}${player.name} ${ChatColor.DARK_AQUA}left the network.")
            }
        }, 100L, TimeUnit.SECONDS)
    }
}

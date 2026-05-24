package net.minebo.basalt.velocity.listeners

import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.connection.DisconnectEvent
import com.velocitypowered.api.event.connection.LoginEvent
import com.velocitypowered.api.event.player.ServerConnectedEvent
import com.velocitypowered.api.proxy.Player
import net.kyori.adventure.text.Component
import net.minebo.basalt.velocity.BasaltVelocityPlugin
import net.minebo.basalt.service.expirable.RankGrantService
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.velocity.util.ColorUtil
import java.util.concurrent.TimeUnit

class VelocityListener {

    private fun sendStaffMessage(message: Component) {
        for (player in BasaltVelocityPlugin.instance.proxy.allPlayers) {
            val profile = ProfileGameService.byId(player.uniqueId) ?: continue
            val rank = profile.getHighestGlobalRank() ?: continue
            if (rank.staff) {
                player.sendMessage(message)
            }
        }
    }

    @Subscribe
    fun onServerConnected(event: ServerConnectedEvent) {
        val player: Player = event.player
        val uuid = player.uniqueId

        val playerRank = ProfileGameService.byId(uuid)?.getHighestGlobalRank() ?: return

        BasaltVelocityPlugin.instance.proxy.scheduler.buildTask(BasaltVelocityPlugin.instance) {
            if (!playerRank.staff) return@buildTask

            val previous = event.previousServer.orElse(null) ?: return@buildTask
            val current = player.currentServer.orElse(null) ?: return@buildTask

            val msg = "&b[S] &r${playerRank.color}${player.username} &3joined &b${current.serverInfo.name} &3from &b${previous.serverInfo.name}"
            sendStaffMessage(ColorUtil.translate(msg))
        }.delay(100, TimeUnit.MILLISECONDS).schedule()
    }

    @Subscribe
    fun onLogin(event: LoginEvent) {
        val player = event.player
        val uuid = player.uniqueId

        val playerRank = ProfileGameService.byId(uuid)?.getHighestGlobalRank() ?: return

        BasaltVelocityPlugin.instance.proxy.scheduler.buildTask(BasaltVelocityPlugin.instance) {
            if (!playerRank.staff) return@buildTask
            val msg = "&b[S] &r${playerRank.color}${player.username} &3connected to the network."
            sendStaffMessage(ColorUtil.translate(msg))
        }.delay(100, TimeUnit.MILLISECONDS).schedule()
    }

    @Subscribe
    fun onDisconnect(event: DisconnectEvent) {
        val player = event.player
        val profile = ProfileGameService.byId(player.uniqueId) ?: return

        RankGrantService.recalculatePlayer(profile)

        val playerRank = profile.getHighestGlobalRank() ?: return

        BasaltVelocityPlugin.instance.proxy.scheduler.buildTask(BasaltVelocityPlugin.instance) {
            if (!playerRank.staff) return@buildTask
            val msg = "&b[S] &r${playerRank.color}${player.username} &3left the network."
            sendStaffMessage(ColorUtil.translate(msg))
        }.delay(100, TimeUnit.MILLISECONDS).schedule()
    }
}
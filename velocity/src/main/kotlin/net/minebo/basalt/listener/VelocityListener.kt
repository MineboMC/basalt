package net.minebo.basalt.listener

import com.velocitypowered.api.event.Continuation
import com.velocitypowered.api.event.PostOrder
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.connection.DisconnectEvent
import com.velocitypowered.api.event.connection.LoginEvent
import com.velocitypowered.api.event.connection.PostLoginEvent
import com.velocitypowered.api.event.permission.PermissionsSetupEvent
import com.velocitypowered.api.event.player.ServerConnectedEvent
import com.velocitypowered.api.proxy.Player
import net.minebo.basalt.BasaltVelocity
import net.minebo.basalt.lockdown.LockdownManager
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.packets.StaffMessagePacket
import net.minebo.basalt.permission.BasaltPermissionProvider
import net.minebo.basalt.service.expirable.RankGrantService
import net.minebo.basalt.service.profiles.ProfileGameService
import org.checkerframework.checker.units.qual.A
import java.util.concurrent.CompletableFuture
import java.util.concurrent.TimeUnit

class VelocityListener(private val plugin: BasaltVelocity) {

    @Subscribe
    fun onSwitch(event: ServerConnectedEvent, continuation: Continuation) {
        val player = event.player.uniqueId

        CompletableFuture.runAsync {
            val playerRank = ProfileGameService.byId(player)?.getHighestGlobalRank() ?: run {
                continuation.resume()
                return@runAsync
            }

            plugin.server.scheduler.buildTask(plugin) {
                if (playerRank.staff && event.previousServer.isPresent) {
                    StaffMessagePacket("&b[S] &r" + playerRank.color + event.player.username + " &3joined &b" + event.server.serverInfo.name + " &3from &b" + event.previousServer.get().serverInfo.name).action()
                }
            }.delay(100, TimeUnit.MILLISECONDS).schedule()

            continuation.resume()
        }
    }

    @Subscribe
    fun setupPermissions(event: PermissionsSetupEvent, continuation: Continuation) {
        if (event.subject !is Player) {
            continuation.resume()
            return
        }

        val player = event.subject as Player

        CompletableFuture.runAsync {
            val profile = ProfileGameService.byId(player.uniqueId) ?: run {
                continuation.resume()
                return@runAsync
            }

            event.provider = BasaltPermissionProvider(player, profile)
            continuation.resume()
        }
    }

    @Subscribe
    fun login(event: PostLoginEvent, continuation: Continuation) {
        val player = event.player

        CompletableFuture.runAsync {
            val playerRank = ProfileGameService.byId(player.uniqueId)?.getHighestGlobalRank() ?: run {
                continuation.resume()
                return@runAsync
            }

            plugin.server.scheduler.buildTask(plugin) {
                if (playerRank.staff) {
                    StaffMessagePacket("&b[S] &r" + playerRank.color + player.username + " &3connected to the network").action()
                }
            }.delay(100, TimeUnit.MILLISECONDS).schedule()

            continuation.resume()
        }
    }

    @Subscribe(order = PostOrder.LAST)
    fun dc(event: DisconnectEvent, continuation: Continuation) {
        val player = event.player

        CompletableFuture.runAsync {
            val profile = ProfileGameService.byId(player.uniqueId) ?: run {
                continuation.resume()
                return@runAsync
            }

            //false fire
            if (plugin.server.getPlayer(player.uniqueId).isPresent) {
                continuation.resume()
                return@runAsync
            }

            RankGrantService.recalculatePlayer(profile)

            val playerRank = profile.getHighestGlobalRank()

            plugin.server.scheduler.buildTask(plugin) {
                if (playerRank.staff) {
                    StaffMessagePacket("&b[S] &r" + playerRank.color + player.username + " &3left the network").action()
                }
            }.delay(100, TimeUnit.SECONDS).schedule()
            continuation.resume()
        }
    }

    @Subscribe(order = PostOrder.FIRST)
    fun checkClearance(event: PostLoginEvent, continuation: Continuation) {
        CompletableFuture.runAsync {
            if (LockdownManager.serverIsOnLockdown()) {
                if (LockdownManager.hasClearance(event.player)) {
                    StaffMessagePacket("&b✓ &a" + event.player.username + " has clearance for " + event.player.currentServer.get().serverInfo.name).action()
                } else {
                    event.player.disconnect(BasaltVelocity.color("&cServer is on lockdown and you do not have clearance!"))
                }
            }
            continuation.resume()
        }
    }


}
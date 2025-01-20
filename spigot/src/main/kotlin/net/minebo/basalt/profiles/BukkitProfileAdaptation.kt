package net.minebo.basalt.profiles

import net.minebo.basalt.models.grant.types.RankGrant
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.profiles.connection.postlog.BukkitPostLoginConnection
import net.minebo.basalt.profiles.connection.prelog.BukkitPreLoginConnection
import net.minebo.basalt.profiles.permissions.packet.PermissionUpdatePacket
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.redis.cache.mutate.UpdateGrantCacheRequest
import net.minebo.basalt.service.expirable.RankGrantService
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.util.SHA
import org.bukkit.entity.Player
import java.util.*
import java.util.concurrent.TimeUnit

/**
 * Class created on 5/27/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object BukkitProfileAdaptation
{

    val backingCacheIpStore = mutableMapOf<UUID, String?>()

    fun loadAllEvents()
    {

        for (task in BukkitPreLoginConnection.getAllTasks())
        {
            if (!task.shouldBeLazy())
            {
                BukkitPreLoginConnection.registerNewCallback {
                    task.run(it)
                }
            } else BukkitPreLoginConnection.registerNewLazyCallback { task.run(it) }
        }

        for (task in BukkitPostLoginConnection.getAllTasks())
        {
            BukkitPostLoginConnection.registerNewCallback {
                task.run(it)
            }
        }
    }

    fun initializeGrant(rankGrant: RankGrant, uuid: UUID)
    {
        RankGrantService.save(rankGrant).whenComplete { g, e ->
            val profile = ProfileGameService.byId(uuid) ?: return@whenComplete

            AsynchronousRedisSender.send(PermissionUpdatePacket(profile.uuid))
            AsynchronousRedisSender.send(UpdateGrantCacheRequest(profile.uuid))
        }
    }

    fun playerNeedsAuthenticating(
        profile: GameProfile, player: Player
    ): Boolean
    {
        val rank = profile.getCurrentRank()

        if (rank.staff)
        {
            val auth = profile.getAuthStatus()

            //player isnt bypassed and player doesnt have 2fa
            if (!auth.authBypassed && !auth.hasSetup2fa)
            {
                return true
            }

            if (auth.authBypassed) return false

            //player has 2fa but it's been 3 days since last verification
            if (auth.hasSetup2fa && System.currentTimeMillis()
                    .minus(auth.lastAuthenticated) >= TimeUnit.DAYS.toMillis(3L)
            )
            {
                return true
            }

            val hexIp = if (backingCacheIpStore.containsKey(player.uniqueId))
            {
                backingCacheIpStore[player.uniqueId]
            } else
            {
                val item = SHA.toHexString(player.address.hostString)
                backingCacheIpStore[player.uniqueId] = item

                item
            }

            //player has 2fa but ip's dont match
            if (auth.hasSetup2fa && !auth.allowedIps.contains(hexIp))
            {
                return true
            }
        }

        return false
    }
}
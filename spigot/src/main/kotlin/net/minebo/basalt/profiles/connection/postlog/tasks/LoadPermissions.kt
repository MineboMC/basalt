package net.minebo.basalt.profiles.connection.postlog.tasks

import net.minebo.basalt.metric.Metric
import net.minebo.basalt.metric.MetricService
import net.minebo.basalt.profiles.connection.postlog.BukkitPostLoginTask
import net.minebo.basalt.profiles.permissions.AccessiblePermissionHandler
import net.minebo.basalt.service.profiles.ProfileGameService
import org.bukkit.entity.Player
import java.util.concurrent.CompletableFuture

/**
 * Class created on 7/20/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object LoadPermissions : BukkitPostLoginTask
{

    override fun run(player: Player)
    {
        val profile = ProfileGameService.byId(player.uniqueId) ?: return

        val startPerms = System.currentTimeMillis()
        CompletableFuture.runAsync {
            AccessiblePermissionHandler.update(player, profile.getPermissions())
        }

        MetricService.addMetric(
            "Permission Handler",
            Metric("Permission Handler", System.currentTimeMillis().minus(startPerms), System.currentTimeMillis())
        )
    }
}

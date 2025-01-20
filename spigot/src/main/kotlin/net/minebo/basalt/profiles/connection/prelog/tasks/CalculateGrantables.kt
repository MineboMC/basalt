package net.minebo.basalt.profiles.connection.prelog.tasks

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.metric.Metric
import net.minebo.basalt.metric.MetricService
import net.minebo.basalt.profiles.connection.prelog.BukkitPreLoginTask
import net.minebo.basalt.service.expirable.PunishmentService
import net.minebo.basalt.service.expirable.RankGrantService
import org.bukkit.event.player.AsyncPlayerPreLoginEvent

/**
 * Class created on 7/20/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object CalculateGrantables : BukkitPreLoginTask
{

    override fun run(event: AsyncPlayerPreLoginEvent)
    {
        val profileId = event.uniqueId
        val profile = BasaltAPI.syncFindProfile(profileId) ?: return

        val startGrants = System.currentTimeMillis()
        RankGrantService.recalculatePlayerSync(profile)
        MetricService.addMetric(
            "Grants Service",
            Metric("Grants Service", System.currentTimeMillis().minus(startGrants), System.currentTimeMillis())
        )

        val startPunishments = System.currentTimeMillis()
        PunishmentService.recalculatePlayerSync(profile)
        MetricService.addMetric(
            "Punishment Service",
            Metric("Punishment Service", System.currentTimeMillis().minus(startPunishments), System.currentTimeMillis())
        )
    }

    override fun shouldBeLazy(): Boolean
    {
        return false
    }
}
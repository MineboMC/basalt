package net.minebo.basalt.filter.listener

import net.minebo.basalt.Basalt
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.filter.packet.FilterBroadcastWithTooltipPacket
import net.minebo.basalt.models.grant.types.Punishment
import net.minebo.basalt.punishment.BukkitPunishmentFunctions
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.punishments.actor.ActorType
import net.minebo.basalt.punishments.actor.DefaultActor
import net.minebo.basalt.punishments.actor.executor.Executor
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.service.filter.FilterService
import net.minebo.basalt.util.TimeUtil
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent
import java.util.*

object FilterListener : Listener
{

    @EventHandler
    fun chat(event: AsyncPlayerChatEvent)
    {
        val filter = FilterService.findInMessage(event.message)
        val player = event.player

        if (filter == null) return

        event.isCancelled = true

        if (filter.staffExempt)
        {
            val perm = filter.exemptPermission

            if (event.player.hasPermission(perm))
            {
                return
            }
        }

        if (filter.shouldPunish)
        {
            val type = filter.punishmentType

            val punishment = Punishment(
                type.name, UUID.randomUUID().toString().substring(0, 4),
                mutableListOf(),
                player.uniqueId,
                UUID.fromString("00000000-0000-0000-0000-000000000000"),
                "Automated Filter Punishment",
                TimeUtil.parseTime(filter.duration) * 1000L,
                DefaultActor(Executor.CONSOLE, ActorType.GAME)
            )

            BukkitPunishmentFunctions.dispatch(punishment, true)
        }

        val uniqueServer = Basalt.globalServer
        val profile = BasaltAPI.syncFindProfile(player.uniqueId) ?: return

        AsynchronousRedisSender.send(
            FilterBroadcastWithTooltipPacket(
                uniqueServer,
                player.uniqueId,
                profile.getPunishments(PunishmentType.MUTE).size,
                profile.getPunishments(PunishmentType.BAN).size,
                filter.shouldPunish,
                event.message
            )
        )
    }
}
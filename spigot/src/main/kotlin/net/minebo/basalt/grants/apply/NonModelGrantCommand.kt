package net.minebo.basalt.grants.apply

/**
 * Class created on 6/13/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.models.grant.types.RankGrant
import net.minebo.basalt.models.grant.types.scope.GrantScope
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.packets.GrantMessageTargetPacket
import net.minebo.basalt.packets.StaffAuditPacket
import net.minebo.basalt.profiles.BukkitProfileAdaptation
import net.minebo.basalt.punishment.BukkitPunishmentFunctions
import net.minebo.basalt.punishments.actor.ActorType
import net.minebo.basalt.punishments.actor.DefaultActor
import net.minebo.basalt.punishments.actor.executor.Executor
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import net.minebo.basalt.webhook.types.grants.GrantsNotification
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.util.*

class NonModelGrantCommand : BaseCommand()
{

    @CommandAlias("nmgrant")
    @CommandPermission("basalt.grants.admin")
    fun nmgrant(
        sender: CommandSender,
        @Name("uuid") uuid: UUID,
        @Name("rank") rank: Rank,
        @Name("duration") duration: String,
        @Name("scope") scope: GrantScope,
        @Name("reason") reason: String
    )
    {
        val rankGrant = RankGrant(
            rank.id,
            uuid,
            BukkitPunishmentFunctions.getSenderUUID(sender),
            reason, (if (duration == "perm") Long.MAX_VALUE else TimeUtil.parseTime(duration) * 1000L),

            DefaultActor(
                if (sender !is Player) Executor.CONSOLE else Executor.PLAYER,
                ActorType.GAME
            ),
            scope
        )

        BukkitProfileAdaptation.initializeGrant(rankGrant, uuid)
        GrantsNotification(rankGrant).send()
        AsynchronousRedisSender.send(
            GrantMessageTargetPacket(
                uuid,
                rank,
                (if (duration == "perm") Long.MAX_VALUE else TimeUtil.parseTime(duration) * 1000L)
            )
        )

        AsynchronousRedisSender.send(StaffAuditPacket("&b[Audit] &f" + uuid.toString() + " &3was granted " + rank.color + rank.displayName + " &3for &b" + reason))
        sender.sendMessage(Chat.format("&aGranted " + uuid.toString() + " the rank " + rank.color + rank.displayName))
    }
}
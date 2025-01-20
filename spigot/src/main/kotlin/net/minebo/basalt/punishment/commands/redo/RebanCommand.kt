package net.minebo.basalt.punishment.commands.redo

/**
 * Class created on 7/20/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.*
import net.minebo.basalt.Basalt
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.grant.types.Punishment
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.packets.OwnershipMessagePacket
import net.minebo.basalt.punishment.BukkitPunishmentFunctions
import net.minebo.basalt.punishment.limitation.PunishmentLimitationUnderstander
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.punishments.actor.ActorType
import net.minebo.basalt.punishments.actor.DefaultActor
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.service.expirable.PunishmentService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.util.*

class RebanCommand : BaseCommand()
{

    @CommandAlias("reban|rb")
    @CommandPermission("basalt.punishments.reban")
    @CommandCompletion("@gameprofile")
    @Syntax("<target> [-a] <reason>")
    fun reban(sender: CommandSender, @Name("target") gameProfile: GameProfile, @Name("reason") reason: String)
    {
        val punishment = Punishment(
            PunishmentType.BAN.name,
            UUID.randomUUID().toString().substring(0, 4),
            mutableListOf(),
            gameProfile.uuid,
            BukkitPunishmentFunctions.getSenderUUID(sender),
            BukkitPunishmentFunctions.parseReason(reason, "Unspecified"), Long.MAX_VALUE,

            DefaultActor(
                BukkitPunishmentFunctions.getExecutorFromSender(sender),
                ActorType.GAME
            )
        )

        val hasPunishment = gameProfile.getActivePunishments(PunishmentType.BAN).firstOrNull()

        if (hasPunishment == null)
        {
            sender.sendMessage(Chat.format("&cPlayer has no bans that need to be removed!"))
            return
        }

        if (sender is Player)
        {

            val profile = BasaltAPI.syncFindProfile(sender.uniqueId)!!
            val canExecute =
                PunishmentLimitationUnderstander.canApplyPunishment(sender.uniqueId)

            if (!canExecute)
            {
                sender.sendMessage(Chat.format("&cYou are currently on punishment cooldown."))
                sender.sendMessage(
                    Chat.format(
                        "&cPlease wait &e" + PunishmentLimitationUnderstander.getDurationString(
                            sender.uniqueId
                        )
                    )
                )

                return
            }

            if (!BukkitPunishmentFunctions.playerCanPunishOther(profile, gameProfile))
            {
                sender.sendMessage(Chat.format("&cYou are not eligible to punish this player!"))
                AsynchronousRedisSender.send(OwnershipMessagePacket("&b[S] &3[${Basalt.globalServer.displayName}] ${profile.getRankDisplay()} &3tried punishing a player with a rank weight higher than theirs"))
                return
            }

            PunishmentLimitationUnderstander.equipCooldown(sender.uniqueId)
        }

        //remove previous
        hasPunishment.expirable.expired = true
        hasPunishment.expirable.removedAt = System.currentTimeMillis()
        hasPunishment.removedBy = BukkitPunishmentFunctions.getSenderUUID(sender)
        hasPunishment.removedReason = "Punishment Re-Executed"

        PunishmentService.save(hasPunishment)

        //create new
        sender.sendMessage(
            Chat.format(
                (if (BukkitPunishmentFunctions.isSilent(reason)) "&7(Silent) " else "")
                        + "&aYou've re-banned " + gameProfile.username + " for &f"
                        + BukkitPunishmentFunctions.parseReason(reason) + " &afor "
                        + TimeUtil.formatDuration(punishment.expirable.duration)
            )
        )
        BukkitPunishmentFunctions.dispatch(punishment, BukkitPunishmentFunctions.isSilent(reason))
    }

}
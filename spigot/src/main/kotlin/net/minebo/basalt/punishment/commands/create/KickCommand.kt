package net.minebo.basalt.punishment.commands.create

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.*
import net.minebo.basalt.Basalt
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.grant.types.Punishment
import net.minebo.basalt.models.grant.types.proof.ProofEntry
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.packets.OwnershipMessagePacket
import net.minebo.basalt.punishment.BukkitPunishmentFunctions
import net.minebo.basalt.punishment.limitation.PunishmentLimitationUnderstander
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.punishments.actor.ActorType
import net.minebo.basalt.punishments.actor.DefaultActor
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.util.Chat
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.util.*

class KickCommand : BaseCommand()
{

    @CommandAlias("kick")
    @CommandPermission("basalt.punishments.kick")
    @CommandCompletion("@gameprofile")
    @Syntax("<target> [-a] <reason>")
    fun kick(sender: CommandSender, @Name("target") gameProfile: GameProfile, @Name("reason") reason: String)
    {
        val punishment = Punishment(
            PunishmentType.KICK.name,
            UUID.randomUUID().toString().substring(0, 4),
            mutableListOf<ProofEntry>(),
            gameProfile.uuid,
            BukkitPunishmentFunctions.getSenderUUID(sender),
            BukkitPunishmentFunctions.parseReason(reason, "Unspecified"), Long.MAX_VALUE,

            DefaultActor(
                BukkitPunishmentFunctions.getExecutorFromSender(sender),
                ActorType.GAME
            )

        )
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

        sender.sendMessage(
            Chat.format(
                (if (BukkitPunishmentFunctions.isSilent(reason)) "&7(Silent) " else "")
                        + "&aYou've kicked " + gameProfile.username + " for &f"
                        + BukkitPunishmentFunctions.parseReason(reason)
            )
        )
        BukkitPunishmentFunctions.dispatchKick(punishment, BukkitPunishmentFunctions.isSilent(reason))

    }

}
package net.minebo.basalt.punishment.commands.remove

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.*
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.punishment.BukkitPunishmentFunctions
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.util.Chat
import org.bukkit.command.CommandSender

class UnmuteCommand : BaseCommand()
{

    @CommandAlias("unmute|unm")
    @CommandPermission("basalt.punishments.unmute")
    @CommandCompletion("@gameprofile")
    fun ban(sender: CommandSender, @Name("target") gameProfile: GameProfile, @Name("reason") reason: String)
    {
        val punishments = gameProfile.getActivePunishments(PunishmentType.MUTE)

        if (punishments.isEmpty())
        {
            sender.sendMessage(Chat.format("&cNo punishments of this type"))
            return
        }

        val punishment = punishments.first()

        punishment.expirable.expired = true
        punishment.expirable.removedAt = System.currentTimeMillis()
        punishment.removedBy = BukkitPunishmentFunctions.getSenderUUID(sender)
        punishment.removedReason = reason

        sender.sendMessage(
            Chat.format(
                (if (BukkitPunishmentFunctions.isSilent(reason)) "&7(Silent) " else "")
                        + "&aYou've unmuted " + gameProfile.username + " for &f"
                        + BukkitPunishmentFunctions.parseReason(reason)
            )
        )
        BukkitPunishmentFunctions.remove(BukkitPunishmentFunctions.getSenderUUID(sender), punishment, true, reason)
    }
}
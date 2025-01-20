package net.minebo.basalt.punishment.commands.menu

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.punishments.actor.ActorType
import net.minebo.basalt.service.expirable.PunishmentService
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import org.bukkit.entity.Player

class PunishmentLookupCommands : BaseCommand()
{

    @CommandAlias("punishmentlookup|plookup")
    @CommandPermission("basalt.punishments.lookup")
    fun lookup(player: Player, @Name("punishmentId") id: String)
    {
        val punishment = PunishmentService.searchFromId(id)

        if (punishment == null)
        {
            player.sendMessage(Chat.format("&cPunishment with this id was not found."))
            return
        }

        player.sendMessage(Chat.format("&6Info On #" + punishment.easyFindId))
        player.sendMessage(" ")
        player.sendMessage(Chat.format("&7- &eActive: &f" + if (punishment.expirable.isActive()) "&aActive" else "&cInactive"))
        player.sendMessage(Chat.format("&7- &eReason: &f" + punishment.reason))
        player.sendMessage(Chat.format("&7- &eWas Local: &f" + if (punishment.actor.actorType == ActorType.GAME) "&aYes" else "&cNo"))
        player.sendMessage(" ")
        player.sendMessage(Chat.format("&6Staff Member Details:"))
        player.sendMessage(Chat.format("&7- &eStaff Executor: &f" + BasaltAPI.getRankDisplay(punishment.executor)))
        player.sendMessage(
            Chat.format(
                "&7- &eStaff Punishments: &f" + PunishmentService.findExecutorPunishments(
                    punishment.executor
                ).size
            )
        )
        val profile = ProfileGameService.getHighestGrant(punishment.executor)
        if (profile == null)
        {
            player.sendMessage(Chat.format("&7- &eGot Staff: &fNever"))
        } else
        {
            player.sendMessage(Chat.format("&7- &eGot Staff: &f" + TimeUtil.formatDuration(System.currentTimeMillis() - profile.expirable.addedAt)))
        }
    }
}
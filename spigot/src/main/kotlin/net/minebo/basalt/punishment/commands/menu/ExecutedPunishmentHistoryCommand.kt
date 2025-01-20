package net.minebo.basalt.punishment.commands.menu

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.*
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.punishment.commands.menu.executed.ExecutedPunishmentHistoryMenu
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player

/**
 * Class created on 5/7/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class ExecutedPunishmentHistoryCommand : BaseCommand()
{

    @CommandAlias("staffhist|staffhistory")
    @CommandPermission("basalt.punishments.check")
    @CommandCompletion("@gameprofile")
    fun checkOthers(player: Player, @Name("target") @Optional profile: GameProfile?)
    {
        if (!player.hasPermission("basalt.punishments.check.others"))
        {
            val profile1 = BasaltAPI.syncFindProfile(player.uniqueId) ?: return
            ExecutedPunishmentHistoryMenu(player, profile1).openMenu()
        } else
        {
            if (profile == null)
            {
                player.sendMessage(Chat.format("&cYou must provide a valid profile!"))
                return
            }

            ExecutedPunishmentHistoryMenu(player, profile).openMenu()
        }
    }
}
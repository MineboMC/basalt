package net.minebo.basalt.grants.view

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandCompletion
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.grants.menu.history.GrantHistoryMenu
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.service.expirable.RankGrantService
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player

class GrantHistoryCommand : BaseCommand()
{

    @CommandAlias("granthistory")
    @CommandPermission("basalt.grants.admin")
    @CommandCompletion("@gameprofile")
    fun grantHistory(player: Player, @Name("target") target: GameProfile)
    {
        val grants = RankGrantService.findExecutedBy(target.uuid)

        if (grants.isEmpty())
        {
            player.sendMessage(Chat.format("&cPlayer has never granted a rank!"))
            return
        }

        GrantHistoryMenu(player, grants, target).updateMenu()
    }
}
package net.minebo.basalt.grants.view

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandCompletion
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.grants.menu.grants.GrantsMenu
import net.minebo.basalt.grants.menu.grants.filter.GrantFilter
import net.minebo.basalt.models.grant.types.RankGrant
import net.minebo.basalt.profiles.AsyncGameProfile
import net.minebo.basalt.profiles.getCurrentRank
import net.minebo.basalt.service.expirable.RankGrantService
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player
import java.util.concurrent.CompletableFuture

object GrantsCommand : BaseCommand()
{

    @CommandAlias("grants")
    @CommandPermission("basalt.grants.admin")
    @CommandCompletion("@gameprofile")
    fun grants(player: Player, @Name("target") gameProfile: AsyncGameProfile): CompletableFuture<Void>
    {
        return gameProfile.use(player) {
            val all = RankGrantService.getFromCache(it.uuid).toMutableList()
            val grants = getViewableGrants(player, all)

            if (!player.hasPermission("basalt.grants.admin.viewAll") && all.isNotEmpty() && grants.isEmpty())
            {
                player.sendMessage(Chat.format("&cThis player has grants in which you are unable to see due to your rank"))
            }

            if (grants.isEmpty())
            {
                player.sendMessage(Chat.format("&cThe user &e${it.username} &chas no visible grants!"))
                return@use
            }

            GrantsMenu(
                player,
                it,
                grants,
                GrantFilter.ALL
            ).updateMenu()
        }
    }

    fun getViewableGrants(player: Player, grants: MutableList<RankGrant>): MutableList<RankGrant>
    {
        if (!player.hasPermission("basalt.grants.admin.viewAll"))
        {
            return grants.filter {
                it.getGrantable().weight <= player.getCurrentRank().weight
            }.toMutableList()
        }

        return grants
    }
}
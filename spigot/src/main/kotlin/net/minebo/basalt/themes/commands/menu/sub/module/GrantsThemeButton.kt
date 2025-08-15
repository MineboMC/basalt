package net.minebo.basalt.themes.commands.menu.sub.module

import net.minebo.basalt.models.grant.types.RankGrant
import net.minebo.basalt.punishments.actor.ActorType
import net.minebo.basalt.punishments.actor.DefaultActor
import net.minebo.basalt.punishments.actor.executor.Executor
import net.minebo.basalt.service.ranks.RankService
import net.minebo.basalt.themes.Theme
import net.minebo.basalt.util.menu.Button
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class GrantsThemeButton(val theme: Theme, val player: Player) : Button()
{

    var fakeGrant = RankGrant(
        RankService.findFirstAvailableDefaultRank()!!.id,
        player.uniqueId,
        player.uniqueId,
        "Test Grant!",
        Long.MAX_VALUE,
        DefaultActor(Executor.CONSOLE, ActorType.GAME)
    )

    override fun getMaterial(player: Player): Material
    {
        return Material.matchMaterial("${theme.getGrantsData(player, fakeGrant)}_WOOL") ?: Material.WHITE_WOOL
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        return theme.getGrantsLore(player, fakeGrant)
    }

    override fun getDisplayName(player: Player): String
    {
        return theme.getGrantsDisplayName(player, fakeGrant)
    }

    override fun getData(player: Player): Short
    {
        return theme.getGrantsData(player, fakeGrant)
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        return
    }
}
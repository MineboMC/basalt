package net.minebo.basalt.themes.commands.menu.sub.module

import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.service.ranks.RankService
import net.minebo.basalt.themes.Theme
import net.minebo.basalt.util.menu.Button
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class GrantThemeButton(val theme: Theme, val player: Player) : Button()
{

    val rank = RankService.findFirstAvailableDefaultRank()!!

    override fun getMaterial(player: Player): Material
    {
        return Material.WOOL
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        return theme.getGrantLore(player, ProfileGameService.byId(player.uniqueId)!!, rank)
    }

    override fun getDisplayName(player: Player): String
    {
        return theme.getGrantDisplayName(player, rank)
    }

    override fun getData(player: Player): Short
    {
        return theme.getGrantData(player, rank)
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        return
    }
}
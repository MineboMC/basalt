package net.minebo.basalt.grants.menu.history

import net.minebo.basalt.grants.menu.history.sub.GrantHistoryViewGrants
import net.minebo.basalt.models.grant.types.RankGrant
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.service.ranks.RankService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class GrantHistoryMenu(val player: Player, val grants: MutableList<RankGrant>, val target: GameProfile) :
    PaginatedMenu(27, player)
{

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()
        var index = 0

        for (rank in RankService.getAllRanksInOrder())
        {
            buttons[index++] = RankButton(player, rank, grants)
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Select a Rank"
    }

    class RankButton(val player: Player, val rank: Rank, val grants: MutableList<RankGrant>) : Button()
    {
        override fun getMaterial(player: Player): Material
        {
            return Material.INK_SACK
        }

        override fun getDescription(player: Player): MutableList<String>
        {
            val desc = mutableListOf<String>()
            desc.add(Chat.format("&6&m---------------------"))
            desc.add(Chat.format("&eRank: &f" + rank.color + rank.displayName))
            desc.add(Chat.format("&eStaff: &f" + rank.staff))
            desc.add(Chat.format("&eTimes Granted: &f" + filterRank(grants, rank).size))
            desc.add(" ")
            desc.add(Chat.format("&aClick to view grants"))
            desc.add(Chat.format("&6&m---------------------"))

            return desc
        }

        fun filterRank(grants: MutableList<RankGrant>, rank: Rank): MutableList<RankGrant>
        {
            return grants.filter { it.getGrantable().id == rank.id }.toMutableList()
        }

        override fun getDisplayName(player: Player): String
        {
            return Chat.format(rank.color + rank.displayName)
        }

        override fun getData(player: Player): Short
        {
            return Chat.getDyeColor(rank.color).dyeData.toShort()
        }

        override fun onClick(player: Player, slot: Int, type: ClickType)
        {
            GrantHistoryViewGrants(player, filterRank(grants, rank)).updateMenu()
        }


    }
}
package net.minebo.basalt.grants.menu.history.sub


import net.minebo.basalt.grants.menu.grants.GrantsButton
import net.minebo.basalt.models.grant.types.RankGrant
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import org.bukkit.entity.Player

class GrantHistoryViewGrants(val player: Player, val grants: MutableList<RankGrant>) : PaginatedMenu(18, player)
{

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = hashMapOf<Int, Button>()

        val time = System.currentTimeMillis()

        var index = 0
        for (grant in grants)
        {
            buttons[index++] = GrantsButton(grant)
        }


        println("Menu " + this.javaClass.simpleName + " took " + System.currentTimeMillis().minus(time) + "ms to open")

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Checking Grant History"
    }
}
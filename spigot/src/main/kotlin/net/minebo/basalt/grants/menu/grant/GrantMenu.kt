package net.minebo.basalt.grants.menu.grant

import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.service.ranks.RankService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.type.BorderedPaginatedMenu
import org.bukkit.entity.Player

class GrantMenu(val player: Player, val gameProfile: GameProfile) : BorderedPaginatedMenu(player)
{

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = hashMapOf<Int, Button>()

        var index = 0
        for (rank in RankService.getAllRanksInOrder())
        {
            buttons[index++] = GrantButton(rank, gameProfile)
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Granting for " + Chat.format(gameProfile.getCurrentRank().color) + gameProfile.username
    }
}
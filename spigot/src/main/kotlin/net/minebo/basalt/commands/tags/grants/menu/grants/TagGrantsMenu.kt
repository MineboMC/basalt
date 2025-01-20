package net.minebo.basalt.commands.tags.grants.menu.grants

import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.service.expirable.TagGrantService
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import org.bukkit.entity.Player

class TagGrantsMenu(val player: Player, val gameProfile: GameProfile) : PaginatedMenu(18, player)
{

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = hashMapOf<Int, Button>()


        var index = 0

        for (tag in TagGrantService.getValues().get().filter { it.target == gameProfile.uuid })
        {
            buttons[index++] = TagGrantsButton(tag)
        }


        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Grants of " + gameProfile.username
    }
}
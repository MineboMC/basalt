package net.minebo.basalt.commands.tags.grants.menu.grant

import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.service.tags.TagService
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import org.bukkit.entity.Player

class TagGrantMenu(val player: Player, val gameProfile: GameProfile) : PaginatedMenu(18, player)
{

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = hashMapOf<Int, Button>()

        var index = 0
        for (tag in TagService.cache.values)
        {
            buttons[index++] = TagGrantButton(tag, gameProfile)
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Tag Granting " + gameProfile.username
    }
}
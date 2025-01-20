package net.minebo.basalt.commands.tags.menu

import net.minebo.basalt.service.tags.TagService
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import org.bukkit.entity.Player

class TagCustomizationMenu(var player: Player) : PaginatedMenu(18, player)
{

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = hashMapOf<Int, Button>()

        var index = 0

        for (tag in TagService.cache.values)
        {
            buttons[index++] = TagCustomizationButton(tag)
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Edit a Tag"
    }
}
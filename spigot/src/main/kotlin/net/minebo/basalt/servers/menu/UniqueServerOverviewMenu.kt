package net.minebo.basalt.servers.menu

import net.minebo.basalt.service.server.UniqueServerService
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import org.bukkit.entity.Player

class UniqueServerOverviewMenu(var player: Player) : PaginatedMenu(18, player)
{

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = hashMapOf<Int, Button>()

        var index = 0

        for (server in UniqueServerService.getValues())
        {
            buttons[index++] = UniqueServerButton(server)
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "All Servers"
    }
}
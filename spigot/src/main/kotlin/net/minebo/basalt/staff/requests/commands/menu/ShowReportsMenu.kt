package net.minebo.basalt.staff.requests.commands.menu

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.staff.requests.report.ReportModel
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.type.BorderedPaginatedMenu
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import java.util.*

/**
 * Class created on 9/13/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class ShowReportsMenu(val player: Player, val reports: MutableList<ReportModel>) : BorderedPaginatedMenu(player)
{
    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()
        var i = 0

        for (report in reports)
        {
            buttons[i++] = ReportsButton(report)
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Viewing Specific Reports"
    }

    class ReportsButton(val model: ReportModel) : Button()
    {
        override fun getMaterial(player: Player): Material
        {
            return Material.PAPER
        }

        override fun getDescription(player: Player): MutableList<String>
        {
            val desc = mutableListOf<String>()
            desc.add(Chat.format("&8Short Id: #${model.id.toString().substring(0, 6)}"))
            desc.add(" ")
            desc.add(Chat.format("&eReason: &f${model.reason}"))
            desc.add(Chat.format("&eIssued On: &f${model.server}"))
            desc.add(Chat.format("&eIssuer: &f${BasaltAPI.getRankDisplay(model.issuer)}"))
            desc.add(Chat.format("&eIssued To: &f${BasaltAPI.getRankDisplay(model.issuedTo)}"))
            desc.add(" ")
            desc.add(Chat.format("&aClick to jump to the target server"))

            return desc
        }

        override fun getDisplayName(player: Player): String
        {
            val name = "&a${Date(model.issuedAt)}"

            return Chat.format(name)
        }

        override fun getData(player: Player): Short
        {
            return 0
        }

        override fun onClick(player: Player, slot: Int, type: ClickType)
        {

        }

    }
}
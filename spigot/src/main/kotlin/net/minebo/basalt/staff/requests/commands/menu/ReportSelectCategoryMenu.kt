package net.minebo.basalt.staff.requests.commands.menu

import net.minebo.basalt.Basalt
import net.minebo.basalt.staff.requests.handlers.RequestHandler
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.InputPrompt
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.Menu
import net.minebo.basalt.util.menu.buttons.SimpleActionButton
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.entity.Player
import java.util.concurrent.TimeUnit

class ReportSelectCategoryMenu(val player: Player) : Menu(player)
{
    init
    {
        staticSize = 9
        placeholder = true
    }

    override fun getButtons(player: Player): MutableMap<Int, Button>
    {
        return mutableMapOf(
            0 to SimpleActionButton(
                Material.ANVIL,
                mutableListOf(),
                "&aAll Reports",
                0
            ).setBody { player, i, clickType ->
                ShowReportsMenu(player, RequestHandler.activeReports.values.toMutableList()).updateMenu()
            },
            2 to SimpleActionButton(
                Material.BOOK,
                mutableListOf(),
                "&eYour Server",
                0
            ).setBody { player, i, clickType ->
                ShowReportsMenu(player, RequestHandler.activeReports.values.filter {
                    it.server.equals(Basalt.globalServer.displayName, ignoreCase = true)
                }.toMutableList()).updateMenu()
            },
            4 to SimpleActionButton(
                Material.NETHER_STAR,
                mutableListOf(),
                "&bPast Hour",
                0
            ).setBody { player, i, clickType ->
                ShowReportsMenu(player, RequestHandler.activeReports.values.filter {
                    System.currentTimeMillis().minus(it.issuedAt) <= TimeUnit.HOURS.toMillis(1L)
                }.toMutableList()).updateMenu()
            },
            6 to SimpleActionButton(
                Material.NAME_TAG,
                mutableListOf(),
                "&6Specific Server",
                0
            ).setBody { player, i, clickType ->
                InputPrompt()
                    .withText(Chat.format("&eType in the &aserver display name &ethat you want to check the reports of."))
                    .acceptInput { str ->
                        ShowReportsMenu(player, RequestHandler.activeReports.values.filter {
                            it.server.equals(str, ignoreCase = true)
                        }.toMutableList()).updateMenu()
                    }.start(player)
            },
            8 to SimpleActionButton(
                Material.ARROW,
                mutableListOf(),
                "&cReported Player is Online",
                0
            ).setBody { player, i, clickType ->
                ShowReportsMenu(player, RequestHandler.activeReports.values.filter {
                    Bukkit.getPlayer(it.issuedTo) != null
                }.toMutableList()).updateMenu()
            }
        )
    }

    override fun getTitle(player: Player): String
    {
        return "Select a Report Category"
    }
}
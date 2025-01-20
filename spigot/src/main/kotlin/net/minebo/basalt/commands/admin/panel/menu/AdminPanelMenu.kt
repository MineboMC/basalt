package net.minebo.basalt.commands.admin.panel.menu

import net.minebo.basalt.commands.admin.panel.menu.editors.AdminPanelEditorMenu
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.Menu
import net.minebo.basalt.util.menu.buttons.PlaceholderButton
import net.minebo.basalt.util.menu.buttons.SimpleActionButton
import org.bukkit.Material
import org.bukkit.entity.Player

class AdminPanelMenu(val player: Player) : Menu(player)
{

    init
    {
        staticSize = 27
        placeholder = true
    }

    override fun getButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()

        buttons[4] = PlaceholderButton(
            Material.DIAMOND, mutableListOf(
                " ",
                Chat.format("&7Everything in Basalt is editable"),
                Chat.format("&7from this menu. You can change features"),
                Chat.format("&7as well as setup your dream rank core"),
                " "
            ), Chat.format("&5&lBasalt"), 0
        )

        buttons[11] = SimpleActionButton(
            Material.NETHER_STAR, mutableListOf(
                " ",
                Chat.format("&7Edit features about Basalt that you"),
                Chat.format("&7may want to change here. Current configurable"),
                Chat.format("&7aspects include:"),
                Chat.format(" "),
                Chat.format("&a&l｜ &fThemes"),
                Chat.format("&a&l｜ &fModules"),
                Chat.format("&a&l｜ &fStaff Messages"),
                Chat.format("&a&l｜ &fConfig Messages"),
                " ",
                Chat.format("&a&lClick To Edit")
            ), "&a&lEditors", 0
        ).setBody { player, i, clickType ->
            AdminPanelEditorMenu(player).openMenu()
        }

        buttons[15] = SimpleActionButton(
            Material.CHEST, mutableListOf(
                " ",
                Chat.format("&7View features in Basalt that give"),
                Chat.format("&7crucial display data and other information"),
                Chat.format("&7that will be good to know. Things include:"),
                Chat.format(" "),
                Chat.format("&c&l｜ &fMetrics"),
                Chat.format("&c&l｜ &fPerformance Stats"),
                Chat.format("&c&l｜ &fServer Information"),
                " ",
                Chat.format("&a&lClick To Edit")
            ), "&c&lDisplay Information", 0
        )

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return Chat.format("&7[Panel] &5Basalt")
    }
}
package net.minebo.basalt.commands.coins.editor

import net.minebo.basalt.commands.coins.category.editor.CoinShopCategoryEditor
import net.minebo.basalt.commands.coins.editor.items.CoinShopItemEditor
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.Menu
import net.minebo.basalt.util.menu.buttons.SimpleActionButton
import org.bukkit.Material
import org.bukkit.entity.Player

class CoinShopEditorMenu(val player: Player) : Menu(player)
{

    init
    {
        staticSize = 27
        placeholder = true
    }

    override fun getButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()

        buttons[12] = SimpleActionButton(
            Material.CHEST, mutableListOf(
                Chat.format(" "),
                Chat.format("&7Click here to view all possible"),
                Chat.format("&7categories that an item could be"),
                Chat.format("&7placed into"),
                Chat.format(" "),
                Chat.format("&aClick here to explore categories!")
            ), "&b&lCategories", 0
        ).setBody { player, i, clickType ->
            CoinShopCategoryEditor(player).updateMenu()
        }

        buttons[14] = SimpleActionButton(
            Material.BEACON, mutableListOf(
                Chat.format(" "),
                Chat.format("&7Click here to view all purchasable items"),
                Chat.format("&7that are available on the coin shop"),
                Chat.format(" "),
                Chat.format("&aClick here to explore items!")
            ), "&6&lItems", 0
        ).setBody { player, i, clickType ->
            CoinShopItemEditor(player).updateMenu()
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return Chat.format("&7[Editor] &eCoin Shop")
    }
}
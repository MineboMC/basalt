package net.minebo.basalt.commands.coins.editor.items.specific

import net.minebo.basalt.commands.coins.CoinShopManager
import net.minebo.basalt.commands.coins.category.CoinShopCategory
import net.minebo.basalt.commands.coins.editor.items.CoinShopItemAttributeEditor
import net.minebo.basalt.commands.coins.item.CoinShopItem
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class SelectCategoryMenu(val player: Player, val item: CoinShopItem) : PaginatedMenu(18, player)
{
    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()
        var i = 0

        for (category in CoinShopManager.categoryMap.values)
        {
            buttons[i++] = CategoryButton(item, category)
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Select a Category"
    }

    class CategoryButton(val item: CoinShopItem, val category: CoinShopCategory) : Button()
    {
        override fun getMaterial(player: Player): Material
        {
            return Material.getMaterial(category.displayItem) ?: Material.PAPER
        }

        override fun getDescription(player: Player): MutableList<String>
        {
            return mutableListOf()
        }

        override fun getDisplayName(player: Player): String
        {
            return Chat.format(category.displayName)
        }

        override fun getData(player: Player): Short
        {
            return 0
        }

        override fun onClick(player: Player, slot: Int, type: ClickType)
        {
            item.category = category.id
            CoinShopManager.saveItem(item)
            player.sendMessage(Chat.format("&aSet the category of ${item.displayName} &ato &f" + category.displayName))
            player.closeInventory()
            CoinShopItemAttributeEditor(player, item).openMenu()
        }
    }
}
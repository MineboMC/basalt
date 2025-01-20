package net.minebo.basalt.commands.coins.shop

import net.minebo.basalt.Basalt
import net.minebo.basalt.commands.coins.CoinShopManager
import net.minebo.basalt.commands.coins.cart.CartHandler
import net.minebo.basalt.commands.coins.cart.MyCartMenu
import net.minebo.basalt.commands.coins.category.CoinShopCategory
import net.minebo.basalt.commands.coins.shop.sub.CoinShopDisplayCategoriesMenu
import net.minebo.basalt.commands.coins.shop.sub.CoinShopDisplayProductsMenu
import net.minebo.basalt.commands.coins.transactions.ViewTransactionsMenu
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.Menu
import net.minebo.basalt.util.menu.buttons.SimpleActionButton
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

/**
 * Class created on 7/4/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class CoinShopMenu(val player: Player) : Menu(player)
{

    init
    {
        staticSize = 45
        placeholder = true
    }

    override fun getButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()

        for (category in CoinShopManager.categoryMap.values)
        {
            if (category.activeOn.contains(Basalt.globalServer.id) && category.parentCategory == null)
            {
                buttons[category.menuSlot] = CategoryDisplayButton(category)
            }
        }

        val cart = CartHandler.carts[player.uniqueId]

        buttons[39] = SimpleActionButton(
            Material.HOPPER, mutableListOf(
                Chat.format(" "),
                Chat.format("&7Click to view the contents of &fYour Cart"),
                Chat.format(" "),
                Chat.format("&7Current Items: &f" + (cart?.items?.size ?: "None")),
                Chat.format("&7Total Price: &f$" + (cart?.getCombinedPrice() ?: "0.0")),
                Chat.format("&7Can Afford: &f" + if (cart?.playerCanAfford(player) == true) "&aYes" else "&cNo"),
                Chat.format(" "),
                Chat.format("&aClick here to view &fYour Cart")
            ), Chat.format("&eYour Cart"), 0
        ).setBody { player, i, clickType ->
            MyCartMenu(player).updateMenu()
        }


        val transactions = CoinShopManager.findAllTransactions(player.uniqueId)
        buttons[41] = SimpleActionButton(
            Material.NAME_TAG, mutableListOf(
                Chat.format(" "),
                Chat.format("&7Click to view your previous &fTransactions"),
                Chat.format(" "),
                Chat.format("&7Total Transactions: &f" + transactions.size),
                Chat.format("&7Total Spent: &f$" + CoinShopManager.getTotalPriceOfTransactions(transactions)),
                Chat.format(" "),
                Chat.format("&aClick here to view your &fTransactions")
            ), Chat.format("&aYour Transactions"), 0
        ).setBody { player, i, clickType ->
            val all = CoinShopManager.findAllTransactions(player.uniqueId)
            ViewTransactionsMenu(player, all).updateMenu()
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Coin Shop"
    }

    class CategoryDisplayButton(val category: CoinShopCategory) : Button()
    {
        override fun getMaterial(player: Player): Material
        {
            return Material.getMaterial(category.displayItem) ?: Material.PAPER
        }

        override fun getDescription(player: Player): MutableList<String>
        {
            return category.desc.map { Chat.format(it) }.toMutableList()
        }

        override fun getDisplayName(player: Player): String
        {
            return Chat.format(category.displayName)
        }

        override fun getData(player: Player): Short
        {
            return category.data
        }

        override fun onClick(player: Player, slot: Int, type: ClickType)
        {
            val existing = category.getCategoriesThatParentThisOne()

            if (existing.isEmpty())
            {
                CoinShopDisplayProductsMenu(category, player).updateMenu()
            } else
            {
                CoinShopDisplayCategoriesMenu(player, category).updateMenu()
            }
        }

    }
}
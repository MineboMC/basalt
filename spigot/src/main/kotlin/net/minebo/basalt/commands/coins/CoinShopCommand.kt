package net.minebo.basalt.commands.coins

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import net.minebo.basalt.commands.coins.shop.CoinShopMenu
import org.bukkit.entity.Player

class CoinShopCommand : BaseCommand()
{

    @CommandAlias("coinshop")
    fun coinShop(player: Player)
    {
        CoinShopMenu(player).openMenu()
    }
}
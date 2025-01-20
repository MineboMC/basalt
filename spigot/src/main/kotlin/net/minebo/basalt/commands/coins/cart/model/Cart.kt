package net.minebo.basalt.commands.coins.cart.model

import net.minebo.basalt.commands.coins.item.CoinShopItem
import net.minebo.basalt.profiles.getProfile
import org.bukkit.entity.Player
import java.util.*

/**
 * Class created on 8/23/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
data class Cart(
    var player: UUID,
    var items: MutableList<CoinShopItem>
)
{

    fun getCombinedPrice(): Double
    {
        var price = 0.0

        for (item in items)
        {
            val p = item.price
            val d = item.discount

            price += if (d != 0.0)
            {
                (p - d)
            } else
            {
                p
            }
        }

        return price
    }

    fun playerCanAfford(player: Player): Boolean
    {
        val profile = player.getProfile() ?: return false

        val coins = profile.coins

        if (coins < getCombinedPrice())
        {
            return false
        }

        return true
    }
}
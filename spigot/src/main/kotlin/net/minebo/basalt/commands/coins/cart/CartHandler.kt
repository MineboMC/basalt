package net.minebo.basalt.commands.coins.cart

import net.minebo.basalt.commands.coins.cart.model.Cart
import net.minebo.basalt.commands.coins.item.CoinShopItem
import java.util.*

/**
 * Class created on 8/23/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object CartHandler
{
    val carts: MutableMap<UUID, Cart> = mutableMapOf()

    fun addToCart(id: UUID, item: CoinShopItem)
    {
        if (!carts.containsKey(id))
        {
            val cart = Cart(id, mutableListOf(item))

            carts[id] = cart
        } else
        {
            val existing = carts[id]!!

            existing.items.add(item)
            carts[id] = existing
        }
    }
}
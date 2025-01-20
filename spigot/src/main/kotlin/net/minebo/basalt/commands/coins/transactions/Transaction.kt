package net.minebo.basalt.commands.coins.transactions

import net.minebo.basalt.commands.coins.item.CoinShopItem
import java.util.*

/**
 * Class created on 8/23/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
data class Transaction(
    var id: UUID,
    var user: UUID,
    var items: MutableList<CoinShopItem>,
    var on: String,
    var coinsSpent: Double
)
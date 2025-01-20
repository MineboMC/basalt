package net.minebo.basalt.commands.coins.listener

import net.minebo.basalt.commands.coins.CoinShopManager
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

/**
 * Class created on 8/23/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class CoinShopLoadTransactionsListener : Listener
{

    @EventHandler
    fun loadTransaction(event: PlayerJoinEvent)
    {
        CoinShopManager.lookupTransactions(event.player.uniqueId).thenAccept {
            CoinShopManager.transactionMap[event.player.uniqueId] = it
        }
    }
}
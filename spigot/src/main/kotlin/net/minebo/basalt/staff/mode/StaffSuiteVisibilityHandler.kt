package net.minebo.basalt.staff.mode

import net.minebo.basalt.Basalt
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.staff.alerts.StaffActionAlertPacket
import org.bukkit.Bukkit
import org.bukkit.entity.Player

object StaffSuiteVisibilityHandler
{

    fun onDisableVisbility(player: Player)
    {
        Bukkit.getOnlinePlayers().forEach {
            it.showPlayer(player)
        }
    }

    fun onEnableVisibility(player: Player)
    {
        Bukkit.getOnlinePlayers().filter { !it.hasPermission("basalt.staff") }.forEach { it.hidePlayer(player) }

        val profile = BasaltAPI.syncFindProfile(player.uniqueId)?.hasMetadata("seeOtherStaff") ?: return

        if (profile)
        {
            Bukkit.getOnlinePlayers().filter {
                it.hasPermission("basalt.staff")
            }.forEach {
                player.showPlayer(it)
            }
        }
    }
}
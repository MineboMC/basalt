package net.minebo.basalt.staff.mode

import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.scheduler.BukkitRunnable


class StaffUpdateVisibilityTask : BukkitRunnable()
{
    override fun run()
    {
        val vanished = Bukkit.getOnlinePlayers().filter { player: Player ->
            player.hasMetadata(
                "vanish"
            )
        }
        for (online in Bukkit.getOnlinePlayers())
        {
            if (online.hasPermission("basalt.staff"))
            {
                continue
            }
            vanished.forEach { online.hidePlayer(it) }
        }
    }
}
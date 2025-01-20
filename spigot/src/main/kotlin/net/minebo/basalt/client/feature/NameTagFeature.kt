package net.minebo.basalt.client.feature

import com.lunarclient.bukkitapi.LunarClientAPI
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.staff.mode.StaffSuiteManager
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import org.bukkit.entity.Player


/**
 * Class created on 9/13/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object NameTagFeature
{
    fun sendNameTag(target: Player, viewer: Player)
    {
        LunarClientAPI.getInstance().overrideNametag(
            target,
            mutableListOf(
                Chat.format(target.displayName),
                Chat.format("&7[Mod Mode]")
            ),
            viewer
        )
    }

    fun startNametagUpdateTask()
    {
        Bukkit.getScheduler().runTaskTimer(
            BasaltSpigotPlugin.instance, {
                for (player in Bukkit.getOnlinePlayers())
                {
                    if (StaffSuiteManager.isModMode(player))
                    {
                        for (other in Bukkit.getOnlinePlayers())
                        {
                            if (StaffSuiteManager.isModMode(other))
                            {
                                sendNameTag(player, other)
                            }
                        }

                        sendNameTag(player, player)
                        TeamViewFeature.sendStaffTeamView(player)
                    }
                }
            }, 0L, 20L
        )
    }

    fun removeNameTag(player: Player)
    {
        Bukkit.getServer().onlinePlayers.forEach { staff ->
            LunarClientAPI.getInstance().resetNametag(player, staff)
        }
    }
}
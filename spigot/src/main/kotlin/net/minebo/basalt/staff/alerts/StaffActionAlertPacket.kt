package net.minebo.basalt.staff.alerts

import net.minebo.basalt.Basalt
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit

// classic overengineering
class StaffActionAlertPacket(val action: String, val user: String, val server: String) : RedisPacket("staff-action-alert")
{
    override fun action()
    {
        if (Basalt.globalServer.id.equals(server, ignoreCase = true))
        {
            Bukkit.getOnlinePlayers().filter { it.hasPermission("basalt.staffalerts") }.forEach {
                it.sendMessage(
                    Chat.format("&7&o[$user: &e$action&7&o]")
                )
            }
        }
    }
}
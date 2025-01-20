package net.minebo.basalt.packets

import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit

class StaffGeneralMessagePacket(val message: String) : RedisPacket("staff-message-general")
{

    override fun action()
    {
        Bukkit.getOnlinePlayers().filter { it.hasPermission("basalt.staff") }
            .forEach { it.sendMessage(Chat.format(message)) }
    }
}
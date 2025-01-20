package net.minebo.basalt.staff.requests.packets

import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.staff.requests.handlers.RequestHandler
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit

class RequestPacket(val message: String) : RedisPacket("staff-message-request")
{

    override fun action()
    {
        Bukkit.getOnlinePlayers().filter {
            it.hasPermission("basalt.staff") && RequestHandler.hasReportsEnabled(it)
        }.forEach { it.sendMessage(Chat.format(message)) }
    }
}
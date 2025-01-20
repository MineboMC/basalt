package net.minebo.basalt.packets

import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit

class OwnershipMessagePacket(val message: String) : RedisPacket("owners-message-general")
{

    override fun action()
    {
        Bukkit.getOnlinePlayers().filter { it.hasPermission("basalt.owner") }
            .forEach { it.sendMessage(Chat.format(message)) }
    }
}
package net.minebo.basalt.packets

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import java.util.*

class AdminChatPacket(val message: String, val server: String, val sender: UUID) : RedisPacket("admin-message")
{

    override fun action()
    {
        val name = BasaltAPI.getRankDisplay(sender)
        val msg =
            BasaltAPI.AC_FORMAT.replace("%server%", server).replace("%profile%", name).replace("%message%", message)
        Bukkit.getOnlinePlayers().filter { it.hasPermission("basalt.admin") }
            .forEach { it.sendMessage(Chat.format(msg)) }
    }
}
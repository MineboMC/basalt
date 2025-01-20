package net.minebo.basalt.packets

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.staff.mode.StaffSuiteManager
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import java.util.*

class StaffMessagePacket(val message: String, val server: String, val sender: UUID) : RedisPacket("staff-message")
{

    override fun action()
    {
        val name = BasaltAPI.getRankDisplay(sender)
        val msg =
            BasaltAPI.SC_FORMAT.replace("%server%", server).replace("%profile%", name).replace("%message%", message)
        Bukkit.getOnlinePlayers()
            .filter { it.hasPermission("basalt.staff") && StaffSuiteManager.hasStaffchatEnabled(it) }
            .forEach { it.sendMessage(Chat.format(msg)) }
    }
}
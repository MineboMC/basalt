package net.minebo.basalt.packets

import net.minebo.basalt.grants.view.AuditCommand
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit

class StaffAuditPacket(val message: String) : RedisPacket("staff-audit")
{

    override fun action()
    {
        Bukkit.getOnlinePlayers().filter { AuditCommand.auditedPlayers.contains(it.uniqueId) }
            .forEach { it.sendMessage(Chat.format(message)) }
    }
}
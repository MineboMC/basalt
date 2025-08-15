package net.minebo.basalt.packets

import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import java.util.*

class PlayerKickPacket(private val uuid: UUID, private val reason: String) : RedisPacket("player-kick")
{

    override fun action()
    {
        if (Bukkit.getPlayer(uuid) != null)
        {
            Bukkit.getPlayer(uuid)!!.kickPlayer(Chat.format(reason))
        }
    }
}

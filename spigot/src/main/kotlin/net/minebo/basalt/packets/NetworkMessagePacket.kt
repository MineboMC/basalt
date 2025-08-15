package net.minebo.basalt.packets

import net.minebo.basalt.redis.RedisPacket
import org.bukkit.Bukkit
import java.util.*

class NetworkMessagePacket(private val uuid: UUID, private val message: String) : RedisPacket("NETWORK_MESSAGE")
{

    override fun action()
    {
        if (Bukkit.getPlayer(uuid) != null)
        {
            Bukkit.getPlayer(uuid)!!.sendMessage(message)
        }
    }
}

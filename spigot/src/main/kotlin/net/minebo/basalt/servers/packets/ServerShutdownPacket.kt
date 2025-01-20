package net.minebo.basalt.servers.packets

import net.minebo.basalt.Basalt
import net.minebo.basalt.redis.RedisPacket
import org.bukkit.Bukkit

class ServerShutdownPacket(val target: String) : RedisPacket("shutdown-packet")
{

    override fun action()
    {
        val server = Basalt.globalServer

        if (server.id.equals(target, ignoreCase = true))
        {
            Bukkit.broadcastMessage("&8[&eMonitor&8] &fServer has been forcefully shut down by a remote user")
            Bukkit.shutdown()
        }
    }
}
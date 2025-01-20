package net.minebo.basalt.servers.packets

import net.minebo.basalt.Basalt
import net.minebo.basalt.redis.RedisPacket
import org.bukkit.Bukkit

class ServerWhitelistPacket(val target: String) : RedisPacket("whitelist-packet")
{

    override fun action()
    {
        val server = Basalt.globalServer

        if (server.id.equals(target, ignoreCase = true))
        {
            Bukkit.setWhitelist(!Bukkit.hasWhitelist())
        }
    }
}
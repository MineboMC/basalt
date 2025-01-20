package net.minebo.basalt.servers.packets


import net.minebo.basalt.Basalt
import net.minebo.basalt.redis.RedisPacket
import org.bukkit.Bukkit

class ExplicitServerWhitelistPacket(val target: String, val boolean: Boolean) : RedisPacket("explicit-whitelist-packet")
{

    override fun action()
    {
        val server = Basalt.globalServer

        if (server.id.equals(target, ignoreCase = true))
        {
            Bukkit.setWhitelist(boolean)
        }
    }
}
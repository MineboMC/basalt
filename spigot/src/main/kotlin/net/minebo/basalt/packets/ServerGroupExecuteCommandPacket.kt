package net.minebo.basalt.packets

import net.minebo.basalt.Basalt
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import java.util.UUID

class ServerGroupExecuteCommandPacket(val group: String, val command: String) : RedisPacket("group-execute-command")
{

    override fun action()
    {
        if (Basalt.globalServer.group.equals(group, true)) {
            Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
        }
    }
}
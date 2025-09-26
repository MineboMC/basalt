package net.minebo.basalt.packets

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import java.util.UUID

class ExecuteCommandPacket(val command: String) : RedisPacket("global-execute-command")
{

    override fun action()
    {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), command);
    }
}
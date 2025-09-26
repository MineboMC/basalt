package net.minebo.basalt.packets

import net.minebo.basalt.redis.RedisPacket
import org.bukkit.Bukkit
import org.bukkit.ChatColor
import org.bukkit.entity.Player

class NetworkBroadcastPacket(val permission: String, val message: String) : RedisPacket("network-broadcast")
{
    override fun action()
    {
        Bukkit.getOnlinePlayers().stream()
            .filter { player: Player? -> player!!.hasPermission(permission) }
            .forEach { player: Player? -> player!!.sendMessage(ChatColor.translateAlternateColorCodes('&', message)) }
    }
}
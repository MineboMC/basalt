package net.minebo.basalt.profiles.permissions.packet

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.profiles.permissions.AccessiblePermissionHandler
import net.minebo.basalt.redis.RedisPacket
import org.bukkit.Bukkit
import java.util.*

class PermissionUpdatePacket(var player: UUID) : RedisPacket("permission-update")
{

    override fun action()
    {
        BasaltAPI.quickFindProfile(player).thenAcceptAsync {
            if (it == null) return@thenAcceptAsync

            val player = Bukkit.getPlayer(player) ?: return@thenAcceptAsync

            AccessiblePermissionHandler.update(player, it.getPermissions())
        }
    }
}
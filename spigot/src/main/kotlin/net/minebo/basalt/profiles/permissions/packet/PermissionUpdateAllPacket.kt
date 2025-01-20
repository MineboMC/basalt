package net.minebo.basalt.profiles.permissions.packet

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.profiles.permissions.AccessiblePermissionHandler
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.expirable.RankGrantService
import org.bukkit.Bukkit

class PermissionUpdateAllPacket : RedisPacket("permission-update-all")
{

    override fun action()
    {
        for (player in Bukkit.getOnlinePlayers())
        {
            val gameProfile = BasaltAPI.quickFindProfile(player.uniqueId).get() ?: continue

            RankGrantService.recalculatePlayer(gameProfile)
            AccessiblePermissionHandler.update(player, gameProfile.getPermissions())
        }
    }
}
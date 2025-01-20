package net.minebo.basalt.sync

import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.redis.cache.refresh.RefreshFiltersPacket
import net.minebo.basalt.redis.cache.refresh.RefreshRankPacket
import net.minebo.basalt.redis.cache.refresh.RefreshServersPacket
import org.bukkit.scheduler.BukkitRunnable

class SyncTask : BukkitRunnable()
{

    override fun run()
    {
        val packets = listOf(RefreshRankPacket(), RefreshFiltersPacket(), RefreshServersPacket())

        for (packet in packets)
        {
            AsynchronousRedisSender.send(packet)
        }
    }
}
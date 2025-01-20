package net.minebo.basalt.redis.data.packet

import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.redis.data.RedisDataSyncService

class RedisModelPopulationPacket(
    val id: String,
) : RedisPacket("redis-populate-packet")
{
    override fun action()
    {
        RedisDataSyncService.syncServices[id]?.load()
    }
}
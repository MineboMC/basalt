package net.minebo.basalt.redis.cache.mutate

import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.expirable.RankGrantService
import java.util.*

class UpdateGrantCacheRequest(val target: UUID) : RedisPacket("grant-sync-update")
{

    override fun action()
    {
        RankGrantService.recalculateUUID(target)
    }
}
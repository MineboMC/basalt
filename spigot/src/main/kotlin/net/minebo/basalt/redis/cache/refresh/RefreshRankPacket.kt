package net.minebo.basalt.redis.cache.refresh

import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.ranks.RankService

class RefreshRankPacket : RedisPacket("refresh-rank")
{

    override fun action()
    {
        val cache = RankService.ranks

        cache.clear()

        RankService.getValues().whenComplete { t, u ->
            for (rank in t)
            {
                RankService.ranks[rank.id] = rank
            }
        }
    }
}
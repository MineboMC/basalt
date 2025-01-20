package net.minebo.basalt.redis.cache.refresh

import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.filter.FilterService

class RefreshFiltersPacket : RedisPacket("refresh-filters")
{

    override fun action()
    {
        val cache = FilterService.cache

        cache.clear()

        FilterService.handler.retrieveAllAsync().thenAccept {
            for (item in it)
            {
                cache[item.word] = item
            }
        }
    }
}
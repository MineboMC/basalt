package net.minebo.basalt.redis.cache.refresh

import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.server.UniqueServerService

class RefreshServersPacket : RedisPacket("refresh-tags")
{

    override fun action()
    {
        val cache = UniqueServerService.servers

        cache.clear()

        UniqueServerService.handler.retrieveAllAsync().thenAccept {
            for (server in it)
            {
                cache[server.id] = server
            }
        }
    }
}
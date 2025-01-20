package net.minebo.basalt.redis.cache.mutate

import net.minebo.basalt.Basalt
import net.minebo.basalt.models.server.UniqueServer
import net.minebo.basalt.redis.RedisPacket

/**
 * Class created on 7/29/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class UpdateGlobalServerPacket(val server: UniqueServer) : RedisPacket("update-global-server")
{
    override fun action()
    {
        if (Basalt.globalServer.id == server.id)
        {
            Basalt.globalServer = server
        }
    }
}
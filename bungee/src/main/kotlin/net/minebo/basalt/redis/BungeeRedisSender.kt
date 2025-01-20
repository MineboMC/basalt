package net.minebo.basalt.redis

import net.minebo.basalt.BasaltBungeePlugin

object BungeeRedisSender {

    fun send(packet: RedisPacket) {
        BasaltBungeePlugin.instance.proxy.scheduler.runAsync(BasaltBungeePlugin.instance)
        {
            RedisPacketManager.pool.resource.use { jedis ->
                val encodedPacket = packet.javaClass.name + "|" + RedisPacketManager.gson.toJson(packet)
                jedis.publish("Basalt||Packets||", encodedPacket)
            }
        }
    }
}
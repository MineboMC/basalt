package net.minebo.basalt.redis

import net.minebo.basalt.BasaltBungee

object BungeeRedisSender {

    fun send(packet: RedisPacket) {
        BasaltBungee.instance.proxy.scheduler.runAsync(BasaltBungee.instance)
        {
            RedisPacketManager.pool.resource.use { jedis ->
                val encodedPacket = packet.javaClass.name + "|" + RedisPacketManager.gson.toJson(packet)
                jedis.publish("Basalt||Packets||", encodedPacket)
            }
        }
    }
}
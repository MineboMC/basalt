package net.minebo.basalt.redis

import net.minebo.basalt.BasaltVelocity

object VelocityRedisSender {
    fun send(packet: RedisPacket) {
        BasaltVelocity.instance.server.scheduler.buildTask(BasaltVelocity.instance) {
            RedisPacketManager.pool.resource.use { jedis ->
                val encodedPacket = packet.javaClass.name + "|" + RedisPacketManager.gson.toJson(packet)
                jedis.publish("Basalt||Packets||", encodedPacket)
            }
        }.schedule()
    }
}
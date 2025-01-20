package net.minebo.basalt.redis

import net.minebo.basalt.BasaltVelocityPlugin

object VelocityRedisSender {
    fun send(packet: RedisPacket) {
        BasaltVelocityPlugin.instance.server.scheduler.buildTask(BasaltVelocityPlugin.instance) {
            RedisPacketManager.pool.resource.use { jedis ->
                val encodedPacket = packet.javaClass.name + "|" + RedisPacketManager.gson.toJson(packet)
                jedis.publish("Basalt||Packets||", encodedPacket)
            }
        }.schedule()
    }
}
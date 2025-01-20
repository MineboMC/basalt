package net.minebo.basalt.redis

abstract class RedisPacket(
    val packetId: String
) {

    abstract fun action()
}
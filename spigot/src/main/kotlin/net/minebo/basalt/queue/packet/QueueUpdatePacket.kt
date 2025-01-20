package net.minebo.basalt.queue.packet

import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.queue.QueueService

/**
 * Class created on 7/12/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class QueueUpdatePacket : RedisPacket("queue-update-packet")
{

    override fun action()
    {
        QueueService.loadAllQueues()
    }
}
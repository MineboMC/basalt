package net.minebo.basalt.queue.packet

import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.queue.QueueService
import java.util.*

/**
 * Class created on 7/12/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class QueueRemovePlayerPacket(val queueId: String, val player: UUID) : RedisPacket("queue-remove-player")
{
    override fun action()
    {
        QueueService.byId(queueId).thenAccept { queue ->
            if (queue == null) return@thenAccept

            if (queue.containsPlayer(player))
            {
                queue.removePlayer(player)

                QueueService.saveQueue(queue)
            }
        }
    }
}
package net.minebo.basalt.queue.task

import net.minebo.basalt.queue.packet.QueueRemovePlayerPacket
import net.minebo.basalt.queue.packet.QueueSendPlayerPacket
import net.minebo.basalt.queue.packet.QueueUpdatePacket
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.service.queue.QueueService
import org.bukkit.scheduler.BukkitRunnable

/**
 * Class created on 7/12/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class QueueSendTask : BukkitRunnable()
{

    override fun run()
    {
        for (queue in QueueService.cache.values)
        {
            if (queue.playersInQueue.isEmpty() || queue.getPlayerAt(1) == null)
            {
                continue
            }

            val firstPlayer = queue.getPlayerAt(1)!!
            val uuid = firstPlayer.id

            if (!queue.isAvailable(uuid)) continue

            queue.lastPull = System.currentTimeMillis()

            AsynchronousRedisSender.send(QueueSendPlayerPacket(uuid, queue.id))
            AsynchronousRedisSender.send(QueueRemovePlayerPacket(queue.id, uuid))
            AsynchronousRedisSender.send(QueueUpdatePacket())
        }
    }
}
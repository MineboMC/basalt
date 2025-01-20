package net.minebo.basalt.queue

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.queue.task.QueueRemindUsersTask
import net.minebo.basalt.queue.task.QueueSendTask

/**
 * Class created on 7/12/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object BukkitQueueHandler
{

    fun load()
    {
        if (BasaltSpigotPlugin.instance.config.getBoolean("modules.queue"))
        {
            QueueSendTask().runTaskTimerAsynchronously(
                BasaltSpigotPlugin.instance,
                2 * 20L,
                2 * 20L
            )

            QueueRemindUsersTask().runTaskTimerAsynchronously(
                BasaltSpigotPlugin.instance,
                15 * 20L,
                15 * 20L
            )
        }
    }

}
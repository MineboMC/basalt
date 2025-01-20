package net.minebo.basalt.queue.task

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.service.queue.QueueService
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import org.bukkit.scheduler.BukkitRunnable

class QueueRemindUsersTask : BukkitRunnable()
{

    override fun run()
    {
        for (queue in QueueService.cache.values)
        {
            for (entry in queue.playersInQueue)
            {
                val uuid = entry.id
                val bukkitPlayer = Bukkit.getPlayer(uuid) ?: return

                val message = BasaltSpigotPlugin.instance.config.getStringList("queue-message")

                for (line in message)
                {
                    val toSend = Chat.format(
                        line
                            .replace("<pos>", queue.getPosition(uuid).toString())
                            .replace("<queue_name>", queue.displayName)
                            .replace("<colored_rank>", BasaltAPI.getPlayerRankString(uuid))
                            .replace("<front>", (queue.playersInQueue.size - queue.getPosition(uuid)).toString())
                    )

                    bukkitPlayer.sendMessage(toSend)
                }
            }
        }
    }
}
package net.minebo.basalt.broadcasts

import com.google.gson.reflect.TypeToken
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.broadcasts.model.BroadcastMessage
import net.minebo.basalt.redis.data.RedisDataSync
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import org.bukkit.scheduler.BukkitRunnable
import java.util.concurrent.ThreadLocalRandom

/**
 * Class created on 6/17/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object BroadcastService : RedisDataSync<BroadcastContainer>("broadcast-service", BroadcastContainer::class.java)
{
    override fun destination(): String = "basalt:broadcast-service:"

    override fun key(): String = "all-broadcasts"

    fun startDispatchingBroadcasts()
    {
        object : BukkitRunnable()
        {
            override fun run()
            {
                val cached = cached()
                    ?: return

                for (player in Bukkit.getOnlinePlayers())
                {
                    val possibleEntries = cached.broadcasts
                        .filter { it.value.canBeSentToPlayer(player) }
                        .map { it.value }

                    if (possibleEntries.isNotEmpty())
                    {
                        val randomEntry = possibleEntries[ThreadLocalRandom.current().nextInt(0, possibleEntries.size)]

                        randomEntry.lines.forEach {
                            player.sendMessage(Chat.format(it))
                        }
                    }
                }
            }
        }.runTaskTimerAsynchronously(
            BasaltSpigotPlugin.instance,
            0L,
            BasaltSpigotPlugin.instance.config.getInt("autobroadcast.interval") * 20L
        )
    }
}
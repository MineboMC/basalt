package net.minebo.basalt.profiles.connection.postlog.tasks

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.profiles.connection.postlog.BukkitPostLoginTask
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import org.bukkit.entity.Player

/**
 * Class created on 7/20/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object SendLoadedProfileMessage : BukkitPostLoginTask
{

    override fun run(player: Player)
    {
        Bukkit.getScheduler().runTaskLater(BasaltSpigotPlugin.instance, {
            val config = BasaltSpigotPlugin.instance.config

            if (config.getBoolean("profiles.load.sendMessage"))
            {
                val msg = config.getString("profiles.load.message")
                player.sendMessage(Chat.format(msg))

            }
        }, 10L)
    }
}
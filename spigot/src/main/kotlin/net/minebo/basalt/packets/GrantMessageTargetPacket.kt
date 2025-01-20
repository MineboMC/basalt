package net.minebo.basalt.packets

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import org.bukkit.Bukkit
import java.util.*

/**
 * Class created on 7/29/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class GrantMessageTargetPacket(val target: UUID, val rank: Rank, val duration: Long) :
    RedisPacket("grant-message-target")
{
    override fun action()
    {
        val player = Bukkit.getPlayer(target)

        if (player != null && player.isOnline)
        {
            val message = BasaltSpigotPlugin.instance.config.getString("grant-message")

            player.sendMessage(
                Chat.format(
                    message
                        .replace("<rank>", rank.color + rank.displayName)
                        .replace("<duration>", TimeUtil.formatDuration(duration))
                )
            )
        }
    }
}
package net.minebo.basalt.servers.listener

import net.minebo.basalt.Basalt
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.packets.StaffAuditPacket
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.service.ranks.RankService
import net.minebo.basalt.util.Chat
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerPreLoginEvent

class ServerLockListener : Listener
{

    @EventHandler
    fun asyncJoin(event: AsyncPlayerPreLoginEvent)
    {
        val server = Basalt.globalServer

        if (server.lockedWithRank)
        {
            val rank = RankService.byId(server.lockRank) ?: return

            val it = BasaltAPI.syncFindProfile(event.uniqueId) ?: return

            val theirRank = it.getCurrentRank()

            if (theirRank == null || theirRank.weight < rank.weight)
            {
                event.loginResult = AsyncPlayerPreLoginEvent.Result.KICK_OTHER
                event.kickMessage =
                    Chat.format("&cThis server is currently locked.\nTo bypass, you must have ${rank.color}${rank.displayName}&c!")
                AsynchronousRedisSender.send(StaffAuditPacket(Chat.format("&b[S] &3[${server.displayName}] &r${theirRank.color + it.username} &3tried joining with a rank priority less than that of ${rank.color + rank.displayName}&3.")))
            }
        }
    }
}
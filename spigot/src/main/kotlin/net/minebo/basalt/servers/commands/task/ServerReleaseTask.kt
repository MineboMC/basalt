package net.minebo.basalt.servers.commands.task

import net.minebo.basalt.Basalt
import net.minebo.basalt.packets.StaffGeneralMessagePacket
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.servers.packets.ExplicitServerWhitelistPacket
import net.minebo.basalt.service.server.UniqueServerService
import net.minebo.basalt.util.Chat
import org.bukkit.scheduler.BukkitRunnable

class ServerReleaseTask : BukkitRunnable()
{

    override fun run()
    {
        val server = Basalt.globalServer

        if (server.setToRelease != -1L && (server.setToRelease - System.currentTimeMillis()) <= 0L)
        {
            AsynchronousRedisSender.send(StaffGeneralMessagePacket(Chat.format("&8[&eServer Monitor&8] &fInstance &a" + server.displayName + " &fhas been automatically &eunwhitelisted")))
            server.setToRelease = -1L
            AsynchronousRedisSender.send(ExplicitServerWhitelistPacket(server.id, false))

            UniqueServerService.save(server)
        }
    }
}
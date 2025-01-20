package net.minebo.basalt.queue.packet

import com.google.common.io.ByteStreams
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.queue.QueueService
import net.minebo.basalt.service.server.UniqueServerService
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import java.util.*

class QueueSendPlayerPacket(val id: UUID, val queueDestination: String) : RedisPacket("queue-send-player")
{

    override fun action()
    {
        val player = Bukkit.getPlayer(id) ?: return
        val queue = QueueService.byId(queueDestination).get() ?: return
        val toSend = UniqueServerService.byId(queue.uniqueServerId)

        if (toSend == null)
        {
            player.sendMessage(Chat.format("&cThe destination server does not exist!"))
            return
        }

        player.sendMessage(Chat.format("&6Connecting you to &f" + queue.displayName + "&6..."))

        val out = ByteStreams.newDataOutput()
        out.writeUTF("Connect")
        out.writeUTF(toSend.bungeeName)
        player.sendPluginMessage(BasaltSpigotPlugin.instance, "BungeeCord", out.toByteArray())
    }
}
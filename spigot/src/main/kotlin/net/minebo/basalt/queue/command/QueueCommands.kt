package net.minebo.basalt.queue.command

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import co.aikar.commands.annotation.Subcommand
import net.minebo.basalt.models.queue.QueueStatus
import net.minebo.basalt.queue.command.menu.QueueEditorMenu
import net.minebo.basalt.queue.packet.QueueUpdatePacket
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.service.queue.QueueService
import net.minebo.basalt.service.server.UniqueServerService
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player

/**
 * Class created on 7/12/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@CommandAlias("queue")
@CommandPermission("basalt.queues.admin")
class QueueCommands : BaseCommand()
{

    @Subcommand("editor")
    fun editor(player: Player)
    {
        QueueEditorMenu(player).updateMenu()
    }

    @Subcommand("pause")
    fun pause(player: Player, @Name("queue") queue: String)
    {
        val existing = QueueService.byId(queue.lowercase())

        existing.thenAccept {
            if (it == null)
            {
                player.sendMessage(Chat.format("&cThis queue does not exist!"))
                return@thenAccept
            }

            val uniqueServer = UniqueServerService.byId(it.uniqueServerId)

            if (uniqueServer == null)
            {
                player.sendMessage(Chat.format("&cCannot modify a queue with a null destination!"))
                return@thenAccept
            }

            if (it.status == QueueStatus.PAUSED)
            {
                it.status = QueueStatus.OPEN
                player.sendMessage(Chat.format("&aYou have unpaused the &f" + it.displayName + " &aqueue!"))
                QueueService.saveQueue(it)
                AsynchronousRedisSender.send(QueueUpdatePacket())
            } else if (it.status == QueueStatus.CLOSED || it.status == QueueStatus.OPEN)
            {
                it.status = QueueStatus.PAUSED
                player.sendMessage(Chat.format("&cYou have paused the &f" + it.displayName + " &cqueue!"))
                QueueService.saveQueue(it)
                AsynchronousRedisSender.send(QueueUpdatePacket())
            }
        }
    }
}
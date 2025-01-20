package net.minebo.basalt.redis.command

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import net.minebo.basalt.Basalt
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.redis.LocalPacketPubSub
import net.minebo.basalt.redis.RedisPacketManager
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import org.bukkit.command.CommandSender

object RedisCommand : BaseCommand()
{

    @CommandAlias("redis")
    @CommandPermission("basalt.owner")
    fun redis(player: CommandSender)
    {
        player.sendMessage(Chat.format("&7&m--------------------------"))
        player.sendMessage(Chat.format("&4&lRedis &7❘ &fInformation"))
        player.sendMessage(Chat.format("&7&m--------------------------"))
        val isConnected = !RedisPacketManager.pool.isClosed
        player.sendMessage(Chat.format("&cIs Connected&7: &f${if (isConnected) "&aYes :3" else "&cNo :("}"))
        player.sendMessage(Chat.format("&cListening On&7: &fBasalt||Packets||%packet%"))
        val totalPackets = AsynchronousRedisSender.totalPacketCount
        val receivedPackets = LocalPacketPubSub.received
        player.sendMessage(Chat.format("&cTotal Packets Sent&7: &f${totalPackets}"))
        player.sendMessage(Chat.format("&cTotal Packets Received&7: &f${receivedPackets}"))
        player.sendMessage(
            Chat.format(
                "&cConnected for&7: &f${
                    TimeUtil.formatDuration(
                        System.currentTimeMillis().minus(BasaltSpigotPlugin.instance.launchedAt)
                    )
                }"
            )
        )
        player.sendMessage(Chat.format("&cPort&7: &f${Basalt.redisConnectionPort}"))
        player.sendMessage(Chat.format("&7&m--------------------------"))
    }
}
package net.minebo.basalt.commands.admin

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.Basalt
import net.minebo.basalt.packets.AdminChatPacket
import net.minebo.basalt.redis.AsynchronousRedisSender
import org.bukkit.entity.Player

class AdminChatCommand : BaseCommand()
{

    @CommandAlias("ac|adminchat")
    @CommandPermission("basalt.adminchat")
    fun adminChat(player: Player, @Name("message") message: String)
    {
        AsynchronousRedisSender.send(AdminChatPacket(message, Basalt.globalServer.displayName, player.uniqueId))
    }
}
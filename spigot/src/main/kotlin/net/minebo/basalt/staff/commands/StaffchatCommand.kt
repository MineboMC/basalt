package net.minebo.basalt.staff.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.Basalt
import net.minebo.basalt.packets.StaffMessagePacket
import net.minebo.basalt.redis.AsynchronousRedisSender
import org.bukkit.entity.Player

class StaffchatCommand : BaseCommand()
{

    @CommandAlias("sc|staffchat")
    @CommandPermission("basalt.staffchat")
    fun staffchat(player: Player, @Name("message") message: String)
    {
        AsynchronousRedisSender.send(StaffMessagePacket(message, Basalt.globalServer.displayName, player.uniqueId))
    }
}
package net.minebo.basalt.essentials.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import co.aikar.commands.annotation.Optional
import co.aikar.commands.bukkit.contexts.OnlinePlayer
import net.minebo.basalt.Basalt
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.staff.alerts.StaffActionAlertPacket
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player

class RegenerativeCommands : BaseCommand()
{

    @CommandAlias("heal")
    @CommandPermission("basalt.essentials.heal")
    fun heal(sender: Player, @Name("target") @Optional target: OnlinePlayer?)
    {
        if (target == null)
        {
            sender.health = 20.0
            sender.sendMessage(Chat.format("&6You have been healed!"))
            AsynchronousRedisSender.send(StaffActionAlertPacket("has healed themselves", sender.name, Basalt.globalServer.id))
        } else
        {
            target.player.health = 20.0
            target.player.sendMessage(Chat.format("&6You have been healed!"))
            sender.sendMessage(Chat.format("&6You have healed ${target.player.displayName}"))
            AsynchronousRedisSender.send(StaffActionAlertPacket("has healed ${target.player.name}", sender.name, Basalt.globalServer.id))
        }
    }

    @CommandAlias("feed")
    @CommandPermission("basalt.essentials.feed")
    fun feed(sender: Player, @Name("target") @Optional target: OnlinePlayer?)
    {
        if (target == null)
        {
            sender.foodLevel = 20
            sender.sendMessage(Chat.format("&6You have been fed!"))
            AsynchronousRedisSender.send(StaffActionAlertPacket("has fed themselves", sender.name, Basalt.globalServer.id))
        } else
        {
            target.player.foodLevel = 20
            target.player.sendMessage(Chat.format("&6You have been fed!"))
            sender.sendMessage(Chat.format("&6You have fed ${target.player.displayName}"))
            AsynchronousRedisSender.send(StaffActionAlertPacket("has fed ${target.player.name}", sender.name, Basalt.globalServer.id))
        }
    }
}
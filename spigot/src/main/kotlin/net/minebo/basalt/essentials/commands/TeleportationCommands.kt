package net.minebo.basalt.essentials.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import co.aikar.commands.bukkit.contexts.OnlinePlayer
import net.minebo.basalt.Basalt
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.staff.alerts.StaffActionAlertPacket
import net.minebo.basalt.util.Chat
import org.bukkit.Location
import org.bukkit.entity.Player

class TeleportationCommands : BaseCommand()
{

    @CommandAlias("teleport|tp")
    @CommandPermission("basalt.essentials.teleport.other")
    fun teleport(player: Player, @Name("target") target: OnlinePlayer)
    {
        player.teleport(target.player.location)
        player.sendMessage(Chat.format("&6You have been teleported to " + target.player.displayName))
        AsynchronousRedisSender.send(StaffActionAlertPacket("has teleported to ${target.player.name}", player.name, Basalt.globalServer.id))
    }

    @CommandAlias("tphere|s")
    @CommandPermission("basalt.essentials.teleport.here")
    fun teleportHere(player: Player, @Name("target") target: OnlinePlayer)
    {
        target.player.teleport(player.location)
        player.sendMessage(Chat.format("&6You have teleported " + target.player.displayName + " &6to yourself"))
        target.player.sendMessage(Chat.format("&6You have been teleported to " + player.displayName))
        AsynchronousRedisSender.send(StaffActionAlertPacket("has teleported ${target.player.name} to themselves", player.name, Basalt.globalServer.id))
    }

    @CommandAlias("tppos")
    @CommandPermission("basalt.essentials.teleport.position")
    fun teleportPos(player: Player, @Name("x") x: Int, @Name("y") y: Int, @Name("z") z: Int)
    {
        player.teleport(Location(player.location.world, x.toDouble(), y.toDouble(), z.toDouble()))
        player.sendMessage(Chat.format("&6You have teleported yourself to the location &f$x, $y, $z"))
        AsynchronousRedisSender.send(StaffActionAlertPacket("has teleported to &f$x, $y, $z", player.name, Basalt.globalServer.id))
    }
}
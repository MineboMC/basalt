package net.minebo.basalt.essentials.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.Basalt
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.staff.alerts.StaffActionAlertPacket
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.entity.Player

class WorldCommands : BaseCommand()
{

    @CommandAlias("world")
    @CommandPermission("basalt.essentials.world")
    fun world(player: Player, @Name("world") worldId: String)
    {
        val found = Bukkit.getWorld(worldId)

        if (found == null)
        {
            player.sendMessage(Chat.format("&cThe world with the name &e$worldId &cwas not found"))
            return
        }

        player.teleport(Location(found, found.spawnLocation.x, found.spawnLocation.y, found.spawnLocation.z))
        player.sendMessage(Chat.format("&6You were teleported to the world &f${found.name}"))
        AsynchronousRedisSender.send(StaffActionAlertPacket("has teleported to the world $worldId", player.name, Basalt.globalServer.id))
    }
}
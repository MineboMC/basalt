package net.minebo.basalt.staff.mode.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.Basalt
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.packets.StaffGeneralMessagePacket
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.metadata.FixedMetadataValue

class FreezeCommand : BaseCommand()
{

    @CommandAlias("freeze|ss")
    @CommandPermission("basalt.staffmode")
    fun freeze(player: Player, @Name("target") targetString: String)
    {
        val target = Bukkit.getPlayer(targetString)

        if (target == null)
        {
            player.sendMessage(Chat.format("&cInvalid target"))
            return
        }

        val frozen = target.hasMetadata("frozen")
        val server = Basalt.globalServer.displayName
        val displayExec = BasaltAPI.getRankDisplay(player.uniqueId)
        val displayTarget = BasaltAPI.getRankDisplay(target.uniqueId)

        if (frozen)
        {
            target.removeMetadata("frozen", BasaltSpigotPlugin.instance)
            target.sendMessage(Chat.format("&aYou have been unfrozen."))
            AsynchronousRedisSender.send(StaffGeneralMessagePacket("&b[S] &3[$server] $displayExec &3has unfrozen $displayTarget"))
        } else
        {
            target.setMetadata("frozen", FixedMetadataValue(BasaltSpigotPlugin.instance, true))
            target.sendMessage(Chat.format("&cYou have been frozen."))
            AsynchronousRedisSender.send(StaffGeneralMessagePacket("&b[S] &3[$server] $displayExec &3has frozen $displayTarget"))
        }

    }

}
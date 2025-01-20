package net.minebo.basalt.staff.requests.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.Name
import net.minebo.basalt.Basalt
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.staff.requests.handlers.RequestHandler
import net.minebo.basalt.staff.requests.packets.RequestPacket
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player

class RequestCommand : BaseCommand()
{

    @CommandAlias("request|helpop")
    fun request(player: Player, @Name("reason") rzn: String)
    {
        if (RequestHandler.isOnRequestCooldown(player))
        {
            player.sendMessage(Chat.format("&cPlease wait before trying this again!"))
            return
        }

        val currentServer = Basalt.globalServer.displayName
        val display = BasaltAPI.getRankDisplay(player.uniqueId)

        AsynchronousRedisSender.send(RequestPacket("&9[Request] &7[$currentServer] &b$display &7requested assistance\n     &9Reason: &7$rzn"))
        RequestHandler.requestCooldowns[player.uniqueId] = System.currentTimeMillis()
        player.sendMessage(Chat.format("&aYour request has been sent to every online staff member!"))

    }
}
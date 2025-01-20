package net.minebo.basalt.staff.requests.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.Basalt
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.staff.requests.commands.menu.ReportSelectCategoryMenu
import net.minebo.basalt.staff.requests.handlers.RequestHandler
import net.minebo.basalt.staff.requests.packets.ReportPacket
import net.minebo.basalt.staff.requests.report.ReportModel
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import java.util.*

class ReportCommand : BaseCommand()
{

    @CommandAlias("reports|viewreports")
    @CommandPermission("basalt.staff")
    fun viewReports(player: Player)
    {
        ReportSelectCategoryMenu(player).openMenu()
    }


    @CommandAlias("report")
    fun request(player: Player, @Name("player") other: String, @Name("reason") rzn: String)
    {
        if (RequestHandler.isOnReportCooldown(player))
        {
            player.sendMessage(Chat.format("&cPlease wait before trying this again!"))
            return
        }

        val target = Bukkit.getPlayer(other)

        if (target == null)
        {
            player.sendMessage(Chat.format("&cInvalid target"))
            return
        }

        if (player.name == target.name)
        {
            player.sendMessage(Chat.format("&cYou cannot report yourself!"))
            return
        }


        val currentServer = Basalt.globalServer.displayName
        val display = BasaltAPI.getRankDisplay(player.uniqueId)
        val otherDisplay = BasaltAPI.getRankDisplay(target.uniqueId)

        AsynchronousRedisSender.send(
            ReportPacket(
                "&9[Report] &7[$currentServer] &b$display &7has reported &f$otherDisplay\n     &9Reason: &7$rzn",
                ReportModel(
                    UUID.randomUUID(),
                    rzn,
                    player.uniqueId,
                    target.uniqueId,
                    currentServer,
                    System.currentTimeMillis()
                )
            )
        )
        RequestHandler.reportCooldowns[player.uniqueId] = System.currentTimeMillis()
        player.sendMessage(Chat.format("&aYour report has been sent to every online staff member!"))

    }
}
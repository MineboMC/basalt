package net.minebo.basalt.staff.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.*
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.servers.*
import net.minebo.basalt.service.server.UniqueServerService
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player
import java.util.*

/**
 * Class created on 5/14/2023

 * @author 98ping, AB987
 * @project Basalt
 * @website https://solo.to/redis
 */
class OnlineStaffCommand : BaseCommand()
{

    @CommandAlias("onlinestaff|globalstaff|stafflist")
    @CommandPermission("basalt.staff.list")
    fun onlineStaff(player: Player)
    {
        val allPlayers = mutableListOf<UUID>()
        val servers = UniqueServerService.getValues()
        val msgs = mutableListOf<String>()

        for (server in servers)
        {
            for (player1 in server.players)
            {
                if (!allPlayers.contains(player1))
                {
                    allPlayers.add(player1)
                }
            }
        }

        for (player2 in allPlayers)
        {
            val profile = BasaltAPI.syncFindProfile(player2) ?: continue
            val serverName = UniqueServerService.byId(profile.metadata.get("server").asString.lowercase())?.displayName
                ?: "&cUnknown"

            if (profile.getCurrentRank().staff)
            {
                msgs.add(Chat.format("&7- " + BasaltAPI.getRankDisplay(profile.uuid) + " &eis currently &aonline &eat &f" + serverName))
            }

        }
        player.sendMessage(Chat.format("&e&lOnline Staff Members&7:"))
        for (msg in msgs)
        {
            player.sendMessage(Chat.format(msg))
        }
    }

}
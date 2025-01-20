package net.minebo.basalt.staff.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.Basalt
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.packets.StaffGeneralMessagePacket
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.service.server.UniqueServerService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.NetworkUtil
import net.minebo.basalt.util.TimeUtil
import org.bukkit.entity.Player
import java.util.*

/**
 * Class created on 5/14/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class JumpToPlayerCommand : BaseCommand()
{

    @CommandAlias("jumptoplayer|jtp|jumpto")
    @CommandPermission("basalt.jtp")
    fun jumpTo(player: Player, @Name("target") target: GameProfile)
    {
        val globalServer = Basalt.globalServer
        val onlineServer = target.metadata.get("server").asString
        val uniqueServer = UniqueServerService.byId(onlineServer.lowercase(Locale.getDefault()))

        if (uniqueServer == null || onlineServer.lowercase(Locale.getDefault()).equals("None", ignoreCase = true))
        {
            player.sendMessage(Chat.format("&6&lServer Jump Request"))
            player.sendMessage(Chat.format("&eTarget: &f" + BasaltAPI.getRankDisplay(target.uuid)))
            player.sendMessage(Chat.format("&eDestination: &cNone"))
            player.sendMessage(Chat.format("&eLast Seen: &f${TimeUtil.formatIntoCalendarString(Date(target.lastSeenAt))} ago"))
            player.sendMessage(Chat.format("&cUnable to handle. Proxy issue?"))
            return
        }

        val rank = BasaltAPI.findRank(target.uuid)

        if (rank.weight < target.getCurrentRank().weight)
        {
            player.sendMessage(Chat.format("&cThis player has a higher rank weight than yours!"))
            return
        }

        player.sendMessage(Chat.format("&6&lServer Jump Request"))
        player.sendMessage(Chat.format("&eTarget: &f" + BasaltAPI.getRankDisplay(target.uuid)))
        player.sendMessage(Chat.format("&eDestination: &f" + uniqueServer.displayName))
        player.sendMessage(Chat.format("&eProxy Name: &f" + uniqueServer.bungeeName))
        player.sendMessage(Chat.format("&aCurrently sending..."))
        NetworkUtil.send(player, uniqueServer.id)
        AsynchronousRedisSender.send(
            StaffGeneralMessagePacket(
                Chat.format(
                    "&b[S] &3[${globalServer.displayName}] &r${
                        BasaltAPI.getRankDisplay(
                            player.uniqueId
                        )
                    } &3has jumped to &r${target.getRankDisplay()}&3."
                )
            )
        )
    }
}
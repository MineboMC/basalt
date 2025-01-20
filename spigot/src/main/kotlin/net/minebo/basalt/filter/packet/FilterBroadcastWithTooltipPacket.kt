package net.minebo.basalt.filter.packet

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.server.UniqueServer
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.util.Chat
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.event.HoverEvent
import org.bukkit.Bukkit
import java.util.*

class FilterBroadcastWithTooltipPacket(
    var uniqueServer: UniqueServer,
    var target: UUID,
    var mutes: Int,
    var bans: Int,
    var alreadyPunished: Boolean,
    var message: String
) : RedisPacket("filter-broadcast-packet")
{

    override fun action()
    {
        val target = BasaltAPI.syncFindProfile(target) ?: return
        val hoverComponent = Component.text(Chat.format("&6&m-------------------------"))
            .appendNewline()
            .append(Component.text(Chat.format("&ePreviously Muted: &f$mutes times")))
            .appendNewline()
            .append(Component.text(Chat.format("&ePreviously Banned: &f$bans times")))
            .appendNewline()
            .append(
                Component.text(Chat.format("&eAlready punished: " + if (alreadyPunished) "&aYes" else "&cNo"))
                    .appendNewline()
                    .append(Component.text(Chat.format("&6&m-------------------------")))
            )

        val component = Component.text(
            Chat.format("&e[Filter] &7[${uniqueServer.displayName}] &c(")
        ).append(Component.text(target.username))
            .color(Chat.findTextColorFromString(target.getCurrentRank().color))
            .append(Component.text(Chat.format(" &e-> $message&c)"))).hoverEvent(HoverEvent.showText(hoverComponent))

        Bukkit.getOnlinePlayers().filter { it.hasPermission("basalt.staff") }.forEach {
            BasaltSpigotPlugin.instance.audience.player(it).sendMessage(component.asComponent())
        }
    }
}
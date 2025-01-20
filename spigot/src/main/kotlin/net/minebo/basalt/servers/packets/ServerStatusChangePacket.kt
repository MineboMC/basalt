package net.minebo.basalt.servers.packets

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.models.server.UniqueServer
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.util.Chat
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.event.HoverEvent
import org.bukkit.Bukkit

class ServerStatusChangePacket(
    var message: String,
    var server: UniqueServer
) : RedisPacket("server-status-change-packet")
{

    override fun action()
    {
        val hoverComponent = Component.text(Chat.format("&8&m-------------------------"))
            .appendNewline()
            .append(Component.text(Chat.format("&fServer: &e${server.displayName}")))
            .appendNewline()
            .append(Component.text(Chat.format("&fRam: &e" + server.ramAllocated + "mb")))
            .appendNewline()
            .append(Component.text(Chat.format("&fServer Locked: &e" + if (server.lockedWithRank) "&aYes" else "&cNo")))
            .appendNewline()
            .append(Component.text(Chat.format("&8&m-------------------------")))

        val component = Component.text(
            Chat.format(message)
        ).hoverEvent(HoverEvent.showText(hoverComponent))

        Bukkit.getOnlinePlayers().filter { it.hasPermission("basalt.staff") }.forEach {
            BasaltSpigotPlugin.instance.audience.player(it).sendMessage(component.asComponent())
        }
    }
}
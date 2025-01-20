package net.minebo.basalt.punishment.packets

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.util.Chat
import net.kyori.adventure.text.Component
import net.kyori.adventure.text.event.HoverEvent
import net.kyori.adventure.text.format.NamedTextColor
import org.bukkit.Bukkit
import java.util.*

class PunishmentDispatchPacket(
    var punishmentType: PunishmentType,
    var target: UUID,
    var executor: UUID,
    var silent: Boolean,
    var reason: String
) : RedisPacket(
    "dispatch-punishment"
)
{

    override fun action()
    {
        val profile = BasaltAPI.syncFindProfile(executor)
        val target = BasaltAPI.syncFindProfile(target)
        val hoverComponent = Component.text(Chat.format("&6&m-------------------------"))
            .appendNewline()
            .append(
                Component.text("Target: ").color(NamedTextColor.YELLOW)
                    .append(
                        Component.text(target?.username ?: "Console").color(
                            Chat.findTextColorFromString(
                                target?.getCurrentRank()?.color ?: BasaltAPI.CONSOLE_COLOR
                            )
                        )
                    )
                    .appendNewline()
                    .append(Component.text(Chat.format("&eExecutor: &r")))
                    .append(
                        Component.text(profile?.username ?: "Console").color(
                            Chat.findTextColorFromString(
                                profile?.getCurrentRank()?.color ?: BasaltAPI.CONSOLE_COLOR
                            )
                        )
                    )
            )
            .appendNewline()
            .append(Component.text(Chat.format("&eReason: &f$reason")))
            .appendNewline()
            .append(Component.text(Chat.format("&6&m-------------------------")))

        val component = Component.text(Chat.format((if (silent) "&7(Silent) " else "") + "&r"))
            .append(
                Component.text(profile?.username ?: "Console")
                    .color(Chat.findTextColorFromString(profile?.getCurrentRank()?.color ?: BasaltAPI.CONSOLE_COLOR))
            )
            .append(
                Component.text(
                    Chat.format(
                        " &ahas " +
                                punishmentType.added +
                                " &r"
                    )
                )
            )
            .append(
                Component.text(target?.username ?: "Console")
                    .color(Chat.findTextColorFromString(target?.getCurrentRank()?.color ?: BasaltAPI.CONSOLE_COLOR))
            ).hoverEvent(HoverEvent.showText(hoverComponent))

        Bukkit.getOnlinePlayers().filter { it.hasPermission("basalt.staff") }.forEach {
            BasaltSpigotPlugin.instance.audience.player(it).sendMessage(component.asComponent())
        }
    }
}
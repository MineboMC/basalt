package net.minebo.basalt.punishment.packets

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.models.grant.types.Punishment
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import org.bukkit.Bukkit
import java.util.*

class PunishmentExecutePacket(
    var punishmentType: PunishmentType,
    var target: UUID,
    var reason: String,
    val punishment: Punishment
) : RedisPacket("punishment-execute")
{

    override fun action()
    {
        val player = Bukkit.getPlayer(target)

        if (player != null)
        {
            if (punishmentType == PunishmentType.BLACKLIST)
            {
                BasaltSpigotPlugin.instance.config.getStringList("blacklist-message")
                    .map { it.replace("<reason>", reason) }.forEach { player.sendMessage(Chat.format(it)) }
            } else if (punishmentType == PunishmentType.BAN)
            {
                BasaltSpigotPlugin.instance.config.getStringList("ban-message")
                    .map { it.replace("<reason>", reason) }.forEach { player.sendMessage(Chat.format(it)) }
            } else if (punishmentType == PunishmentType.MUTE)
            {
                BasaltSpigotPlugin.instance.config.getStringList("mute-message")
                    .map { it.replace("<reason>", reason) }.forEach { player.sendMessage(Chat.format(it)) }
            } else if (punishmentType == PunishmentType.WARN)
            {
                BasaltSpigotPlugin.instance.config.getStringList("warn-message")
                    .map { it.replace("<reason>", reason) }.forEach { player.sendMessage(Chat.format(it)) }
            } else if (punishmentType == PunishmentType.KICK)
            {
                val msgs = BasaltSpigotPlugin.instance.config.getStringList("kick-message")

                player.kickPlayer(msgs.map { Chat.format(it).replace("<reason>", reason) }.joinToString("\n"))
            }

            if (punishmentType == PunishmentType.BAN)
            {

                val msgs = BasaltSpigotPlugin.instance.config.getStringList("banned-join")

                msgs.replaceAll { it.replace("<reason>", punishment.reason) }
                msgs.replaceAll {
                    it.replace(
                        "<expires>",
                        if (punishment.expirable.duration == Long.MAX_VALUE) "Never" else TimeUtil.formatDuration(
                            punishment.expirable.addedAt + punishment.expirable.duration - System.currentTimeMillis()
                        )
                    )
                }

                player.kickPlayer(msgs.map { Chat.format(it) }.joinToString("\n"))
            } else if (punishmentType == PunishmentType.BLACKLIST)
            {
                val msgs = BasaltSpigotPlugin.instance.config.getStringList("blacklisted-join")

                msgs.replaceAll { it.replace("<reason>", punishment.reason) }
                msgs.replaceAll {
                    it.replace(
                        "<expires>",
                        if (punishment.expirable.duration == Long.MAX_VALUE) "Never" else TimeUtil.formatDuration(
                            punishment.expirable.addedAt + punishment.expirable.duration - System.currentTimeMillis()
                        )
                    )
                }

                player.kickPlayer(msgs.map { Chat.format(it) }.joinToString("\n"))
            }
        }
    }
}
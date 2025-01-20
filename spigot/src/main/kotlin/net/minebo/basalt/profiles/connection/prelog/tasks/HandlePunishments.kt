package net.minebo.basalt.profiles.connection.prelog.tasks

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.grant.types.Punishment
import net.minebo.basalt.profiles.connection.prelog.BukkitPreLoginTask
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import org.bukkit.event.player.AsyncPlayerPreLoginEvent

/**
 * Class created on 7/20/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object HandlePunishments : BukkitPreLoginTask
{

    override fun run(event: AsyncPlayerPreLoginEvent)
    {
        val profileId = event.uniqueId
        val profile = BasaltAPI.syncFindProfile(profileId) ?: return

        if (profile.hasActivePunishment(PunishmentType.BAN) || profile.hasActivePunishment(PunishmentType.BLACKLIST))
        {
            val option = profile.hasActivePunishment(PunishmentType.BAN)
            val punishment =
                profile.getActivePunishments(if (option) PunishmentType.BAN else PunishmentType.BLACKLIST).firstOrNull()
            val msgs =
                BasaltSpigotPlugin.instance.config.getStringList("${if (option) "banned" else "blacklisted"}-join")

            msgs.replaceAll { it.replace("<reason>", punishment!!.reason) }
            msgs.replaceAll {
                it.replace(
                    "<expires>",
                    if (punishment!!.expirable.duration == Long.MAX_VALUE) "Never" else TimeUtil.formatDuration(
                        punishment.expirable.addedAt + punishment.expirable.duration - System.currentTimeMillis()
                    )
                )
            }

            event.loginResult = AsyncPlayerPreLoginEvent.Result.KICK_BANNED
            event.kickMessage = msgs.map { Chat.format(it) }.joinToString("\n")

            return
        }

        if (profile.alternateAccountHasBlacklist())
        {
            val detectedPunishment: Punishment = profile.getFirstBlacklistFromAlts() ?: return

            val msgs = BasaltSpigotPlugin.instance.config.getStringList("blacklisted-join-related")

            msgs.replaceAll { it.replace("<reason>", detectedPunishment.reason) }
            msgs.replaceAll {
                it.replace(
                    "<related>",
                    BasaltAPI.syncFindProfile(detectedPunishment.target)?.username ?: "N/A"
                )
            }

            msgs.replaceAll {
                it.replace(
                    "<expires>",
                    if (detectedPunishment.expirable.duration == Long.MAX_VALUE) "Never" else TimeUtil.formatDuration(
                        detectedPunishment.expirable.addedAt + detectedPunishment.expirable.duration - System.currentTimeMillis()
                    )
                )
            }
            event.kickMessage = msgs.map { Chat.format(it) }.joinToString("\n")
        }
    }

    override fun shouldBeLazy(): Boolean
    {
        return true
    }
}
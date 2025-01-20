package net.minebo.basalt.profiles.connection.postlog.tasks

import net.minebo.basalt.Basalt
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.packets.StaffGeneralMessagePacket
import net.minebo.basalt.profiles.connection.postlog.BukkitPostLoginTask
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.redis.AsynchronousRedisSender
import org.bukkit.entity.Player

/**
 * Class created on 7/20/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object CheckBanEvasion : BukkitPostLoginTask
{
    override fun run(player: Player)
    {
        val profileId = player.uniqueId
        val profile = BasaltAPI.syncFindProfile(profileId) ?: return
        profile.getAltAccounts().thenAcceptAsync { alts ->
            val isBanEvading = alts.size >= 1 && alts.any {
                it.hasActivePunishment(PunishmentType.BAN) || it.hasActivePunishment(
                    PunishmentType.BLACKLIST
                )
            }

            if (isBanEvading)
            {
                AsynchronousRedisSender.send(
                    StaffGeneralMessagePacket(
                        "&b[S] &3[${Basalt.globalServer.displayName}] ${
                            BasaltAPI.getRankWithPrefix(
                                profileId
                            )
                        } &3may be using an alt to evade a punishment!"
                    )
                )
            }
        }
    }
}
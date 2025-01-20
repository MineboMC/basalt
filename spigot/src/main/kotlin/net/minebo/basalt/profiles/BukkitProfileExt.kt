package net.minebo.basalt.profiles

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.punishment.BukkitPunishmentFunctions
import net.minebo.basalt.service.ranks.RankService
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

/**
 * Class created on 6/30/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */

fun Player.getProfile(): GameProfile?
{
    return BasaltAPI.syncFindProfile(uniqueId)
}

fun Player.getRankDisplay(): String
{
    return BasaltAPI.getRankDisplay(uniqueId)
}

fun Player.getCurrentRank(): Rank
{
    val profile = BasaltAPI.syncFindProfile(player.uniqueId) ?: return RankService.FALLBACK_RANK

    return profile.getCurrentRank()
}

fun CommandSender.getRankDisplay(): String
{
    var finalString = "${BasaltAPI.CONSOLE_COLOR}Console"

    val profile = BasaltAPI.syncFindProfile(BukkitPunishmentFunctions.getSenderUUID(this))

    if (profile != null)
    {
        finalString = profile.getCurrentRank().color + profile.username
    }

    return finalString

}

fun Player.getRankDisplayWithPrefix(): String
{
    return BasaltAPI.getRankWithPrefix(uniqueId)
}
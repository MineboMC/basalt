package net.minebo.basalt.placeholder

import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.profiles.getCurrentRank
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.service.ranks.RankService
import net.minebo.basalt.staff.mode.StaffSuiteManager
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import me.clip.placeholderapi.expansion.PlaceholderExpansion
import org.bukkit.entity.Player

class BasaltExpansion : PlaceholderExpansion() {

    override fun getIdentifier(): String = "basalt"
    override fun getAuthor(): String = "ForestBukkit"
    override fun getVersion(): String = "1.0.0"

    override fun onPlaceholderRequest(player: Player, params: String): String {
        val profile = ProfileGameService.byId(player.uniqueId) ?: return ""

        return when (params) {

            "rankDisplay" -> {
                val disguise = profile.rankDisguiseAttribute?.let { RankService.byId(it.rank) }
                val rank = disguise ?: profile.getCurrentRank() ?: RankService.FALLBACK_RANK
                Chat.format(rank.color + rank.displayName)
            }

            "rankWeight" -> player.getCurrentRank().weight.toString()

            "vanishStatus" -> if (player.hasMetadata("vanish")) "&aYes" else "&cNo"

            "coinTotal" -> profile.coins.toString()

            "totalFriends" -> profile.friends.size.toString()

            "modModeStatus" -> if (StaffSuiteManager.isModMode(player)) "&aYes" else "&cNo"

            "vanishPrefix" -> {
                if (player.hasMetadata("vanish")) "&7[V] " else ""
            }

            "rankPrefix" -> {
                val rank = getEffectiveRank(profile)
                Chat.format(rank.prefix)
            }

            "rankColor" -> {
                val rank = getEffectiveRank(profile)
                Chat.format(rank.color)
            }

            "nametagPrefix" -> {
                val rank = getEffectiveRank(profile)
                val vanish = if (player.hasMetadata("vanish")) "&7[V] " else ""
                Chat.format(vanish + rank.prefix + rank.color)
            }

            "fullNametag" -> {
                val rank = getEffectiveRank(profile)
                val vanish = if (player.hasMetadata("vanish")) "&7[V] " else ""
                Chat.format(vanish + rank.prefix + "%player%")
            }

            "rankExpiresAt" -> {
                val current = profile.getCurrentGrant()
                if (current.expirable.duration == Long.MAX_VALUE) "Never"
                else TimeUtil.formatDuration((current.expirable.addedAt + current.expirable.duration) - System.currentTimeMillis())
            }

            "activeTag" -> Chat.format(profile.getActivePrefix()?.prefix ?: "")

            else -> ""
        }
    }

    private fun getEffectiveRank(profile: net.minebo.basalt.models.profile.GameProfile): Rank {
        val disguise = profile.rankDisguiseAttribute?.let { RankService.byId(it.rank) }
        return disguise ?: profile.getCurrentRank() ?: RankService.FALLBACK_RANK
    }
}
package net.minebo.basalt.velocity.api

import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.service.ranks.RankService
import java.util.UUID
import java.util.concurrent.CompletableFuture

object VelocityAPI {

    fun getPlayerRankString(uuid: UUID): String {
        val current = RankService.FALLBACK_RANK

        val profile = syncFindProfile(uuid) ?: return (current.color + current.displayName)
        val rank = profile.getCurrentRank()

        return rank.color + rank.displayName
    }

    fun getRankWeight(uuid: UUID): Int {
        val profile = syncFindProfile(uuid) ?: return 1
        val currentRank = profile.getCurrentRank()

        return currentRank.weight
    }

    fun quickFindProfile(uuid: UUID): CompletableFuture<GameProfile?> {
        return CompletableFuture.supplyAsync { ProfileGameService.byId(uuid) }
    }

    fun syncFindProfile(uuid: UUID): GameProfile? {
        return ProfileGameService.byId(uuid)
    }

    fun findRank(uuid: UUID): Rank {
        val profile = ProfileGameService.byId(uuid) ?: return RankService.FALLBACK_RANK
        return profile.getCurrentRank()
    }
}
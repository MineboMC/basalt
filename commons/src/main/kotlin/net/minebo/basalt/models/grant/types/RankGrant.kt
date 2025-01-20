package net.minebo.basalt.models.grant.types


import net.minebo.basalt.models.expirables.Expirable
import net.minebo.basalt.models.grant.Grantable
import net.minebo.basalt.models.grant.types.scope.GrantScope
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.punishments.actor.DefaultActor
import net.minebo.basalt.service.expirable.RankGrantService
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.service.ranks.RankService
import java.util.*


data class RankGrant(
    var rankId: String,
    val addedTo: UUID,
    val addedBy: UUID,
    val addedReason: String,
    val duration: Long,
    val actor: DefaultActor,
    val constructorScope: GrantScope? = null
) :
    Grantable<Rank>(
        UUID.randomUUID(),
        addedTo,
        addedBy,
        addedReason,
        Expirable(false, System.currentTimeMillis(), duration, 0L),
        null, null
    ) {

    var internalActor: DefaultActor = actor
    var rank: String = rankId
    var scope: GrantScope? = constructorScope


    fun verifyGrantScope() : GrantScope {
        if (scope == null) return RankGrantService.global

        return scope!!
    }

    fun getIssuedByName() : String
    {
        val profile = ProfileGameService.byId(this.executor) ?: return "Console"

        return profile.username
    }

    override fun getGrantable(): Rank {
       val optional = RankService.byId(rank)

        if (optional != null) {
            return optional
        }

        return RankService.FALLBACK_RANK
    }

}
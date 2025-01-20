package net.minebo.basalt.models.grant.types

import net.minebo.basalt.models.expirables.Expirable
import net.minebo.basalt.models.grant.Grantable
import net.minebo.basalt.models.grant.types.proof.ProofEntry
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.punishments.actor.DefaultActor
import net.minebo.basalt.service.profiles.ProfileGameService
import java.util.*


class Punishment(
    punishmentType: String,
    easyFindId: String,
    proof: MutableList<ProofEntry>,
    addedTo: UUID,
    addedBy: UUID,
    addedReason: String,
    duration: Long,
    actor: DefaultActor
) :
    Grantable<PunishmentType>(
        UUID.randomUUID(),
        addedTo,
        addedBy,
        addedReason,
        Expirable(false, System.currentTimeMillis(), duration, 0L),
        null, null
    ) {

    var punishmentType: String = punishmentType
    var actor: DefaultActor = actor
    var easyFindId: String = easyFindId
    var proof: MutableList<ProofEntry> = proof

    fun getIssuedByName() : String
    {
        val profile = ProfileGameService.byId(this.executor)
        if (profile == null)
        {
            return "Console"
        }

        return profile.username
    }

    fun getTargetProfile() : GameProfile?
    {
        return ProfileGameService.byId(target)
    }

    override fun getGrantable(): PunishmentType {
        return PunishmentType.valueOf(punishmentType)
    }

}
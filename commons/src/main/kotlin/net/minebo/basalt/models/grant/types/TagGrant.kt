package net.minebo.basalt.models.grant.types

import net.minebo.basalt.models.expirables.Expirable
import net.minebo.basalt.models.grant.Grantable
import net.minebo.basalt.models.tags.Tag
import net.minebo.basalt.punishments.actor.DefaultActor
import net.minebo.basalt.service.tags.TagService
import java.util.*


class TagGrant(
    id: String,
    addedTo: UUID,
    addedBy: UUID,
    addedReason: String,
    duration: Long,
    actor: DefaultActor,
) :
    Grantable<Tag>(
        UUID.randomUUID(),
        addedTo,
        addedBy,
        addedReason,
        Expirable(false, System.currentTimeMillis(), duration, 0L),
        null, null
    ) {

    var internalActor: DefaultActor = actor
    var id: String = id

    override fun getGrantable(): Tag? {
        return TagService.byId(id)
    }

}
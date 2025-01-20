package net.minebo.basalt.service.expirable

import io.github.nosequel.data.DataStoreType
import net.minebo.basalt.Basalt
import net.minebo.basalt.models.grant.types.Punishment
import net.minebo.basalt.models.grant.types.RankGrant
import net.minebo.basalt.models.grant.types.TagGrant
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.punishments.actor.ActorType
import java.util.*
import java.util.concurrent.CompletableFuture

object TagGrantService : ExpiringService<TagGrant>() {

    var handler = Basalt.dataHandler.createStoreType<UUID, TagGrant>(Basalt.getDataStoreMethod())


    fun getValues(): CompletableFuture<Collection<TagGrant>> {
        return handler.retrieveAllAsync()
    }

    fun save(tagGrant: TagGrant) {
        handler.storeAsync(tagGrant.uuid, tagGrant)
    }

    override fun clearOutModels() {
        getValues().get().forEach { it.expirable.isActive() }
    }

}
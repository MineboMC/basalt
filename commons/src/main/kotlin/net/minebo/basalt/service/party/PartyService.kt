package net.minebo.basalt.service.party

import io.github.nosequel.data.DataStoreType
import io.github.nosequel.data.store.type.MongoStoreType
import net.minebo.basalt.Basalt
import net.minebo.basalt.models.filter.Filter
import net.minebo.basalt.models.party.Party
import net.minebo.basalt.mongo.MongoStorageCache
import net.minebo.basalt.service.GeneralizedService
import java.util.*
import java.util.concurrent.CompletableFuture

object PartyService : GeneralizedService {

    var handler = Basalt.dataHandler.createStoreType<UUID, Party>(Basalt.getDataStoreMethod())
    val backingPartyCache = mutableMapOf<UUID, Party>()

    fun getParty(uuid: UUID): CompletableFuture<Party?>
    {
        for (party in backingPartyCache.values)
        {
            if (party.leader == uuid
                ||
                party.members[uuid] != null
            ) {
                return CompletableFuture.completedFuture(party)
            }
        }

        return handler.retrieveAllAsync().thenApply { parties ->
            for (mongoParty in parties)
            {
                if (mongoParty.members[uuid] != null
                    ||
                    mongoParty.leader == uuid
                ) {
                    backingPartyCache[mongoParty.id] = mongoParty

                    return@thenApply mongoParty
                }
            }

            null
        }
    }
}
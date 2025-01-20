package net.minebo.basalt.service.session

import io.github.nosequel.data.DataStoreType
import net.minebo.basalt.Basalt
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.models.sessions.Session
import net.minebo.basalt.service.GeneralizedService
import org.bson.Document
import java.util.*
import java.util.concurrent.CompletableFuture
import java.util.concurrent.ConcurrentHashMap

object SessionService : GeneralizedService {

    var handler = Basalt.dataHandler.createStoreType<String, Session>(Basalt.getDataStoreMethod())
    private val rawCollection = Basalt.MongoConnectionPool.getCollection("session")

    var cache = ConcurrentHashMap<UUID, List<Session>>()

    fun save(session: Session) {
        CompletableFuture.runAsync {
            handler.store(session.randomId, session)
        }
    }


    fun loadIntoCache(profile: GameProfile)
    {
        val filter = Document("player", profile.uuid.toString())

        val documents = rawCollection.find(filter)
        val sessions = mutableListOf<Session>()

        for (document in documents)
        {
            sessions.add(Basalt.gson.fromJson(document.toJson(), Session::class.java))
        }

        cache[profile.uuid] = sessions
    }
}
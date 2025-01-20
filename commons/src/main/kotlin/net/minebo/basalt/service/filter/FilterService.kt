package net.minebo.basalt.service.filter

import io.github.nosequel.data.DataStoreType
import net.minebo.basalt.Basalt
import net.minebo.basalt.models.filter.Filter
import net.minebo.basalt.service.GeneralizedService
import org.bson.Document
import java.util.*
import java.util.concurrent.ConcurrentHashMap

object FilterService : GeneralizedService {


    var handler = Basalt.dataHandler.createStoreType<UUID, Filter>(Basalt.getDataStoreMethod())
    val collection = Basalt.MongoConnectionPool.getCollection("filter")

    val cache = ConcurrentHashMap<String, Filter>()

    fun loadIntoCache() {
        handler.retrieveAllAsync().thenAccept {
            for (value in it) {
                cache[value.word] = value
            }
        }
    }

    fun getValues(): Collection<Filter> {
        return handler.retrieveAll()
    }

    fun save(filter: Filter) {
        handler.storeAsync(filter.id, filter)

        cache[filter.word] = filter
    }

    fun byWord(word: String): Filter? {
        val filter = Document("word", word)
        val finder = collection.find(filter).first() ?: return null

        return Basalt.gson.fromJson(finder.toJson(), Filter::class.java)
    }

    fun findInMessage(message: String) : Filter?
    {
        for (filter in cache.values)
        {
            if (message.toLowerCase().contains(filter.word.toLowerCase()))
            {
                return filter
            }
        }

        return null
    }

}
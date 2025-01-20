package net.minebo.basalt.service.tags

import io.github.nosequel.data.DataStoreType
import net.minebo.basalt.Basalt
import net.minebo.basalt.models.tags.Tag
import net.minebo.basalt.service.GeneralizedService
import java.util.concurrent.CompletableFuture
import java.util.concurrent.ConcurrentHashMap

object TagService : GeneralizedService {

    var handler = Basalt.dataHandler.createStoreType<String, Tag>(Basalt.getDataStoreMethod())
    var cache = ConcurrentHashMap<String, Tag>()

    fun loadTags() {
        getValues().thenAccept {
            for (tag in it) {
                cache[tag.id] = tag
            }
        }
    }

    fun getValues() : CompletableFuture<Collection<Tag>> {
        return handler.retrieveAllAsync()
    }

    fun save(tag: Tag) {
        cache[tag.id] = tag
        handler.storeAsync(tag.id, tag)
    }


    fun byId(id: String) : Tag? {
        if (cache.containsKey(id)) {
            return cache[id]
        }

        val future = getValues().thenApply {
            for (tag in it) {
                if (tag.id.equals(id, ignoreCase = true))
                {
                    return@thenApply tag
                }
            }

            return@thenApply null
        }

        return future.get()
    }
}

package net.minebo.basalt.cache.types

import net.minebo.basalt.cache.RedisCache
import java.util.UUID
import java.util.concurrent.CompletableFuture

object UUIDCache : RedisCache<UUID, String>("Basalt:Caches:UUID")
{
    fun findById(id: UUID) : CompletableFuture<String?>
    {
        return CompletableFuture.supplyAsync {
            return@supplyAsync this.aToBCache[id]
        }
    }

    fun findByUsername(name: String) : CompletableFuture<UUID?>
    {
        return CompletableFuture.supplyAsync {
            return@supplyAsync this.btoACache[name]
        }
    }
}
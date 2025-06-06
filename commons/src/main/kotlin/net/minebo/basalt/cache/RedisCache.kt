package net.minebo.basalt.cache

import com.google.gson.reflect.TypeToken
import net.minebo.basalt.Basalt
import net.minebo.basalt.redis.RedisPacketManager
import java.lang.reflect.Type
import java.util.concurrent.CompletableFuture

abstract class RedisCache<A, B>(
    var redisKey: String
) {

    var aToBCache: MutableMap<A, B> = mutableMapOf()
    var btoACache: MutableMap<B, A> = mutableMapOf()

    fun loadAllFromRedis() : CompletableFuture<Void>
    {
        return CompletableFuture.runAsync {
            val type: Type = object : TypeToken<MutableMap<A, B>>() {}.type
            val otherType: Type = object : TypeToken<MutableMap<B, A>>() {}.type
            val start = System.currentTimeMillis()

            RedisPacketManager.pool.resource.use {
                val ex = it.exists("$redisKey:A")

                //a -> b cache
                if (ex)
                {
                    val all = it.get("$redisKey:A")
                    val gson = Basalt.gson.fromJson<MutableMap<A, B>>(all, type)

                    this.aToBCache = gson
                }

                val ex2 = it.exists("$redisKey:B")

                //b -> a cache
                if (ex2)
                {
                    val all = it.get("$redisKey:B")
                    val gson = Basalt.gson.fromJson<MutableMap<B, A>>(all, otherType)

                    this.btoACache = gson
                }

                println("Cache load for $redisKey loaded in ${System.currentTimeMillis().minus(start)}ms")
            }

        }
    }

    fun addToFirstCache(key: A, value: B) : CompletableFuture<B>
    {
        return CompletableFuture.supplyAsync {
            aToBCache[key] = value

            RedisPacketManager.pool.resource.use {
                it.set(
                    "$redisKey:A",
                    Basalt.gson.toJson(aToBCache)
                )
            }
            value
        }
    }

    fun addToSecondCache(key: B, value: A) : CompletableFuture<A>
    {
        return CompletableFuture.supplyAsync {
            btoACache[key] = value

            RedisPacketManager.pool.resource.use {
                it.set(
                    "$redisKey:B",
                    Basalt.gson.toJson(btoACache)
                )
            }
            value
        }
    }
}
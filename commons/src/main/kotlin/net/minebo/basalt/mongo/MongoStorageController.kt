package net.minebo.basalt.mongo

import com.mongodb.client.MongoCollection
import com.mongodb.client.model.Filters
import com.mongodb.client.model.UpdateOptions
import io.github.nosequel.data.DataStoreType
import net.minebo.basalt.Basalt
import net.minebo.basalt.models.party.Party
import net.minebo.basalt.mongo.extensions.deserialize
import net.minebo.basalt.mongo.extensions.eq
import org.bson.Document
import org.bson.conversions.Bson
import java.util.*
import java.util.concurrent.CompletableFuture
import java.util.concurrent.ForkJoinPool
import kotlin.properties.Delegates
import kotlin.reflect.KProperty

/**
 * Class created on 9/27/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class MongoStorageController<K, V>(
    collectionName: String,
    private val serialClass: Class<V>
) {
    private var collection = Basalt.MongoConnectionPool.getCollection(collectionName)

    fun retrieve(
        key: K
    ): CompletableFuture<V?>
    {
        return CompletableFuture.supplyAsync {
            val cursor = collection
                .find(Filters.eq("_id", key.toString()))
                .cursor()

            while (cursor.hasNext())
            {
                val obj = cursor.next() deserialize serialClass

                if (obj != null)
                {
                    return@supplyAsync obj
                }
            }

            null
        }
    }

    fun delete(
        key: K
    ) {
        collection.deleteOne(
            Filters.eq("_id", key.toString())
        )
    }

    fun deleteAsynchronously(
        key: K
    ) = CompletableFuture.runAsync { delete(key) }

    fun aggregate(
        constraints: List<Bson>
    ): CompletableFuture<MutableList<V>>
    {
        return CompletableFuture.supplyAsync {
            val items = mutableListOf<V>()

            val cursor = collection
                .aggregate(constraints)
                .cursor()

            while (cursor.hasNext())
            {
                val obj = cursor.next() deserialize serialClass

                if (obj != null)
                {
                    items.add(obj)
                }
            }

            items
        }
    }

    fun getAll(): CompletableFuture<MutableList<V>>
    {
        return CompletableFuture.supplyAsync {
            val items = mutableListOf<V>()

            val cursor = collection
                .find()
                .cursor()

            while (cursor.hasNext())
            {
                val obj = cursor.next() deserialize serialClass

                if (obj != null)
                {
                    items.add(obj)
                }
            }

            items
        }
    }

    fun asynchronouslyInsert(
        key: K,
        value: V
    ): CompletableFuture<Void> = CompletableFuture.runAsync { insert(key, value) }

    fun insert(
        key: K,
        value: V
    ) {
        collection.updateOne(
            Filters.eq("_id", key.toString()),
            Document(
                "\$set",
                Document.parse(
                    Basalt.gson.toJson(value)
                )
            ),
            UpdateOptions().upsert(true)
        )
    }


    fun <T> filter(
        property: KProperty<T>,
        value: String
    ): CompletableFuture<MutableList<V>>
    {
        return CompletableFuture.supplyAsync {
            val items = mutableListOf<V>()

            val cursor = collection
                .find(property eq value)
                .cursor()

            while (cursor.hasNext())
            {
                val obj = Basalt.gson.fromJson(
                    cursor.next().toJson(),
                    serialClass
                )

                if (obj != null)
                {
                    items.add(obj)
                }
            }

            items
        }
    }
}

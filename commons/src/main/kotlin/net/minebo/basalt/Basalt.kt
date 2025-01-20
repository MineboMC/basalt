package net.minebo.basalt

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import com.google.gson.LongSerializationPolicy
import io.github.nosequel.data.DataHandler
import io.github.nosequel.data.DataStoreType
import io.github.nosequel.data.connection.flatfile.FlatfileConnectionPool
import io.github.nosequel.data.connection.mongo.MongoConnectionPool
import io.github.nosequel.data.store.StoreType
import io.github.nosequel.data.store.type.MongoStoreType
import net.minebo.basalt.cache.types.UUIDCache
import net.minebo.basalt.models.server.UniqueServer
import net.minebo.basalt.redis.RedisPacketManager
import net.minebo.basalt.service.filter.FilterService
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.service.queue.QueueService
import net.minebo.basalt.service.ranks.RankService
import net.minebo.basalt.service.server.UniqueServerService
import net.minebo.basalt.service.tags.TagService
import kotlin.properties.Delegates

object Basalt
{

    //connection
    lateinit var MongoConnectionPool: MongoConnectionPool
    lateinit var FlatFileConnectionPool: FlatfileConnectionPool

    lateinit var dataHandler: DataHandler

    //global properties
    lateinit var globalServer: UniqueServer
    var redisConnectionPort by Delegates.notNull<Int>()

    // store type information
    var usingMongo = false

    var gson: Gson = GsonBuilder()
        .setLongSerializationPolicy(LongSerializationPolicy.STRING)
        .serializeNulls().create()

    fun start(
        useMongo: Boolean,
        mongoConnectionPool: MongoConnectionPool?,
        needsRedis: Boolean,
        redisHost: String,
        redisPort: Int,
        redisUsername: String?,
        redisPassword: String?,
        directory: String? = null
    )
    {
        if (useMongo)
        {
            this.MongoConnectionPool = mongoConnectionPool!!
            this.dataHandler = DataHandler.withConnectionPool(mongoConnectionPool)

            usingMongo = true
        } else
        {
            this.MongoConnectionPool = mongoConnectionPool!!
            this.FlatFileConnectionPool = FlatfileConnectionPool().apply {
                this.directory = directory
            }

            this.dataHandler = DataHandler.withConnectionPool(MongoConnectionPool)
        }

        if (needsRedis)
        {
            RedisPacketManager.load(redisHost, redisPort, redisPassword, redisUsername)
            redisConnectionPort = redisPort
        }

        UniqueServerService.loadAll()
        RankService.loadRanks()
        ProfileGameService.loadIndexes()
        TagService.loadTags()

        FilterService.loadIntoCache()

        if (needsRedis)
        {
            UUIDCache.loadAllFromRedis()
        }
    }
    
    fun getDataStoreMethod(): DataStoreType
    {
        return if (usingMongo)
        {
            DataStoreType.MONGO
        } else
        {
            DataStoreType.FLATFILE
        }
    }
}
package net.minebo.basalt.service.server

import com.google.gson.reflect.TypeToken
import io.github.nosequel.data.DataStoreType
import net.minebo.basalt.Basalt
import net.minebo.basalt.flatfile.FlatfileUtilities
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.models.server.UniqueServer
import net.minebo.basalt.service.GeneralizedService
import java.io.File
import java.lang.reflect.Type
import java.util.concurrent.CompletableFuture
import java.util.concurrent.ConcurrentHashMap

object UniqueServerService : GeneralizedService
{

    var handler = Basalt.dataHandler.createStoreType<String, UniqueServer>(Basalt.getDataStoreMethod())

    val servers = ConcurrentHashMap<String, UniqueServer>()

    // flatfile info
    lateinit var jsonFile: File
    private val type: Type = object : TypeToken<MutableList<UniqueServer>>()
    {}.type

    fun loadAll()
    {
        val list = handler.retrieveAll()

        if (Basalt.usingMongo)
        {

            for (server in list)
            {
                servers[server.id] = server
            }
        } else
        {
            FlatfileUtilities.getAllEntries(jsonFile, type, mutableListOf<UniqueServer>())?.forEach {
                servers[it.id] = it
            }
        }
    }

    fun getValues(): Collection<UniqueServer>
    {
        return servers.values
    }

    fun save(server: UniqueServer)
    {
        servers[server.id] = server

        if (Basalt.usingMongo)
        {
            CompletableFuture.runAsync {
                handler.store(server.id, server)
            }
        } else
        {
            FlatfileUtilities.writeToFile(jsonFile, servers.values, type)
        }
    }

    fun updateGlobalServer(server: UniqueServer)
    {
        Basalt.globalServer = server
    }

    fun byId(id: String): UniqueServer?
    {
        if (servers.containsKey(id)) return servers[id]

        return handler.retrieve(id)
    }
}
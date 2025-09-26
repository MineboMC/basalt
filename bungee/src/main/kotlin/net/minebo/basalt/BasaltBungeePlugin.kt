package net.minebo.basalt

import io.github.nosequel.data.connection.mongo.AuthenticatedMongoConnectionPool
import io.github.nosequel.data.connection.mongo.NoAuthMongoConnectionPool
import io.github.nosequel.data.connection.mongo.URIMongoConnectionPool
import net.minebo.basalt.listeners.BungeeListener
import net.minebo.basalt.motd.MotdListener
import net.minebo.basalt.whitelist.WhitelistListener
import net.minebo.basalt.commands.MotdCommand
import net.minebo.basalt.commands.WhitelistCommand
import net.md_5.bungee.api.plugin.Plugin
import net.md_5.bungee.config.Configuration
import net.md_5.bungee.config.ConfigurationProvider
import net.md_5.bungee.config.YamlConfiguration
import java.io.File

class BasaltBungeePlugin : Plugin() {

    companion object {
        lateinit var instance: BasaltBungeePlugin
    }

    val config = ConfigurationProvider.getProvider(YamlConfiguration::class.java)

    lateinit var configuration: Configuration
    lateinit var configFile: File

    fun saveConfig() {
        config.save(configuration, configFile)
    }

    override fun onEnable() {
        instance = this

        if (!dataFolder.exists()) {
            dataFolder.mkdir()
        }

        val file = File(dataFolder, "config.yml")
        configFile = file

        if (!file.exists()) {
            file.createNewFile()
            configuration = config.load(file)

            configuration.set("mongo.host", "127.0.0.1")
            configuration.set("mongo.port", 27017)
            configuration.set("mongo.authDB", "admin")
            configuration.set("mongo.password", "")
            configuration.set("mongo.username", "")
            configuration.set("mongo.database", "Basalt")
            configuration.set("mongo.auth", false)

            configuration.set("uri", "")

            configuration.set("redis.host", "127.0.0.1")
            configuration.set("redis.port", 6379)
            configuration.set("redis.username", "")
            configuration.set("redis.password", "")

            // MOTD defaults
            configuration.set("motd.normal", listOf(
                "Welcome to the server!",
                "Enjoy your stay."
            ))
            configuration.set("motd.whitelist", listOf(
                "Server is currently whitelisted.",
                "Please try again later."
            ))

            // Whitelist defaults
            configuration.set("whitelist.enabled", true)
            configuration.set("whitelist.kick-message", listOf(
                "&cYou are not whitelisted."
            ))
            configuration.set("whitelist.uuids", listOf(
                "15f0316d-84f0-404f-84ff-19fae1a0d289"
            ))

            config.save(configuration, file)
        } else {
            configuration = config.load(file)
        }

        val authEnabled = configuration.getBoolean("mongo.auth")

        println(authEnabled)

        if (configuration.getString("uri") != "") {
            val connectionPool = URIMongoConnectionPool().apply {
                this.databaseName = configuration.getString("mongo.database")
                this.uri = configuration.getString("uri")
            }

            Basalt.start(true, connectionPool,
                true,
                configuration.getString("redis.host"),
                configuration.getInt("redis.port"),
                (if (configuration.getString("redis.username") == "") null else configuration.getString("redis.username")),
                (if (configuration.getString("redis.password") == "") null else configuration.getString("redis.password"))
            )
        } else if (authEnabled) {
            val connectionPool = AuthenticatedMongoConnectionPool().apply {
                hostname = configuration.getString("mongo.host")
                password = configuration.getString("mongo.password")
                username = configuration.getString("mongo.username")
                port = configuration.getInt("mongo.port")
                databaseName = configuration.getString("mongo.database")
                authDb = configuration.getString("mongo.authDB")
            }

            Basalt.start(true, connectionPool,
                true,
                configuration.getString("redis.host"),
                configuration.getInt("redis.port"),
                (if (configuration.getString("redis.username") == "") null else configuration.getString("redis.username")),
                (if (configuration.getString("redis.password") == "") null else configuration.getString("redis.password"))
            )
        } else {
            val connectionPool = NoAuthMongoConnectionPool().apply {
                hostname = configuration.getString("mongo.host")
                port = configuration.getInt("mongo.port")
                databaseName = configuration.getString("mongo.database")
            }

            Basalt.start(true, connectionPool,
                true,
                configuration.getString("redis.host"),
                configuration.getInt("redis.port"),
                (if (configuration.getString("redis.username") == "") null else configuration.getString("redis.username")),
                (if (configuration.getString("redis.password") == "") null else configuration.getString("redis.password"))
            )
        }

        // Listeners already present
        proxy.pluginManager.registerListener(this, BungeeListener())

        // New: Register MOTD and Whitelist listeners
        proxy.pluginManager.registerListener(this, MotdListener())
        proxy.pluginManager.registerListener(this, WhitelistListener())

        // New: Register simple commands for MOTD and Whitelist management
        proxy.pluginManager.registerCommand(this, WhitelistCommand())
        proxy.pluginManager.registerCommand(this, MotdCommand())
    }
}
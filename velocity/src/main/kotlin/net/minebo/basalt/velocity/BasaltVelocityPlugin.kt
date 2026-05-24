package net.minebo.basalt.velocity

import com.google.inject.Inject
import com.velocitypowered.api.command.CommandManager
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.proxy.ProxyInitializeEvent
import com.velocitypowered.api.plugin.Plugin
import com.velocitypowered.api.plugin.annotation.DataDirectory
import com.velocitypowered.api.proxy.ProxyServer
import net.minebo.basalt.Basalt
import net.minebo.basalt.velocity.commands.MotdCommand
import net.minebo.basalt.velocity.commands.WhitelistCommand
import net.minebo.basalt.velocity.listeners.PlayerListener
import net.minebo.basalt.velocity.listeners.VelocityListener
import net.minebo.basalt.velocity.motd.MotdListener
import org.slf4j.Logger
import java.nio.file.Files
import java.nio.file.Path

@Plugin(
    id = "basalt",
    name = "Basalt",
    version = "1.0.0",
    authors = ["Ian Rich"]
)
class BasaltVelocityPlugin @Inject constructor(
    val proxy: ProxyServer,
    val logger: Logger,
    @DataDirectory val dataDirectory: Path,
    val commandManager: CommandManager
) {

    companion object {
        lateinit var instance: BasaltVelocityPlugin
            private set
    }

    lateinit var configFile: Path
    lateinit var configuration: BasaltConfig

    fun saveConfig() {
        BasaltConfigIo.save(configuration, configFile)
    }

    @Subscribe
    fun onProxyInitialize(event: ProxyInitializeEvent) {
        instance = this

        if (!Files.exists(dataDirectory)) {
            Files.createDirectories(dataDirectory)
        }

        configFile = dataDirectory.resolve("config.yml")

        if (!Files.exists(configFile)) {
            Files.createFile(configFile)
            configuration = BasaltConfig.defaults()
            saveConfig()
        } else {
            configuration = BasaltConfigIo.load(configFile)
        }

        val authEnabled = configuration.mongo.auth

        if (configuration.uri.isNotBlank()) {
            val connectionPool = io.github.nosequel.data.connection.mongo.URIMongoConnectionPool().apply {
                databaseName = configuration.mongo.database
                uri = configuration.uri
            }

            Basalt.start(
                true, connectionPool,
                true,
                configuration.redis.host,
                configuration.redis.port,
                configuration.redis.username.ifBlank { null },
                configuration.redis.password.ifBlank { null }
            )
        } else if (authEnabled) {
            val connectionPool = io.github.nosequel.data.connection.mongo.AuthenticatedMongoConnectionPool().apply {
                hostname = configuration.mongo.host
                password = configuration.mongo.password
                username = configuration.mongo.username
                port = configuration.mongo.port
                databaseName = configuration.mongo.database
                authDb = configuration.mongo.authDB
            }

            Basalt.start(
                true, connectionPool,
                true,
                configuration.redis.host,
                configuration.redis.port,
                configuration.redis.username.ifBlank { null },
                configuration.redis.password.ifBlank { null }
            )
        } else {
            val connectionPool = io.github.nosequel.data.connection.mongo.NoAuthMongoConnectionPool().apply {
                hostname = configuration.mongo.host
                port = configuration.mongo.port
                databaseName = configuration.mongo.database
            }

            Basalt.start(
                true, connectionPool,
                true,
                configuration.redis.host,
                configuration.redis.port,
                configuration.redis.username.ifBlank { null },
                configuration.redis.password.ifBlank { null }
            )
        }

        proxy.eventManager.register(this, PlayerListener())
        proxy.eventManager.register(this, VelocityListener())
        proxy.eventManager.register(this, MotdListener())

        commandManager.register(
            commandManager.metaBuilder("whitelist").aliases("wl").build(),
            WhitelistCommand()
        )
        commandManager.register(
            commandManager.metaBuilder("motd").build(),
            MotdCommand()
        )
    }
}
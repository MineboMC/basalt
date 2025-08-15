package net.minebo.basalt

import co.aikar.commands.PaperCommandManager
import io.github.nosequel.data.connection.mongo.AuthenticatedMongoConnectionPool
import io.github.nosequel.data.connection.mongo.MongoConnectionPool
import io.github.nosequel.data.connection.mongo.NoAuthMongoConnectionPool
import io.github.nosequel.data.connection.mongo.URIMongoConnectionPool
import net.minebo.basalt.aikar.ACFCommandController
import net.minebo.basalt.broadcasts.BroadcastService
import net.minebo.basalt.commands.coins.listener.CoinShopLoadTransactionsListener
import net.minebo.basalt.filter.listener.FilterListener
import net.minebo.basalt.grants.GrantConfigurationService
import net.minebo.basalt.module.PluginModuleHandler
import net.minebo.basalt.network.listener.NetworkJoinAndLeaveListener
import net.minebo.basalt.placeholder.BasaltExpansion
import net.minebo.basalt.profiles.ProfileJoinListener
import net.minebo.basalt.profiles.commands.auth.listener.AuthListener
import net.minebo.basalt.queue.BukkitQueueHandler
import net.minebo.basalt.redis.LocalPacketPubSub
import net.minebo.basalt.redis.RedisPacketManager
import net.minebo.basalt.repository.BasaltRepositoryService
import net.minebo.basalt.servers.commands.task.ServerReleaseTask
import net.minebo.basalt.servers.listener.ServerLockListener
import net.minebo.basalt.servers.statistic.StatisticManager
import net.minebo.basalt.servers.task.ServerUpdateRunnable
import net.minebo.basalt.service.vouchers.VoucherService
import net.minebo.basalt.staff.mode.listeners.FrozenPlayerListener
import net.minebo.basalt.staff.mode.listeners.GenericStaffmodePreventionListener
import net.minebo.basalt.staff.mode.listeners.StaffmodeFunctionalityListener
import net.minebo.basalt.sync.SyncTask
import net.minebo.basalt.tasks.ClearOutExpirablesTask
import net.minebo.basalt.themes.ThemeLoader
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.listener.MenuListener
import net.minebo.basalt.util.menu.update.MenuAutoUpdate
import net.minebo.basalt.vault.VaultHookManager
import net.minebo.basalt.webhook.WebhookService
import net.kyori.adventure.platform.bukkit.BukkitAudiences
import org.apache.maven.artifact.versioning.DefaultArtifactVersion
import org.bukkit.Bukkit
import org.bukkit.plugin.java.JavaPlugin
import kotlin.concurrent.thread
import kotlin.properties.Delegates


class BasaltSpigotPlugin : JavaPlugin()
{

    companion object
    {
        lateinit var instance: BasaltSpigotPlugin
    }

    var launchedAt by Delegates.notNull<Long>()
    lateinit var commandManager: PaperCommandManager
    lateinit var audience: BukkitAudiences

    override fun onEnable()
    {
        saveDefaultConfig()
        instance = this
        launchedAt = System.currentTimeMillis()

        sendStartupMSG()

        val startMongo = System.currentTimeMillis()

        val enabled = config.getBoolean("mongo.enabled")
        val authEnabled = config.getBoolean("mongo.auth")
        val uri = config.getString("uri")

        var connectionPool: MongoConnectionPool? = null

        if (enabled)
        {
            if (uri != "")
            {
                connectionPool = URIMongoConnectionPool().apply {
                    this.databaseName = config.getString("mongo.database")
                    this.uri = uri
                }
                Chat.sendConsoleMessage(
                    "&a[Mongo] &fDetected URI authentication system on &aMongoDB"
                )
            } else if (authEnabled)
            {
                connectionPool = AuthenticatedMongoConnectionPool().apply {
                    hostname = config.getString("mongo.host")
                    password = config.getString("mongo.password")
                    username = config.getString("mongo.username")
                    port = config.getInt("mongo.port")
                    databaseName = config.getString("mongo.database")
                    authDb = config.getString("mongo.authDB")
                }

                Chat.sendConsoleMessage(
                    "&a[Mongo] &fDetected generic authentication system on &aMongoDB"
                )
            } else
            {
                connectionPool = NoAuthMongoConnectionPool().apply {
                    hostname = config.getString("mongo.host")
                    port = config.getInt("mongo.port")
                    databaseName = config.getString("mongo.database")
                }

                Chat.sendConsoleMessage(
                    "&a[Mongo] &fDetected no authentication system on &aMongoDB"
                )
            }
        }

        Basalt.start(
            enabled,
            connectionPool
                ?: NoAuthMongoConnectionPool().apply {
                    hostname = config.getString("mongo.host")
                    port = config.getInt("mongo.port")
                    databaseName = config.getString("mongo.database")
                },
            true,
            config.getString("redis.host")!!,
            config.getInt("redis.port"),
            (if (config.getString("redis.username") == "") null else config.getString("redis.username")),
            (if (config.getString("redis.password") == "") null else config.getString("redis.password")),
            this.dataFolder.path
        )

        Chat.sendConsoleMessage(
            "&a[Mongo] &fDetected mongo auth type and loaded in &a" + System.currentTimeMillis()
                .minus(startMongo) + "ms"
        )

        audience = BukkitAudiences.create(this)

        val commandsStart = System.currentTimeMillis()

        ACFCommandController.registerAll()

        Chat.sendConsoleMessage(
            "&3[Commands] &fAll commands registered in &3" + System.currentTimeMillis().minus(commandsStart) + "ms"
        )

        PluginModuleHandler.loadModules()

        val themeStart = System.currentTimeMillis()
        ThemeLoader.loadAllThemes()

        Chat.sendConsoleMessage(
            "&d[Themes] &fAll themes loaded in &d" + System.currentTimeMillis().minus(themeStart) + "ms"
        )

        val pubsubStart = System.currentTimeMillis()
        thread {
            RedisPacketManager.pool.resource.use {
                it.subscribe(LocalPacketPubSub, "Basalt||Packets||")
            }
        }

        GrantConfigurationService.loadAllDurationModel()
        GrantConfigurationService.loadAllReasonModel()

        Chat.sendConsoleMessage(
            "&4[Jedis] &fJedis publisher started in &4" + System.currentTimeMillis().minus(pubsubStart) + "ms"
        )

        val listenerStart = System.currentTimeMillis()
        server.pluginManager.registerEvents(ProfileJoinListener(), this)
        server.pluginManager.registerEvents(MenuListener(), this)

        if (config.getBoolean("modules.filters"))
        {
            server.pluginManager.registerEvents(FilterListener, this)
        }

        if (config.getBoolean("modules.coins"))
        {
            server.pluginManager.registerEvents(CoinShopLoadTransactionsListener(), this)
        }

        if (config.getBoolean("modules.2fa"))
        {
            server.pluginManager.registerEvents(AuthListener(), this)
        }

        server.pluginManager.registerEvents(NetworkJoinAndLeaveListener(), this)
        server.pluginManager.registerEvents(ServerLockListener(), this)

        if (config.getBoolean("modules.staffmode"))
        {
            server.pluginManager.registerEvents(FrozenPlayerListener(), this)
            server.pluginManager.registerEvents(GenericStaffmodePreventionListener(), this)
            server.pluginManager.registerEvents(StaffmodeFunctionalityListener(), this)
        }

        Chat.sendConsoleMessage(
            "&e[Listeners] &fListeners loaded in &e" + System.currentTimeMillis().minus(listenerStart) + "ms"
        )


        if (config.getBoolean("autobroadcast.enabled"))
        {
            BroadcastService.load()
            BroadcastService.startDispatchingBroadcasts()
        }

        ClearOutExpirablesTask.runTaskTimerAsynchronously(this, 0L, 20L)
        ServerUpdateRunnable.runTaskTimerAsynchronously(this, 0L, 80L)
        (ServerReleaseTask()).runTaskTimer(this, 0L, 20L)
        (SyncTask()).runTaskTimer(this, 0L, 60L * 20L)
        MenuAutoUpdate().runTaskTimer(this, 20L, 20L)

        StatisticManager.loadStats()

        val vaultStart = System.currentTimeMillis()
        VaultHookManager.loadVault()

        Chat.sendConsoleMessage(
            "&6[Vault] &fHooked in &6" + System.currentTimeMillis().minus(vaultStart) + "ms"
        )

        val voucherStart = System.currentTimeMillis()
        VoucherService.loadVoucherGrants()
        VoucherService.loadVoucherTemplates()

        Chat.sendConsoleMessage(
            "&5[Vouchers] &fAll vouchers loaded in &5" + System.currentTimeMillis().minus(voucherStart) + "ms"
        )

        val papiStart = System.currentTimeMillis()
        registerExpansion()

        Chat.sendConsoleMessage(
            "&b[Placeholders] &fAll placeholders loaded in &b" + System.currentTimeMillis().minus(papiStart) + "ms"
        )

        val discordStart = System.currentTimeMillis()

        if (config.getBoolean("discord.punishments.enabled"))
        {

            WebhookService.createPunishmentClient(config.getString("discord.punishments.webhookLink")!!)
        }

        if (config.getBoolean("discord.grants.enabled"))
        {
            WebhookService.createRankGrantClient(config.getString("discord.grants.webhookLink")!!)
        }

        Chat.sendConsoleMessage(
            "&5[Discord] &fAll modules registered in &5" + System.currentTimeMillis().minus(discordStart) + "ms"
        )


        val queueStart = System.currentTimeMillis()

        BukkitQueueHandler.load()

        Chat.sendConsoleMessage(
            "&e[Queue] &fAll queues registered in &e" + System.currentTimeMillis().minus(queueStart) + "ms"
        )
    }

    fun sendStartupMSG()
    {
        Chat.sendMultiConsoleMessage(
            arrayOf(
                "&7&m--------------------------------",
                "&b&lBasalt Network Core &7- &3Forked from 98ping's alchemist!",
                "&7&m--------------------------------",
            )
        )
    }

    fun registerExpansion()
    {
        if (Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null)
        {
            BasaltExpansion().register()
        }
    }
}
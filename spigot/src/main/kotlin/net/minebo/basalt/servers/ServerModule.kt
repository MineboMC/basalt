package net.minebo.basalt.servers

import co.aikar.commands.BaseCommand
import net.minebo.basalt.Basalt
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.aikar.ACFCommandController
import net.minebo.basalt.commands.vouchers.VoucherCommand
import net.minebo.basalt.models.server.UniqueServer
import net.minebo.basalt.models.server.software.ServerPlugin
import net.minebo.basalt.models.server.software.ServerSoftware
import net.minebo.basalt.module.PluginModule
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.servers.commands.HubCommand
import net.minebo.basalt.servers.commands.ServerEnvironmentCommand
import net.minebo.basalt.servers.commands.WhereAmICommand
import net.minebo.basalt.servers.packets.ServerStatusChangePacket
import net.minebo.basalt.service.queue.QueueService
import net.minebo.basalt.service.server.UniqueServerService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.NetworkUtil
import org.bukkit.Bukkit
import java.util.*

/**
 * Class created on 7/21/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object ServerModule : PluginModule
{
    override fun onLoad()
    {
        val config = BasaltSpigotPlugin.instance.config
        val serversStart = System.currentTimeMillis()

        if (UniqueServerService.byId(config.getString("server.id")!!.lowercase(Locale.getDefault())) == null)
        {
            val server = UniqueServer(
                config.getString("server.id")!!.lowercase(),
                config.getString("server.id")!!,
                config.getString("server.id")!!,
                arrayListOf(),
                Bukkit.getServer().maxPlayers,
                true,
                (Runtime.getRuntime().maxMemory() / (1024 * 1024)).toInt(),
                config.getString("server.id")!!,
                -1L,
                false,
                "",
                System.currentTimeMillis()
            )

            Chat.sendConsoleMessage(
                "&cServer was not originally found so it was created instead"
            )

            setupPluginSoftware(server)
            UniqueServerService.save(server)
            UniqueServerService.updateGlobalServer(server)
        } else
        {
            val server = UniqueServerService.byId(config.getString("server.id")!!.lowercase(Locale.getDefault()))!!

            Chat.sendConsoleMessage("&eFound server with the id " + server.id + " in your database")
            server.ramAllocated = (Runtime.getRuntime().maxMemory() / (1024 * 1024)).toInt()
            server.online = true

            //save server so when we refresh data carries
            setupPluginSoftware(server)
            UniqueServerService.save(server)
            UniqueServerService.updateGlobalServer(server)
        }

        AsynchronousRedisSender.send(
            ServerStatusChangePacket(
                Chat.format("&8[&eServer Monitor&8] &fAdding server " + Basalt.globalServer.displayName + "..."),
                Basalt.globalServer
            )
        )

        NetworkUtil.load()
        QueueService.loadAllQueues()

        Chat.sendConsoleMessage(
            "&6[Servers] &fServer instance loaded in &6" + System.currentTimeMillis().minus(serversStart) + "ms"
        )
    }

    fun setupPluginSoftware(server: UniqueServer)
    {
        val version = Bukkit.getBukkitVersion()
        val plugins = Bukkit.getPluginManager().plugins.map {
            ServerPlugin(
                it.description.name,
                it.description.version,
                it.description.authors.joinToString(", "),
                it.description.main
            )
        }

        server.serverSoftware = ServerSoftware(version, plugins.toMutableList())
    }

    override fun getCommands(): MutableList<BaseCommand>
    {
        val commands = mutableListOf<BaseCommand>()

        commands.add(ServerEnvironmentCommand())
        commands.add(WhereAmICommand)

        if (BasaltSpigotPlugin.instance.config.getBoolean("hubCommand.enabled"))
        {
            commands.add(HubCommand)
        }

        return commands
    }

    override fun getModularConfigOption(): Boolean
    {
        return true
    }
}
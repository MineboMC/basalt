package net.minebo.basalt.util

/**
 * Class created on 5/14/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
import com.google.common.collect.Iterables
import com.google.common.io.ByteStreams
import net.minebo.basalt.BasaltSpigotPlugin
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.plugin.messaging.PluginMessageListener
import org.bukkit.scheduler.BukkitRunnable
import java.io.ByteArrayOutputStream
import java.io.DataOutputStream
import java.io.IOException
import java.util.concurrent.ConcurrentHashMap
import java.util.function.Consumer

object NetworkUtil : PluginMessageListener
{
    private val playerCounts: MutableMap<String, Int> = ConcurrentHashMap()

    fun getPlayerCounts(): Map<String, Int>
    {
        return playerCounts
    }

    private val servers = listOf("ALL") //could be used for individual servers but I CBA rn

    fun load()
    {
        Bukkit.getServer().messenger.registerOutgoingPluginChannel(BasaltSpigotPlugin.instance, "BungeeCord")
        Bukkit.getServer().messenger.registerIncomingPluginChannel(BasaltSpigotPlugin.instance, "BungeeCord", this)

        object : BukkitRunnable()
        {
            override fun run()
            {
                servers.forEach(Consumer { server: String ->
                    getPlayerCount(
                        server
                    )
                })
            }
        }.runTaskTimerAsynchronously(BasaltSpigotPlugin.instance, 20L, 20L)
    }

    override fun onPluginMessageReceived(channel: String, player: Player, message: ByteArray)
    {
        if (!channel.equals("BungeeCord", ignoreCase = true)) return

        val `in` = ByteStreams.newDataInput(message)
        val subchannel = `in`.readUTF()

        if (subchannel.equals("PlayerCount", ignoreCase = true)) try
        {
            val server = `in`.readUTF()
            val count = `in`.readInt()
            if (servers.contains(server))
            {
                playerCounts[server] = Integer.valueOf(count)
            }
        } catch (exception: Exception)
        {
            return
        }
    }

    fun send(player: Player, server: String?)
    {
        val b = ByteArrayOutputStream()
        val out = DataOutputStream(b)
        try
        {
            out.writeUTF("Connect")
            out.writeUTF(server)
        } catch (ignored: IOException)
        {
        }
        player.sendPluginMessage(BasaltSpigotPlugin.instance, "BungeeCord", b.toByteArray())
    }

    fun sendAll(server: String?)
    {
        val b = ByteArrayOutputStream()
        val out = DataOutputStream(b)
        try
        {
            out.writeUTF("Connect")
            out.writeUTF(server)
        } catch (ignored: IOException)
        {
        }
        for (player in Bukkit.getOnlinePlayers())
        {
            player.sendPluginMessage(BasaltSpigotPlugin.instance, "BungeeCord", b.toByteArray())
        }
    }

    fun getPlayerCount(server: String)
    {
        val out = ByteStreams.newDataOutput()
        out.writeUTF("PlayerCount")
        out.writeUTF(server)

        Iterables.getFirst(Bukkit.getOnlinePlayers(), null)
            ?.sendPluginMessage(BasaltSpigotPlugin.instance, "BungeeCord", out.toByteArray())
    }
}
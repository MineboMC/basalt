package net.minebo.basalt.profiles

import net.minebo.basalt.Basalt
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.chat.ChatService
import net.minebo.basalt.packets.StaffMessagePacket
import net.minebo.basalt.profiles.connection.postlog.BukkitPostLoginConnection
import net.minebo.basalt.profiles.connection.prelog.BukkitPreLoginConnection
import net.minebo.basalt.profiles.permissions.AccessiblePermissionHandler
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.service.ranks.RankService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import me.clip.placeholderapi.PlaceholderAPI
import org.bukkit.entity.Player
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerChatEvent
import org.bukkit.event.player.AsyncPlayerPreLoginEvent
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerQuitEvent
import java.util.*


class ProfileJoinListener : Listener
{

    @EventHandler
    fun autoFormatChat(event: AsyncPlayerChatEvent)
    {
        var prefixString = ""

        val profile = BasaltAPI.quickFindProfile(event.player.uniqueId).join() ?: return

        var colorString = ""

        if (profile.hasActivePrefix())
        {

            val prefix = profile.getActivePrefix()

            if (prefix != null)
            {
                prefixString = prefix.prefix
            }
        }

        if (profile.activeColor != null)
        {
            colorString = profile.activeColor!!.chatColor
        }

        var rank = RankService.FALLBACK_RANK

        if (profile.rankDisguiseAttribute != null)
        {
            val curr = RankService.byId(profile.rankDisguiseAttribute!!.rank)
            if (curr != null)
            {
                rank = curr
            }
        } else
        {
            rank = profile.getCurrentRank()
        }

        var nameString = profile.username

        if (profile.skinDisguiseAttribute != null)
        {
            nameString = profile.skinDisguiseAttribute!!.customName
        }

        //set format first
        val configFormat = BasaltSpigotPlugin.instance.config.getString("chat.format")
        val format = Chat.format(
            configFormat
                .replace("<prefix_string>", prefixString)
                .replace("<rank_string>", rank.prefix)
                .replace("<player_name>", nameString)
                .replace("<color_string>", colorString)
                .replace("<message>", "%2\$s")
        )

        if (BasaltSpigotPlugin.instance.server.pluginManager.isPluginEnabled("PlaceholderAPI"))
        {
            PlaceholderAPI.setPlaceholders(event.player, format)
        }

        //player has explicit staff chat on
        if (event.player.hasPermission("basalt.staff") && profile.hasMetadata("allMSGSC"))
        {
            event.isCancelled = true
            val message = event.message
            AsynchronousRedisSender.send(
                StaffMessagePacket(
                    message,
                    Basalt.globalServer.displayName,
                    event.player.uniqueId
                )
            )

            return
        }

        //player is ghostmuted
        if (profile.hasActivePunishment(PunishmentType.GHOST_MUTE))
        {
            event.isCancelled = true
            event.player.sendMessage(
                Chat.format(
                    format.replace("%1\$s", profile.username).replace("%2\$s", event.message)
                )
            )
            return
        }

        //player is muted
        if (profile.hasActivePunishment(PunishmentType.MUTE))
        {
            val mute = profile.getActivePunishments(PunishmentType.MUTE).first()
            event.isCancelled = true

            val msgs = BasaltSpigotPlugin.instance.config.getStringList("muted-chat")

            msgs.replaceAll { it.replace("<reason>", mute.reason) }
            msgs.replaceAll {
                it.replace(
                    "<expires>",
                    if (mute.expirable.duration == Long.MAX_VALUE) "Never" else TimeUtil.formatDuration(mute.expirable.addedAt + mute.expirable.duration - System.currentTimeMillis())
                )
            }

            msgs.forEach { event.player.sendMessage(Chat.format(it)) }
            return
        }

        //chat is muted
        if (ChatService.muted)
        {
            if (!event.player.hasPermission("basalt.mutechat.bypass"))
            {
                val message = ChatService.MUTE_MESSAGE

                event.player.sendMessage(Chat.format(message))

                event.isCancelled = true

                return
            }
        }


        //chat is slowed
        if (ChatService.slowed)
        {
            if (!event.player.hasPermission("basalt.slowchat.bypass"))
            {
                val message = ChatService.SLOW_MESSAGE

                if (ChatService.isOnCooldown(event.player))
                {
                    val rem = ChatService.getCooldownRemaining(event.player)
                    if (rem != 0)
                    {
                        event.player.sendMessage(
                            Chat.format(
                                message.replace(
                                    "<seconds>",
                                    rem.toString()
                                )
                            )
                        )
                        event.isCancelled = true

                        return
                    }
                } else
                {
                    ChatService.addCooldown(event.player)
                }
            }
        }

        //player sends a link
        if (ChatService.LINK_LIMIT_ENABLED)
        {
            val msg = event.message

            //website sending
            if (msg.contains("http://") || msg.contains("https://"))
            {
                val rank = RankService.byId(ChatService.MINIMUM_LINK_SEND_RANK.lowercase(Locale.getDefault())) ?: return
                val theirRank = event.player.getCurrentRank()

                if (theirRank.weight < rank.weight)
                {
                    event.player.sendMessage(Chat.format("&eYou must be at least " + rank.color + rank.displayName + " &erank to send links"))
                    event.isCancelled = true
                    return
                }
            }
        }

        //lastly set format
        event.format = format
    }

    @EventHandler
    fun applyPerms(event: PlayerJoinEvent)
    {
        val player = event.player

        if (!BasaltSpigotPlugin.instance.config.getBoolean("debug.noJoinEvents"))
        {
            val allCallbacks = mutableListOf<(Player) -> Unit>().also {
                it.addAll(BukkitPostLoginConnection.allCallbacks + BukkitPostLoginConnection.allLazyCallbacks)
            }

            for (cback in allCallbacks)
            {
                cback.invoke(player)
            }
        }
    }

    @EventHandler
    fun join(event: AsyncPlayerPreLoginEvent)
    {
        if (!BasaltSpigotPlugin.instance.config.getBoolean("debug.noJoinEvents"))
        {
            val allCallbacks = mutableListOf<(AsyncPlayerPreLoginEvent) -> Unit>().also {
                it.addAll(BukkitPreLoginConnection.allCallbacks + BukkitPreLoginConnection.allLazyCallbacks)
            }

            for (cback in allCallbacks)
            {
                cback.invoke(event)
            }
        }
    }

    @EventHandler
    fun leave(event: PlayerQuitEvent)
    {
        val player = event.player

        AccessiblePermissionHandler.remove(player)
    }
}


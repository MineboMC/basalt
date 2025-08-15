package net.minebo.basalt.essentials.messages

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.profiles.getRankDisplay
import net.minebo.basalt.redis.RedisPacketManager
import net.minebo.basalt.util.Chat
import org.bukkit.Sound
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.util.*

object MessageHandler
{
    val replyMap: MutableMap<UUID, UUID> = mutableMapOf()

    private val MESSAGE_FORMAT_FROM: String =
        BasaltSpigotPlugin.instance.config.getString("message.message_format_from")!!
    private val MESSAGE_FORMAT_TO: String = BasaltSpigotPlugin.instance.config.getString("message.message_format_to")!!

    private val STAFF_MESSAGE_FORMAT_FROM: String =
        BasaltSpigotPlugin.instance.config.getString("message.staff_message_format_from")!!
    private val STAFF_MESSAGE_FORMAT_TO: String =
        BasaltSpigotPlugin.instance.config.getString("message.staff_message_format_to")!!
    private val SOUND: String = BasaltSpigotPlugin.instance.config.getString("message.sound")!!

    fun message(to: Player, from: CommandSender, message: String)
    {
        //allow people to not be able to ignore console
        if (from is Player)
        {
            if (!hasMessagesOn(to.uniqueId))
            {
                from.sendMessage(Chat.format("&cThis player does not have their direct messages open!"))
                return
            }
        }

        to.sendMessage(
            Chat.format(
                MESSAGE_FORMAT_FROM
                    .replace("<from>", from.getRankDisplay())
                    .replace("<message>", message)
            )
        )

        from.sendMessage(
            Chat.format(
                MESSAGE_FORMAT_TO
                    .replace("<from>", to.getRankDisplay())
                    .replace("<message>", message)
            )
        )

        //can't reply to console either
        if (from is Player)
        {
            replyMap[to.uniqueId] = from.uniqueId
            replyMap[from.uniqueId] = to.uniqueId
        }

        //some sounds work differently on newer versions
        val mcSound =
            Sound.values().firstOrNull { it.name.equals(SOUND.uppercase(Locale.getDefault()), ignoreCase = true) }

        if (mcSound != null)
        {
            if (hasSoundsOn(to.uniqueId))
            {
                to.playSound(to.location, mcSound, 1.0f, 1.0f)
            }

            //cant play sounds to console
            if (from is Player)
            {
                if (hasSoundsOn(from.uniqueId))
                {
                    from.playSound(from.location, mcSound, 1.0f, 1.0f)
                }
            }
        }
    }

    fun staffMessage(to: Player, from: Player, message: String)
    {
        to.sendMessage(
            Chat.format(
                STAFF_MESSAGE_FORMAT_FROM
                    .replace("<from>", from.getRankDisplay())
                    .replace("<message>", message)
            )
        )

        from.sendMessage(
            Chat.format(
                STAFF_MESSAGE_FORMAT_TO
                    .replace("<to>", to.getRankDisplay())
                    .replace("<message>", message)
            )
        )

        replyMap[to.uniqueId] = from.uniqueId
        replyMap[from.uniqueId] = to.uniqueId

        //some sounds work differently on newer versions
        val mcSound =
            Sound.values().firstOrNull { it.name.equals(SOUND.uppercase(Locale.getDefault()), ignoreCase = true) }

        if (mcSound != null)
        {
            if (hasSoundsOn(to.uniqueId))
            {
                to.playSound(to.location, mcSound, 1.0f, 1.0f)
            }

            if (hasSoundsOn(from.uniqueId))
            {
                from.playSound(from.location, mcSound, 1.0f, 1.0f)
            }
        }
    }

    fun getPlayersIgnored(player: Player): MutableList<UUID>
    {
        RedisPacketManager.pool.resource.use { jedis ->
            val list = jedis.hgetAll("Basalt:messageSettings:ignoreList:${player.uniqueId}")

            return list.filter { it.value.toBoolean() }.map { UUID.fromString(it.key) }.toMutableList()
        }
    }

    fun hasPlayerIgnored(player: Player, ignored: UUID): Boolean
    {
        RedisPacketManager.pool.resource.use {
            return it.hget(
                "Basalt:messageSettings:ignoreList:${player.uniqueId}",
                ignored.toString()
            ).toBoolean()
        }
    }

    fun addIgnoredPlayer(
        player: Player,
        ignored: UUID
    )
    {
        RedisPacketManager.pool.resource.use {
            it.hset("Basalt:messageSettings:ignoreList:${player.uniqueId}", ignored.toString(), "true")
        }
    }

    fun removeIgnoredPlayer(
        player: Player,
        ignored: UUID
    )
    {
        RedisPacketManager.pool.resource.use {
            it.hset("Basalt:messageSettings:ignoreList:${player.uniqueId}", ignored.toString(), "false")
        }
    }

    fun hasSoundsOn(player: UUID): Boolean
    {
        RedisPacketManager.pool.resource.use {
            if (it.hexists("Basalt:messageSettings:soundsDisabled:", player.toString()))
            {
                return false
            }

            return true
        }
    }

    fun toggleSounds(value: Boolean, player: UUID)
    {
        RedisPacketManager.pool.resource.use {
            if (!value)
            {
                it.hset("Basalt:messageSettings:soundsDisabled:", player.toString(), true.toString())
            } else
            {
                it.hdel("Basalt:messageSettings:soundsDisabled:", player.toString())
            }
        }
    }

    fun hasMessagesOn(player: UUID): Boolean
    {
        RedisPacketManager.pool.resource.use {
            if (it.hexists("Basalt:messageSettings:messagesDisabled:", player.toString()))
            {
                return false
            }

            return true
        }
    }

    fun toggleMessages(value: Boolean, player: UUID)
    {
        RedisPacketManager.pool.resource.use {
            if (!value)
            {
                it.hset("Basalt:messageSettings:messagesDisabled:", player.toString(), true.toString())
            } else
            {
                it.hdel("Basalt:messageSettings:messagesDisabled:", player.toString())
            }
        }
    }
}
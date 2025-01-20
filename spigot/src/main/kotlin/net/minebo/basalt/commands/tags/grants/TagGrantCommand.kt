package net.minebo.basalt.commands.tags.grants

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandCompletion
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.commands.tags.grants.menu.grant.TagGrantMenu
import net.minebo.basalt.models.grant.types.TagGrant
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.packets.StaffAuditPacket
import net.minebo.basalt.punishment.BukkitPunishmentFunctions
import net.minebo.basalt.punishments.actor.ActorType
import net.minebo.basalt.punishments.actor.DefaultActor
import net.minebo.basalt.punishments.actor.executor.Executor
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.service.expirable.TagGrantService
import net.minebo.basalt.service.tags.TagService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player
import java.util.*

class TagGrantCommand : BaseCommand()
{

    @CommandAlias("taggrant|prefixgrant")
    @CommandPermission("basalt.tags.admin")
    @CommandCompletion("@gameprofile")
    fun tagGrant(player: Player, @Name("target") gameProfile: GameProfile)
    {
        TagGrantMenu(player, gameProfile).updateMenu()
    }

    @CommandAlias("manualtaggrant|manaulprefixgrant")
    @CommandPermission("basalt.tags.admin")
    @CommandCompletion("@gameprofile")
    fun manual(
        sender: CommandSender,
        @Name("target") gameProfile: GameProfile,
        @Name("tag") tag: String,
        @Name("duration") duration: String,
        @Name("reason") reason: String
    )
    {
        val time: Long
        try
        {
            val parsed = TimeUtil.parseTime(duration)
            time = if (parsed == Long.MAX_VALUE.toInt())
            {
                Long.MAX_VALUE
            } else parsed * 1000L
        } catch (e: Exception)
        {
            sender.sendMessage(Chat.format("&cInvalid time!"))
            return
        }

        val found = TagService.byId(tag.lowercase(Locale.getDefault()))

        if (found == null)
        {
            sender.sendMessage(Chat.format("&cThis tag does not exist!"))
            return
        }


        val taggrant = TagGrant(
            found.id,
            gameProfile.uuid,
            BukkitPunishmentFunctions.getSenderUUID(sender),
            reason,
            time,
            DefaultActor(Executor.PLAYER, ActorType.GAME)
        )

        TagGrantService.save(taggrant)
        sender.sendMessage(
            Chat.format(
                "&aGranted &f" + gameProfile.username + " &athe " + found.menuName + " &atag"
            )
        )

        AsynchronousRedisSender.send(StaffAuditPacket("&b[Audit] &b" + gameProfile.username + " &3was granted the " + found.menuName + " &3prefix for &b" + reason))
    }
}
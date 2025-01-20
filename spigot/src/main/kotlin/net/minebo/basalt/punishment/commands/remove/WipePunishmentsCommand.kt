package net.minebo.basalt.punishment.commands.remove

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.service.expirable.PunishmentService
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player

object WipePunishmentsCommand : BaseCommand()
{

    @CommandAlias("wipepunishments")
    @CommandPermission("basalt.punishments.wipe")
    fun wipePunishments(player: Player, @Name("type") typestr: String)
    {
        var foundType: PunishmentType? = null

        for (type in PunishmentType.values())
        {
            if (type.name.equals(typestr.uppercase(), ignoreCase = true))
            {
                foundType = type
            }
        }

        if (foundType == null)
        {
            val matches = typestr.equals("all", ignoreCase = true)

            if (!matches)
            {
                player.sendMessage(Chat.format("&cInvalid punishment type: BAN, BLACKLIST, ALL, MUTE, WARN, GHOST_MUTE"))
                return
            }

            for (punishment in PunishmentService.handler.retrieveAll())
            {
                PunishmentService.handler.deleteAsync(punishment.uuid)
                PunishmentService.grants.clear()

            }

            player.sendMessage(Chat.format("&aCleared every punishment from the database!"))

            return
        }

        val typedPunishment = PunishmentService.handler.retrieveAll().filter { it.getGrantable() == foundType }

        for (punishment in typedPunishment)
        {
            PunishmentService.handler.deleteAsync(punishment.uuid)
        }

        for (entry in PunishmentService.grants.entries)
        {
            entry.value.removeIf { it.getGrantable() == foundType }
        }

        player.sendMessage(Chat.format("&aWiped all " + foundType.niceName + "'s"))
    }
}
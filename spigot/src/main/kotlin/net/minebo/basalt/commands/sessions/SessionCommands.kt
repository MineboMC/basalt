package net.minebo.basalt.commands.sessions

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandCompletion
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.commands.sessions.menu.SessionsMenu
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.service.session.SessionService
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player

class SessionCommands : BaseCommand()
{

    @CommandAlias("sessions")
    @CommandCompletion("@gameprofile")
    @CommandPermission("basalt.sessions")
    fun sessions(player: Player, @Name("profile") profile: GameProfile)
    {
        if (!SessionService.cache.containsKey(profile.uuid))
        {
            player.sendMessage(Chat.format("&cPlayer has no sessions"))
            return
        }

        val sessions = SessionService.cache[profile.uuid]

        SessionsMenu(player, sessions!!).updateMenu()
    }
}
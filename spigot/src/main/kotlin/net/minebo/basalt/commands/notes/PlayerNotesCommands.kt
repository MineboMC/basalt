package net.minebo.basalt.commands.notes

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.*
import net.minebo.basalt.commands.notes.menu.PlayerNotesMenu
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.models.profile.notes.ProfileNote
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player

@CommandAlias("notes|note")
@CommandPermission("basalt.profiles.admin")
class PlayerNotesCommands : BaseCommand()
{

    @Default
    @CatchUnknown
    @CommandCompletion("@gameprofile")
    fun default(sender: Player, @Name("target") gameProfile: GameProfile)
    {
        PlayerNotesMenu(sender, gameProfile).updateMenu()
    }

    @Subcommand("add")
    @CommandCompletion("@gameprofile")
    fun add(sender: Player, @Name("target") gameProfile: GameProfile, @Name("note") note: String)
    {
        gameProfile.notes.add(
            ProfileNote(
                author = sender.uniqueId,
                content = note,
                createdAt = System.currentTimeMillis()
            )
        )

        ProfileGameService.save(gameProfile)

        sender.sendMessage(Chat.format("&eAdded note to ${gameProfile.username}."))
    }
}
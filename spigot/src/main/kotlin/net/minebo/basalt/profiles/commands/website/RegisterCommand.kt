package net.minebo.basalt.profiles.commands.website

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.models.website.BasaltUser
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.service.website.WebProfileService
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player
import java.util.*

object RegisterCommand : BaseCommand()
{
    @CommandAlias("register")
    @CommandPermission("basalt.website.register")
    fun onRegister(player: Player)
    {
        val profile = ProfileGameService.byId(player.uniqueId)

        if (profile == null)
        {
            player.sendMessage(Chat.format("&cYou must have a profile in order to register for an account!"))
            return
        }

        if (!profile.getCurrentRank().staff)
        {
            player.sendMessage(Chat.format("&cYou are unable to register for panel access if you are not a staff member!"))
            return
        }

        if (profile.websiteNeedsVerification)
        {
            player.sendMessage(Chat.format("&7[&bWebsite&7] &cYou have already tried to register a panel account under this username!"))
            return
        }

        val user = BasaltUser(
            UUID.randomUUID(),
            player.uniqueId,
            player.name,
            null,
            UUID.randomUUID().toString().substring(0, 8),
            administrator = false,
            authenticated = false,
            mutableListOf()
        )
        profile.websiteNeedsVerification = true
        profile.websiteVerificationToken = user.secret

        // Save our data after this
        WebProfileService.save(user)
        ProfileGameService.save(profile)

        player.sendMessage(Chat.format("&7[&bWebsite&7] &aSuccess! You have registered an account on our admin panel."))
        player.sendMessage(Chat.format("&7Your secret key is &f${user.secret}&7. Input this on the register page."))
    }
}
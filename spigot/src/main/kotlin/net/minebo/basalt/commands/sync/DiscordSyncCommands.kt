package net.minebo.basalt.commands.sync

import co.aikar.commands.BaseCommand
import co.aikar.commands.ConditionFailedException
import co.aikar.commands.annotation.*
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player
import java.util.*

@CommandAlias("sync")
object DiscordSyncCommands : BaseCommand()
{

    @Default
    fun sync(sender: Player)
    {
        val gameProfile = ProfileGameService.byId(sender.uniqueId)
            ?: throw ConditionFailedException("You do not currently have a profile!")

        val currentCode = gameProfile.syncCode

        if (currentCode != null)
        {
            sender.sendMessage(Chat.format("&eYour sync code is &a${currentCode}&e! Use it in our &6Discord Server &ein order to link your in-game rank and your discord rank."))
            return
        }

        val uniqueCode = generateUniqueCode()

        gameProfile.syncCode = uniqueCode
        ProfileGameService.save(gameProfile)

        sender.sendMessage(Chat.format("&eYour sync code is &a$uniqueCode&e! Use it in our &6Discord Server &ein order to link your in-game rank and your discord rank."))
    }

    @Subcommand("check")
    @CommandCompletion("@gameprofile")
    @CommandPermission("basalt.sync.admin")
    fun check(sender: Player, @Name("target") gameProfile: GameProfile)
    {
        val syncCode = gameProfile.syncCode
            ?: throw ConditionFailedException("This player does not have a a sync code!")

        sender.sendMessage(Chat.format("&eThe sync code for ${gameProfile.getRankDisplay()} &eis&7: &f${syncCode}"))
    }

    @Subcommand("delete")
    @CommandCompletion("@players")
    @CommandPermission("basalt.sync.admin")
    fun delete(sender: Player, @Name("username") targetUsername: String) =
        ProfileGameService.byUsernameWithList(targetUsername).thenAccept {
            val targetGameProfile = it.firstOrNull()
                ?: throw ConditionFailedException("No player by this name exists!")

            targetGameProfile.syncCode = null
            ProfileGameService.save(targetGameProfile)
            sender.sendMessage(Chat.format("&aThe sync code has been deleted from &r${targetGameProfile.getRankDisplay()}&a."))
        }

}

private fun generateUniqueCode(): String
{
    val characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
    val random = Random()
    return (1..7).map { characters[random.nextInt(characters.length)] }.joinToString("")
}

package net.minebo.basalt.aikar.context

import co.aikar.commands.BukkitCommandExecutionContext
import co.aikar.commands.InvalidCommandArgument
import co.aikar.commands.contexts.ContextResolver
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.service.profiles.ProfileGameService

class GameProfileContextResolver : ContextResolver<GameProfile, BukkitCommandExecutionContext>
{

    override fun getContext(c: BukkitCommandExecutionContext): GameProfile?
    {
        val firstArg = c.popFirstArg() ?: return null

        //todo: async wrapper just mad lazy
        return ProfileGameService.byUsernameWithList(firstArg).join().firstOrNull()
            ?: throw InvalidCommandArgument("No player by this name found")
    }
}
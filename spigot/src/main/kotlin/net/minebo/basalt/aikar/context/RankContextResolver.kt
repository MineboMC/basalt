package net.minebo.basalt.aikar.context

import co.aikar.commands.BukkitCommandExecutionContext
import co.aikar.commands.InvalidCommandArgument
import co.aikar.commands.contexts.ContextResolver
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.service.ranks.RankService

class RankContextResolver : ContextResolver<Rank, BukkitCommandExecutionContext>
{

    override fun getContext(c: BukkitCommandExecutionContext?): Rank?
    {
        val firstArg = c!!.popFirstArg() ?: return null

        return RankService.byIdAnyCase(firstArg)
            ?: throw InvalidCommandArgument("No rank by this name found")
    }
}
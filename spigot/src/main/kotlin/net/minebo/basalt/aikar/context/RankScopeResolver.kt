package net.minebo.basalt.aikar.context

import co.aikar.commands.BukkitCommandExecutionContext
import co.aikar.commands.InvalidCommandArgument
import co.aikar.commands.contexts.ContextResolver
import net.minebo.basalt.models.ranks.scope.RankScope
import net.minebo.basalt.service.server.UniqueServerService
import java.util.*

/**
 * Class created on 6/21/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class RankScopeResolver : ContextResolver<RankScope, BukkitCommandExecutionContext>
{

    override fun getContext(c: BukkitCommandExecutionContext?): RankScope?
    {
        val firstArg = c!!.popFirstArg() ?: return null

        if (firstArg.contains(","))
        {
            val split = firstArg.split(",")
            val scopes = mutableListOf<String>()

            for (server in split)
            {
                val id = server.lowercase(Locale.getDefault())
                if (UniqueServerService.byId(id) != null)
                {
                    if (!scopes.contains(id))
                    {
                        scopes.add(id)
                    }
                }
            }

            return RankScope(scopes, false)
        }

        if (!firstArg.equals("global", ignoreCase = true))
        {
            val uniqueServer = UniqueServerService.byId(firstArg.lowercase())
                ?: throw InvalidCommandArgument("You have not provided a valid scope!")

            return RankScope(mutableListOf(uniqueServer.id), false)
        } else if (firstArg.equals("global", ignoreCase = true))
        {
            return RankScope(mutableListOf(), true)
        }

        throw InvalidCommandArgument("This is not a valid scope!")
    }
}
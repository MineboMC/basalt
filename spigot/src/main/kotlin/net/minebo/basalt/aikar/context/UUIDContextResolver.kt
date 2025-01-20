package net.minebo.basalt.aikar.context

import co.aikar.commands.BukkitCommandExecutionContext
import co.aikar.commands.InvalidCommandArgument
import co.aikar.commands.contexts.ContextResolver
import java.util.*

/**
 * Class created on 6/13/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class UUIDContextResolver : ContextResolver<UUID, BukkitCommandExecutionContext>
{

    override fun getContext(c: BukkitCommandExecutionContext?): UUID?
    {
        val firstArg = c!!.popFirstArg() ?: return null

        val uuid = UUID.fromString(firstArg)

        if (uuid != null) return uuid

        throw InvalidCommandArgument("Invalid uuid!")
    }
}
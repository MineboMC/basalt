package net.minebo.basalt.grants.apply

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandCompletion
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.grants.menu.grant.GrantMenu
import net.minebo.basalt.models.profile.GameProfile
import org.bukkit.entity.Player

class GrantCommand : BaseCommand()
{

    @CommandAlias("grant")
    @CommandPermission("basalt.grants.admin")
    @CommandCompletion("@gameprofile")
    fun grant(player: Player, @Name("target") gameProfile: GameProfile)
    {
        GrantMenu(player, gameProfile).updateMenu()
    }
}
package net.minebo.basalt.commands.alts

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandCompletion
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.commands.alts.menu.AltsMenu
import net.minebo.basalt.models.profile.GameProfile
import org.bukkit.entity.Player

class AltsCommand : BaseCommand()
{

    @CommandAlias("alts")
    @CommandPermission("basalt.alts")
    @CommandCompletion("@gameprofile")
    fun listAll(player: Player, @Name("target") profile: GameProfile)
    {
        profile.getAltAccounts().thenAccept { alts ->
            AltsMenu(player, profile, alts).updateMenu()
        }
    }
}
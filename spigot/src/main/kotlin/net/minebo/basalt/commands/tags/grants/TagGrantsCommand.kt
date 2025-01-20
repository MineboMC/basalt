package net.minebo.basalt.commands.tags.grants

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandCompletion
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.commands.tags.grants.menu.grants.TagGrantsMenu
import net.minebo.basalt.models.profile.GameProfile
import org.bukkit.entity.Player

class TagGrantsCommand : BaseCommand()
{

    @CommandAlias("taggrants|prefixgrants")
    @CommandPermission("basalt.tags.admin")
    @CommandCompletion("@gameprofile")
    fun grants(player: Player, @Name("target") gameProfile: GameProfile)
    {
        TagGrantsMenu(player, gameProfile).updateMenu()
    }
}
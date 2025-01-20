package net.minebo.basalt.themes.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import net.minebo.basalt.themes.commands.menu.ThemeSelectMenu
import org.bukkit.entity.Player

class ThemeSelectCommand : BaseCommand()
{

    @CommandAlias("themes|theme")
    @CommandPermission("basalt.themes")
    fun theme(player: Player)
    {
        ThemeSelectMenu(player).openMenu()
    }
}
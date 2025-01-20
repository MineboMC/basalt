package net.minebo.basalt.commands.tags

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import net.minebo.basalt.commands.tags.menu.GeneralTagMenu
import org.bukkit.entity.Player

class TagCommand : BaseCommand()
{

    @CommandAlias("prefix|tags|tag|prefixes")
    fun tags(player: Player)
    {
        GeneralTagMenu(player).updateMenu()
    }
}
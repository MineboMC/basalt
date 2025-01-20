package net.minebo.basalt.disguise.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import net.minebo.basalt.disguise.commands.menu.rank.RankDisguiseMenu
import org.bukkit.entity.Player
import java.util.*


class RankDisguiseCommand : BaseCommand()
{

    @CommandAlias("rankdisguise")
    @CommandPermission("basalt.disguise.rank")
    fun rankDisguise(player: Player)
    {
        RankDisguiseMenu(player).updateMenu()
    }
}
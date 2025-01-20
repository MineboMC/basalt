package net.minebo.basalt.chatcolors.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import net.minebo.basalt.chatcolors.menu.ChatColorMenu
import org.bukkit.entity.Player

class ChatColorCommands : BaseCommand()
{

    @CommandAlias("chatcolors|cc|colors")
    fun chatColors(player: Player)
    {
        ChatColorMenu(player).updateMenu()
    }
}
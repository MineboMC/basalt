package net.minebo.basalt.servers.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import net.minebo.basalt.Basalt
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player

object WhereAmICommand : BaseCommand()
{
    @CommandAlias("whereami|whatamion")
    fun whereAmI(sender: Player)
    {
        val server = Basalt.globalServer
        sender.sendMessage(Chat.format("&eYou are currently on the server &a${server.displayName}&e. &8(${server.players.size} Connected)"))
    }
}
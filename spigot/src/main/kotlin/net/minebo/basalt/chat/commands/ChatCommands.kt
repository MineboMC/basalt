package net.minebo.basalt.chat.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.chat.ChatService
import net.minebo.basalt.util.Chat
import org.bukkit.command.CommandSender

object ChatCommands : BaseCommand()
{

    @CommandAlias("slowchat")
    @CommandPermission("basalt.chat.admin")
    fun slowchat(player: CommandSender, @Name("duration") duration: Int)
    {
        if (!ChatService.slowed)
        {
            ChatService.slowDuration = duration
            ChatService.slowed = true
            player.sendMessage(Chat.format("&aYou have just slowed the chat down to 1 message every &f$duration &aseconds"))
        } else
        {
            ChatService.slowDuration = 0
            ChatService.slowed = false
            player.sendMessage(Chat.format("&cIn game chat is no longer slowed down"))
        }
    }

    @CommandAlias("mutechat")
    @CommandPermission("basalt.chat.admin")
    fun mutechat(player: CommandSender)
    {
        if (!ChatService.muted)
        {
            ChatService.muted = true
            player.sendMessage(Chat.format("&aYou have just muted the global chat"))
        } else
        {
            ChatService.muted = false
            player.sendMessage(Chat.format("&aGlobal chat is no longer muted!"))
        }
    }
}
package net.minebo.basalt.commands.branding

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Default
import co.aikar.commands.annotation.Subcommand
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.util.Chat
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

@CommandAlias("basalt")
class BasaltCommand : BaseCommand()
{

    @Default
    fun basalt(player: Player)
    {
        player.sendMessage(Chat.format("&7&m----------------------------------------"))
        player.sendMessage(Chat.format("&6&lBasalt Rank Core"))
        player.sendMessage(" ")
        player.sendMessage(Chat.format("&6&lCommands"))
        player.sendMessage(Chat.format("&e/basalt reload &7- Reloads the configuration."))
        player.sendMessage(Chat.format("&e/basalt refreshplaceholders &7- Refreshes the PlaceholderAPI placeholders."))
        player.sendMessage(Chat.format("&e/basalt checkversion &7- Checks for the newest plugin version."))
        player.sendMessage(Chat.format("&7&m----------------------------------------"))
    }

    @Subcommand("reload")
    @CommandPermission("basalt.owner")
    fun reload(sender: CommandSender)
    {
        BasaltSpigotPlugin.instance.reloadConfig()
        sender.sendMessage(Chat.format("&eBasalt has been reloaded. Files affected: &aconfig.yml&e."))
    }

    @Subcommand("refreshplaceholders")
    @CommandPermission("basalt.owner")
    fun reloadPlaceholders(sender: CommandSender)
    {
        BasaltSpigotPlugin.instance.registerExpansion()
        sender.sendMessage(Chat.format("&eBasalt has reloaded every active &aPlaceholder &efrom &bPlaceholderAPI&e."))
    }

}
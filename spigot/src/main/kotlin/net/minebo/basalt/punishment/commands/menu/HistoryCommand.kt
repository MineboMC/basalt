package net.minebo.basalt.punishment.commands.menu

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.*
import net.minebo.basalt.profiles.AsyncGameProfile
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player
import java.util.concurrent.CompletableFuture

class HistoryCommand : BaseCommand()
{

    @CommandAlias("c|history|checkpunishments")
    @CommandPermission("basalt.punishments.check")
    @CommandCompletion("@gameprofile")
    fun ban(sender: Player, @Name("target") gameProfile: AsyncGameProfile): CompletableFuture<Void>
    {
        return gameProfile.use(sender) {
            HistoryMenu(it, sender).openMenu()
            sender.sendMessage(Chat.format("&eViewing punishment history of " + it.getRankDisplay() + "&e..."))
        }
    }
}
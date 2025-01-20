package net.minebo.basalt.staff.mode.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import net.minebo.basalt.Basalt
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.staff.alerts.StaffActionAlertPacket
import net.minebo.basalt.staff.mode.StaffSuiteManager
import net.minebo.basalt.staff.mode.StaffSuiteVisibilityHandler
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player
import org.bukkit.metadata.FixedMetadataValue

class VanishCommands : BaseCommand()
{

    @CommandAlias("vanish|v|byebye")
    @CommandPermission("basalt.staffmode")
    fun vanish(player: Player)
    {
        if (player.hasMetadata("vanish"))
        {
            player.removeMetadata("vanish", BasaltSpigotPlugin.instance)
            StaffSuiteVisibilityHandler.onDisableVisbility(player)
            player.sendMessage(Chat.format("&cYou have came out of vanish!"))
            AsynchronousRedisSender.send(StaffActionAlertPacket("has unvanished", player.name, Basalt.globalServer.id))
        } else
        {
            player.setMetadata("vanish", FixedMetadataValue(BasaltSpigotPlugin.instance, true))
            StaffSuiteVisibilityHandler.onEnableVisibility(player)
            player.sendMessage(Chat.format("&aYou have entered vanish!"))
            AsynchronousRedisSender.send(StaffActionAlertPacket("has vanished", player.name, Basalt.globalServer.id))
        }
    }

    @CommandAlias("?vis|qvis|amivanished|visible")
    @CommandPermission("basalt.staffmode")
    fun qvis(player: Player)
    {
        val modded = StaffSuiteManager.isModMode(player)
        val vanish = player.hasMetadata("vanish")

        player.sendMessage(Chat.format("&6ModMode: &f" + if (modded) "&aYes" else "&cNo"))
        player.sendMessage(Chat.format("&6Vanished: &f" + if (vanish) "&aYes" else "&cNo"))
        player.sendMessage(Chat.format("&7&oBukkit respects and abides by these values"))
    }
}
package net.minebo.basalt.essentials.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import co.aikar.commands.bukkit.contexts.OnlinePlayer
import net.minebo.basalt.Basalt
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.staff.alerts.StaffActionAlertPacket
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player

class InventoryCopyingCommands : BaseCommand()
{

    @CommandAlias("cpinv|cpfrom")
    @CommandPermission("basalt.essentials.cpinv")
    fun cpInv(sender: Player, @Name("target") online: OnlinePlayer)
    {
        val player = online.player

        sender.inventory.contents = player.inventory.contents
        sender.inventory.armorContents = player.inventory.armorContents
        sender.health = player.health
        sender.foodLevel = player.foodLevel
        player.activePotionEffects.forEach(sender::addPotionEffect)

        sender.sendMessage(Chat.format(player.displayName + "&6's inventory has been applied to you."))

        AsynchronousRedisSender.send(StaffActionAlertPacket("has copied ${online.player.name}'s current inventory", player.name, Basalt.globalServer.id))
    }

    @CommandAlias("cpto")
    @CommandPermission("basalt.essentials.cpto")
    fun cpTo(sender: Player, @Name("target") online: OnlinePlayer)
    {
        val player = online.player

        player.inventory.contents = sender.inventory.contents
        player.inventory.armorContents = sender.inventory.armorContents
        player.health = sender.health
        player.foodLevel = sender.foodLevel
        sender.activePotionEffects.forEach(player::addPotionEffect)

        AsynchronousRedisSender.send(StaffActionAlertPacket("has given their inventory to ${online.player.name}", player.name, Basalt.globalServer.id))

        sender.sendMessage(Chat.format("&6Your inventory has been applied to &f" + player.displayName + "&6."))
    }
}
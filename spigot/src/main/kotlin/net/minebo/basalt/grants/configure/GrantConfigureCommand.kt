package net.minebo.basalt.grants.configure

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import net.minebo.basalt.grants.GrantConfigurationService
import net.minebo.basalt.grants.configure.menu.GrantConfigCategory
import net.minebo.basalt.grants.configure.menu.GrantConfigureMenu
import net.minebo.basalt.util.Chat
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

/**
 * Class created on 8/3/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class GrantConfigureCommand : BaseCommand()
{

    @CommandAlias("configuregrants|grantconfig")
    @CommandPermission("basalt.grants.config")
    fun grantConfig(player: Player)
    {
        GrantConfigureMenu(
            player,
            GrantConfigCategory.DURATIONS
        ).updateMenu()
    }

    @CommandAlias("resetgrantdurations")
    @CommandPermission("basalt.grants.config")
    fun resetDurations(sender: CommandSender)
    {
        GrantConfigurationService.grantDurationModels.clear()

        for (dur in GrantConfigurationService.getDefaultGrantDurationModels())
        {
            GrantConfigurationService.grantDurationModels[dur.value.id] = dur.value
        }

        GrantConfigurationService.saveAllDurations()

        sender.sendMessage(Chat.format("&cWiped all grant durations!"))
    }

    @CommandAlias("resetgrantreasons")
    @CommandPermission("basalt.grants.config")
    fun resetReasons(sender: CommandSender)
    {
        GrantConfigurationService.grantReasonModels.clear()

        for (dur in GrantConfigurationService.getDefaultGrantReasonModels())
        {
            GrantConfigurationService.grantReasonModels[dur.value.id] = dur.value
        }

        GrantConfigurationService.saveAllReasons()

        sender.sendMessage(Chat.format("&cWiped all grant reasons!"))
    }
}
package net.minebo.basalt.commands.admin.panel

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import net.minebo.basalt.commands.admin.panel.menu.AdminPanelMenu
import org.bukkit.entity.Player


/**
 * Class created on 7/30/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class AdminPanelCommand : BaseCommand()
{

    @CommandAlias("adminpanel|panel")
    @CommandPermission("basalt.panel")
    fun panel(player: Player)
    {
        AdminPanelMenu(player).openMenu()
    }

}
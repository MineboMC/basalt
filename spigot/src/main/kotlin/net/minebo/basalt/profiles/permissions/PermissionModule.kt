package net.minebo.basalt.profiles.permissions

import co.aikar.commands.BaseCommand
import net.minebo.basalt.module.PluginModule
import net.minebo.basalt.profiles.permissions.command.PermissionEditCommands
import net.minebo.basalt.util.Chat

/**
 * Class created on 7/21/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object PermissionModule : PluginModule
{
    override fun onLoad()
    {
        val permissionStart = System.currentTimeMillis()
        AccessiblePermissionHandler.load()

        Chat.sendConsoleMessage(
            "&9[Permissions] &fAll permissions loaded in &9" + System.currentTimeMillis().minus(permissionStart) + "ms"
        )
    }

    override fun getCommands(): MutableList<BaseCommand>
    {
        val list = mutableListOf<BaseCommand>()
        list.add(PermissionEditCommands())

        return list
    }

    override fun getModularConfigOption(): Boolean
    {
        return true
    }
}
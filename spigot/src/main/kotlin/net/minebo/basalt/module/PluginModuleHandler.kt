package net.minebo.basalt.module

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.chat.ChatModule
import net.minebo.basalt.client.LunarClientExtension
import net.minebo.basalt.disguise.DisguiseModule
import net.minebo.basalt.essentials.EssentialsModule
import net.minebo.basalt.profiles.ProfileModule
import net.minebo.basalt.profiles.permissions.PermissionModule
import net.minebo.basalt.punishment.PunishmentModule
import net.minebo.basalt.servers.ServerModule
import net.minebo.basalt.staff.StaffModeModule

/**
 * Class created on 7/21/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object PluginModuleHandler
{

    private val modules = listOf(
        ProfileModule,
        StaffModeModule,
        PunishmentModule,
        EssentialsModule,
        PermissionModule,
        ServerModule,
        ChatModule,
        LunarClientExtension,
        DisguiseModule
    )

    fun loadModules()
    {
        for (module in modules)
        {
            if (!module.getModularConfigOption()) continue

            module.onLoad()

            for (command in module.getCommands())
            {
                BasaltSpigotPlugin.instance.commandManager.registerCommand(command)
            }
        }
    }
}
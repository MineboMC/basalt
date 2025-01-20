package net.minebo.basalt.staff

import co.aikar.commands.BaseCommand
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.module.PluginModule
import net.minebo.basalt.staff.commands.InventoryViewCommand
import net.minebo.basalt.staff.mode.action.StaffModeActionBarHandler
import net.minebo.basalt.staff.mode.commands.FreezeCommand
import net.minebo.basalt.staff.mode.commands.StaffCommands
import net.minebo.basalt.staff.mode.commands.VanishCommands
import net.minebo.basalt.staff.settings.edit.EditModModeCommand

/**
 * Class created on 7/21/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object StaffModeModule : PluginModule
{
    override fun onLoad()
    {
        StaffModeActionBarHandler().runTaskTimer(BasaltSpigotPlugin.instance, 20L, 20L)
    }

    override fun getCommands(): MutableList<BaseCommand>
    {
        val list = mutableListOf<BaseCommand>()

        list.add(FreezeCommand())
        list.add(StaffCommands())
        list.add(VanishCommands())

        list.add(EditModModeCommand())

        if (BasaltSpigotPlugin.instance.config.getBoolean("staffmode.invseeCommand"))
        {
            list.add(InventoryViewCommand())
        }

        return list

    }

    override fun getModularConfigOption(): Boolean
    {
        return BasaltSpigotPlugin.instance.config.getBoolean("modules.staffmode")
    }
}
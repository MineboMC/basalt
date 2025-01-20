package net.minebo.basalt.client

import co.aikar.commands.BaseCommand
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.client.commands.LunarClientCommands
import net.minebo.basalt.client.feature.NameTagFeature
import net.minebo.basalt.module.PluginModule
import org.bukkit.Bukkit

/**
 * Class created on 9/13/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object LunarClientExtension : PluginModule
{
    override fun onLoad()
    {
        NameTagFeature.startNametagUpdateTask()
    }

    override fun getCommands(): MutableList<BaseCommand>
    {
        return mutableListOf(
            LunarClientCommands
        )
    }

    override fun getModularConfigOption(): Boolean
    {
        return Bukkit.getPluginManager().isPluginEnabled(
            "LunarClient-API"
        ) && BasaltSpigotPlugin.instance.config.getBoolean(
            "modules.lunarClientAPI"
        )
    }
}
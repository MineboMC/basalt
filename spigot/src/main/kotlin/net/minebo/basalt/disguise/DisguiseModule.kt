package net.minebo.basalt.disguise

import co.aikar.commands.BaseCommand
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.disguise.commands.DisguiseCacheCommands
import net.minebo.basalt.disguise.commands.DisguiseCommand
import net.minebo.basalt.module.PluginModule
import net.pinger.disguise.DisguiseAPI
import org.bukkit.Bukkit

object DisguiseModule : PluginModule
{
    override fun onLoad()
    {
        if (DisguiseAPI.getDefaultProvider() == null)
        {
            Bukkit.getLogger().info("Failed to find the disguise API provider for this version!")
            Bukkit.getLogger().info("We are not going to enable the disguise module.")
            return
        }

        DisguiseService.loadAllSkins()
    }

    override fun getCommands(): MutableList<BaseCommand>
    {
        return mutableListOf(
            DisguiseCommand,
            DisguiseCacheCommands
        )
    }

    override fun getModularConfigOption(): Boolean
    {
        return Bukkit.getPluginManager().isPluginEnabled(
            "DisguiseAPI"
        ) && BasaltSpigotPlugin.instance.config.getBoolean(
            "modules.disguise"
        )
    }
}
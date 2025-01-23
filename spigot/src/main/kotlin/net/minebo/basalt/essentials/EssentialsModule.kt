package net.minebo.basalt.essentials

import co.aikar.commands.BaseCommand
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.essentials.commands.*
import net.minebo.basalt.essentials.listener.EntityEditorListener
import net.minebo.basalt.essentials.messages.MessageCommands
import net.minebo.basalt.module.PluginModule
import net.minebo.essentials.commands.EnchantCommand
import org.bukkit.Bukkit

object EssentialsModule : PluginModule
{
    override fun onLoad()
    {
        Bukkit.getServer().pluginManager.registerEvents(EntityEditorListener(), BasaltSpigotPlugin.instance)
    }

    override fun getCommands(): MutableList<BaseCommand>
    {
        val commands = mutableListOf<BaseCommand>()

        commands.add(GamemodeCommands())
        commands.add(WorldCommands())
        commands.add(RegenerativeCommands())
        commands.add(ClearInventoryCommand())
        commands.add(CraftCommand())

        commands.add(EnchantCommand())

        commands.add(KillCommand())
        commands.add(RenameCommand())

        commands.add(InventoryCopyingCommands())
        commands.add(TeleportationCommands())

        commands.add(EntityCommands)

        commands.add(MessageCommands())

        commands.add(PingCommand())

        return commands
    }

    override fun getModularConfigOption(): Boolean
    {
        return BasaltSpigotPlugin.instance.config.getBoolean("modules.essentials")
    }
}
package net.minebo.basalt.chat

import co.aikar.commands.BaseCommand
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.chat.commands.ChatCommands
import net.minebo.basalt.module.PluginModule

object ChatModule : PluginModule
{

    override fun onLoad()
    {
    }

    override fun getCommands(): MutableList<BaseCommand>
    {
        val list = mutableListOf<BaseCommand>()

        list.add(ChatCommands)

        return list
    }

    override fun getModularConfigOption(): Boolean
    {
        return BasaltSpigotPlugin.instance.config.getBoolean("modules.chat")
    }
}
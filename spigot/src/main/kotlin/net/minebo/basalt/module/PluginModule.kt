package net.minebo.basalt.module

import co.aikar.commands.BaseCommand

/**
 * Class created on 7/21/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
interface PluginModule
{

    fun onLoad()

    fun getCommands(): MutableList<BaseCommand>

    fun getModularConfigOption(): Boolean
}
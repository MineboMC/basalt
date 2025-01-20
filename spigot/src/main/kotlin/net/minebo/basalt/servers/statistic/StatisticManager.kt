package net.minebo.basalt.servers.statistic

import net.minebo.basalt.BasaltSpigotPlugin


object StatisticManager
{

    lateinit var metrics: Metric

    fun loadStats()
    {
        val pluginId = 16260

        metrics = Metric(BasaltSpigotPlugin.instance, pluginId)
    }

}
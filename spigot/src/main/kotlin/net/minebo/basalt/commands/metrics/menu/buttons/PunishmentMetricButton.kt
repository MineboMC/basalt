package net.minebo.basalt.commands.metrics.menu.buttons

/**
 * Class created on 7/4/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
import net.minebo.basalt.metric.MetricService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import net.minebo.basalt.util.menu.Button
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class PunishmentMetricButton : Button()
{

    override fun getMaterial(player: Player): Material
    {
        return Material.REDSTONE
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        val desc = mutableListOf<String>()
        desc.add(Chat.format("&7&m-------------------"))
        val average = MetricService.averageMS("Punishment Service")
        if (average != Long.MAX_VALUE)
        {
            desc.add(Chat.format("&eAverage ms/r: &c" + average + "ms"))
        } else
        {
            desc.add(Chat.format("&eAverage ms/r: &cN/A"))
        }
        val all = MetricService.getLast10("Punishment Service")
        desc.add(Chat.format("&eQuartile Low: &c" + all.sortedBy { it.ms }.first().ms + "ms"))
        desc.add(Chat.format("&eQuartile High: &c" + all.sortedByDescending { it.ms }.first().ms + "ms"))
        desc.add(" ")
        desc.add(Chat.format("&eLast 10 Entries"))
        for (metric in all)
        {
            desc.add(Chat.format("&7→ &e" + metric.ms + "ms"))
        }
        desc.add(" ")
        if (!all.isEmpty())
        {
            desc.add(
                Chat.format(
                    "&eLast Requested: &c" + TimeUtil.formatDuration(
                        System.currentTimeMillis().minus(all.first().at)
                    ) + " ago"
                )
            )
        } else
        {
            desc.add(Chat.format("&eLast Requested: &cNever!"))
        }
        desc.add(Chat.format("&7&m-------------------"))

        return desc
    }

    override fun getDisplayName(player: Player): String
    {
        return Chat.format("&6Punishment Metrics")
    }

    override fun getData(player: Player): Short
    {
        return 0
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {

    }
}
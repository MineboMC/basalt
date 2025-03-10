package net.minebo.basalt.commands.metrics.menu.buttons

import net.minebo.basalt.Basalt
import net.minebo.basalt.metric.MetricService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class HeartbeatButton : Button()
{

    override fun getMaterial(player: Player): Material
    {
        return Material.PAPER
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        val desc = mutableListOf<String>()

        desc.add(Chat.format("&7&m-------------------"))
        val average = MetricService.averageMS("Heartbeat")
        if (average != Long.MAX_VALUE)
        {
            desc.add(Chat.format("&eRoundtrip ms: &c" + average + "ms"))
        } else
        {
            desc.add(Chat.format("&eRoundtrip ms: &cN/A"))
        }
        desc.add(Chat.format("&eLast Error: &aNever :3"))
        desc.add(Chat.format("&eMongo Synced: &r" + if (Basalt.globalServer.online) "&aYes!" else "&cNo..."))
        desc.add(Chat.format("&7&m-------------------"))

        return desc
    }

    override fun getDisplayName(player: Player): String
    {
        return Chat.format("&6Heartbeat Service")
    }

    override fun getData(player: Player): Short
    {
        return 0
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {

    }
}
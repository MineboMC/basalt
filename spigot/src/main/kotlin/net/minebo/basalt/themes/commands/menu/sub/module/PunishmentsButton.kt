package net.minebo.basalt.themes.commands.menu.sub.module

import net.minebo.basalt.models.grant.types.Punishment
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.punishments.actor.ActorType
import net.minebo.basalt.punishments.actor.DefaultActor
import net.minebo.basalt.punishments.actor.executor.Executor
import net.minebo.basalt.themes.Theme
import net.minebo.basalt.util.menu.Button
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class PunishmentsButton(val theme: Theme, val player: Player) : Button()
{

    var fakeGrant = Punishment(
        PunishmentType.BAN.name,
        "7UiO",
        mutableListOf(),
        player.uniqueId,
        player.uniqueId,
        "Test Punishment",
        Long.MAX_VALUE,
        DefaultActor(Executor.CONSOLE, ActorType.GAME)
    )

    override fun getMaterial(player: Player): Material
    {
        return Material.WOOL
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        return theme.getHistoryLore(player, fakeGrant)
    }

    override fun getDisplayName(player: Player): String
    {
        return theme.getHistoryDisplayName(player, fakeGrant)
    }

    override fun getData(player: Player): Short
    {
        return theme.getHistoryData(player, fakeGrant)
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        return
    }
}
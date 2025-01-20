package net.minebo.basalt.punishment.commands.menu.impl

import net.minebo.basalt.models.grant.types.Punishment
import net.minebo.basalt.punishment.commands.menu.impl.proof.ProofMenu
import net.minebo.basalt.themes.ThemeLoader
import net.minebo.basalt.util.menu.Button
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class GeneralPunishmentButton(var punishment: Punishment) : Button()
{

    override fun getMaterial(player: Player): Material
    {
        return Material.WOOL
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        val theme = ThemeLoader.defaultTheme

        return theme.getHistoryLore(player, punishment)
    }

    override fun getDisplayName(player: Player): String
    {
        return ThemeLoader.defaultTheme.getHistoryDisplayName(player, punishment)
    }

    override fun getData(player: Player): Short
    {
        return ThemeLoader.defaultTheme.getHistoryData(player, punishment)
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        if (type == ClickType.LEFT)
        {
            ProofMenu(player, punishment).updateMenu()
        }
    }
}
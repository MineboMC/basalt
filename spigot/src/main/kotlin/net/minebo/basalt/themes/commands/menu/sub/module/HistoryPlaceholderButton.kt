package net.minebo.basalt.themes.commands.menu.sub.module

import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.themes.Theme
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class HistoryPlaceholderButton(val theme: Theme, val player: Player, val target: GameProfile) : Button()
{

    var type = PunishmentType.BAN

    override fun getMaterial(player: Player): Material
    {
        return Material.matchMaterial("${theme.getHistoryPlaceholderData(player, target, type)}_WOOL") ?: Material.WHITE_WOOL
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        return theme.getHistoryPlaceholderLore(player, target, type).map { Chat.format(it) }.toMutableList()
    }

    override fun getDisplayName(player: Player): String
    {
        return theme.getHistoryPlaceholderName(player, target, type)
    }

    override fun getData(player: Player): Short
    {
        return theme.getHistoryPlaceholderData(player, target, type)
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        return
    }
}
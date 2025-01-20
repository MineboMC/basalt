package net.minebo.basalt.punishment.commands.menu

import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.punishment.commands.menu.impl.GeneralPunishmentMenu
import net.minebo.basalt.punishment.commands.menu.impl.filter.PunishmentFilter
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.service.expirable.PunishmentService
import net.minebo.basalt.themes.ThemeLoader
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class HistoryPlaceholderButton(var punishmentType: PunishmentType, var gameProfile: GameProfile) : Button()
{

    override fun getMaterial(player: Player): Material
    {
        return Material.WOOL
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        return ThemeLoader.defaultTheme.getHistoryPlaceholderLore(player, gameProfile, punishmentType)
            .map { Chat.format(it) }.toMutableList()
    }

    override fun getDisplayName(player: Player): String
    {
        return ThemeLoader.defaultTheme.getHistoryPlaceholderName(player, gameProfile, punishmentType)
    }

    override fun getData(player: Player): Short
    {
        return ThemeLoader.defaultTheme.getHistoryPlaceholderData(player, gameProfile, punishmentType)
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        GeneralPunishmentMenu(
            gameProfile,
            punishmentType,
            PunishmentService.getFromCache(gameProfile.uuid).toMutableList(),
            PunishmentFilter.ALL,
            player
        ).updateMenu()
    }


}

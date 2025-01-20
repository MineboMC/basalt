package net.minebo.basalt.staff.settings.toggle

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import net.minebo.basalt.staff.settings.toggle.menu.SettingsMenu
import org.bukkit.entity.Player

class SettingsCommand : BaseCommand()
{

    @CommandAlias("tsm|tsc|staffsettings")
    @CommandPermission("basalt.staff")
    fun settings(player: Player)
    {
        SettingsMenu(player).openMenu()
    }
}
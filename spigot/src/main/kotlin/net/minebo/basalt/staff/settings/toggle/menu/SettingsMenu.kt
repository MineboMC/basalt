package net.minebo.basalt.staff.settings.toggle.menu

import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.staff.settings.toggle.types.*
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.Menu
import org.bukkit.entity.Player

class SettingsMenu(val player: Player) : Menu(player)
{

    init
    {
        staticSize = 27
        placeholder = true
    }

    val profile = ProfileGameService.byId(player.uniqueId)!!

    override fun getButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()

        buttons[10] = ToggleRequestsSetting(profile)
        buttons[11] = ToggleStaffChatSetting(profile)
        buttons[12] = ToggleModModeOnJoinSetting(profile)
        buttons[13] = CanSeeOtherStaffSetting(profile)
        buttons[14] = AllMessagesAreStaffSetting(profile)
        buttons[15] = AutomaticAuditSetting(profile)

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Edit your Settings!"
    }
}
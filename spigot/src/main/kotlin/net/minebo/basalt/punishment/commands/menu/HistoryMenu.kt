package net.minebo.basalt.punishment.commands.menu

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.Menu
import org.bukkit.entity.Player

class HistoryMenu(var gameprofile: GameProfile, var player: Player) : Menu(player)
{

    init
    {
        staticSize = 27
        placeholder = true
    }

    override fun getButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = hashMapOf<Int, Button>()

        buttons[9] = HistoryPlaceholderButton(PunishmentType.WARN, gameprofile)
        buttons[11] = HistoryPlaceholderButton(PunishmentType.MUTE, gameprofile)
        buttons[13] = HistoryPlaceholderButton(PunishmentType.GHOST_MUTE, gameprofile)
        buttons[15] = HistoryPlaceholderButton(PunishmentType.BAN, gameprofile)
        buttons[17] = HistoryPlaceholderButton(PunishmentType.BLACKLIST, gameprofile)

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return Chat.format(BasaltAPI.getRankDisplay(gameprofile.uuid))
    }
}
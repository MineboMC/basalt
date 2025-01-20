package net.minebo.basalt.commands.notes.menu

import net.minebo.basalt.commands.notes.menu.button.PlayerNotesButton
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import org.bukkit.entity.Player

class PlayerNotesMenu(private val p: Player, val gameProfile: GameProfile) : PaginatedMenu(18, player = p)
{

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()

        gameProfile.notes.forEachIndexed { index, profileNote ->
            buttons[index] = PlayerNotesButton(profileNote, gameProfile)
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Notes for ${gameProfile.username}"
    }
}
package net.minebo.basalt.commands.notes.menu.button

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.models.profile.notes.ProfileNote
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import java.util.*

class PlayerNotesButton(val note: ProfileNote, val targetProfile: GameProfile) : Button()
{

    override fun getMaterial(player: Player): Material
    {
        return Material.PLAYER_HEAD
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        val desc = mutableListOf<String>()

        desc.add(Chat.format("&7&m-------------------"))
        desc.add(Chat.format("&eAdded by: &c" + BasaltAPI.getRankDisplay(note.author)))
        desc.add(Chat.format("&eNote: &c" + note.content))
        desc.add(Chat.format("&7&m-------------------"))
        desc.add(Chat.format("&eClick to remove this note"))
        desc.add(Chat.format("&7&m-------------------"))

        return desc
    }

    override fun getDisplayName(player: Player): String
    {
        return Chat.format("&e${Date(note.createdAt)}")
    }

    override fun getData(player: Player): Short
    {
        return 0
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        targetProfile.notes.remove(note)
        ProfileGameService.save(targetProfile)

        player.sendMessage(Chat.format("&cRemoved note from ${targetProfile.username}."))
        player.closeInventory()
    }
}
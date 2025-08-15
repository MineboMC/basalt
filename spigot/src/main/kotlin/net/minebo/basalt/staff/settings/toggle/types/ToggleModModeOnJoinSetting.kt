package net.minebo.basalt.staff.settings.toggle.types

import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.staff.settings.toggle.menu.SettingsMenu
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import org.bukkit.DyeColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class ToggleModModeOnJoinSetting(val profile: GameProfile) : Button()
{

    override fun getMaterial(player: Player): Material
    {
        return if (profile.hasMetadata("toggleMM")) Material.LIME_WOOL else Material.RED_WOOL
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        val desc = mutableListOf<String>()
        desc.add(" ")
        desc.add(Chat.format("&7Toggle this setting to make it so"))
        desc.add(Chat.format("&7every time you join you are put into"))
        desc.add(Chat.format("&aMod Mode"))
        desc.add("")
        val hasMetadata = profile.hasMetadata("toggleMM")
        if (hasMetadata)
        {
            desc.add(Chat.format("&7► &eCurrently &coff"))
        } else
        {
            desc.add(Chat.format("&7► &eCurrently &aon"))
        }
        desc.add(" ")
        desc.add(Chat.format("&7Click to edit this value!"))
        desc.add(" ")
        return desc
    }

    override fun getDisplayName(player: Player): String
    {
        return Chat.format("&eToggle Mod Mode On Join")
    }

    override fun getData(player: Player): Short
    {
        return if (!profile.hasMetadata("toggleMM")) DyeColor.LIME.woolData.toShort() else DyeColor.RED.woolData.toShort()
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        val hasMetadata = profile.hasMetadata("toggleMM")

        if (hasMetadata)
        {
            profile.metadata.remove("toggleMM")
            player.sendMessage(Chat.format("&eYou have toggled your mod mode on join &aon"))
            ProfileGameService.save(profile)
        } else
        {
            profile.metadata.addProperty("toggleMM", true)
            player.sendMessage(Chat.format("&eYou have toggled your mod mode on join &coff"))
            ProfileGameService.save(profile)
        }

        SettingsMenu(player).openMenu()
    }
}
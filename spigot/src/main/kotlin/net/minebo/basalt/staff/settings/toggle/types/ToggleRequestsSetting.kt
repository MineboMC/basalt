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

class ToggleRequestsSetting(val profile: GameProfile) : Button()
{
    override fun getMaterial(player: Player): Material
    {
        return Material.WOOL
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        val desc = mutableListOf<String>()
        desc.add(" ")
        desc.add(Chat.format("&7Toggle this setting to make it so"))
        desc.add(Chat.format("&7you are unable to see requests and reports."))
        desc.add(Chat.format("&7Great for &5Streamers &7and &cYou&fTubers"))
        desc.add("")
        val hasMetadata = profile.hasMetadata("toggleRequests")
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
        return Chat.format("&eToggle Reports and Requests")
    }

    override fun getData(player: Player): Short
    {
        return if (!profile.hasMetadata("toggleRequests")) DyeColor.LIME.woolData.toShort() else DyeColor.RED.woolData.toShort()
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        val hasMetadata = profile.hasMetadata("toggleRequests")

        if (hasMetadata)
        {
            profile.metadata.remove("toggleRequests")
            player.sendMessage(Chat.format("&eYou have toggled your reports and requests &aon"))
            ProfileGameService.save(profile)
        } else
        {
            profile.metadata.addProperty("toggleRequests", true)
            player.sendMessage(Chat.format("&eYou have toggled your reports and requests &coff"))
            ProfileGameService.save(profile)
        }

        SettingsMenu(player).openMenu()
    }
}
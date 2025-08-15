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

class AllMessagesAreStaffSetting(val profile: GameProfile) : Button()
{
    override fun getMaterial(player: Player): Material
    {
        return if (profile.hasMetadata("allMSGSC")) Material.LIME_WOOL else Material.RED_WOOL
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        val desc = mutableListOf<String>()
        desc.add(" ")
        desc.add(Chat.format("&7Toggle this setting to make it so"))
        desc.add(Chat.format("&7every new message sent by you automaticially"))
        desc.add(Chat.format("&7ends up in &bStaff Chat"))
        desc.add("")
        val hasMetadata = profile.hasMetadata("allMSGSC")
        if (hasMetadata)
        {
            desc.add(Chat.format("&7► &eCurrently &aon"))
        } else
        {
            desc.add(Chat.format("&7► &eCurrently &coff"))
        }
        desc.add(" ")
        desc.add(Chat.format("&7Click to edit this value!"))
        desc.add(" ")
        return desc
    }

    override fun getDisplayName(player: Player): String
    {
        return Chat.format("&eToggle All Messages Go To Staff Chat")
    }

    override fun getData(player: Player): Short
    {
        return if (profile.hasMetadata("allMSGSC")) DyeColor.LIME.woolData.toShort() else DyeColor.RED.woolData.toShort()
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        val hasMetadata = profile.hasMetadata("allMSGSC")

        if (hasMetadata)
        {
            profile.metadata.remove("allMSGSC")
            player.sendMessage(Chat.format("&eAll message will &cnot &ego into staff chat!"))
            ProfileGameService.save(profile)
        } else
        {
            profile.metadata.addProperty("allMSGSC", true)
            player.sendMessage(Chat.format("&eAll messages &awill &ego into staff chat!"))
            ProfileGameService.save(profile)
        }

        SettingsMenu(player).openMenu()
    }
}
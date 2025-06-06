package net.minebo.basalt.staff.settings.toggle.types

/**
 * Class created on 9/14/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */

import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.staff.settings.toggle.menu.SettingsMenu
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import org.bukkit.DyeColor
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class AutomaticAuditSetting(val profile: GameProfile) : Button()
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
        desc.add(Chat.format("&7every time you join you are subscribed"))
        desc.add(Chat.format("&7to the server audit logs. "))
        desc.add("")
        desc.add(Chat.format("&cThis setting requires a permission"))
        desc.add("")
        val hasMetadata = profile.hasMetadata("toggleAudit")
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
        return Chat.format("&eToggle Audit Logs on Join")
    }

    override fun getData(player: Player): Short
    {
        return if (profile.hasMetadata("toggleAudit")) DyeColor.LIME.woolData.toShort() else DyeColor.RED.woolData.toShort()
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        val hasMetadata = profile.hasMetadata("toggleAudit")

        if (hasMetadata)
        {
            profile.metadata.remove("toggleAudit")
            player.sendMessage(Chat.format("&eYou have toggled your audit log on join &coff"))
            ProfileGameService.save(profile)
        } else
        {
            profile.metadata.addProperty("toggleAudit", true)
            player.sendMessage(Chat.format("&eYou have toggled your audit log on join &aon"))
            ProfileGameService.save(profile)
        }

        SettingsMenu(player).openMenu()
    }
}
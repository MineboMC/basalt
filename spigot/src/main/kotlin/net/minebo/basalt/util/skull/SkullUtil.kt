package net.minebo.basalt.util.skull

import com.destroystokyo.paper.profile.ProfileProperty
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.inventory.ItemStack
import org.bukkit.inventory.meta.SkullMeta
import java.util.*

object SkullUtil {

    fun applyCustomHead(
        skull: ItemStack,
        value: String?,
        tempname: String?,
        descrption: MutableList<String>,
        displayname: String
    ): ItemStack? {
        if (value == null) return null

        val profile = Bukkit.createProfile(UUID.randomUUID(), tempname ?: "CustomHead")
        profile.setProperty(ProfileProperty("textures", value))

        val skullMeta = skull.itemMeta as SkullMeta
        skullMeta.playerProfile = profile

        skullMeta.setDisplayName(Chat.format(displayname))
        skullMeta.lore = descrption.map { Chat.format(it) }

        skull.itemMeta = skullMeta
        return skull
    }

    fun generate(owner: String, displayname: String): ItemStack {
        val itemstack = ItemStack(Material.PLAYER_HEAD)
        val itemMeta = itemstack.itemMeta as SkullMeta

        itemMeta.setDisplayName(Chat.format(displayname))
        itemMeta.owner = owner

        itemstack.itemMeta = itemMeta
        return itemstack
    }
}
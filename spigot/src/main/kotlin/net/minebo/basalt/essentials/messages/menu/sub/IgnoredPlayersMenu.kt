package net.minebo.basalt.essentials.messages.menu.sub

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.essentials.messages.MessageHandler
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.items.ItemBuilder
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.type.BorderedPaginatedMenu
import net.minebo.basalt.util.skull.SkullUtil
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import org.bukkit.inventory.ItemStack

class IgnoredPlayersMenu(val player: Player) : BorderedPaginatedMenu(player)
{
    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        var i = 0
        val buttons = mutableMapOf<Int, Button>()

        for (uuid in MessageHandler.getPlayersIgnored(player))
        {
            val profile = BasaltAPI.syncFindProfile(player.uniqueId) ?: continue

            buttons[i++] = PlayerButton(profile)

        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Ignored Players"
    }

    class PlayerButton(val profile: GameProfile) : Button()
    {

        override fun getButtonItem(player: Player): ItemStack
        {
            return ItemBuilder
                .copyOf(SkullUtil.generate(profile.username, profile.getRankDisplay()))
                .setLore(getDescription(player).toList()).build()
        }

        override fun getMaterial(player: Player): Material
        {
            return Material.DIRT
        }

        override fun getDescription(player: Player): MutableList<String>
        {
            return mutableListOf(
                Chat.format("&7Click to remove from ignore list")
            )
        }

        override fun getDisplayName(player: Player): String
        {
            return ""
        }

        override fun getData(player: Player): Short
        {
            return 0
        }

        override fun onClick(player: Player, slot: Int, type: ClickType)
        {
            MessageHandler.removeIgnoredPlayer(player, profile.uuid)
            player.sendMessage(Chat.format("&aYou have removed ${profile.getRankDisplay()} &afrom your ignore list"))
        }
    }
}
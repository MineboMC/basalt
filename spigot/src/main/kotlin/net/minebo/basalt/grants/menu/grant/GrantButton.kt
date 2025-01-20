package net.minebo.basalt.grants.menu.grant

import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.profiles.getProfile
import net.minebo.basalt.themes.ThemeLoader
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType


class GrantButton(var rank: Rank, var gameProfile: GameProfile) : Button()
{


    override fun getMaterial(player: Player): Material
    {
        val curr = player.getProfile()?.getCurrentRank()

        if (rank.weight > (curr?.weight ?: 0))
        {
            return Material.OBSIDIAN
        }

        return Material.WOOL
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        return ThemeLoader.defaultTheme.getGrantLore(player, gameProfile, rank)
    }

    override fun getDisplayName(player: Player): String
    {
        return ThemeLoader.defaultTheme.getGrantDisplayName(player, rank)
    }

    override fun getData(player: Player): Short
    {
        val curr = player.getProfile()?.getCurrentRank()

        if (rank.weight > (curr?.weight ?: 0))
        {
            return 0
        }

        return ThemeLoader.defaultTheme.getGrantData(player, rank)
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        val curr = player.getProfile()?.getCurrentRank()

        if (rank.weight > (curr?.weight ?: 0))
        {
            player.sendMessage(Chat.format("&cThis rank is too high up on the priority list for you to grant!"))
            return
        }

        DurationMenu(player, rank, gameProfile).openMenu()
    }
}
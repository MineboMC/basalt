package net.minebo.basalt.staff.commands.menu

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.Menu
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

/**
 * Class created on 9/16/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class StaffLeaderboardMenu(val player: Player, val preLoadedButtons: MutableMap<Int, Button>) : Menu(player)
{

    init
    {
        staticSize = 27
        placeholder = true
    }

    override fun getButtons(player: Player): MutableMap<Int, Button>
    {
        return preLoadedButtons
    }

    override fun getTitle(player: Player): String
    {
        return "Viewing Staff Leaderboards"
    }

    class LeaderboardPunishmentButton(val type: PunishmentType, val users: MutableList<GameProfile>) : Button()
    {
        override fun getMaterial(player: Player): Material
        {
            return Material.matchMaterial("${BasaltAPI.getWoolColor(type.color)}_WOOL") ?: Material.WHITE_WOOL
        }

        override fun getDescription(player: Player): MutableList<String>
        {
            val desc = mutableListOf<String>()
            var i = 1
            desc.add(Chat.format("&8&m---------------------------"))
            for (profile in users)
            {
                desc.add(
                    Chat.format(
                        getColoredSlot(i) + " &7- ${profile.getRankDisplay()} &8(${
                            profile.getExecutedCountByType(
                                type
                            )
                        })"
                    )
                )
                i++
            }
            desc.add(Chat.format("&8&m---------------------------"))

            return desc
        }

        fun getColoredSlot(index: Int): String
        {
            if (index == 1) return "&6#1"
            if (index == 2) return "&7#2"
            if (index == 3) return "&c#3"

            return "&a#${index}"
        }

        override fun getDisplayName(player: Player): String
        {
            return Chat.format(type.color + type.niceName + " Leaderboard &7(Top 10)")
        }

        override fun getData(player: Player): Short
        {
            return BasaltAPI.getWoolColor(type.color).woolData.toShort()
        }

        override fun onClick(player: Player, slot: Int, type: ClickType)
        {
        }

    }
}
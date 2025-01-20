package net.minebo.basalt.punishment.commands.menu.executed

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.service.expirable.PunishmentService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.Menu
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

/**
 * Class created on 5/7/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class ExecutedPunishmentHistoryMenu(player: Player, val target: GameProfile) : Menu(player)
{

    init
    {
        placeholder = true
        staticSize = 27
    }

    override fun getButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()

        buttons[9] = PunishmentTypeButton(PunishmentType.WARN, "&a&lIssued Warn", target)
        buttons[11] = PunishmentTypeButton(PunishmentType.MUTE, "&a&lIssued Mute", target)
        buttons[13] = PunishmentTypeButton(PunishmentType.GHOST_MUTE, "&a&lIssued Ghost Mute", target)
        buttons[15] = PunishmentTypeButton(PunishmentType.BAN, "&a&lIssued Ban", target)
        buttons[17] = PunishmentTypeButton(PunishmentType.BLACKLIST, "&a&lIssued Blacklist", target)

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return Chat.format("&7Punishments issued: " + BasaltAPI.getRankDisplay(target.uuid))
    }


    class PunishmentTypeButton(val type: PunishmentType, val displayName: String, val target: GameProfile) : Button()
    {

        override fun setCustomAmount(player: Player): Int
        {
            val number =
                PunishmentService.findExecutorPunishments(target.uuid).filter { it.getGrantable() == type }.size
            return if (number > 64) 64 else (if (number == 0) 1 else number)
        }

        override fun getMaterial(player: Player): Material
        {
            return Material.PAPER
        }

        override fun getDescription(player: Player): MutableList<String>
        {
            val desc = mutableListOf<String>()
            desc.add(Chat.format("&fClick to view this category"))
            desc.add(Chat.format("&fissued from"))
            desc.add(Chat.format(BasaltAPI.getRankDisplay(target.uuid)))
            desc.add(" ")
            desc.add(
                Chat.format(
                    "&fTotal Punishments: &f" + PunishmentService.findExecutorPunishments(target.uuid)
                        .filter { it.getGrantable() == type }.size
                )
            )
            return desc
        }

        override fun getDisplayName(player: Player): String
        {
            return Chat.format(displayName)
        }

        override fun getData(player: Player): Short
        {
            return 0
        }

        override fun onClick(player: Player, slot: Int, type: ClickType)
        {
            GeneralExecutedPunishmentMenu(target, this.type, player).updateMenu()
        }

    }
}
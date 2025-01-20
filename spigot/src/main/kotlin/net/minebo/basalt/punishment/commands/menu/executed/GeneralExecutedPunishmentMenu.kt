package net.minebo.basalt.punishment.commands.menu.executed

import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.punishment.commands.menu.impl.GeneralPunishmentButton
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.service.expirable.PunishmentService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.buttons.SimpleActionButton
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import org.bukkit.Material
import org.bukkit.entity.Player

/**
 * Class created on 5/7/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class GeneralExecutedPunishmentMenu(var profile: GameProfile, var punishmentType: PunishmentType, var player: Player) :
    PaginatedMenu(18, player)
{

    override fun getHeaderItems(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()

        buttons[4] =
            SimpleActionButton(Material.PAPER, mutableListOf(), "&cGo Back", 0).setBody { player, slot, click ->
                ExecutedPunishmentHistoryMenu(player, profile).openMenu()
            }

        return buttons
    }

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = hashMapOf<Int, Button>()

        var index = 0
        for (punishment in PunishmentService.findExecutorPunishments(profile.uuid)
            .filter { it.getGrantable() == punishmentType })
        {
            buttons[index++] = GeneralPunishmentButton(punishment)
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return Chat.format(punishmentType.color + punishmentType.niceName + "s")
    }
}
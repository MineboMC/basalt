package net.minebo.basalt.staff.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.service.expirable.PunishmentService
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.staff.commands.menu.StaffLeaderboardMenu
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import org.bukkit.entity.Player
import java.util.concurrent.CompletableFuture

/**
 * Class created on 9/16/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object StaffLeaderboardCommand : BaseCommand()
{
    @CommandAlias("staffleaderboard")
    @CommandPermission("basalt.staff.leaderboards")
    fun staffLeaderboard(player: Player): CompletableFuture<Void>
    {
        player.sendMessage(Chat.format("&eOpening up the &astaff leaderboard&e! &ePlease wait, this may take a moment."))

        return ProfileGameService.handler.retrieveAllAsync().thenAcceptAsync {
            val mutableList = it.toMutableList()
            val types = listOf(
                PunishmentType.WARN,
                PunishmentType.MUTE,
                PunishmentType.GHOST_MUTE,
                PunishmentType.BAN,
                PunishmentType.BLACKLIST
            )

            exclusivelyLoadEntries(types, mutableList).whenComplete { t, v ->
                StaffLeaderboardMenu(player, t).openMenu()
            }
        }
    }

    fun exclusivelyLoadEntries(
        types: List<PunishmentType>,
        users: MutableList<GameProfile>
    ): CompletableFuture<MutableMap<Int, Button>>
    {
        val toLoad = mutableMapOf<Int, Button>()
        var i = 11

        for (type in types)
        {
            toLoad[i++] = StaffLeaderboardMenu.LeaderboardPunishmentButton(type, fetchFirst10Entries(type, users))
        }

        return CompletableFuture.completedFuture(toLoad)
    }


    fun fetchFirst10Entries(
        type: PunishmentType, toPickFrom: MutableList<GameProfile>
    ): MutableList<GameProfile>
    {
        return mutableListOf<GameProfile>().apply {
            val toAdd = toPickFrom
                .sortedByDescending {
                    PunishmentService.findExecutorPunishments(it.uuid)
                        .count { punishment -> punishment.punishmentType == type.name }
                }.take(10)
            this.addAll(toAdd)
        }
    }
}
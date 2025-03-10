package net.minebo.basalt.grants.menu.grant.scope

import net.minebo.basalt.models.grant.types.RankGrant
import net.minebo.basalt.models.grant.types.scope.GrantScope
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.models.server.UniqueServer
import net.minebo.basalt.packets.GrantMessageTargetPacket
import net.minebo.basalt.packets.StaffAuditPacket
import net.minebo.basalt.profiles.permissions.packet.PermissionUpdatePacket
import net.minebo.basalt.punishments.actor.ActorType
import net.minebo.basalt.punishments.actor.DefaultActor
import net.minebo.basalt.punishments.actor.executor.Executor
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.redis.cache.mutate.UpdateGrantCacheRequest
import net.minebo.basalt.service.expirable.RankGrantService
import net.minebo.basalt.service.server.UniqueServerService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.buttons.SimpleActionButton
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import net.minebo.basalt.webhook.types.grants.GrantsNotification
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

/**
 * Class created on 6/21/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class ScopeSelectionMenu(
    val player: Player,
    val rank: Rank,
    val target: GameProfile,
    val duration: Long,
    val reason: String,
    val equipped: MutableList<String>,
    val global: Boolean
) : PaginatedMenu(18, player)
{

    override fun getHeaderItems(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()

        buttons[3] = SimpleActionButton(
            Material.DIAMOND_SWORD, mutableListOf(
                Chat.format(" "),
                Chat.format("&7Click to make this grant global."),
                Chat.format("&7Making this a global grant means that"),
                Chat.format("&7this grant will apply on every scope."),
                Chat.format(" "),
                Chat.format("&e&lLeft-Click &eto change global status to " + (if (global) "&cfalse" else "&atrue") + "&e."),
                Chat.format(" ")
            ), Chat.format("&e&lGlobal Status"), 0
        ).setBody { player, i, clickType ->
            ScopeSelectionMenu(player, rank, target, duration, reason, equipped, !global).updateMenu()
        }

        buttons[5] = SimpleActionButton(
            Material.PAPER, mutableListOf(
                Chat.format(" "),
                Chat.format("&7Click to finalize this grant"),
                Chat.format("&7using all the scopes that are"),
                Chat.format("&7currently selected."),
                Chat.format(" "),
                Chat.format("&e&lLeft-Click &eto finalize this grant"),
                Chat.format(" ")
            ), Chat.format("&a&lFinalize"), 0
        ).setBody { player, i, clickType ->
            if (!global && equipped.isEmpty())
            {
                player.sendMessage(Chat.format("&cYou must select a scope to add this grant to"))
                return@setBody
            }

            val rankGrant = RankGrant(
                rank.id,
                target.uuid,
                player.uniqueId,
                reason, duration,
                DefaultActor(Executor.PLAYER, ActorType.GAME),
                GrantScope("Manual Grant", equipped, global)
            )

            RankGrantService.save(rankGrant).whenComplete { _, _ ->
                AsynchronousRedisSender.send(PermissionUpdatePacket(target.uuid))
                AsynchronousRedisSender.send(UpdateGrantCacheRequest(target.uuid))
            }

            AsynchronousRedisSender.send(GrantMessageTargetPacket(target.uuid, rank, duration))

            player.sendMessage(
                Chat.format(
                    "&aGranted &f" + target.username + " &athe " + rank.color + rank.displayName + " &arank"
                )
            )
            GrantsNotification(rankGrant).send()

            AsynchronousRedisSender.send(StaffAuditPacket("&b[Audit] &b" + target.getRankDisplay() + " &3was granted " + rank.color + rank.displayName + " &3for &b" + reason))
            player.closeInventory()
        }

        return buttons
    }

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        var index = 0
        val items = UniqueServerService.getValues()
        val buttons = mutableMapOf<Int, Button>()

        for (item in items)
        {
            buttons[index++] = ScopeButton(item, target, rank, duration, reason, global, equipped)
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Select Scopes To Add"
    }

    class ScopeButton(
        val uniqueServer: UniqueServer,
        val target: GameProfile,
        val rank: Rank,
        val duration: Long,
        val reason: String,
        val global: Boolean,
        val equipped: MutableList<String>
    ) : Button()
    {
        override fun getMaterial(player: Player): Material
        {
            return Material.PAPER
        }

        override fun getDescription(player: Player): MutableList<String>
        {
            val desc = mutableListOf<String>()
            desc.add(Chat.format(" "))
            desc.add(Chat.format("&7Click to " + (if (equipped.contains(uniqueServer.id)) "&cremove" else "&aadd") + " &7${uniqueServer.displayName}"))
            desc.add(Chat.format("&7to the active scope list."))
            desc.add(Chat.format(" "))
            desc.add(Chat.format("&e&lLeft-Click &eto " + (if (equipped.contains(uniqueServer.id)) "unselect" else "select") + " this server"))
            desc.add(Chat.format(" "))

            return desc
        }

        override fun getDisplayName(player: Player): String
        {
            return Chat.format("&a&l" + uniqueServer.displayName)
        }

        override fun getData(player: Player): Short
        {
            return 0
        }

        override fun onClick(player: Player, slot: Int, type: ClickType)
        {
            if (!global)
            {
                if (!equipped.contains(uniqueServer.id))
                {
                    equipped.add(uniqueServer.id)
                } else
                {
                    equipped.remove(uniqueServer.id)
                }

                ScopeSelectionMenu(player, rank, target, duration, reason, equipped, global).updateMenu()
            } else
            {
                player.sendMessage(Chat.format("&eYou have the &6global &escope selected and cannot add any more"))
            }
        }

    }
}
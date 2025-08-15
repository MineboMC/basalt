package net.minebo.basalt.grants.menu.grants

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.grants.menu.grant.scope.ScopeSelectionEditorMenu
import net.minebo.basalt.models.grant.types.RankGrant
import net.minebo.basalt.profiles.permissions.packet.PermissionUpdatePacket
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.service.expirable.RankGrantService
import net.minebo.basalt.themes.ThemeLoader
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.conversations.*
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class GrantsButton(var rankGrant: RankGrant) : Button()
{


    override fun getMaterial(player: Player): Material
    {
        return Material.matchMaterial("${BasaltAPI.getWoolColor(ThemeLoader.defaultTheme.getGrantsData(player, rankGrant))}_WOOL") ?: Material.WHITE_WOOL
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        return ThemeLoader.defaultTheme.getGrantsLore(player, rankGrant)
    }

    override fun getDisplayName(player: Player): String
    {
        return ThemeLoader.defaultTheme.getGrantsDisplayName(player, rankGrant)
    }

    override fun getData(player: Player): Short
    {
        return ThemeLoader.defaultTheme.getGrantsData(player, rankGrant)
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        if (type == ClickType.RIGHT)
        {
            if (player.hasPermission("basalt.grants.remove"))
            {
                if (rankGrant.expirable.isActive())
                {
                    player.closeInventory()
                    val factory =
                        ConversationFactory(BasaltSpigotPlugin.instance).withModality(true)
                            .withPrefix(NullConversationPrefix())
                            .withFirstPrompt(object : StringPrompt()
                            {
                                override fun getPromptText(context: ConversationContext): String
                                {
                                    return Chat.format("&ePlease type a reason for this grant to be removed, or type &ccancel &eto cancel.")
                                }

                                override fun acceptInput(context: ConversationContext, input: String?): Prompt?
                                {
                                    if (input.equals("cancel", ignoreCase = true))
                                    {
                                        context.forWhom.sendRawMessage(Chat.format("&cGrant process aborted."))
                                        return Prompt.END_OF_CONVERSATION
                                    } else
                                    {
                                        Bukkit.getScheduler().runTaskLater(BasaltSpigotPlugin.instance, Runnable{
                                            rankGrant.expirable.removedAt = System.currentTimeMillis()
                                            rankGrant.removedReason = input
                                            rankGrant.removedBy = player.uniqueId
                                            rankGrant.expirable.expired = true

                                            RankGrantService.save(rankGrant)

                                            AsynchronousRedisSender.send(PermissionUpdatePacket(rankGrant.target))
                                            player.sendMessage(Chat.format("&aRemoved the grant!"))
                                        }, 5L)
                                        return Prompt.END_OF_CONVERSATION
                                    }
                                }
                            }).withEscapeSequence("/no").withLocalEcho(false).withTimeout(10)
                            .thatExcludesNonPlayersWithMessage("Go away evil console!")
                    val con: Conversation = factory.buildConversation(player)
                    player.beginConversation(con)
                } else
                {
                    player.sendMessage(Chat.format("&cYou cannot remove a grant that is already removed!"))
                }
            } else
            {
                player.sendMessage(Chat.format("&cYou lack the permissions to do this!"))
            }
        }

        if (type == ClickType.LEFT)
        {
            ScopeSelectionEditorMenu(
                player,
                rankGrant.getGrantable(),
                BasaltAPI.syncFindProfile(rankGrant.target)!!,
                rankGrant.expirable.duration,
                rankGrant.reason,
                rankGrant.verifyGrantScope().servers,
                rankGrant,
                rankGrant.verifyGrantScope().global
            ).updateMenu()
        }
    }
}
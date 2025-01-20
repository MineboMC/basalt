package net.minebo.basalt.commands.tags.grants.menu.grant

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.grant.types.TagGrant
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.models.tags.Tag
import net.minebo.basalt.packets.StaffAuditPacket
import net.minebo.basalt.punishments.actor.ActorType
import net.minebo.basalt.punishments.actor.DefaultActor
import net.minebo.basalt.punishments.actor.executor.Executor
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.service.expirable.TagGrantService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import net.minebo.basalt.util.menu.Button
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.conversations.*
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType


class TagGrantButton(var tag: Tag, var gameProfile: GameProfile) : Button()
{


    override fun getMaterial(player: Player): Material
    {
        return Material.WOOL
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        val desc = arrayListOf<String>()

        desc.add(Chat.format("&7&m--------------"))
        desc.add(Chat.format("&fTag: &r${tag.menuName}"))
        desc.add(Chat.format("&7* &fPrefix: ${tag.prefix}"))
        desc.add(Chat.format("&7* &fPurchasable: ${tag.purchasable}"))
        desc.add(Chat.format("&7&m--------------"))


        return desc
    }

    override fun getDisplayName(player: Player): String
    {
        return Chat.format(tag.menuName)
    }

    override fun getData(player: Player): Short
    {
        return BasaltAPI.getWoolColor(tag.menuName).woolData.toShort()
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        reasonConvo(player)
    }

    fun reasonConvo(player: Player)
    {
        player.closeInventory()
        val factory =
            ConversationFactory(BasaltSpigotPlugin.instance).withModality(true).withPrefix(NullConversationPrefix())
                .withFirstPrompt(object : StringPrompt()
                {
                    override fun getPromptText(context: ConversationContext): String
                    {
                        return Chat.format("&ePlease type a reason for this grant, or type &ccancel &eto cancel.")
                    }

                    override fun acceptInput(context: ConversationContext, input: String): Prompt?
                    {
                        if (input.equals("cancel", ignoreCase = true))
                        {
                            context.forWhom.sendRawMessage(Chat.format("&cGrant process aborted."))
                            return Prompt.END_OF_CONVERSATION
                        } else
                        {
                            val reason = input

                            Bukkit.getScheduler().runTaskLater(BasaltSpigotPlugin.instance, {
                                durationConversation(player, reason)
                            }, 5L)
                            return Prompt.END_OF_CONVERSATION
                        }
                    }
                }).withEscapeSequence("/no").withLocalEcho(false).withTimeout(10)
                .thatExcludesNonPlayersWithMessage("Go away evil console!")
        val con: Conversation = factory.buildConversation(player)
        player.beginConversation(con)
    }

    fun durationConversation(player: Player, reason: String)
    {
        player.closeInventory()
        val factory =
            ConversationFactory(BasaltSpigotPlugin.instance).withModality(true).withPrefix(NullConversationPrefix())
                .withFirstPrompt(object : StringPrompt()
                {
                    override fun getPromptText(context: ConversationContext): String
                    {
                        return Chat.format("&ePlease type a duration for this grant, (\"perm\" for permanent), or type &ccancel &eto cancel.")
                    }

                    override fun acceptInput(context: ConversationContext, input: String): Prompt?
                    {
                        return if (input.equals("cancel", ignoreCase = true))
                        {
                            context.forWhom.sendRawMessage(Chat.format("&cGrant process aborted."))
                            END_OF_CONVERSATION
                        } else
                        {


                            var duration = 0L

                            duration = if (input == "perm")
                            {
                                Long.MAX_VALUE
                            } else
                            {
                                TimeUtil.parseTime(input).toLong() * 1000L
                            }

                            if (duration <= 0)
                            {
                                player.sendMessage(Chat.format("&cInvalid time, grant process aborted."))
                                return END_OF_CONVERSATION
                            }

                            Bukkit.getScheduler().runTaskLater(BasaltSpigotPlugin.instance, {
                                val taggrant = TagGrant(
                                    tag.id,
                                    gameProfile.uuid,
                                    player.uniqueId,
                                    reason,
                                    duration,
                                    DefaultActor(Executor.PLAYER, ActorType.GAME)
                                )

                                TagGrantService.save(taggrant)
                                player.sendMessage(
                                    Chat.format(
                                        "&aGranted &f" + gameProfile.username + " &athe " + tag.menuName + " &atag"
                                    )
                                )

                                AsynchronousRedisSender.send(StaffAuditPacket("&b[Audit] &b" + gameProfile.username + " &3was granted the " + tag.menuName + " &3prefix for &b" + reason))
                            }, 1L)
                            END_OF_CONVERSATION
                        }
                    }
                }).withEscapeSequence("/no").withLocalEcho(false).withTimeout(10)
                .thatExcludesNonPlayersWithMessage("Go away evil console!")
        val con: Conversation = factory.buildConversation(player)
        player.beginConversation(con)
    }

}
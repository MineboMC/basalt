package net.minebo.basalt.commands.tags.menu

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.tags.Tag
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.redis.cache.refresh.RefreshTagsPacket
import net.minebo.basalt.service.tags.TagService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import org.bukkit.Bukkit
import org.bukkit.Material
import org.bukkit.conversations.*
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class TagCustomizationButton(var tag: Tag) : Button()
{

    override fun getMaterial(player: Player): Material
    {
        return Material.INK_SACK
    }

    override fun getDescription(player: Player): MutableList<String>
    {
        val desc = arrayListOf<String>()

        desc.add(Chat.format("&7&m------------------------"))
        desc.add(Chat.format("&eTag: &c" + tag.id))
        desc.add(Chat.format("&eMenuName: &c" + tag.menuName))
        desc.add(Chat.format("&ePurchasable: &c" + tag.purchasable))
        desc.add(Chat.format("&ePrefix: &c" + tag.prefix))
        desc.add(" ")
        desc.add(Chat.format("&b&lLEFT-CLICK To change purchasable status"))
        desc.add(Chat.format("&a&lMIDDLE-CLICK To change MenuName of tag"))
        desc.add(Chat.format("&c&lRIGHT-CLICK To change prefix of tag"))
        desc.add(Chat.format("&7&m------------------------"))

        return desc
    }

    override fun getDisplayName(player: Player): String
    {
        return Chat.format(tag.menuName)
    }

    override fun getData(player: Player): Short
    {
        return BasaltAPI.getWoolColor(tag.menuName).dyeData.toShort()
    }

    override fun onClick(player: Player, slot: Int, type: ClickType)
    {
        when (type)
        {
            ClickType.RIGHT ->
            {
                prefixConversation(player)
            }

            ClickType.MIDDLE ->
            {
                menuNameConversation(player)
            }

            ClickType.LEFT ->
            {
                tag.purchasable = !tag.purchasable
                player.sendMessage(Chat.format("&aUpdated the purchasable status of " + tag.id))

                AsynchronousRedisSender.send(RefreshTagsPacket())
                TagService.save(tag)
            }

            else ->
            {
                return
            }
        }
    }

    fun prefixConversation(player: Player)
    {
        player.closeInventory()
        val factory =
            ConversationFactory(BasaltSpigotPlugin.instance).withModality(true).withPrefix(NullConversationPrefix())
                .withFirstPrompt(object : StringPrompt()
                {
                    override fun getPromptText(context: ConversationContext): String
                    {
                        return Chat.format("&ePlease type a prefix change for this tag, or type &ccancel &eto cancel.")
                    }

                    override fun acceptInput(context: ConversationContext, input: String): Prompt?
                    {
                        return if (input.equals("cancel", ignoreCase = true))
                        {
                            context.forWhom.sendRawMessage(Chat.format("&cGrant process aborted."))
                            END_OF_CONVERSATION
                        } else
                        {

                            Bukkit.getScheduler().runTaskLater(BasaltSpigotPlugin.instance, {
                                tag.prefix = input
                                TagService.save(tag)
                                AsynchronousRedisSender.send(RefreshTagsPacket())
                                player.sendMessage(Chat.format("&aUpdated the prefix of ${tag.menuName}"))
                            }, 1L)
                            END_OF_CONVERSATION
                        }
                    }
                }).withEscapeSequence("/no").withLocalEcho(false).withTimeout(10)
                .thatExcludesNonPlayersWithMessage("Go away evil console!")
        val con: Conversation = factory.buildConversation(player)
        player.beginConversation(con)
    }

    fun menuNameConversation(player: Player)
    {
        player.closeInventory()
        val factory =
            ConversationFactory(BasaltSpigotPlugin.instance).withModality(true).withPrefix(NullConversationPrefix())
                .withFirstPrompt(object : StringPrompt()
                {
                    override fun getPromptText(context: ConversationContext): String
                    {
                        return Chat.format("&ePlease type a menu name for this tag, or type &ccancel &eto cancel.")
                    }

                    override fun acceptInput(context: ConversationContext, input: String): Prompt?
                    {
                        return if (input.equals("cancel", ignoreCase = true))
                        {
                            context.forWhom.sendRawMessage(Chat.format("&cGrant process aborted."))
                            END_OF_CONVERSATION
                        } else
                        {

                            Bukkit.getScheduler().runTaskLater(BasaltSpigotPlugin.instance, {
                                tag.menuName = input
                                TagService.save(tag)
                                AsynchronousRedisSender.send(RefreshTagsPacket())
                                player.sendMessage(Chat.format("&aUpdated the menuname of ${tag.menuName}"))
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
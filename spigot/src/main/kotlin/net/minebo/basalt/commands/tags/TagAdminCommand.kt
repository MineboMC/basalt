package net.minebo.basalt.commands.tags

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import co.aikar.commands.annotation.Subcommand
import net.minebo.basalt.commands.tags.menu.TagCustomizationMenu
import net.minebo.basalt.models.tags.Tag
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.redis.cache.refresh.RefreshTagsPacket
import net.minebo.basalt.service.tags.TagService
import net.minebo.basalt.util.Chat
import org.bukkit.Material
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

@CommandAlias("tagadmin")
class TagAdminCommand : BaseCommand()
{

    @Subcommand("create")
    @CommandPermission("basalt.tags.admin")
    fun create(sender: CommandSender, @Name("name") name: String)
    {
        val tag = TagService.byId(name)

        if (tag != null)
        {
            sender.sendMessage(Chat.format("&cTag already exists"))
            return
        }

        TagService.save(Tag(name, "&7$name", true, "", "Text", Material.NAME_TAG.name))
        AsynchronousRedisSender.send(RefreshTagsPacket())
        sender.sendMessage(Chat.format("&aCreated a new tag"))
    }

    @Subcommand("delete")
    @CommandPermission("basalt.tags.admin")
    fun delete(sender: CommandSender, @Name("name") name: String)
    {
        val tag = TagService.byId(name)

        if (tag == null)
        {
            sender.sendMessage(Chat.format("&cTag does not exist"))
            return
        }

        TagService.handler.delete(tag.id)
        AsynchronousRedisSender.send(RefreshTagsPacket())
        sender.sendMessage(Chat.format("&cDeleted this tag!"))
    }

    @Subcommand("edit")
    @CommandPermission("basalt.tags.admin")
    fun edit(player: Player)
    {
        TagCustomizationMenu(player).updateMenu()
    }
}
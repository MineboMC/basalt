package net.minebo.basalt.commands.filter

import co.aikar.commands.BaseCommand
import co.aikar.commands.CommandHelp
import co.aikar.commands.annotation.*
import net.minebo.basalt.commands.filter.menu.FilterEditorMenu
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.redis.cache.refresh.RefreshFiltersPacket
import net.minebo.basalt.service.filter.FilterService
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player
import java.util.*

@CommandAlias("filters|filter")
@CommandPermission("basalt.filters.admin")
class FilterCommands : BaseCommand()
{

    @HelpCommand
    fun help(help: CommandHelp)
    {
        help.showHelp()
    }

    @Subcommand("editor")
    fun create(player: Player)
    {
        FilterEditorMenu(player).updateMenu()
    }

    @Subcommand("delete")
    fun delete(player: Player, @Name("word") word: String)
    {
        val filter = FilterService.byWord(word.lowercase())

        if (filter == null)
        {
            player.sendMessage(Chat.format("&cThis is not a filter!"))
            return
        }

        FilterService.handler.delete(filter.id)
        AsynchronousRedisSender.send(RefreshFiltersPacket())
        player.sendMessage(Chat.format("&aDeleted the &f$word &afilter"))
    }


}
package net.minebo.basalt.profiles.commands.sibling

import co.aikar.commands.BaseCommand
import co.aikar.commands.CommandHelp
import co.aikar.commands.annotation.*
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.profiles.commands.sibling.menu.SiblingCheckMenu
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.util.Chat
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

/**
 * Class created on 7/4/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@CommandAlias("sibling")
@CommandPermission("basalt.siblings")
class SiblingCommands : BaseCommand()
{

    @HelpCommand
    fun help(help: CommandHelp)
    {
        help.showHelp()
    }

    @Subcommand("add")
    fun add(sender: CommandSender, @Name("target") target: GameProfile, @Name("sibling") sibling: GameProfile)
    {
        target.getAllSiblings().add(sibling.uuid)
        sibling.getAllSiblings().add(target.uuid)
        ProfileGameService.save(target)
        ProfileGameService.save(sibling)
        sender.sendMessage(Chat.format("&aAdded a new sibling to " + target.getRankDisplay()))
        sender.sendMessage(Chat.format("&e&lCaution! &cIt is recommended to add siblings only if their"))
        sender.sendMessage(Chat.format("&cIP Addresses match. You can check by running /sibling check <target>"))
    }

    @Subcommand("check")
    fun check(player: Player, @Name("target") target: GameProfile)
    {
        SiblingCheckMenu(target, player).updateMenu()
    }
}
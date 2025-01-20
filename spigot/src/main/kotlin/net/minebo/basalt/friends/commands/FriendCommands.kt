package net.minebo.basalt.friends.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.*
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.friends.filter.FriendFilter
import net.minebo.basalt.friends.menus.FriendsListMenu
import net.minebo.basalt.friends.menus.FriendsMenu
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.packets.NetworkMessagePacket
import net.minebo.basalt.profiles.getProfile
import net.minebo.basalt.redis.AsynchronousRedisSender
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import org.bukkit.entity.Player


class FriendCommands : BaseCommand()
{

    @CommandAlias("f|friend|friends")
    fun friend(player: Player)
    {
        val profile = player.getProfile()

        if (profile == null)
        {
            player.sendMessage(Chat.format("&cYour profile does not exist!"))
            return
        }

        FriendsMenu(player, profile).openMenu()
    }

    @Subcommand("add")
    @CommandCompletion("@gameprofile")
    fun add(player: Player, @Name("target") gameProfile: GameProfile)
    {
        val playerProfile = BasaltAPI.quickFindProfile(player.uniqueId).join() ?: return
        val bukkitPlayer = Bukkit.getOfflinePlayer(gameProfile.uuid)

        if (gameProfile.friends.contains(player.uniqueId))
        {
            player.sendMessage(Chat.format("&cThis player is already friends with you"))
            return
        }

        if (playerProfile.friendInvites.contains(gameProfile.uuid))
        {
            player.sendMessage(Chat.format("&cAlready sent an invite to this player"))
            return
        }

        if (gameProfile.uuid == player.uniqueId)
        {
            player.sendMessage(Chat.format("&cCannot friend yourself!"))
            return
        }

        gameProfile.friendInvites.add(player.uniqueId)
        player.sendMessage(Chat.format("&e&l[Friends] &aYou have send a friend request to &f" + gameProfile.username))

        AsynchronousRedisSender.send(
            NetworkMessagePacket(
                gameProfile.uuid,
                Chat.format("&e&l[Friends] &aYou have received a friend request from &f" + playerProfile.username)
            )
        )
        AsynchronousRedisSender.send(
            NetworkMessagePacket(
                gameProfile.uuid,
                Chat.format("&e&l[Friends] &aType &f/friend accept &ato accept the request")
            )
        )

        ProfileGameService.save(gameProfile)
    }

    @Subcommand("list")
    fun list(player: Player)
    {
        val gameProfile = BasaltAPI.quickFindProfile(player.uniqueId).get()!!

        FriendsListMenu(player, gameProfile, FriendFilter.ALL).updateMenu()
    }

    @Subcommand("accept")
    @CommandCompletion("@gameprofile")
    fun accept(player: Player, @Name("target") gameProfile: GameProfile)
    {
        val it = ProfileGameService.byId(player.uniqueId)
        if (!it?.friendInvites!!.contains(gameProfile.uuid))
        {
            player.sendMessage(Chat.format("&cThis player has never tried friending you!"))
            return
        }

        it.friendInvites.remove(gameProfile.uuid)
        it.friends.add(gameProfile.uuid)

        gameProfile.friends.add(it.uuid)

        ProfileGameService.save(it)
        ProfileGameService.save(gameProfile)

        player.sendMessage(Chat.format("&e&l[Friends] &aYou have accepted ${gameProfile.username}'s &fFriend Request"))

        AsynchronousRedisSender.send(
            NetworkMessagePacket(
                gameProfile.uuid,
                Chat.format("&e&l[Friends] &f" + player.name + " &ahas accepted your friend request!")
            )
        )

    }
}
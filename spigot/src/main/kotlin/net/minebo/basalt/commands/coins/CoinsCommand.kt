package net.minebo.basalt.commands.coins

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.*
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.commands.coins.editor.CoinShopEditorMenu
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player

@CommandAlias("coins|coin")
class CoinsCommand : BaseCommand()
{

    @Default
    fun coinsCommand(player: Player)
    {
        val profile = BasaltAPI.syncFindProfile(player.uniqueId)

        if (profile == null)
        {
            player.sendMessage(Chat.format("&cYou must have a profile to use this command!"))
            return
        }

        player.sendMessage(Chat.format("&7[&6Coins&7] &eYou have a total of &6" + profile.coins + " &ecoins"))
    }

    @Subcommand("editor")
    @CommandPermission("basalt.coins.owner")
    fun coinsEditor(player: Player)
    {
        CoinShopEditorMenu(player).openMenu()
    }

    @Subcommand("set")
    @CommandPermission("basalt.coins.admin")
    fun coinsSetCommand(player: Player, @Name("target") target: GameProfile, @Name("amount") amount: Int)
    {
        target.coins = amount
        ProfileGameService.save(target)

        player.sendMessage(Chat.format("&7[&6Coins&7] &eYou have set " + BasaltAPI.getRankDisplay(target.uuid) + "'s &ecoins to &6" + amount))
    }

    @Subcommand("give")
    @CommandPermission("basalt.coins.admin")
    fun coinsGiveCommand(player: Player, @Name("target") target: GameProfile, @Name("amount") amount: Int)
    {
        target.coins = amount
        ProfileGameService.save(target)

        player.sendMessage(
            Chat.format(
                "&7[&6Coins&7] &eYou have given &6" + amount + " &ecoins to the player " + BasaltAPI.getRankDisplay(
                    target.uuid
                )
            )
        )
    }
}
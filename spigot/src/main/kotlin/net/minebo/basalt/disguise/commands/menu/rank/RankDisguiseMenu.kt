package net.minebo.basalt.disguise.commands.menu.rank

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.profile.disguise.RankDisguiseAttribute
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.service.ranks.RankService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.items.ItemBuilder
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.buttons.SimpleActionButton
import net.minebo.basalt.util.menu.buttons.SkullButton
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType
import org.bukkit.inventory.ItemStack

/**
 * Class created on 6/27/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
class RankDisguiseMenu(val player: Player) : PaginatedMenu(27, player)
{

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()
        var i = 0

        for (rank in RankService.getRanksInOrder().filter { BasaltAPI.getRankWeight(player.uniqueId) >= it.weight })
        {
            buttons[i++] = RankDisguiseButton(rank)
        }

        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Viewing Ranks"
    }

    override fun getButtonPositions(): List<Int>
    {
        return listOf(
            10, 12, 14, 16,
            19, 21, 23, 25,
            28, 30, 32, 34
        )
    }

    override fun getHeaderItems(player: Player): MutableMap<Int, Button>
    {
        return mutableMapOf(
            0 to Button.placeholder(),
            1 to Button.placeholder(),
            2 to Button.placeholder(),
            3 to Button.placeholder(),
            4 to SimpleActionButton(
                Material.NETHER_STAR,
                mutableListOf(
                    " ",
                    Chat.format("&7Click here to reset your active disguise."),
                    Chat.format("&7This will change all rank options back to their"),
                    Chat.format("&7original settings."),
                    " ",
                    Chat.format("&aYou will look like " + BasaltAPI.getPlayerRankString(player.uniqueId)),
                    " "
                ),
                "&eReset Rank Disguise",
                0
            ).setBody { player, i, clickType ->
                val profile = BasaltAPI.syncFindProfile(player.uniqueId) ?: return@setBody
                profile.rankDisguiseAttribute = null

                ProfileGameService.save(profile)
                player.sendMessage(
                    Chat.format(
                        "&aYou have reset your rank disguise! Now looking like " + BasaltAPI.getPlayerRankString(
                            player.uniqueId
                        )
                    )
                )
            },
            5 to Button.placeholder(),
            6 to Button.placeholder(),
            7 to Button.placeholder(),
            8 to Button.placeholder(),
            9 to Button.placeholder(),
            11 to Button.placeholder(),
            13 to Button.placeholder(),
            15 to Button.placeholder(),
            17 to Button.placeholder(),
            18 to Button.placeholder(),
            20 to Button.placeholder(),
            22 to Button.placeholder(),
            24 to Button.placeholder(),
            26 to Button.placeholder(),
            27 to Button.placeholder(),
            29 to Button.placeholder(),
            31 to Button.placeholder(),
            33 to Button.placeholder(),
            35 to Button.placeholder(),
        )
    }

    override fun getButtonsPerPage(): Int
    {
        return 16
    }

    class RankDisguiseButton(val rank: Rank) : Button()
    {

        override fun getButtonItem(player: Player): ItemStack
        {
            return ItemBuilder.of(getMaterial(player))
                .setLore(getDescription(player))
                .name(getDisplayName(player))
                .color(Chat.getLeatherMetaColor(if (rank.woolColor != null) rank.woolColor!! else rank.color))
                .build()
        }

        override fun getMaterial(player: Player): Material
        {
            return Material.LEATHER_CHESTPLATE
        }

        override fun getDescription(player: Player): MutableList<String>
        {
            val desc = mutableListOf<String>()
            desc.add(" ")
            desc.add("&7Display Name: &f${rank.displayName}")
            desc.add("&7Chat Format: &f${rank.prefix + rank.color + player.name}")
            desc.add(" ")
            desc.add("&aClick to disguse yourself as ${rank.displayName}&a.")

            return desc.map { Chat.format(it) }.toMutableList()
        }

        override fun getDisplayName(player: Player): String
        {
            return Chat.format(rank.color + rank.displayName)
        }

        override fun getData(player: Player): Short
        {
            return 0
        }

        override fun onClick(player: Player, slot: Int, type: ClickType)
        {
            player.closeInventory()
            val profile = BasaltAPI.syncFindProfile(player.uniqueId)!!
            profile.rankDisguiseAttribute = RankDisguiseAttribute(rank.id, true)
            ProfileGameService.save(profile)

            player.sendMessage(Chat.format("&eSuccess! &aYou now look like you have the rank " + rank.color + rank.displayName))
        }

    }

}
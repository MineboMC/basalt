package net.minebo.basalt.commands.rank.menu

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.commands.rank.menu.filter.RankListFilter
import net.minebo.basalt.commands.rank.menu.sub.RankEditPropertiesMenu
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.service.ranks.RankService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.InputPrompt
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.buttons.SimpleActionButton
import net.minebo.basalt.util.menu.buttons.SkullButton
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import net.minebo.basalt.util.menu.type.BorderedPaginatedMenu
import org.bukkit.Material
import org.bukkit.entity.Player
import org.bukkit.event.inventory.ClickType

class RankEditorMenu(
    player: Player,
    private val ranks: List<Rank>,
    private val rankListFilter: RankListFilter
) : BorderedPaginatedMenu(player)
{

    override fun getHeaderItems(player: Player): MutableMap<Int, Button>
    {
        return super.getHeaderItems(player).apply {
            putAll(mutableMapOf(
                1 to Button.placeholder(),
                2 to Button.placeholder(),
                4 to Button.placeholder(),
                6 to Button.placeholder(),
                7 to Button.placeholder(),
                9 to Button.placeholder(),
                17 to Button.placeholder(),
                18 to Button.placeholder(),
                26 to Button.placeholder(),
                27 to Button.placeholder(),
                35 to Button.placeholder(),
                36 to Button.placeholder(),
                37 to Button.placeholder(),
                38 to Button.placeholder(),
                39 to Button.placeholder(),
                40 to Button.placeholder(),
                41 to Button.placeholder(),
                42 to Button.placeholder(),
                43 to Button.placeholder(),
                44 to Button.placeholder(),
                3 to SimpleActionButton(
                    Material.HOPPER,
                    generateRankListFilterLore(),
                    "&eClick to switch Rank Filter",
                    0
                ).setBody { player, i, clickType ->
                    val values = RankListFilter.values()
                    val index = values.indexOf(rankListFilter)
                    val next = (index + 1)
                    val limit = values.size - 1

                    if (next > limit)
                    {
                        RankEditorMenu(player, getRanksBasedOnFilter(values[0]).toList(), values[0]).updateMenu()

                        return@setBody
                    }

                    RankEditorMenu(player, getRanksBasedOnFilter(values[next]).toList(), values[next]).updateMenu()
                },

                5 to SkullButton(
                    "eyJ0aW1lc3RhbXAiOjE1NzEzMTYzMzY1MjgsInByb2ZpbGVJZCI6IjVkZTZlMTg0YWY4ZDQ5OGFiYmRlMDU1ZTUwNjUzMzE2IiwicHJvZmlsZU5hbWUiOiJBc3Nhc2luSmlhbmVyMjUiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzlhNmUwYzE2ZGYwMTMzNDE4OGVhNjliNzVjN2M4Y2IxOGVmODZmMjZhMTVjYTk2YTJkYTI1MWVhZGQ5NDU1NTkifX19",
                    mutableListOf(
                        Chat.format("&7Type any search query to be shown"),
                        Chat.format("&7a list of ranks that match the search"),
                        "",
                        Chat.format("&aClick to query!")
                    ),
                    "&eQuery Ranks"
                ).setBody { player, i, clickType ->
                    InputPrompt()
                        .withText(Chat.format("&eType any search query to be shown a list of ranks that match the search"))
                        .acceptInput { s: String ->
                            RankEditorMenu(
                                player,
                                ranks.filter { it.id.contains(s, ignoreCase = true) }.toMutableList(),
                                rankListFilter
                            ).updateMenu()
                        }.start(player)
                }
            ))
        }
    }

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = mutableMapOf<Int, Button>()
        var index = 0

        for (rank in ranks)
        {
            buttons[index++] = RankButton(player, rank)
        }
        return buttons
    }

    override fun getTitle(player: Player): String
    {
        return "Viewing all ranks..."
    }

    class RankButton(val player: Player, val rank: Rank) : Button()
    {
        override fun getMaterial(player: Player): Material
        {
            return Material.INK_SACK
        }

        override fun getDescription(player: Player): MutableList<String>
        {
            val desc = mutableListOf<String>()
            desc.add(Chat.format("&7&m---------------------"))
            desc.add(Chat.format("&6Metadata:"))
            desc.add(Chat.format("&6&l｜ &fPrefix: &e" + rank.prefix))
            desc.add(Chat.format("&6&l｜ &fWeight: &e" + rank.weight))
            desc.add(Chat.format("&6&l｜ &fColor: &r${rank.color}This"))
            desc.add(Chat.format("&6&l｜ &fWool Color: &e${if (rank.woolColor == null) "&cNone" else "${rank.woolColor}This"}"))
            desc.add(" ")
            desc.add(Chat.format("&6Attachments:"))
            desc.add(Chat.format("&6&l｜ &fPermissions: &e" + rank.permissions.size))
            desc.add(Chat.format("&6&l｜ &fParents: &e" + rank.parents.size))
            desc.add(" ")
            desc.add(Chat.format("&6Display:"))
            desc.add(Chat.format("&6&l｜ &fPlayer List: &f" + rank.color + player.name))
            desc.add(Chat.format("&6&l｜ &fChat Format: &f" + rank.prefix + rank.color + player.name))
            desc.add(" ")
            desc.add(Chat.format("&a&lLeft-Click to edit this rank!"))
            desc.add(Chat.format("&7&m---------------------"))

            return desc
        }

        override fun getDisplayName(player: Player): String
        {
            return Chat.format(rank.color + rank.displayName)
        }

        override fun getData(player: Player): Short
        {
            if (rank.woolColor != null)
            {
                return BasaltAPI.getWoolColor(rank.woolColor!!).dyeData.toShort()
            }
            return BasaltAPI.getWoolColor(rank.color).dyeData.toShort()
        }

        override fun onClick(player: Player, slot: Int, type: ClickType)
        {
            RankEditPropertiesMenu(player, rank).openMenu()
        }


    }

    private fun getRanksBasedOnFilter(filter: RankListFilter): MutableCollection<Rank>
    {
        return when (filter)
        {
            RankListFilter.ALL -> RankService.ranks.values
            RankListFilter.DEFAULT -> RankService.ranks.values.filter { it.default }
            RankListFilter.STAFF -> RankService.ranks.values.filter { it.staff }
            RankListFilter.HAS_PARENTS -> RankService.ranks.values.filter { it.parents.isNotEmpty() }
        }.toMutableList()
    }

    private fun generateRankListFilterLore(): MutableList<String>
    {
        val desc = mutableListOf<String>()
        desc.add(" ")
        for (filter in RankListFilter.values())
        {
            if (rankListFilter == filter)
            {
                desc.add(Chat.format("&a&l｜ &f" + filter.displayName))
            } else
            {
                desc.add(Chat.format("&c&l｜ &f" + filter.displayName))
            }
        }
        desc.add(" ")
        desc.add(Chat.format("&7Click to move to next filter!"))
        desc.add(" ")

        return desc
    }

}
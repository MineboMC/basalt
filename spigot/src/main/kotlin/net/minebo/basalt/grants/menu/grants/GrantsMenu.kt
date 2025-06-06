package net.minebo.basalt.grants.menu.grants

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.grants.menu.grants.filter.GrantFilter
import net.minebo.basalt.grants.view.GrantsCommand
import net.minebo.basalt.models.grant.types.RankGrant
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.profiles.commands.player.WipeGrantsCommand
import net.minebo.basalt.service.expirable.RankGrantService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.menu.Button
import net.minebo.basalt.util.menu.buttons.SkullButton
import net.minebo.basalt.util.menu.pagination.PaginatedMenu
import org.bukkit.command.CommandSender
import org.bukkit.entity.Player

class GrantsMenu(
    val player: Player,
    val gameProfile: GameProfile,
    val grants: MutableList<RankGrant>,
    val grantFilter: GrantFilter
) : PaginatedMenu(36, player)
{

    override fun getPagesButtons(player: Player): MutableMap<Int, Button>
    {
        val buttons = hashMapOf<Int, Button>()

        var index = 0
        for (grant in grants)
        {
            buttons[index++] = GrantsButton(grant)
        }

        return buttons
    }

    override fun getButtonPositions(): List<Int>
    {
        return listOf(
            10, 11, 12, 13, 14, 15, 16,
            19, 20, 21, 22, 23, 24, 25,
            28, 29, 30, 31, 32, 33, 34
        )
    }

    override fun getHeaderItems(player: Player): MutableMap<Int, Button>
    {
        return mutableMapOf(
            1 to Button.placeholder(),
            2 to Button.placeholder(),
            3 to SkullButton(
                "eyJ0aW1lc3RhbXAiOjE1MTA5MzU0NTkwMTMsInByb2ZpbGVJZCI6IjdkYTJhYjNhOTNjYTQ4ZWU4MzA0OGFmYzNiODBlNjhlIiwicHJvZmlsZU5hbWUiOiJHb2xkYXBmZWwiLCJzaWduYXR1cmVSZXF1aXJlZCI6dHJ1ZSwidGV4dHVyZXMiOnsiU0tJTiI6eyJ1cmwiOiJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlL2VlMWFjMzk4MmI4MTk5MzE1MmNhZDVmZWI1NmE3NWM4MzA3MmE1NjU1ZGMwNzEzN2ZkNjVkMWZmODk1MjI4MSJ9fX0=",
                getFilterDesc(), Chat.format("&eFilter Grants")
            ).setBody { player, i, clickType ->
                val values = GrantFilter.values()
                val index = values.indexOf(grantFilter)
                val next = (index + 1)
                val limit = values.size - 1

                if (next > limit)
                {
                    GrantsMenu(
                        player,
                        gameProfile,
                        values[0].lambda.invoke(
                            GrantsCommand.getViewableGrants(
                                player,
                                RankGrantService.getFromCache(gameProfile.uuid)
                                    .sortedByDescending { it.expirable.addedAt }.toMutableList()
                            )
                        ).toMutableList(),
                        values[0]
                    ).updateMenu()

                    return@setBody
                }

                GrantsMenu(
                    player,
                    gameProfile,
                    values[next].lambda.invoke(
                        GrantsCommand.getViewableGrants(
                            player,
                            RankGrantService.getFromCache(gameProfile.uuid).sortedByDescending { it.expirable.addedAt }
                                .toMutableList()
                        )
                    ).toMutableList(),
                    values[next]
                ).updateMenu()
            },
            4 to Button.placeholder(),
            5 to SkullButton(
                "ewogICJ0aW1lc3RhbXAiIDogMTY1NzEzMDk3Nzg4NCwKICAicHJvZmlsZUlkIiA6ICI4N2RlZmVhMTQwMWQ0MzYxODFhNmNhOWI3ZGQ2ODg0MyIsCiAgInByb2ZpbGVOYW1lIiA6ICJTcGh5bnhpdHMiLAogICJzaWduYXR1cmVSZXF1aXJlZCIgOiB0cnVlLAogICJ0ZXh0dXJlcyIgOiB7CiAgICAiU0tJTiIgOiB7CiAgICAgICJ1cmwiIDogImh0dHA6Ly90ZXh0dXJlcy5taW5lY3JhZnQubmV0L3RleHR1cmUvOGVjNjIxM2Y1ZGM4NmNkYjM2OWQ5NTEyN2Q3MmIwMGIwMzNlMGY5YWI1OTcwYTQ3NmRhZDdiZGRjOWZlOGYiCiAgICB9CiAgfQp9",
                mutableListOf(
                    " ",
                    Chat.format("&eClick to wipe every grant from"),
                    Chat.format(BasaltAPI.getRankWithPrefix(gameProfile.uuid)),
                    " ",
                    Chat.format(
                        "&aCurrently totaling &f" + GrantsCommand.getViewableGrants(
                            player,
                            RankGrantService.getFromCache(gameProfile.uuid).sortedByDescending { it.expirable.addedAt }
                                .toMutableList()
                        ).size + " &aentries"
                    ),
                    " "
                ), Chat.format("&eWipe Grants")
            ).setBody { player, i, clickType ->
                if (player.hasPermission("basalt.owner"))
                {
                    player.closeInventory()
                    WipeGrantsCommand.wipeGrants(player as CommandSender, gameProfile).whenComplete { t, u ->
                        GrantsMenu(
                            player,
                            gameProfile,
                            GrantsCommand.getViewableGrants(
                                player,
                                RankGrantService.getFromCache(gameProfile.uuid)
                                    .sortedByDescending { it.expirable.addedAt }.toMutableList()
                            ),
                            GrantFilter.ALL
                        ).updateMenu()
                    }
                } else player.sendMessage(Chat.format("&cYou must be a server operator to do this"))
            },
            6 to Button.placeholder(),
            7 to Button.placeholder(),
            17 to Button.placeholder(),
            18 to Button.placeholder(),
            26 to Button.placeholder(),
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
            9 to Button.placeholder(),
            27 to Button.placeholder(),
        )
    }

    fun getFilterDesc(): MutableList<String>
    {
        val desc = mutableListOf<String>()
        desc.add(" ")
        for (filter in GrantFilter.values())
        {
            if (grantFilter == filter)
            {
                desc.add(Chat.format("&7- &a" + grantFilter.displayName))
            } else
            {
                desc.add(Chat.format("&7- &7" + filter.displayName))
            }
        }
        desc.add(" ")
        desc.add(Chat.format("&7&oClick to move to next filter!"))
        desc.add(" ")

        return desc
    }

    override fun getButtonsPerPage(): Int
    {
        return 21
    }

    override fun getTitle(player: Player): String
    {
        return "Grants of " + Chat.format(gameProfile.getCurrentRank().color) + gameProfile.username
    }
}
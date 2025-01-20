package net.minebo.basalt.themes.types

import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.grant.types.Punishment
import net.minebo.basalt.models.grant.types.RankGrant
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.punishments.PunishmentType
import net.minebo.basalt.themes.Theme
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import org.bukkit.DyeColor
import org.bukkit.Material
import org.bukkit.entity.Player
import java.util.*

class mCore : Theme(
    "mcore",
    "&amCore",
    mutableListOf(
        " ",
        "&7mCore was a very popular",
        "&7server core on McMarket which",
        "&7through its very configurable",
        "&7style, was able to amass a good",
        "&7fortune while it was available",
        " ",
        "&eClick to select the &amCore &etheme.",
        " "
    ),
    Material.NAME_TAG, 0
)
{

    override fun getGrantsLore(player: Player, rankGrant: RankGrant): MutableList<String>
    {
        val desc = mutableListOf<String>()
        desc.add(Chat.format("&eRank: &f" + rankGrant.getGrantable().color + rankGrant.getGrantable().displayName))
        desc.add(Chat.format("&eDate: &f" + Date(rankGrant.expirable.addedAt)))
        desc.add(Chat.format("&eExecutor: &f" + BasaltAPI.getRankDisplay(rankGrant.executor)))
        if (rankGrant.expirable.duration != Long.MAX_VALUE)
        {
            desc.add(Chat.format("&eDuration: &f" + TimeUtil.formatDuration(rankGrant.expirable.duration)))
        }
        desc.add(Chat.format("&eReason: &c" + rankGrant.reason))
        desc.add(Chat.format("&7&m-----------------------"))
        if (rankGrant.expirable.isActive())
        {
            desc.add(Chat.format("&c&lClick to DELETE"))
            desc.add(Chat.format("&7&m-----------------------"))
        }

        return desc
    }

    override fun getGrantsDisplayName(player: Player, rankGrant: RankGrant): String
    {
        return Chat.format("&d" + rankGrant.getGrantable().displayName + " Grant")
    }

    override fun getGrantsData(player: Player, rankGrant: RankGrant): Short
    {
        return if (rankGrant.expirable.isActive()) DyeColor.LIME.woolData.toShort() else DyeColor.RED.woolData.toShort()
    }

    override fun getGrantLore(player: Player, gameProfile: GameProfile, rank: Rank): MutableList<String>
    {
        val desc = mutableListOf<String>()
        desc.add(Chat.format("&7&m--------------------------------"))
        desc.add(Chat.format("&9Grant &f" + BasaltAPI.getRankDisplay(gameProfile.uuid) + " &9the &f" + rank.color + rank.displayName + " &9rank"))
        desc.add(Chat.format("&7&m--------------------------------"))

        return desc
    }

    override fun getGrantDisplayName(player: Player, rank: Rank): String
    {
        return Chat.format("&dGrant " + rank.displayName)
    }

    override fun getGrantData(player: Player, rank: Rank): Short
    {
        if (rank.woolColor != null)
        {
            return BasaltAPI.getWoolColor(rank.woolColor!!).woolData.toShort()
        }

        return BasaltAPI.getWoolColor(rank.color).woolData.toShort()
    }

    override fun getHistoryLore(player: Player, punishment: Punishment): MutableList<String>
    {
        val desc = mutableListOf<String>()
        desc.add(Chat.format("&eType: &f" + punishment.getGrantable().color + punishment.getGrantable().niceName))
        desc.add(Chat.format("&eDate: &f" + Date(punishment.expirable.addedAt)))
        desc.add(Chat.format("&eExecutor: &f" + BasaltAPI.getRankDisplay(punishment.executor)))
        if (punishment.expirable.duration != Long.MAX_VALUE)
        {
            desc.add(Chat.format("&eDuration: &f" + TimeUtil.formatDuration(punishment.expirable.duration)))
        }
        desc.add(Chat.format("&eReason: &c" + punishment.reason))
        desc.add(Chat.format("&7&m-----------------------"))
        if (punishment.expirable.isActive())
        {
            desc.add(Chat.format("&c&lClick to DELETE"))
            desc.add(Chat.format("&7&m-----------------------"))
        }
        return desc
    }

    override fun getHistoryDisplayName(player: Player, punishment: Punishment): String
    {
        return Chat.format("&d" + punishment.getGrantable().niceName)
    }

    override fun getHistoryData(player: Player, punishment: Punishment): Short
    {
        return if (punishment.expirable.isActive()) DyeColor.LIME.woolData.toShort() else DyeColor.RED.woolData.toShort()
    }

    override fun getHistoryPlaceholderLore(
        player: Player,
        profile: GameProfile,
        punishment: PunishmentType
    ): MutableList<String>
    {
        return mutableListOf()
    }

    override fun getHistoryPlaceholderName(player: Player, profile: GameProfile, punishment: PunishmentType): String
    {
        return Chat.format("&d" + punishment.niceName + "'s")
    }

    override fun getHistoryPlaceholderData(player: Player, profile: GameProfile, punishment: PunishmentType): Short
    {
        return Chat.getDyeColor(punishment.color).woolData.toShort()
    }
}
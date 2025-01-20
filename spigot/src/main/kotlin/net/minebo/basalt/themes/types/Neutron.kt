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

class Neutron : Theme(
    "neutron",
    "&6Neutron",
    mutableListOf(
        " ",
        "&7Neutron was the daily-driver behind",
        "&7a very large HCF server called",
        "&4CavePvP&7. The style of Neutron is very",
        "&7simplistic and minimal allowing it to",
        "&7be read very easily.",
        " ",
        "&eClick to select the &6Neutron &etheme.",
        " "
    ),
    Material.NETHER_STAR, 0
)
{

    override fun getGrantsLore(player: Player, rankGrant: RankGrant): MutableList<String>
    {
        val desc = mutableListOf<String>()
        desc.add(Chat.format("&7&m-----------------------"))
        desc.add(Chat.format("&eBy: &f" + BasaltAPI.getRankDisplay(rankGrant.executor)))
        desc.add(Chat.format("&eRank: &f" + rankGrant.getGrantable().color + rankGrant.getGrantable().displayName))
        desc.add(Chat.format("&eReason: &c" + rankGrant.reason))
        desc.add(Chat.format("&7&m-----------------------"))
        if (!rankGrant.expirable.isActive())
        {
            desc.add(Chat.format("&ePardoned By: &c" + BasaltAPI.getRankDisplay(rankGrant.removedBy!!)))
            desc.add(Chat.format("&ePardoned At: &c" + Date(rankGrant.expirable.removedAt)))
            desc.add(Chat.format("&ePardoned Reason: &c" + rankGrant.removedReason!!))
            desc.add(Chat.format("&7&m-----------------------"))
        }

        return desc
    }

    override fun getGrantsDisplayName(player: Player, rankGrant: RankGrant): String
    {
        return Chat.format("&c" + Date(rankGrant.expirable.addedAt))
    }

    override fun getGrantsData(player: Player, rankGrant: RankGrant): Short
    {
        return if (rankGrant.expirable.isActive()) DyeColor.LIME.woolData.toShort() else DyeColor.RED.woolData.toShort()
    }

    override fun getGrantLore(player: Player, gameProfile: GameProfile, rank: Rank): MutableList<String>
    {
        val desc = mutableListOf<String>()
        desc.add(Chat.format("&7&m--------------------------------"))
        desc.add(
            Chat.format(
                "&9Click to grant &f" + rank.color + rank.displayName + " &9to " + BasaltAPI.getRankDisplay(
                    gameProfile.uuid
                )
            )
        )
        desc.add(Chat.format("&7&m--------------------------------"))

        return desc
    }

    override fun getGrantDisplayName(player: Player, rank: Rank): String
    {
        return Chat.format(rank.color + rank.displayName)
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
        desc.add(Chat.format("&7&m-----------------------"))
        desc.add(Chat.format("&eBy: &f" + BasaltAPI.getRankDisplay(punishment.executor)))
        desc.add(Chat.format("&eSilent: &cYes"))
        if (punishment.expirable.duration != Long.MAX_VALUE)
        {
            desc.add(Chat.format("&eDuration: &f" + TimeUtil.formatDuration(punishment.expirable.duration)))
        }
        desc.add(Chat.format("&eReason: &c" + punishment.reason))
        desc.add(Chat.format("&7&m-----------------------"))
        if (!punishment.expirable.isActive())
        {
            desc.add(Chat.format("&ePardoned By: &c" + BasaltAPI.getRankDisplay(punishment.removedBy!!)))
            desc.add(Chat.format("&ePardoned At: &c" + Date(punishment.expirable.removedAt)))
            desc.add(Chat.format("&ePardoned Reason: &c" + punishment.removedReason!!))
            desc.add(Chat.format("&7&m-----------------------"))
        }

        return desc
    }

    override fun getHistoryDisplayName(player: Player, punishment: Punishment): String
    {
        return Chat.format("&c" + Date(punishment.expirable.addedAt))
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
        return Chat.format(punishment.color + punishment.niceName + "'s")
    }

    override fun getHistoryPlaceholderData(player: Player, profile: GameProfile, punishment: PunishmentType): Short
    {
        return Chat.getDyeColor(punishment.color).woolData.toShort()
    }
}
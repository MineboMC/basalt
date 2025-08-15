package net.minebo.basalt.api

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.models.ranks.Rank
import net.minebo.basalt.profiles.permissions.AccessiblePermissionHandler
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.service.ranks.RankService
import org.bukkit.Bukkit
import org.bukkit.DyeColor
import org.bukkit.entity.Player
import java.util.*
import java.util.concurrent.CompletableFuture


object BasaltAPI
{

    var SERVER_NAME = BasaltSpigotPlugin.instance.config.getString("details.ip")
    var GENERIC_NAME = BasaltSpigotPlugin.instance.config.getString("details.genericName")
    var SC_FORMAT = BasaltSpigotPlugin.instance.config.getString("channels.staffChat")
    var AC_FORMAT = BasaltSpigotPlugin.instance.config.getString("channels.adminChat")

    var CONSOLE_COLOR = BasaltSpigotPlugin.instance.config.getString("consoleColor") ?: "&c&l"

    fun getRankDisplay(uuid: UUID): String
    {
        var finalString = "${CONSOLE_COLOR}Console"

        val profile = quickFindProfile(uuid).get()

        if (profile != null)
        {
            finalString = profile.getCurrentRank().color + profile.username
        }

        return finalString
    }


    fun getPlayerRankString(uuid: UUID): String
    {
        val current = RankService.FALLBACK_RANK

        val profile = syncFindProfile(uuid) ?: return (current.color + current.displayName)
        val rank = profile.getCurrentRank()

        return rank.color + rank.displayName
    }

    fun getRankWeight(uuid: UUID): Int
    {
        val profile = syncFindProfile(uuid) ?: return 1
        val currentRank = profile.getCurrentRank()

        return currentRank.weight
    }

    fun getRankWithPrefix(uuid: UUID): String
    {
        var finalString = "${CONSOLE_COLOR}Console"

        val profile = quickFindProfile(uuid).get()

        if (profile != null)
        {
            val rank = profile.getCurrentRank()
            finalString = rank.prefix + rank.color + profile.username
        }

        return finalString
    }

    fun quickFindProfile(uuid: UUID): CompletableFuture<GameProfile?>
    {
        return CompletableFuture.supplyAsync { ProfileGameService.byId(uuid) }
    }

    fun syncFindProfile(uuid: UUID): GameProfile?
    {
        return ProfileGameService.byId(uuid)
    }

    fun findRank(uuid: UUID): Rank
    {
        val profile = ProfileGameService.byId(uuid) ?: return RankService.FALLBACK_RANK

        return profile.getCurrentRank()
    }

    fun supplyColoredNames(): CompletableFuture<List<Player>>
    {
        return CompletableFuture.supplyAsync {
            Bukkit.getOnlinePlayers()
                .filter { !it.hasMetadata("vanish") }
                .sortedBy {
                    AccessiblePermissionHandler.findRankWeight(it)
                }.reversed()
        }
    }

    fun getWoolColor(color: Short): DyeColor {
        return when (color.toInt()) {
            0 -> DyeColor.WHITE
            1 -> DyeColor.ORANGE
            2 -> DyeColor.MAGENTA
            3 -> DyeColor.LIGHT_BLUE
            4 -> DyeColor.YELLOW
            5 -> DyeColor.LIME
            6 -> DyeColor.PINK
            7 -> DyeColor.GRAY
            8 -> DyeColor.LIGHT_GRAY // was "SILVER"
            9 -> DyeColor.CYAN
            10 -> DyeColor.PURPLE
            11 -> DyeColor.BLUE
            12 -> DyeColor.BROWN
            13 -> DyeColor.GREEN
            14 -> DyeColor.RED
            15 -> DyeColor.BLACK
            else -> DyeColor.WHITE
        }
    }

    fun getWoolColor(color: String): DyeColor
    {
        return when {
            color.contains("&1") || color.contains("&9") -> DyeColor.BLUE
            color.contains("&2") -> DyeColor.GREEN
            color.contains("&3") -> DyeColor.CYAN
            color.contains("&4") || color.contains("&c") -> DyeColor.RED
            color.contains("&5") -> DyeColor.PURPLE
            color.contains("&6") -> DyeColor.ORANGE
            color.contains("&7") -> DyeColor.LIGHT_GRAY
            color.contains("&8") -> DyeColor.GRAY
            color.contains("&a") -> DyeColor.LIME
            color.contains("&b") -> DyeColor.LIGHT_BLUE
            color.contains("&d") -> DyeColor.PINK
            color.contains("&e") -> DyeColor.YELLOW
            else -> DyeColor.WHITE
        }
    }

    fun getWoolColorStrict(color: String): DyeColor?
    {
        return when {
            color.contains("&1") || color.contains("&9") -> DyeColor.BLUE
            color.contains("&2") -> DyeColor.GREEN
            color.contains("&3") -> DyeColor.CYAN
            color.contains("&4") || color.contains("&c") -> DyeColor.RED
            color.contains("&5") -> DyeColor.PURPLE
            color.contains("&6") -> DyeColor.ORANGE
            color.contains("&7") -> DyeColor.LIGHT_GRAY
            color.contains("&8") -> DyeColor.GRAY
            color.contains("&a") -> DyeColor.LIME
            color.contains("&b") -> DyeColor.LIGHT_BLUE
            color.contains("&d") -> DyeColor.PINK
            color.contains("&e") -> DyeColor.YELLOW
            color.contains("&f") -> DyeColor.WHITE
            else -> null
        }
    }

}
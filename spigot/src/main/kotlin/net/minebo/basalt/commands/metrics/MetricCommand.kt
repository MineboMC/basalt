package net.minebo.basalt.commands.metrics

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandPermission
import com.google.common.base.Stopwatch
import com.google.gson.JsonObject
import net.minebo.basalt.Basalt
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.commands.metrics.menu.MetricsMenu
import net.minebo.basalt.metric.Metric
import net.minebo.basalt.metric.MetricService
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.util.Chat
import org.bukkit.entity.Player
import java.util.*
import java.util.concurrent.TimeUnit

class MetricCommand : BaseCommand()
{

    @CommandAlias("metrics|mylaggyserver")
    @CommandPermission("basalt.metrics")
    fun metrics(player: Player)
    {
        val startMs = System.currentTimeMillis()
        //sends a decoy mongo request to know its working. If this takes long asf its my fault
        //for not being able to code :shrug:
        Basalt.MongoConnectionPool.getCollection("gameprofile").find()

        MetricService.addMetric(
            "Heartbeat",
            Metric("Heartbeat", System.currentTimeMillis().minus(startMs), System.currentTimeMillis())
        )

        MetricsMenu(player).openMenu()
    }

    @CommandAlias("decoyprofiles")
    @CommandPermission("basalt.owner")
    fun decoy(player: Player, amt: Int)
    {
        for (int in 0 until amt)
        {
            val profile = GameProfile(
                UUID.randomUUID(),
                "Profile_${int}",
                "Profile_${int}".lowercase(Locale.getDefault()),
                JsonObject(),
                "",
                arrayListOf(),
                arrayListOf(),
                null,
                null,
                null,
                mutableListOf(),
                System.currentTimeMillis()
            )

            ProfileGameService.save(profile)
            player.sendMessage(Chat.format("&aMade a new profile"))
        }
    }

    /*    @CommandAlias("infixtest")
        @CommandPermission("basalt.owner")
        fun infix(player: Player, uname: String) : CompletableFuture<Void>
        {
           return ProfileGameService.test
               .filter(
                   GameProfile::lowercasedUsername,
                   uname
               ).thenAccept {
                   val first = it.firstOrNull()

                   if (first == null)
                   {
                       player.sendMessage(Chat.format("&cUser is not found"))
                   } else {
                       player.sendMessage(Chat.format("&aWas able to use an infix function to find &f${first.username} &ain mongo"))
                   }
               }
        }*/


    @CommandAlias("performancetest")
    @CommandPermission("basalt.metrics")
    fun performanceTest(player: Player)
    {
        player.sendMessage(Chat.format("&6&lPerformance Evaluation"))
        player.sendMessage(" ")
        val startProfile = Stopwatch.createStarted()
        //only doing this to test timings.
        val profile = ProfileGameService.handler.retrieve(player.uniqueId)
        player.sendMessage(Chat.format("&eProfile Fetch &7- &f" + startProfile.elapsed(TimeUnit.MILLISECONDS) + "ms"))
            .also {
                startProfile.stop()
            }

        val startGrantSort = Stopwatch.createStarted()
        val highestRank = profile!!.getCurrentRank()
        player.sendMessage(Chat.format("&eCurrent Grant Sort &7- &f" + startGrantSort.elapsed(TimeUnit.MILLISECONDS) + "ms"))
            .also {
                startGrantSort.stop()
            }
        player.sendMessage(" ")
    }
}
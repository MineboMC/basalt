package net.minebo.basalt.profiles.commands.player

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import co.aikar.commands.annotation.CommandCompletion
import co.aikar.commands.annotation.CommandPermission
import co.aikar.commands.annotation.Name
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.TimeUtil
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.scheduler.BukkitRunnable
import java.util.logging.Level

class LookupCommand : BaseCommand()
{

    @CommandAlias("lookup|find|whereis|seen")
    @CommandPermission("basalt.staff")
    @CommandCompletion("@gameprofile")
    fun lookup(player: Player, @Name("target") gameProfile: GameProfile)
    {
        val start = System.currentTimeMillis()
        player.sendMessage(Chat.format("&aLooking up player..."))
        object : BukkitRunnable()
        {
            override fun run()
            {
                val serverFromProfile = gameProfile.metadata.get("server")

                if (serverFromProfile != null && !serverFromProfile.asString.equals("None", ignoreCase = true))
                {
                    player.sendMessage(Chat.format(BasaltAPI.getRankDisplay(gameProfile.uuid) + " &ewas found on &f${serverFromProfile.asString}"))
                } else
                {
                    player.sendMessage(
                        Chat.format(
                            BasaltAPI.getRankDisplay(gameProfile.uuid) + " &ewas last online &f${
                                TimeUtil.formatDuration(
                                    System.currentTimeMillis().minus(gameProfile.lastSeenAt)
                                )
                            } &eago"
                        )
                    )
                }
            }
        }.runTaskLater(BasaltSpigotPlugin.instance, 0L)

        Bukkit.getLogger().log(Level.INFO, "Player lookup took " + System.currentTimeMillis().minus(start) + "ms")
    }

}
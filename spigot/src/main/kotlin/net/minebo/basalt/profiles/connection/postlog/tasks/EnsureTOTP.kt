package net.minebo.basalt.profiles.connection.postlog.tasks

import net.minebo.basalt.profiles.BukkitProfileAdaptation
import net.minebo.basalt.profiles.connection.postlog.BukkitPostLoginTask
import net.minebo.basalt.profiles.getProfile
import net.minebo.basalt.service.profiles.ProfileGameService
import org.bukkit.entity.Player
import java.util.concurrent.CompletableFuture

/**
 * Class created on 9/14/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object EnsureTOTP : BukkitPostLoginTask
{
    override fun run(player: Player)
    {
        CompletableFuture.runAsync {
            val profile = player.getProfile() ?: return@runAsync

            if (BukkitProfileAdaptation.playerNeedsAuthenticating(profile, player))
            {
                profile.metadata.addProperty("needsAuthetication", "true")
                ProfileGameService.saveSync(profile)
            }
        }
    }
}
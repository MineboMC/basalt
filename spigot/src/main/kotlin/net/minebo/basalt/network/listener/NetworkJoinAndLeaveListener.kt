package net.minebo.basalt.network.listener

import net.minebo.basalt.Basalt
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.service.session.SessionService
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.AsyncPlayerPreLoginEvent
import org.bukkit.event.player.PlayerQuitEvent

class NetworkJoinAndLeaveListener : Listener
{

    @EventHandler
    fun disconnect(e: PlayerQuitEvent)
    {
        BasaltAPI.quickFindProfile(e.player.uniqueId).thenApply {
            if (it != null)
            {
                it.metadata.addProperty("server", "None")

                it.lastSeenAt = System.currentTimeMillis()

                if (it.currentSession != null)
                {
                    it.currentSession!!.leftAt = System.currentTimeMillis()
                    SessionService.save(it.currentSession!!)

                    it.currentSession = null
                }


                ProfileGameService.save(it)
            }
        }
    }

    @EventHandler
    fun asyncJoin(e: AsyncPlayerPreLoginEvent)
    {
        val profile = BasaltAPI.syncFindProfile(e.uniqueId) ?: return

        profile.metadata.addProperty("server", Basalt.globalServer.id)
        profile.lastSeenAt = System.currentTimeMillis()

        ProfileGameService.save(profile)
    }
}
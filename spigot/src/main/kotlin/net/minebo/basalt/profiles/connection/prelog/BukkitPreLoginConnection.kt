package net.minebo.basalt.profiles.connection.prelog

import net.minebo.basalt.models.connection.ConnectionMethod
import net.minebo.basalt.profiles.connection.prelog.tasks.CalculateGrantables
import net.minebo.basalt.profiles.connection.prelog.tasks.HandlePunishments
import net.minebo.basalt.profiles.connection.prelog.tasks.LoadProfile
import org.bukkit.event.player.AsyncPlayerPreLoginEvent

/**
 * Class created on 5/27/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object BukkitPreLoginConnection : ConnectionMethod<AsyncPlayerPreLoginEvent>()
{

    fun getAllTasks(): List<BukkitPreLoginTask>
    {
        return listOf(
            LoadProfile,
            HandlePunishments,
            CalculateGrantables
        )
    }
}
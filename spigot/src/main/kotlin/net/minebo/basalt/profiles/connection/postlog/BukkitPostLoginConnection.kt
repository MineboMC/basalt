package net.minebo.basalt.profiles.connection.postlog

import net.minebo.basalt.disguise.DisguiseLoginTask
import net.minebo.basalt.disguise.DisguiseModule
import net.minebo.basalt.models.connection.ConnectionMethod
import net.minebo.basalt.profiles.connection.postlog.tasks.*
import org.bukkit.entity.Player

/**
 * Class created on 5/27/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object BukkitPostLoginConnection : ConnectionMethod<Player>()
{

    fun getAllTasks(): List<BukkitPostLoginTask>
    {
        return mutableListOf(
            LoadPermissions,
            SendStaffWelcome,
            CheckBanEvasion,
            SendLoadedProfileMessage,
            EnsureTOTP,
        ).also {
            if (DisguiseModule.getModularConfigOption())
            {
                it.add(DisguiseLoginTask)
            }
        }
    }
}
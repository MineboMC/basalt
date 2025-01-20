package net.minebo.basalt.profiles.connection.postlog

import org.bukkit.entity.Player

/**
 * Class created on 7/20/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
interface BukkitPostLoginTask
{

    fun run(player: Player)
}
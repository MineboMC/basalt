package net.minebo.basalt.profiles.connection.prelog

import org.bukkit.event.player.AsyncPlayerPreLoginEvent

/**
 * Class created on 7/20/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
interface BukkitPreLoginTask
{

    fun run(event: AsyncPlayerPreLoginEvent)

    fun shouldBeLazy(): Boolean
}
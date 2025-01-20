package net.minebo.basalt.lockdown

import net.minebo.basalt.BasaltBungeePlugin
import net.md_5.bungee.api.connection.ProxiedPlayer

object LockdownManager {

    fun serverIsOnLockdown() : Boolean {
        return BasaltBungeePlugin.instance.configuration.getBoolean("lockdown")
    }

    fun hasClearance(player: ProxiedPlayer) : Boolean {
        return player.hasPermission("basalt.clearance")
    }
}
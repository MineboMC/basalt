package net.minebo.basalt.lockdown

import com.velocitypowered.api.proxy.Player
import net.minebo.basalt.BasaltVelocityPlugin


object LockdownManager {
    fun serverIsOnLockdown() : Boolean {
        return BasaltVelocityPlugin.instance.config.getBoolean("lockdown")
    }

    fun hasClearance(player: Player) : Boolean {
        return player.hasPermission("basalt.clearance")
    }
}
package net.minebo.basalt.lockdown

import com.velocitypowered.api.proxy.Player
import net.minebo.basalt.BasaltVelocity


object LockdownManager {
    fun serverIsOnLockdown() : Boolean {
        return BasaltVelocity.instance.config.getBoolean("lockdown")
    }

    fun hasClearance(player: Player) : Boolean {
        return player.hasPermission("basalt.clearance")
    }
}
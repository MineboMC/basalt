package net.minebo.basalt.packets

import net.minebo.basalt.BasaltVelocityPlugin
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.profiles.ProfileGameService

class StaffMessagePacket(val message: String) : RedisPacket("staff-message-bungee") {

    override fun action() {
        BasaltVelocityPlugin.instance.server.allPlayers.filter {
            ProfileGameService.byId(it.uniqueId)?.getHighestGlobalRank()!!.staff
        }.forEach {
            it.sendMessage(BasaltVelocityPlugin.color(message))
        }
    }
}
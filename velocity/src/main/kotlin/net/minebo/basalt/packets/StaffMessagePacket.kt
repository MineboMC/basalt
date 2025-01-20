package net.minebo.basalt.packets

import net.minebo.basalt.BasaltVelocity
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.profiles.ProfileGameService

class StaffMessagePacket(val message: String) : RedisPacket("staff-message-bungee") {

    override fun action() {
        BasaltVelocity.instance.server.allPlayers.filter {
            ProfileGameService.byId(it.uniqueId)?.getHighestGlobalRank()!!.staff
        }.forEach {
            it.sendMessage(BasaltVelocity.color(message))
        }
    }
}
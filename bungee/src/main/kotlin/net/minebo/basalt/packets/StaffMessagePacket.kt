package net.minebo.basalt.packets

import net.minebo.basalt.BasaltBungeePlugin
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.profiles.ProfileGameService
import net.md_5.bungee.api.ChatColor
import net.md_5.bungee.api.chat.TextComponent

class StaffMessagePacket(val message: String) : RedisPacket("staff-message-bungee") {

    override fun action() {
        BasaltBungeePlugin.instance.proxy.players.filter {
            ProfileGameService.byId(it.uniqueId)?.getHighestGlobalRank()!!.staff
        }.forEach {
            it.sendMessage(TextComponent(ChatColor.translateAlternateColorCodes('&', message)))
        }
    }
}
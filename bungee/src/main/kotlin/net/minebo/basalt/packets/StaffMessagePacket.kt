package net.minebo.basalt.packets

import net.minebo.basalt.BasaltBungee
import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.service.profiles.ProfileGameService
import net.md_5.bungee.api.ChatColor
import net.md_5.bungee.api.chat.BaseComponent
import net.md_5.bungee.api.chat.TextComponent
import net.md_5.bungee.chat.BaseComponentSerializer

class StaffMessagePacket(val message: String) : RedisPacket("staff-message-bungee") {

    override fun action() {
        BasaltBungee.instance.proxy.players.filter {
            ProfileGameService.byId(it.uniqueId)?.getHighestGlobalRank()!!.staff
        }.forEach {
            it.sendMessage(TextComponent(ChatColor.translateAlternateColorCodes('&', message)))
        }
    }
}
package net.minebo.basalt.staff.requests.packets


import net.minebo.basalt.redis.RedisPacket
import net.minebo.basalt.staff.requests.handlers.RequestHandler
import net.minebo.basalt.staff.requests.report.ReportModel
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit

class ReportPacket(val message: String, val reportModel: ReportModel) : RedisPacket("staff-message-report")
{

    override fun action()
    {
        Bukkit.getOnlinePlayers().filter {
            it.hasPermission("basalt.staff") && RequestHandler.hasReportsEnabled(it)
        }.forEach { it.sendMessage(Chat.format(message)) }

        RequestHandler.activeReports[reportModel.id] = reportModel
    }
}
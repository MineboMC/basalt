package net.minebo.basalt.profiles

import co.aikar.commands.BaseCommand
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.module.PluginModule
import net.minebo.basalt.profiles.commands.auth.AuthCommands
import net.minebo.basalt.profiles.commands.player.*
import net.minebo.basalt.profiles.commands.sibling.SiblingCommands
import net.minebo.basalt.profiles.commands.website.RegisterCommand
import net.minebo.basalt.staff.commands.*
import net.minebo.basalt.staff.requests.commands.ReportCommand
import net.minebo.basalt.staff.requests.commands.RequestCommand
import net.minebo.basalt.staff.settings.toggle.SettingsCommand
import net.minebo.basalt.util.Chat

/**
 * Class created on 7/21/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object ProfileModule : PluginModule
{

    override fun onLoad()
    {
        val start = System.currentTimeMillis()
        BukkitProfileAdaptation.loadAllEvents()

        Chat.sendConsoleMessage(
            "&b[Profiles] &fAll profile events loaded in &b" + System.currentTimeMillis().minus(start) + "ms"
        )
    }

    override fun getCommands(): MutableList<BaseCommand>
    {
        val list = mutableListOf<BaseCommand>()

        if (BasaltSpigotPlugin.instance.config.getBoolean("freeRank.enabled"))
        {
            list.add(FreerankCommand())
        }

        list.add(ListCommand())
        list.add(LookupCommand())
        list.add(PlayerAdminCommand())
        list.add(SudoCommand())
        list.add(WipeGrantsCommand)
        list.add(WipeProfileCommand())
        list.add(SiblingCommands())

        list.add(JumpToPlayerCommand())
        list.add(OnlineStaffCommand())
        list.add(StaffchatCommand())
        list.add(TimelineCommand())
        list.add(StaffLeaderboardCommand)

        if (BasaltSpigotPlugin.instance.config.getBoolean("modules.websiteCommands"))
        {
            list.add(RegisterCommand)
        }

        list.add(ReportCommand())
        list.add(RequestCommand())

        if (BasaltSpigotPlugin.instance.config.getBoolean("modules.2fa"))
        {
            list.add(AuthCommands())
        }

        list.add(SettingsCommand())

        return list
    }

    override fun getModularConfigOption(): Boolean
    {
        return true
    }
}
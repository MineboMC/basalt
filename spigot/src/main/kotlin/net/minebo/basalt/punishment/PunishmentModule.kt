package net.minebo.basalt.punishment

import co.aikar.commands.BaseCommand
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.module.PluginModule
import net.minebo.basalt.punishment.commands.create.*
import net.minebo.basalt.punishment.commands.menu.ExecutedPunishmentHistoryCommand
import net.minebo.basalt.punishment.commands.menu.HistoryCommand
import net.minebo.basalt.punishment.commands.menu.PunishmentLookupCommands
import net.minebo.basalt.punishment.commands.redo.RebanCommand
import net.minebo.basalt.punishment.commands.remove.*
import net.minebo.basalt.punishment.limitation.PunishmentLimitationUnderstander
import net.minebo.basalt.util.Chat

/**
 * Class created on 7/21/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object PunishmentModule : PluginModule
{
    override fun onLoad()
    {
        val punishmentStart = System.currentTimeMillis()

        PunishmentLimitationUnderstander.load()

        Chat.sendConsoleMessage(
            "&6[Punishments] &fAll profile events loaded in &6" + System.currentTimeMillis()
                .minus(punishmentStart) + "ms"
        )
    }

    override fun getCommands(): MutableList<BaseCommand>
    {
        val list = mutableListOf<BaseCommand>()

        list.add(MuteCommand())
        list.add(BanCommand())
        list.add(BlacklistCommand())
        list.add(TempBanCommand())
        list.add(TempMuteCommand())
        list.add(KickCommand())
        list.add(WarnCommand())
        list.add(GhostMuteCommand())
        list.add(TempGhostMuteCommand())

        list.add(HistoryCommand())

        list.add(UnghostmuteCommand())
        list.add(UnbanCommand())
        list.add(UnmuteCommand())
        list.add(UnblacklistCommand())
        list.add(PunishmentLookupCommands())
        list.add(RebanCommand())

        list.add(WipePunishmentsCommand)
        list.add(ExecutedPunishmentHistoryCommand())

        return list
    }

    override fun getModularConfigOption(): Boolean
    {
        return BasaltSpigotPlugin.instance.config.getBoolean("modules.punishments")
    }
}
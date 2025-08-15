package net.minebo.basalt.profiles.connection.postlog.tasks

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.profiles.connection.postlog.BukkitPostLoginTask
import net.minebo.basalt.profiles.getProfile
import net.minebo.basalt.staff.mode.StaffSuiteManager
import net.minebo.basalt.staff.requests.handlers.RequestHandler
import net.minebo.basalt.util.Chat
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import java.text.SimpleDateFormat
import java.util.*

/**
 * Class created on 7/20/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
object SendStaffWelcome : BukkitPostLoginTask
{

    override fun run(player: Player)
    {
        Bukkit.getScheduler().runTaskLater(BasaltSpigotPlugin.instance, Runnable {
            val config = BasaltSpigotPlugin.instance.config
            val dateFormat = SimpleDateFormat("MM-dd-yyyy", Locale.getDefault())

            if (player.hasPermission("basalt.staff"))
            {

                if (config.getBoolean("staffmode.sendWelcomeMessage"))
                {
                    player.sendMessage(" ")
                    player.sendMessage(Chat.format("&eWelcome back, " + BasaltAPI.getRankDisplay(player.uniqueId)))
                    player.sendMessage(Chat.format("&eIt is currently &d" + dateFormat.format(Date(System.currentTimeMillis()))))
                    player.sendMessage(Chat.format("&eEdit your mod mode with &a/editmodmode"))
                    player.sendMessage(" ")
                }

                if (BasaltSpigotPlugin.instance.config.getBoolean("staffmode.autoEquipOnJoin")
                    &&
                    StaffSuiteManager.isModModeOnJoin(player)
                    &&
                    BasaltSpigotPlugin.instance.config.getBoolean("modules.staffmode")
                )
                {
                    player.sendMessage(Chat.format("&7&oYou have been put into ModMode automatically"))
                    StaffSuiteManager.setStaffMode(player)
                }

                val profile = player.getProfile()

                if (profile != null)
                {
                    if (config.getBoolean("staffmode.sendSettingSummaryOnJoin"))
                    {
                        player.sendMessage(" ")
                        player.sendMessage(Chat.format("&6&lYour Settings"))
                        player.sendMessage(Chat.format("&7➥ &eReports: &f${if (RequestHandler.hasReportsEnabled(player)) "&aOn" else "&cOff"}"))
                        player.sendMessage(Chat.format("&7➥ &eStaff Chat: &f${if (profile.hasMetadata("allMSGSC")) "&aTogged On" else "&cCommand Only"}"))
                        player.sendMessage(
                            Chat.format(
                                "&7➥ &eAuto ModMode: &f${
                                    if (StaffSuiteManager.isModModeOnJoin(
                                            player
                                        )
                                    ) "&aOn" else "&cOff"
                                }"
                            )
                        )
                        player.sendMessage(Chat.format("&7➥ &eAuth Setup: &f${if (profile.getAuthStatus().hasSetup2fa) "&aYes :)" else "&cNo"}"))
                        player.sendMessage(Chat.format("&eUse the &f/staffsettings &eto edit these properties"))
                        player.sendMessage(" ")
                    }
                }
            }
        }, 10L)
    }
}
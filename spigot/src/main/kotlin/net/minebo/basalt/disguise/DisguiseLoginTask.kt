package net.minebo.basalt.disguise

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.profiles.connection.postlog.BukkitPostLoginTask
import net.minebo.basalt.profiles.getProfile
import net.minebo.basalt.util.Chat
import net.pinger.disguise.DisguiseAPI
import net.pinger.disguise.skin.Skin
import org.bukkit.Bukkit
import org.bukkit.Location
import org.bukkit.entity.Player

object DisguiseLoginTask :  BukkitPostLoginTask
{
    override fun run(player: Player)
    {
        Bukkit.getScheduler().runTaskLater(BasaltSpigotPlugin.instance, Runnable {
            val profile = player.getProfile()
                ?: return@Runnable
            val attribute = profile.skinDisguiseAttribute

            if (attribute != null)
            {
                player.setDisplayName(attribute.customName)
                player.setPlayerListName(player.displayName)
                player.customName = player.displayName

                DisguiseAPI.getDefaultProvider().updatePlayer(player, Skin(attribute.texture, attribute.signature), attribute.customName)
                val location = player.location

                // refresh player skin
                player.teleport(Location(Bukkit.getWorld("SkinUpdateWorld"), 0.0, 100.0, 0.0))
                player.teleport(location)

                player.sendMessage(Chat.format("&aSuccess! You now look like &f${attribute.customName} &awith the skin &f${attribute.skinName}&a."))
                player.sendMessage(Chat.format("&8This disguise has been transferred from an alternate server..."))
            }
        }, 20L)
    }
}
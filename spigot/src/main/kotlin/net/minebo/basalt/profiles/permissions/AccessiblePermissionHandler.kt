package net.minebo.basalt.profiles.permissions

import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.models.profile.GameProfile
import net.minebo.basalt.profiles.getProfile
import net.minebo.basalt.util.Chat.format
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import org.bukkit.metadata.FixedMetadataValue
import org.bukkit.permissions.PermissionAttachment
import java.lang.reflect.Field
import java.util.*


object AccessiblePermissionHandler
{

    private val permissionAttachmentMap: MutableMap<UUID, PermissionAttachment> = HashMap()

    lateinit var permissionField: Field

    var pendingLoadPermissions = hashMapOf<UUID, Map<String?, Boolean?>>()

    fun load()
    {
        try
        {
            permissionField = PermissionAttachment::class.java.getDeclaredField("permissions")
            permissionField.isAccessible = true
        } catch (e: NoSuchFieldException)
        {
            e.printStackTrace()
        }

    }

    fun setupPlayer(uuid: UUID, perms: Map<String?, Boolean?>)
    {
        pendingLoadPermissions[uuid] = perms
    }

    fun remove(player: Player)
    {
        permissionAttachmentMap.remove(player.uniqueId)
    }

    fun findRankWeight(player: Player): Int
    {
        return if (player.hasMetadata("BasaltRankWeight"))
        {
            player.getMetadata("BasaltRankWeight").first().asInt()
        } else 0
    }

    fun update(player: Player, perms: Map<String, Boolean>)
    {
        permissionAttachmentMap.putIfAbsent(player.uniqueId, player.addAttachment(BasaltSpigotPlugin.instance))
        try
        {
            val attachment = permissionAttachmentMap[player.uniqueId]
            permissionField.set(attachment, perms)
            player.recalculatePermissions()
        } catch (e: IllegalAccessException)
        {
            e.printStackTrace()
        }

        val profile: GameProfile = player.getProfile() ?: return

        Bukkit.getScheduler().runTask(BasaltSpigotPlugin.instance) {
            //apply display name
            player.displayName = format(profile.getCurrentRank().color + player.name)

            //set metadata values
            player.removeMetadata("BasaltRankWeight", BasaltSpigotPlugin.instance)
            player.setMetadata(
                "BasaltRankWeight",
                FixedMetadataValue(BasaltSpigotPlugin.instance, (profile.getCurrentRank().weight))
            )
        }
    }
}

package net.minebo.basalt.velocity.listeners

import com.google.common.collect.Sets
import com.velocitypowered.api.event.ResultedEvent
import com.velocitypowered.api.event.Subscribe
import com.velocitypowered.api.event.connection.LoginEvent
import com.velocitypowered.api.event.permission.PermissionsSetupEvent
import com.velocitypowered.api.permission.PermissionFunction
import com.velocitypowered.api.permission.PermissionProvider
import com.velocitypowered.api.permission.Tristate
import com.velocitypowered.api.proxy.Player
import net.minebo.basalt.velocity.api.VelocityAPI
import net.minebo.basalt.velocity.util.ColorUtil
import net.minebo.basalt.velocity.whitelist.WhitelistManager
import java.util.UUID
import java.util.concurrent.ConcurrentHashMap

class PlayerListener {

    var permissions = ConcurrentHashMap<UUID, MutableSet<String>>()

    @Subscribe
    fun onLogin(event: LoginEvent) {
        if (!WhitelistManager.enabled) return

        val uuid = event.player.uniqueId

        if (!WhitelistManager.isWhitelisted(uuid)) {
            val reason = ColorUtil.translate(WhitelistManager.kickMessage)
            event.result = ResultedEvent.ComponentResult.denied(reason)
        }
    }

    @Subscribe
    fun onPermissionsSetup(event: PermissionsSetupEvent) {
        if(event.subject is Player) {
            val player = event.subject as Player
            event.provider = createPermissionProvider(player.uniqueId)
            setupPerms(player)
        }
    }

    fun setupPerms(player: Player) {
        val profile = VelocityAPI.quickFindProfile(player.uniqueId)

        profile.get()?.getPermissions()?.forEach { perm -> permissions.computeIfAbsent(player.uniqueId) { Sets.newHashSet() } .add(if(perm.value) perm.key else "") }
    }

    fun createPermissionProvider(uuid: UUID): PermissionProvider {
        return PermissionProvider { _ ->
            PermissionFunction { permission ->
                val perms = permissions[uuid] ?: emptySet()
                if (perms.contains(permission)) {
                    Tristate.TRUE
                } else {
                    Tristate.UNDEFINED
                }
            }
        }
    }
}
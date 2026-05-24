package net.minebo.basalt.velocity.whitelist

import net.minebo.basalt.velocity.BasaltVelocityPlugin
import java.util.UUID

object WhitelistManager {

    private fun plugin() = BasaltVelocityPlugin.instance

    var enabled: Boolean
        get() = plugin().configuration.whitelist.enabled
        set(value) {
            plugin().configuration = plugin().configuration.copy(
                whitelist = plugin().configuration.whitelist.copy(enabled = value)
            )
            plugin().saveConfig()
        }

    var kickMessage: List<String>
        get() = plugin().configuration.whitelist.`kick-message`.ifEmpty { listOf("&cYou are not whitelisted.") }
        set(value) {
            plugin().configuration = plugin().configuration.copy(
                whitelist = plugin().configuration.whitelist.copy(`kick-message` = value)
            )
            plugin().saveConfig()
        }

    private fun loadUuids(): MutableSet<UUID> {
        val raw = plugin().configuration.whitelist.uuids
        return raw.mapNotNull { runCatching { UUID.fromString(it) }.getOrNull() }.toMutableSet()
    }

    private fun saveUuids(uuids: Set<UUID>) {
        plugin().configuration = plugin().configuration.copy(
            whitelist = plugin().configuration.whitelist.copy(uuids = uuids.map(UUID::toString))
        )
        plugin().saveConfig()
    }

    fun getAll(): Set<UUID> = loadUuids()

    fun isWhitelisted(uuid: UUID): Boolean = loadUuids().contains(uuid)

    fun add(uuid: UUID): Boolean {
        val set = loadUuids()
        val added = set.add(uuid)
        if (added) saveUuids(set)
        return added
    }

    fun remove(uuid: UUID): Boolean {
        val set = loadUuids()
        val removed = set.remove(uuid)
        if (removed) saveUuids(set)
        return removed
    }
}
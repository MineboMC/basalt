package net.minebo.basalt.bungee.whitelist

import net.minebo.basalt.bungee.BasaltBungeePlugin
import java.util.UUID

object WhitelistManager {

    private const val KEY_ENABLED = "whitelist.enabled"
    private const val KEY_MESSAGE = "whitelist.kick-message"
    private const val KEY_UUIDS = "whitelist.uuids"

    var enabled: Boolean
        get() = BasaltBungeePlugin.instance.configuration.getBoolean(KEY_ENABLED, false)
        set(value) {
            BasaltBungeePlugin.instance.configuration.set(KEY_ENABLED, value)
            BasaltBungeePlugin.instance.saveConfig()
        }

    var kickMessage: List<String>
        get() = BasaltBungeePlugin.instance.configuration.getStringList(KEY_MESSAGE).ifEmpty { listOf("&cYou are not whitelisted.") }
        set(value) {
            BasaltBungeePlugin.instance.configuration.set(KEY_MESSAGE, value)
            BasaltBungeePlugin.instance.saveConfig()
        }

    private fun loadUuids(): MutableSet<UUID> {
        val raw = BasaltBungeePlugin.instance.configuration.getStringList(KEY_UUIDS)
        return raw.mapNotNull {
            runCatching { UUID.fromString(it) }.getOrNull()
        }.toMutableSet()
    }

    private fun saveUuids(uuids: Set<UUID>) {
        BasaltBungeePlugin.instance.configuration.set(KEY_UUIDS, uuids.map(UUID::toString))
        BasaltBungeePlugin.instance.saveConfig()
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
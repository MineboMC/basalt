package net.minebo.basalt.velocity.commands

import com.google.gson.JsonParser
import com.velocitypowered.api.command.SimpleCommand
import com.velocitypowered.api.proxy.ProxyServer
import net.minebo.basalt.velocity.BasaltVelocityPlugin
import net.minebo.basalt.velocity.api.VelocityAPI
import net.minebo.basalt.velocity.util.ColorUtil
import net.minebo.basalt.velocity.whitelist.WhitelistManager
import java.net.HttpURLConnection
import java.net.URL
import java.util.UUID

class WhitelistCommand : SimpleCommand {

    override fun execute(invocation: SimpleCommand.Invocation) {
        val source = invocation.source()
        val args = invocation.arguments()

        if (!source.hasPermission("basalt.admin")) {
            source.sendMessage(ColorUtil.translate("&cNo permission."))
            return
        }

        if (args.isEmpty()) {
            sendUsage(source)
            return
        }

        when (args[0].lowercase()) {
            "status" -> {
                source.sendMessage(
                    ColorUtil.translate(
                        "&eWhitelist is currently " + (if (WhitelistManager.enabled) "&aenabled" else "&cdisabled") + "&e."
                    )
                )
            }
            "on", "enable" -> {
                if (WhitelistManager.enabled) {
                    source.sendMessage(ColorUtil.translate("&cWhitelist is already enabled."))
                } else {
                    WhitelistManager.enabled = true
                    source.sendMessage(ColorUtil.translate("&eWhitelist enabled."))
                }
            }
            "off", "disable" -> {
                if (!WhitelistManager.enabled) {
                    source.sendMessage(ColorUtil.translate("&cWhitelist is already disabled."))
                } else {
                    WhitelistManager.enabled = false
                    source.sendMessage(ColorUtil.translate("&eWhitelist disabled."))
                }
            }
            "list" -> {
                val all = WhitelistManager.getAll()
                if (all.isEmpty()) {
                    source.sendMessage(ColorUtil.translate("&cNo players are whitelisted."))
                } else {
                    source.sendMessage(ColorUtil.translate("&eWhitelisted players (${all.size}):"))
                    all.forEach { uuid ->
                        val profile = VelocityAPI.quickFindProfile(uuid)
                        val name = profile.get()?.username ?: uuid.toString()
                        source.sendMessage(ColorUtil.translate("&7 - &f$name"))
                    }
                }
            }
            "add" -> {
                if (args.size < 2) {
                    source.sendMessage(ColorUtil.translate("&cUsage: /whitelist add <player|uuid>"))
                    return
                }
                val target = args[1]
                val uuid = resolveUuid(target)
                if (uuid == null) {
                    source.sendMessage(ColorUtil.translate("&cPlayer must be online or provide a valid UUID."))
                    return
                }
                if (!WhitelistManager.add(uuid)) {
                    source.sendMessage(ColorUtil.translate("&c$target is already whitelisted."))
                } else {
                    source.sendMessage(ColorUtil.translate("&eAdded &f$target&e to the whitelist."))
                }
            }
            "remove", "rem" -> {
                if (args.size < 2) {
                    source.sendMessage(ColorUtil.translate("&cUsage: /whitelist remove <player|uuid>"))
                    return
                }
                val target = args[1]
                val uuid = resolveUuid(target)
                if (uuid == null) {
                    source.sendMessage(ColorUtil.translate("&cPlayer must be online or provide a valid UUID."))
                    return
                }
                if (!WhitelistManager.remove(uuid)) {
                    source.sendMessage(ColorUtil.translate("&c$target is not whitelisted."))
                } else {
                    source.sendMessage(ColorUtil.translate("&eRemoved &f$target&e from the whitelist."))
                }
            }
            else -> sendUsage(source)
        }
    }

    private fun sendUsage(source: com.velocitypowered.api.command.CommandSource) {
        source.sendMessage(ColorUtil.translate("&eWhitelist commands:"))
        source.sendMessage(ColorUtil.translate("&7/whitelist status &8- &fShow whitelist status"))
        source.sendMessage(ColorUtil.translate("&7/whitelist on|off &8- &fEnable or disable the whitelist"))
        source.sendMessage(ColorUtil.translate("&7/whitelist list &8- &fList whitelisted players"))
        source.sendMessage(ColorUtil.translate("&7/whitelist add <player|uuid> &8- &fAdd to whitelist"))
        source.sendMessage(ColorUtil.translate("&7/whitelist remove <player|uuid> &8- &fRemove from whitelist"))
    }

    private fun resolveUuid(input: String): UUID? {
        val proxy: ProxyServer = BasaltVelocityPlugin.instance.proxy

        val online = proxy.getPlayer(input).orElse(null)
        if (online != null) return online.uniqueId

        runCatching { UUID.fromString(input) }.getOrNull()?.let { return it }

        return try {
            val url = URL("https://api.mojang.com/users/profiles/minecraft/$input")
            val connection = url.openConnection() as HttpURLConnection
            connection.requestMethod = "GET"
            connection.connectTimeout = 3000
            connection.readTimeout = 3000

            if (connection.responseCode == 200) {
                val response = connection.inputStream.bufferedReader().use { it.readText() }
                val json = JsonParser.parseString(response).asJsonObject
                val rawId = json.get("id").asString
                UUID.fromString(
                    rawId.replaceFirst(
                        "(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})".toRegex(),
                        "$1-$2-$3-$4-$5"
                    )
                )
            } else null
        } catch (_: Exception) {
            null
        }
    }
}
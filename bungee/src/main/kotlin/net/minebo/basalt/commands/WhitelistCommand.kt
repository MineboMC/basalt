package net.minebo.basalt.commands

import com.google.gson.JsonParser
import net.minebo.basalt.whitelist.WhitelistManager
import net.md_5.bungee.api.CommandSender
import net.md_5.bungee.api.ChatColor
import net.md_5.bungee.api.ProxyServer
import net.md_5.bungee.api.plugin.Command
import net.minebo.basalt.api.BasaltAPI
import java.net.HttpURLConnection
import java.net.URL
import java.util.UUID

class WhitelistCommand : Command("whitelist", "", "wl") {

    override fun execute(sender: CommandSender, args: Array<out String>) {
        if (!sender.hasPermission("basalt.admin")) {
            sender.sendMessage("${ChatColor.RED}No permission.")
            return
        }

        if (args.isEmpty()) {
            sendUsage(sender)
            return
        }

        when (args[0].lowercase()) {
            "status" -> {
                sender.sendMessage("${ChatColor.YELLOW}Whitelist is currently ${if (WhitelistManager.enabled) ChatColor.GREEN.toString() + "enabled" else ChatColor.RED.toString() + "disabled"}${ChatColor.YELLOW}.")
            }
            "on", "enable" -> {
                if (WhitelistManager.enabled) {
                    sender.sendMessage("${ChatColor.RED}Whitelist is already enabled.")
                } else {
                    WhitelistManager.enabled = true
                    sender.sendMessage("${ChatColor.YELLOW}Whitelist enabled.")
                }
            }
            "off", "disable" -> {
                if (!WhitelistManager.enabled) {
                    sender.sendMessage("${ChatColor.RED}Whitelist is already disabled.")
                } else {
                    WhitelistManager.enabled = false
                    sender.sendMessage("${ChatColor.YELLOW}Whitelist disabled.")
                }
            }
            "list" -> {
                val all = WhitelistManager.getAll()
                if (all.isEmpty()) {
                    sender.sendMessage("${ChatColor.RED}No players are whitelisted.")
                } else {
                    sender.sendMessage("${ChatColor.YELLOW}Whitelisted players (${all.size}):")
                    all.forEach { uuid ->
                        val profile = BasaltAPI.quickFindProfile(uuid)
                        val name = profile.get()?.username ?: uuid.toString()
                        sender.sendMessage("${ChatColor.GRAY} - ${ChatColor.WHITE}$name")
                    }
                }
            }
            "add" -> {
                if (args.size < 2) {
                    sender.sendMessage("${ChatColor.RED}Usage: /whitelist add <player|uuid>")
                    return
                }
                val target = args[1]
                val uuid = resolveUuid(target)
                if (uuid == null) {
                    sender.sendMessage("${ChatColor.RED}Player must be online or provide a valid UUID.")
                    return
                }
                if (!WhitelistManager.add(uuid)) {
                    sender.sendMessage("${ChatColor.RED}${target} is already whitelisted.")
                } else {
                    sender.sendMessage("${ChatColor.YELLOW}Added ${ChatColor.WHITE}${target}${ChatColor.YELLOW} to the whitelist.")
                }
            }
            "remove", "rem" -> {
                if (args.size < 2) {
                    sender.sendMessage("${ChatColor.RED}Usage: /whitelist remove <player|uuid>")
                    return
                }
                val target = args[1]
                val uuid = resolveUuid(target)
                if (uuid == null) {
                    sender.sendMessage("${ChatColor.RED}Player must be online or provide a valid UUID.")
                    return
                }
                if (!WhitelistManager.remove(uuid)) {
                    sender.sendMessage("${ChatColor.RED}${target} is not whitelisted.")
                } else {
                    sender.sendMessage("${ChatColor.YELLOW}Removed ${ChatColor.WHITE}${target}${ChatColor.YELLOW} from the whitelist.")
                }
            }
            else -> sendUsage(sender)
        }
    }

    private fun sendUsage(sender: CommandSender) {
        sender.sendMessage("${ChatColor.YELLOW}Whitelist commands:")
        sender.sendMessage("${ChatColor.GRAY}/whitelist status ${ChatColor.DARK_GRAY}- ${ChatColor.WHITE}Show whitelist status")
        sender.sendMessage("${ChatColor.GRAY}/whitelist on|off ${ChatColor.DARK_GRAY}- ${ChatColor.WHITE}Enable or disable the whitelist")
        sender.sendMessage("${ChatColor.GRAY}/whitelist list ${ChatColor.DARK_GRAY}- ${ChatColor.WHITE}List whitelisted players")
        sender.sendMessage("${ChatColor.GRAY}/whitelist add <player|uuid> ${ChatColor.DARK_GRAY}- ${ChatColor.WHITE}Add to whitelist")
        sender.sendMessage("${ChatColor.GRAY}/whitelist remove <player|uuid> ${ChatColor.DARK_GRAY}- ${ChatColor.WHITE}Remove from whitelist")
    }

    private fun resolveUuid(input: String): UUID? {
        // 1. Check online players
        ProxyServer.getInstance().getPlayer(input)?.uniqueId?.let { return it }

        // 2. Check if input is already a UUID
        runCatching { UUID.fromString(input) }.getOrNull()?.let { return it }

        // 3. Try Mojang API lookup (for offline/never-joined players)
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
                return UUID.fromString(rawId.replaceFirst(
                    "(\\w{8})(\\w{4})(\\w{4})(\\w{4})(\\w{12})".toRegex(),
                    "$1-$2-$3-$4-$5"
                ))
            }
            null
        } catch (e: Exception) {
            e.printStackTrace()
            null
        }
    }

}
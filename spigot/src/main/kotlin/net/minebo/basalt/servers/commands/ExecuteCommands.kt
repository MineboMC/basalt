package net.minebo.basalt.servers.commands

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.*
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.packets.ExecuteCommandPacket
import net.minebo.basalt.packets.NetworkBroadcastPacket
import net.minebo.basalt.packets.ServerExecuteCommandPacket
import net.minebo.basalt.packets.ServerGroupExecuteCommandPacket
import net.minebo.basalt.redis.AsynchronousRedisSender
import org.bukkit.ChatColor
import org.bukkit.conversations.*
import org.bukkit.entity.Player

@CommandAlias("execcmd|executecommands")
@CommandPermission("basalt.execute")
class ExecuteCommands : BaseCommand() {

    @Subcommand("server")
    @CommandCompletion("@servers @nothing")
    @Syntax("<server> <command>")
    @CommandPermission("basalt.execute")
    @Description("Execute a command on a specific server")
    fun onServer(player: Player, server: String, command: String) {
        promptExecute(player, server, command)
    }

    @Subcommand("global")
    @Syntax("<command>")
    @CommandPermission("basalt.execute")
    @Description("Execute a command globally")
    fun onGlobal(player: Player, command: String) {
        promptExecute(player, "globally", command)
    }

    @Subcommand("group")
    @CommandCompletion("@groups @nothing")
    @Syntax("<group> <command>")
    @CommandPermission("basalt.execute")
    @Description("Execute a command on a server group")
    fun onGroup(player: Player, group: String, command: String) {
        promptExecute2(player, group, command)
    }

    private fun promptExecute(player: Player, server: String, command: String) {
        val factory = ConversationFactory(BasaltSpigotPlugin.instance)
            .withModality(true)
            .withPrefix(NullConversationPrefix())
            .withFirstPrompt(object : StringPrompt() {
                override fun getPromptText(context: ConversationContext): String {
                    return ChatColor.translateAlternateColorCodes('&',
                        "&eYou are about to execute the command &c\"$command\" &c$server &eare you sure you want to do this? If so type &ayes&c."
                    )
                }

                override fun acceptInput(context: ConversationContext, input: String?): Prompt? {
                    if (input.equals("yes", ignoreCase = true)) {
                        context.forWhom.sendRawMessage("${ChatColor.GREEN}Sending cross-bungee command...")
                        // BasaltPa.sendToAll(new ServerExecuteCommandPacket(server, command));
                        // If BasaltPa is not defined, use PacketHandler or the appropriate handler.
                        if(server == "globally") {
                            AsynchronousRedisSender.send(ExecuteCommandPacket(command))
                        } else {
                            AsynchronousRedisSender.send(ServerExecuteCommandPacket(server, command))
                        }
                        AsynchronousRedisSender.send(
                            NetworkBroadcastPacket(
                                "bridge.execute.view",
                                "&8[&eServer Monitor&8] ${player.displayName} &fexecuted command &d$command" +
                                        (if (server == "globally") " &f" else " &fon ") + server
                            )
                        )
                    } else {
                        context.forWhom.sendRawMessage("${ChatColor.RED}Executing cancelled.")
                    }
                    return Prompt.END_OF_CONVERSATION
                }
            })
            .withEscapeSequence("/no")
            .withLocalEcho(false)
            .withTimeout(10)
            .thatExcludesNonPlayersWithMessage("Go away evil console!")
        val con = factory.buildConversation(player)
        player.beginConversation(con)
    }

    private fun promptExecute2(player: Player, serverGroup: String, command: String) {
        val factory = ConversationFactory(BasaltSpigotPlugin.instance)
            .withModality(true)
            .withPrefix(NullConversationPrefix())
            .withFirstPrompt(object : StringPrompt() {
                override fun getPromptText(context: ConversationContext): String {
                    return ChatColor.translateAlternateColorCodes('&',
                        "&eYou are about to execute the command &c\"$command\" to the server group &c$serverGroup &eare you sure you want to do this? If so type &ayes&c."
                    )
                }

                override fun acceptInput(context: ConversationContext, input: String?): Prompt? {
                    if (input.equals("yes", ignoreCase = true)) {
                        context.forWhom.sendRawMessage("${ChatColor.GREEN}Sending cross-bungee command...")
                        AsynchronousRedisSender.send(ServerGroupExecuteCommandPacket(serverGroup, command))
                        AsynchronousRedisSender.send(
                            NetworkBroadcastPacket(
                                "bridge.execute.view",
                                "&8[&eServer Monitor&8] ${player.displayName} &fexecuted command &d$command &fon the server group $serverGroup"
                            )
                        )
                    } else {
                        context.forWhom.sendRawMessage("${ChatColor.RED}Executing cancelled.")
                    }
                    return Prompt.END_OF_CONVERSATION
                }
            })
            .withEscapeSequence("/no")
            .withLocalEcho(false)
            .withTimeout(10)
            .thatExcludesNonPlayersWithMessage("Go away evil console!")
        val con = factory.buildConversation(player)
        player.beginConversation(con)
    }
}
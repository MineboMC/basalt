package net.minebo.basalt.profiles.commands.player

import co.aikar.commands.BaseCommand
import co.aikar.commands.annotation.CommandAlias
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.service.profiles.ProfileGameService
import net.minebo.basalt.util.Chat
import net.minebo.basalt.util.WebUtil
import org.bukkit.Bukkit
import org.bukkit.entity.Player

class FreerankCommand : BaseCommand()
{

    @CommandAlias("freerank")
    fun freeRank(player: Player)
    {
        val gameProfile = ProfileGameService.byId(player.uniqueId)

        if (gameProfile == null)
        {
            player.sendMessage(Chat.format("&cYou do not have a profile!"))
            return
        }

        if (gameProfile.metadata.has("redeemedFreeRank"))
        {
            player.sendMessage(Chat.format("&cYou already claimed your free rank!"))
            return
        }

        WebUtil.playerHasLiked(player.uniqueId).thenApply {
            if (it == false)
            {
                for (line in BasaltSpigotPlugin.instance.config.getStringList("freeRank.message"))
                {
                    player.sendMessage(Chat.format(line))
                }

                return@thenApply
            } else
            {
                player.sendMessage(Chat.format("&aRedeemed your free rank!"))

                BasaltSpigotPlugin.instance.server.scheduler.runTask(BasaltSpigotPlugin.instance) {
                    Bukkit.dispatchCommand(
                        Bukkit.getConsoleSender(),
                        BasaltSpigotPlugin.instance.config.getString("freeRank.command")
                            .replace("<target>", player.name)
                    )
                }

                gameProfile.metadata.addProperty("redeemedFreeRank", true)

                ProfileGameService.saveSync(gameProfile)
            }
        }
    }
}
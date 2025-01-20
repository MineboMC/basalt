package net.minebo.basalt.webhook.types.grants

/**
 * Class created on 7/20/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
import club.minnced.discord.webhook.send.WebhookEmbed
import club.minnced.discord.webhook.send.WebhookEmbedBuilder
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.grant.types.RankGrant
import net.minebo.basalt.util.TimeUtil
import net.minebo.basalt.webhook.WebhookInformation
import net.minebo.basalt.webhook.WebhookService
import org.bukkit.Color

class GrantsNotification(val rankGrant: RankGrant) : WebhookInformation()
{

    override fun getEmbed(): WebhookEmbed
    {
        val embed = WebhookEmbedBuilder()
            .setColor(Color.ORANGE.asRGB())
            .setThumbnailUrl("https://minotar.net/avatar/${rankGrant.target}/75.png")
            .setTitle(WebhookEmbed.EmbedTitle("**Grant Executed**", null))
            .setDescription(
                ((BasaltAPI.syncFindProfile(rankGrant.target)?.username
                    ?: "Unknown") + " has been granted " + rankGrant.getGrantable().displayName + " by " + (BasaltAPI.syncFindProfile(
                    rankGrant.executor
                )?.username ?: "Console"))
                        + "\n\n" + "**Reason**: " + rankGrant.reason
                        + "\n**Scopes**: " + rankGrant.verifyGrantScope().servers.toString()
                        + "\n**Type**: " + rankGrant.getGrantable().displayName
                        + "\n**Actor**: " + rankGrant.actor.actorType.name
                        + "\n**Duration**: " + if (rankGrant.expirable.duration != Long.MAX_VALUE) TimeUtil.formatDuration(
                    rankGrant.expirable.duration
                ) else "Permanent"
            ).build()


        return embed
    }

    override fun send()
    {
        if (BasaltSpigotPlugin.instance.config.getBoolean("discord.grants.enabled"))
        {
            WebhookService.sendInformation(this, WebhookService.rankGrantClient)
        }
    }
}
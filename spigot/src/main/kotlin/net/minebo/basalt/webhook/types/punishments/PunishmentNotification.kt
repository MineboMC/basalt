package net.minebo.basalt.webhook.types.punishments

import club.minnced.discord.webhook.send.WebhookEmbed
import club.minnced.discord.webhook.send.WebhookEmbedBuilder
import net.minebo.basalt.BasaltSpigotPlugin
import net.minebo.basalt.api.BasaltAPI
import net.minebo.basalt.models.grant.types.Punishment
import net.minebo.basalt.util.TimeUtil
import net.minebo.basalt.webhook.WebhookInformation
import net.minebo.basalt.webhook.WebhookService

class PunishmentNotification(val punishment: Punishment) : WebhookInformation()
{

    override fun getEmbed(): WebhookEmbed
    {
        val embed = WebhookEmbedBuilder()
            .setColor(punishment.getGrantable().hex)
            .setThumbnailUrl("https://minotar.net/avatar/${punishment.target}/75.png")
            .setTitle(WebhookEmbed.EmbedTitle("**Punishment Executed**", null))
            .setDescription(
                ((BasaltAPI.syncFindProfile(punishment.target)?.username
                    ?: "Unknown") + " has been " + punishment.getGrantable().added + " by " + (BasaltAPI.syncFindProfile(
                    punishment.executor
                )?.username ?: "Console"))
                        + "\n\n" + "**Reason**: " + punishment.reason
                        + "\n**Short Identifier**: " + punishment.easyFindId
                        + "\n**Type**: " + punishment.getGrantable().niceName
                        + "\n**Actor**: " + punishment.actor.actorType.name
                        + "\n**Duration**: " + if (punishment.expirable.duration != Long.MAX_VALUE) TimeUtil.formatDuration(
                    punishment.expirable.duration
                ) else "Permanent"
            ).build()


        return embed
    }

    override fun send()
    {
        if (BasaltSpigotPlugin.instance.config.getBoolean("discord.punishments.enabled"))
        {
            WebhookService.sendInformation(this, WebhookService.punishmentClient)
        }
    }
}
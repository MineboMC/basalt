package net.minebo.basalt.webhook

import club.minnced.discord.webhook.send.WebhookEmbed

abstract class WebhookInformation
{

    abstract fun getEmbed(): WebhookEmbed

    abstract fun send()


}
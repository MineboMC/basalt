package net.minebo.basalt.webhook;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lnet/minebo/basalt/webhook/WebhookInformation;", "", "<init>", "()V", "getEmbed", "Lclub/minnced/discord/webhook/send/WebhookEmbed;", "send", "", "spigot"})
public abstract class WebhookInformation {
    
    public WebhookInformation() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract club.minnced.discord.webhook.send.WebhookEmbed getEmbed();
    
    public abstract void send();
}
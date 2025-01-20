package net.minebo.basalt.webhook.types.punishments;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lnet/minebo/basalt/webhook/types/punishments/PunishmentNotification;", "Lnet/minebo/basalt/webhook/WebhookInformation;", "punishment", "Lnet/minebo/basalt/models/grant/types/Punishment;", "<init>", "(Lnet/minebo/basalt/models/grant/types/Punishment;)V", "getPunishment", "()Lnet/minebo/basalt/models/grant/types/Punishment;", "getEmbed", "Lclub/minnced/discord/webhook/send/WebhookEmbed;", "send", "", "spigot"})
public final class PunishmentNotification extends net.minebo.basalt.webhook.WebhookInformation {
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.grant.types.Punishment punishment = null;
    
    public PunishmentNotification(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.Punishment punishment) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.grant.types.Punishment getPunishment() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public club.minnced.discord.webhook.send.WebhookEmbed getEmbed() {
        return null;
    }
    
    @java.lang.Override()
    public void send() {
    }
}
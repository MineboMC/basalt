package net.minebo.basalt.webhook;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eJ\u000e\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000eJ\u0016\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0019"}, d2 = {"Lnet/minebo/basalt/webhook/WebhookService;", "", "<init>", "()V", "punishmentClient", "Lclub/minnced/discord/webhook/WebhookClient;", "getPunishmentClient", "()Lclub/minnced/discord/webhook/WebhookClient;", "setPunishmentClient", "(Lclub/minnced/discord/webhook/WebhookClient;)V", "rankGrantClient", "getRankGrantClient", "setRankGrantClient", "PUNISHMENT_ICON", "", "getPUNISHMENT_ICON", "()Ljava/lang/String;", "createPunishmentClient", "", "uri", "createRankGrantClient", "sendInformation", "info", "Lnet/minebo/basalt/webhook/WebhookInformation;", "client", "spigot"})
public final class WebhookService {
    public static club.minnced.discord.webhook.WebhookClient punishmentClient;
    public static club.minnced.discord.webhook.WebhookClient rankGrantClient;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PUNISHMENT_ICON = "https://static.wikia.nocookie.net/minecraft/images/8/8d/BarrierNew.png";
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.webhook.WebhookService INSTANCE = null;
    
    private WebhookService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final club.minnced.discord.webhook.WebhookClient getPunishmentClient() {
        return null;
    }
    
    public final void setPunishmentClient(@org.jetbrains.annotations.NotNull()
    club.minnced.discord.webhook.WebhookClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final club.minnced.discord.webhook.WebhookClient getRankGrantClient() {
        return null;
    }
    
    public final void setRankGrantClient(@org.jetbrains.annotations.NotNull()
    club.minnced.discord.webhook.WebhookClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPUNISHMENT_ICON() {
        return null;
    }
    
    public final void createPunishmentClient(@org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
    }
    
    public final void createRankGrantClient(@org.jetbrains.annotations.NotNull()
    java.lang.String uri) {
    }
    
    public final void sendInformation(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.webhook.WebhookInformation info, @org.jetbrains.annotations.NotNull()
    club.minnced.discord.webhook.WebhookClient client) {
    }
}
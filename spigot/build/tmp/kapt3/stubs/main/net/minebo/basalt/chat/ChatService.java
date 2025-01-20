package net.minebo.basalt.chat;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020\u000f2\u0006\u0010(\u001a\u00020)J\u000e\u0010+\u001a\u00020\u001e2\u0006\u0010(\u001a\u00020)R\u001b\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\n\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\bR\u001b\u0010\f\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\b\r\u0010\bR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R-\u0010\u0012\u001a\u001e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013j\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015`\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0011\"\u0004\b%\u0010\u001c\u00a8\u0006,"}, d2 = {"Lnet/minebo/basalt/chat/ChatService;", "", "<init>", "()V", "SLOW_MESSAGE", "", "kotlin.jvm.PlatformType", "getSLOW_MESSAGE", "()Ljava/lang/String;", "Ljava/lang/String;", "MUTE_MESSAGE", "getMUTE_MESSAGE", "MINIMUM_LINK_SEND_RANK", "getMINIMUM_LINK_SEND_RANK", "LINK_LIMIT_ENABLED", "", "getLINK_LIMIT_ENABLED", "()Z", "cooldownMap", "Ljava/util/HashMap;", "Ljava/util/UUID;", "", "Lkotlin/collections/HashMap;", "getCooldownMap", "()Ljava/util/HashMap;", "slowed", "getSlowed", "setSlowed", "(Z)V", "slowDuration", "", "getSlowDuration", "()I", "setSlowDuration", "(I)V", "muted", "getMuted", "setMuted", "addCooldown", "", "player", "Lorg/bukkit/entity/Player;", "isOnCooldown", "getCooldownRemaining", "spigot"})
public final class ChatService {
    private static final java.lang.String SLOW_MESSAGE = null;
    private static final java.lang.String MUTE_MESSAGE = null;
    private static final java.lang.String MINIMUM_LINK_SEND_RANK = null;
    private static final boolean LINK_LIMIT_ENABLED = false;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashMap<java.util.UUID, java.lang.Long> cooldownMap = null;
    private static boolean slowed = false;
    private static int slowDuration = 3;
    private static boolean muted = false;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.chat.ChatService INSTANCE = null;
    
    private ChatService() {
        super();
    }
    
    public final java.lang.String getSLOW_MESSAGE() {
        return null;
    }
    
    public final java.lang.String getMUTE_MESSAGE() {
        return null;
    }
    
    public final java.lang.String getMINIMUM_LINK_SEND_RANK() {
        return null;
    }
    
    public final boolean getLINK_LIMIT_ENABLED() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.util.UUID, java.lang.Long> getCooldownMap() {
        return null;
    }
    
    public final boolean getSlowed() {
        return false;
    }
    
    public final void setSlowed(boolean p0) {
    }
    
    public final int getSlowDuration() {
        return 0;
    }
    
    public final void setSlowDuration(int p0) {
    }
    
    public final boolean getMuted() {
        return false;
    }
    
    public final void setMuted(boolean p0) {
    }
    
    public final void addCooldown(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    public final boolean isOnCooldown(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return false;
    }
    
    public final int getCooldownRemaining(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return 0;
    }
}
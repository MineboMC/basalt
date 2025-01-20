package net.minebo.basalt.util;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\tJ\u0006\u0010\f\u001a\u00020\rJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0018\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u0010\u0010\u0016\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0006J\u000e\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lnet/minebo/basalt/util/NetworkUtil;", "Lorg/bukkit/plugin/messaging/PluginMessageListener;", "<init>", "()V", "playerCounts", "", "", "", "getPlayerCounts", "", "servers", "", "load", "", "onPluginMessageReceived", "channel", "player", "Lorg/bukkit/entity/Player;", "message", "", "send", "server", "sendAll", "getPlayerCount", "spigot"})
public final class NetworkUtil implements org.bukkit.plugin.messaging.PluginMessageListener {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, java.lang.Integer> playerCounts = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.List<java.lang.String> servers = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.util.NetworkUtil INSTANCE = null;
    
    private NetworkUtil() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, java.lang.Integer> getPlayerCounts() {
        return null;
    }
    
    public final void load() {
    }
    
    @java.lang.Override()
    public void onPluginMessageReceived(@org.jetbrains.annotations.NotNull()
    java.lang.String channel, @org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    byte[] message) {
    }
    
    public final void send(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.Nullable()
    java.lang.String server) {
    }
    
    public final void sendAll(@org.jetbrains.annotations.Nullable()
    java.lang.String server) {
    }
    
    public final void getPlayerCount(@org.jetbrains.annotations.NotNull()
    java.lang.String server) {
    }
}
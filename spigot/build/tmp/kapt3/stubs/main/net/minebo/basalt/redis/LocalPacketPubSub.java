package net.minebo.basalt.redis;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\rH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lnet/minebo/basalt/redis/LocalPacketPubSub;", "Lredis/clients/jedis/JedisPubSub;", "<init>", "()V", "received", "", "getReceived", "()I", "setReceived", "(I)V", "onMessage", "", "channel", "", "message", "spigot"})
public final class LocalPacketPubSub extends redis.clients.jedis.JedisPubSub {
    private static int received = 0;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.redis.LocalPacketPubSub INSTANCE = null;
    
    private LocalPacketPubSub() {
        super();
    }
    
    public final int getReceived() {
        return 0;
    }
    
    public final void setReceived(int p0) {
    }
    
    @java.lang.Override()
    public void onMessage(@org.jetbrains.annotations.Nullable()
    java.lang.String channel, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
}
package net.minebo.basalt.packets;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0010"}, d2 = {"Lnet/minebo/basalt/packets/AdminChatPacket;", "Lnet/minebo/basalt/redis/RedisPacket;", "message", "", "server", "sender", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/UUID;)V", "getMessage", "()Ljava/lang/String;", "getServer", "getSender", "()Ljava/util/UUID;", "action", "", "spigot"})
public final class AdminChatPacket extends net.minebo.basalt.redis.RedisPacket {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String server = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID sender = null;
    
    public AdminChatPacket(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    java.lang.String server, @org.jetbrains.annotations.NotNull()
    java.util.UUID sender) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getSender() {
        return null;
    }
    
    @java.lang.Override()
    public void action() {
    }
}
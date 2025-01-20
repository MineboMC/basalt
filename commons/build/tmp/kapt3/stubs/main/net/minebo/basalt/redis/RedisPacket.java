package net.minebo.basalt.redis;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH&R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/redis/RedisPacket;", "", "packetId", "", "<init>", "(Ljava/lang/String;)V", "getPacketId", "()Ljava/lang/String;", "action", "", "commons"})
public abstract class RedisPacket {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String packetId = null;
    
    public RedisPacket(@org.jetbrains.annotations.NotNull()
    java.lang.String packetId) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPacketId() {
        return null;
    }
    
    public abstract void action();
}
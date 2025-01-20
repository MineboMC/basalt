package net.minebo.basalt.packets;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/packets/PlayerKickPacket;", "Lnet/minebo/basalt/redis/RedisPacket;", "uuid", "Ljava/util/UUID;", "reason", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "action", "", "spigot"})
public final class PlayerKickPacket extends net.minebo.basalt.redis.RedisPacket {
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID uuid = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reason = null;
    
    public PlayerKickPacket(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid, @org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
        super(null);
    }
    
    @java.lang.Override()
    public void action() {
    }
}
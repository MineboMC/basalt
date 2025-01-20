package net.minebo.basalt.profiles.permissions.packet;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u000b"}, d2 = {"Lnet/minebo/basalt/profiles/permissions/packet/PermissionUpdatePacket;", "Lnet/minebo/basalt/redis/RedisPacket;", "player", "Ljava/util/UUID;", "<init>", "(Ljava/util/UUID;)V", "getPlayer", "()Ljava/util/UUID;", "setPlayer", "action", "", "spigot"})
public final class PermissionUpdatePacket extends net.minebo.basalt.redis.RedisPacket {
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID player;
    
    public PermissionUpdatePacket(@org.jetbrains.annotations.NotNull()
    java.util.UUID player) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getPlayer() {
        return null;
    }
    
    public final void setPlayer(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    @java.lang.Override()
    public void action() {
    }
}
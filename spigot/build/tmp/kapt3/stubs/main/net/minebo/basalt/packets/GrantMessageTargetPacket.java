package net.minebo.basalt.packets;

/**
 * Class created on 7/29/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lnet/minebo/basalt/packets/GrantMessageTargetPacket;", "Lnet/minebo/basalt/redis/RedisPacket;", "target", "Ljava/util/UUID;", "rank", "Lnet/minebo/basalt/models/ranks/Rank;", "duration", "", "<init>", "(Ljava/util/UUID;Lnet/minebo/basalt/models/ranks/Rank;J)V", "getTarget", "()Ljava/util/UUID;", "getRank", "()Lnet/minebo/basalt/models/ranks/Rank;", "getDuration", "()J", "action", "", "spigot"})
public final class GrantMessageTargetPacket extends net.minebo.basalt.redis.RedisPacket {
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID target = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.ranks.Rank rank = null;
    private final long duration = 0L;
    
    public GrantMessageTargetPacket(@org.jetbrains.annotations.NotNull()
    java.util.UUID target, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, long duration) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getTarget() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.ranks.Rank getRank() {
        return null;
    }
    
    public final long getDuration() {
        return 0L;
    }
    
    @java.lang.Override()
    public void action() {
    }
}
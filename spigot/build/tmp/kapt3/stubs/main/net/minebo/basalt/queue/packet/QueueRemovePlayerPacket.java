package net.minebo.basalt.queue.packet;

/**
 * Class created on 7/12/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/queue/packet/QueueRemovePlayerPacket;", "Lnet/minebo/basalt/redis/RedisPacket;", "queueId", "", "player", "Ljava/util/UUID;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;)V", "getQueueId", "()Ljava/lang/String;", "getPlayer", "()Ljava/util/UUID;", "action", "", "spigot"})
public final class QueueRemovePlayerPacket extends net.minebo.basalt.redis.RedisPacket {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String queueId = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID player = null;
    
    public QueueRemovePlayerPacket(@org.jetbrains.annotations.NotNull()
    java.lang.String queueId, @org.jetbrains.annotations.NotNull()
    java.util.UUID player) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQueueId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getPlayer() {
        return null;
    }
    
    @java.lang.Override()
    public void action() {
    }
}
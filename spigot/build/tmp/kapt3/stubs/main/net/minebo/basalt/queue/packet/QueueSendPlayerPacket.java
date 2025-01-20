package net.minebo.basalt.queue.packet;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/queue/packet/QueueSendPlayerPacket;", "Lnet/minebo/basalt/redis/RedisPacket;", "id", "Ljava/util/UUID;", "queueDestination", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getId", "()Ljava/util/UUID;", "getQueueDestination", "()Ljava/lang/String;", "action", "", "spigot"})
public final class QueueSendPlayerPacket extends net.minebo.basalt.redis.RedisPacket {
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID id = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String queueDestination = null;
    
    public QueueSendPlayerPacket(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    java.lang.String queueDestination) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQueueDestination() {
        return null;
    }
    
    @java.lang.Override()
    public void action() {
    }
}
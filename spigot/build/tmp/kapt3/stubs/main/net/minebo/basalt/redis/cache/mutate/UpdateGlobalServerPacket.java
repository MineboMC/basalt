package net.minebo.basalt.redis.cache.mutate;

/**
 * Class created on 7/29/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\b\u001a\u00020\tH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/redis/cache/mutate/UpdateGlobalServerPacket;", "Lnet/minebo/basalt/redis/RedisPacket;", "server", "Lnet/minebo/basalt/models/server/UniqueServer;", "<init>", "(Lnet/minebo/basalt/models/server/UniqueServer;)V", "getServer", "()Lnet/minebo/basalt/models/server/UniqueServer;", "action", "", "spigot"})
public final class UpdateGlobalServerPacket extends net.minebo.basalt.redis.RedisPacket {
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.server.UniqueServer server = null;
    
    public UpdateGlobalServerPacket(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.server.UniqueServer server) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.server.UniqueServer getServer() {
        return null;
    }
    
    @java.lang.Override()
    public void action() {
    }
}
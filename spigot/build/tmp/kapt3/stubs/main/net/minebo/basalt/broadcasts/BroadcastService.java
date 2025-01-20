package net.minebo.basalt.broadcasts;

/**
 * Class created on 6/17/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0006\u0010\b\u001a\u00020\t\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/broadcasts/BroadcastService;", "Lnet/minebo/basalt/redis/data/RedisDataSync;", "Lnet/minebo/basalt/broadcasts/BroadcastContainer;", "<init>", "()V", "destination", "", "key", "startDispatchingBroadcasts", "", "spigot"})
public final class BroadcastService extends net.minebo.basalt.redis.data.RedisDataSync<net.minebo.basalt.broadcasts.BroadcastContainer> {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.broadcasts.BroadcastService INSTANCE = null;
    
    private BroadcastService() {
        super(null, null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String destination() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String key() {
        return null;
    }
    
    public final void startDispatchingBroadcasts() {
    }
}
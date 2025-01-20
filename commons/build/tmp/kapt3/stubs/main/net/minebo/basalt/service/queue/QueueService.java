package net.minebo.basalt.service.queue;

/**
 * Class created on 7/12/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00162\u0006\u0010\u0017\u001a\u00020\u0006J\u000e\u0010\u0018\u001a\u00020\u00112\u0006\u0010\u0019\u001a\u00020\u0007R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001a"}, d2 = {"Lnet/minebo/basalt/service/queue/QueueService;", "Lnet/minebo/basalt/service/GeneralizedService;", "<init>", "()V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Lnet/minebo/basalt/models/queue/QueueModel;", "getCache", "()Ljava/util/concurrent/ConcurrentHashMap;", "setCache", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "handler", "Lio/github/nosequel/data/store/StoreType;", "getHandler", "()Lio/github/nosequel/data/store/StoreType;", "loadAllQueues", "", "playerAlreadyQueued", "uuid", "Ljava/util/UUID;", "byId", "Ljava/util/concurrent/CompletableFuture;", "id", "saveQueue", "model", "commons"})
public final class QueueService implements net.minebo.basalt.service.GeneralizedService {
    @org.jetbrains.annotations.NotNull()
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, net.minebo.basalt.models.queue.QueueModel> cache;
    @org.jetbrains.annotations.NotNull()
    private static final io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.queue.QueueModel> handler = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.service.queue.QueueService INSTANCE = null;
    
    private QueueService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, net.minebo.basalt.models.queue.QueueModel> getCache() {
        return null;
    }
    
    public final void setCache(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.lang.String, net.minebo.basalt.models.queue.QueueModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.queue.QueueModel> getHandler() {
        return null;
    }
    
    public final void loadAllQueues() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.queue.QueueModel playerAlreadyQueued(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<net.minebo.basalt.models.queue.QueueModel> byId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public final void saveQueue(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.queue.QueueModel model) {
    }
}
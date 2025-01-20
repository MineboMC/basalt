package net.minebo.basalt.service.tags;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00160\u0015J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0007J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001a\u001a\u00020\u0006R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001b"}, d2 = {"Lnet/minebo/basalt/service/tags/TagService;", "Lnet/minebo/basalt/service/GeneralizedService;", "<init>", "()V", "handler", "Lio/github/nosequel/data/store/StoreType;", "", "Lnet/minebo/basalt/models/tags/Tag;", "getHandler", "()Lio/github/nosequel/data/store/StoreType;", "setHandler", "(Lio/github/nosequel/data/store/StoreType;)V", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "getCache", "()Ljava/util/concurrent/ConcurrentHashMap;", "setCache", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "loadTags", "", "getValues", "Ljava/util/concurrent/CompletableFuture;", "", "save", "tag", "byId", "id", "commons"})
public final class TagService implements net.minebo.basalt.service.GeneralizedService {
    @org.jetbrains.annotations.NotNull()
    private static io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.tags.Tag> handler;
    @org.jetbrains.annotations.NotNull()
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, net.minebo.basalt.models.tags.Tag> cache;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.service.tags.TagService INSTANCE = null;
    
    private TagService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.tags.Tag> getHandler() {
        return null;
    }
    
    public final void setHandler(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.tags.Tag> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, net.minebo.basalt.models.tags.Tag> getCache() {
        return null;
    }
    
    public final void setCache(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.lang.String, net.minebo.basalt.models.tags.Tag> p0) {
    }
    
    public final void loadTags() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.Collection<net.minebo.basalt.models.tags.Tag>> getValues() {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.tags.Tag tag) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.tags.Tag byId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
}
package net.minebo.basalt.cache.types;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00072\u0006\u0010\b\u001a\u00020\u0002J\u0016\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\n\u001a\u00020\u0003\u00a8\u0006\u000b"}, d2 = {"Lnet/minebo/basalt/cache/types/UUIDCache;", "Lnet/minebo/basalt/cache/RedisCache;", "Ljava/util/UUID;", "", "<init>", "()V", "findById", "Ljava/util/concurrent/CompletableFuture;", "id", "findByUsername", "name", "commons"})
public final class UUIDCache extends net.minebo.basalt.cache.RedisCache<java.util.UUID, java.lang.String> {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.cache.types.UUIDCache INSTANCE = null;
    
    private UUIDCache() {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.String> findById(@org.jetbrains.annotations.NotNull()
    java.util.UUID id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.UUID> findByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
}
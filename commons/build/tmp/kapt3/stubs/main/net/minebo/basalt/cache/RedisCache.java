package net.minebo.basalt.cache;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00028\u00010\u00152\u0006\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00028\u0001\u00a2\u0006\u0002\u0010\u001aJ!\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u0006\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u001aR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007R&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R&\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010\u00a8\u0006\u001c"}, d2 = {"Lnet/minebo/basalt/cache/RedisCache;", "A", "B", "", "redisKey", "", "<init>", "(Ljava/lang/String;)V", "getRedisKey", "()Ljava/lang/String;", "setRedisKey", "aToBCache", "", "getAToBCache", "()Ljava/util/Map;", "setAToBCache", "(Ljava/util/Map;)V", "btoACache", "getBtoACache", "setBtoACache", "loadAllFromRedis", "Ljava/util/concurrent/CompletableFuture;", "Ljava/lang/Void;", "addToFirstCache", "key", "value", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/util/concurrent/CompletableFuture;", "addToSecondCache", "commons"})
public abstract class RedisCache<A extends java.lang.Object, B extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String redisKey;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<A, B> aToBCache;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<B, A> btoACache;
    
    public RedisCache(@org.jetbrains.annotations.NotNull()
    java.lang.String redisKey) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRedisKey() {
        return null;
    }
    
    public final void setRedisKey(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<A, B> getAToBCache() {
        return null;
    }
    
    public final void setAToBCache(@org.jetbrains.annotations.NotNull()
    java.util.Map<A, B> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<B, A> getBtoACache() {
        return null;
    }
    
    public final void setBtoACache(@org.jetbrains.annotations.NotNull()
    java.util.Map<B, A> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> loadAllFromRedis() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<B> addToFirstCache(A key, B value) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<A> addToSecondCache(B key, A value) {
        return null;
    }
}
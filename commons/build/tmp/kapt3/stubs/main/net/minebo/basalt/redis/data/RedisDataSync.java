package net.minebo.basalt.redis.data;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u000b\u001a\u00020\u0004H&J\b\u0010\f\u001a\u00020\u0004H&J\u0013\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00028\u0000\u00a2\u0006\u0002\u0010\u0010J\u0006\u0010\u0011\u001a\u00020\u000eJ\u0006\u0010\u0012\u001a\u00020\u000eJ\r\u0010\u0013\u001a\u0004\u0018\u00018\u0000\u00a2\u0006\u0002\u0010\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0015"}, d2 = {"Lnet/minebo/basalt/redis/data/RedisDataSync;", "V", "", "identifier", "", "clazz", "Ljava/lang/Class;", "<init>", "(Ljava/lang/String;Ljava/lang/Class;)V", "getClazz", "()Ljava/lang/Class;", "destination", "key", "cache", "", "value", "(Ljava/lang/Object;)V", "load", "sync", "cached", "()Ljava/lang/Object;", "commons"})
public abstract class RedisDataSync<V extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String identifier = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.Class<V> clazz = null;
    
    public RedisDataSync(@org.jetbrains.annotations.NotNull()
    java.lang.String identifier, @org.jetbrains.annotations.NotNull()
    java.lang.Class<V> clazz) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Class<V> getClazz() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String destination();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String key();
    
    public final void cache(V value) {
    }
    
    public final void load() {
    }
    
    public final void sync() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final V cached() {
        return null;
    }
}
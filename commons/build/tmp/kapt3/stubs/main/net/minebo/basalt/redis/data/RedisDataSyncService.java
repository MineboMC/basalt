package net.minebo.basalt.redis.data;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J!\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u0002H\u000f\u00a2\u0006\u0002\u0010\u0012R!\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR!\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t\u00a8\u0006\u0013"}, d2 = {"Lnet/minebo/basalt/redis/data/RedisDataSyncService;", "", "<init>", "()V", "dataSyncModels", "", "", "Lnet/minebo/basalt/redis/data/RedisObjectWrapper;", "getDataSyncModels", "()Ljava/util/Map;", "syncServices", "Lnet/minebo/basalt/redis/data/RedisDataSync;", "getSyncServices", "syncModel", "", "V", "id", "newModel", "(Ljava/lang/String;Ljava/lang/Object;)V", "commons"})
public final class RedisDataSyncService {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, net.minebo.basalt.redis.data.RedisObjectWrapper<?>> dataSyncModels = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, net.minebo.basalt.redis.data.RedisDataSync<?>> syncServices = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.redis.data.RedisDataSyncService INSTANCE = null;
    
    private RedisDataSyncService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, net.minebo.basalt.redis.data.RedisObjectWrapper<?>> getDataSyncModels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, net.minebo.basalt.redis.data.RedisDataSync<?>> getSyncServices() {
        return null;
    }
    
    public final <V extends java.lang.Object>void syncModel(@org.jetbrains.annotations.NotNull()
    java.lang.String id, V newModel) {
    }
}
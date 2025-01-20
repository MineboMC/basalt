package net.minebo.basalt.redis;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0013R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lnet/minebo/basalt/redis/RedisPacketManager;", "", "<init>", "()V", "pool", "Lredis/clients/jedis/JedisPool;", "getPool", "()Lredis/clients/jedis/JedisPool;", "setPool", "(Lredis/clients/jedis/JedisPool;)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "load", "", "host", "", "port", "", "password", "username", "commons"})
public final class RedisPacketManager {
    public static redis.clients.jedis.JedisPool pool;
    @org.jetbrains.annotations.NotNull()
    private static com.google.gson.Gson gson;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.redis.RedisPacketManager INSTANCE = null;
    
    private RedisPacketManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final redis.clients.jedis.JedisPool getPool() {
        return null;
    }
    
    public final void setPool(@org.jetbrains.annotations.NotNull()
    redis.clients.jedis.JedisPool p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    public final void load(@org.jetbrains.annotations.NotNull()
    java.lang.String host, int port, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String username) {
    }
}
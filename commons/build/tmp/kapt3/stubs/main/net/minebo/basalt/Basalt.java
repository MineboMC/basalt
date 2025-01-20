package net.minebo.basalt;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003JP\u00101\u001a\u0002022\u0006\u00103\u001a\u00020&2\b\u00104\u001a\u0004\u0018\u00010\u00052\u0006\u00105\u001a\u00020&2\u0006\u00106\u001a\u0002072\u0006\u00108\u001a\u00020\u001d2\b\u00109\u001a\u0004\u0018\u0001072\b\u0010:\u001a\u0004\u0018\u0001072\n\b\u0002\u0010;\u001a\u0004\u0018\u000107J\u0006\u0010<\u001a\u00020=R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001d8F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010%\u001a\u00020&X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020,X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100\u00a8\u0006>"}, d2 = {"Lnet/minebo/basalt/Basalt;", "", "<init>", "()V", "MongoConnectionPool", "Lio/github/nosequel/data/connection/mongo/MongoConnectionPool;", "getMongoConnectionPool", "()Lio/github/nosequel/data/connection/mongo/MongoConnectionPool;", "setMongoConnectionPool", "(Lio/github/nosequel/data/connection/mongo/MongoConnectionPool;)V", "FlatFileConnectionPool", "Lio/github/nosequel/data/connection/flatfile/FlatfileConnectionPool;", "getFlatFileConnectionPool", "()Lio/github/nosequel/data/connection/flatfile/FlatfileConnectionPool;", "setFlatFileConnectionPool", "(Lio/github/nosequel/data/connection/flatfile/FlatfileConnectionPool;)V", "dataHandler", "Lio/github/nosequel/data/DataHandler;", "getDataHandler", "()Lio/github/nosequel/data/DataHandler;", "setDataHandler", "(Lio/github/nosequel/data/DataHandler;)V", "globalServer", "Lnet/minebo/basalt/models/server/UniqueServer;", "getGlobalServer", "()Lnet/minebo/basalt/models/server/UniqueServer;", "setGlobalServer", "(Lnet/minebo/basalt/models/server/UniqueServer;)V", "<set-?>", "", "redisConnectionPort", "getRedisConnectionPort", "()I", "setRedisConnectionPort", "(I)V", "redisConnectionPort$delegate", "Lkotlin/properties/ReadWriteProperty;", "usingMongo", "", "getUsingMongo", "()Z", "setUsingMongo", "(Z)V", "gson", "Lcom/google/gson/Gson;", "getGson", "()Lcom/google/gson/Gson;", "setGson", "(Lcom/google/gson/Gson;)V", "start", "", "useMongo", "mongoConnectionPool", "needsRedis", "redisHost", "", "redisPort", "redisUsername", "redisPassword", "directory", "getDataStoreMethod", "Lio/github/nosequel/data/DataStoreType;", "commons"})
public final class Basalt {
    public static io.github.nosequel.data.connection.mongo.MongoConnectionPool MongoConnectionPool;
    public static io.github.nosequel.data.connection.flatfile.FlatfileConnectionPool FlatFileConnectionPool;
    public static io.github.nosequel.data.DataHandler dataHandler;
    public static net.minebo.basalt.models.server.UniqueServer globalServer;
    @org.jetbrains.annotations.NotNull()
    private static final kotlin.properties.ReadWriteProperty redisConnectionPort$delegate = null;
    private static boolean usingMongo = false;
    @org.jetbrains.annotations.NotNull()
    private static com.google.gson.Gson gson;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.Basalt INSTANCE = null;
    
    private Basalt() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.connection.mongo.MongoConnectionPool getMongoConnectionPool() {
        return null;
    }
    
    public final void setMongoConnectionPool(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.connection.mongo.MongoConnectionPool p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.connection.flatfile.FlatfileConnectionPool getFlatFileConnectionPool() {
        return null;
    }
    
    public final void setFlatFileConnectionPool(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.connection.flatfile.FlatfileConnectionPool p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.DataHandler getDataHandler() {
        return null;
    }
    
    public final void setDataHandler(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.DataHandler p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.server.UniqueServer getGlobalServer() {
        return null;
    }
    
    public final void setGlobalServer(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.server.UniqueServer p0) {
    }
    
    public final void setRedisConnectionPort(int p0) {
    }
    
    public final int getRedisConnectionPort() {
        return 0;
    }
    
    public final boolean getUsingMongo() {
        return false;
    }
    
    public final void setUsingMongo(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.gson.Gson getGson() {
        return null;
    }
    
    public final void setGson(@org.jetbrains.annotations.NotNull()
    com.google.gson.Gson p0) {
    }
    
    public final void start(boolean useMongo, @org.jetbrains.annotations.Nullable()
    io.github.nosequel.data.connection.mongo.MongoConnectionPool mongoConnectionPool, boolean needsRedis, @org.jetbrains.annotations.NotNull()
    java.lang.String redisHost, int redisPort, @org.jetbrains.annotations.Nullable()
    java.lang.String redisUsername, @org.jetbrains.annotations.Nullable()
    java.lang.String redisPassword, @org.jetbrains.annotations.Nullable()
    java.lang.String directory) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.DataStoreType getDataStoreMethod() {
        return null;
    }
}
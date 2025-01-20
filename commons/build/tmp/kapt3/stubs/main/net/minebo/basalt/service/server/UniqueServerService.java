package net.minebo.basalt.service.server;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\u001bJ\u000e\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0007J\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u0007J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u00072\u0006\u0010 \u001a\u00020\u0006R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u0011X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006!"}, d2 = {"Lnet/minebo/basalt/service/server/UniqueServerService;", "Lnet/minebo/basalt/service/GeneralizedService;", "<init>", "()V", "handler", "Lio/github/nosequel/data/store/StoreType;", "", "Lnet/minebo/basalt/models/server/UniqueServer;", "getHandler", "()Lio/github/nosequel/data/store/StoreType;", "setHandler", "(Lio/github/nosequel/data/store/StoreType;)V", "servers", "Ljava/util/concurrent/ConcurrentHashMap;", "getServers", "()Ljava/util/concurrent/ConcurrentHashMap;", "jsonFile", "Ljava/io/File;", "getJsonFile", "()Ljava/io/File;", "setJsonFile", "(Ljava/io/File;)V", "type", "Ljava/lang/reflect/Type;", "loadAll", "", "getValues", "", "save", "server", "updateGlobalServer", "byId", "id", "commons"})
public final class UniqueServerService implements net.minebo.basalt.service.GeneralizedService {
    @org.jetbrains.annotations.NotNull()
    private static io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.server.UniqueServer> handler;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, net.minebo.basalt.models.server.UniqueServer> servers = null;
    public static java.io.File jsonFile;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.reflect.Type type = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.service.server.UniqueServerService INSTANCE = null;
    
    private UniqueServerService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.server.UniqueServer> getHandler() {
        return null;
    }
    
    public final void setHandler(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.server.UniqueServer> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, net.minebo.basalt.models.server.UniqueServer> getServers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getJsonFile() {
        return null;
    }
    
    public final void setJsonFile(@org.jetbrains.annotations.NotNull()
    java.io.File p0) {
    }
    
    public final void loadAll() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<net.minebo.basalt.models.server.UniqueServer> getValues() {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.server.UniqueServer server) {
    }
    
    public final void updateGlobalServer(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.server.UniqueServer server) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.server.UniqueServer byId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
}
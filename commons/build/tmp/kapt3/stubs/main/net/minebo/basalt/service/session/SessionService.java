package net.minebo.basalt.service.session;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0007J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cR&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R,\u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0011\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00120\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006\u001d"}, d2 = {"Lnet/minebo/basalt/service/session/SessionService;", "Lnet/minebo/basalt/service/GeneralizedService;", "<init>", "()V", "handler", "Lio/github/nosequel/data/store/StoreType;", "", "Lnet/minebo/basalt/models/sessions/Session;", "getHandler", "()Lio/github/nosequel/data/store/StoreType;", "setHandler", "(Lio/github/nosequel/data/store/StoreType;)V", "rawCollection", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/UUID;", "", "getCache", "()Ljava/util/concurrent/ConcurrentHashMap;", "setCache", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "save", "", "session", "loadIntoCache", "profile", "Lnet/minebo/basalt/models/profile/GameProfile;", "commons"})
public final class SessionService implements net.minebo.basalt.service.GeneralizedService {
    @org.jetbrains.annotations.NotNull()
    private static io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.sessions.Session> handler;
    @org.jetbrains.annotations.NotNull()
    private static final com.mongodb.client.MongoCollection<org.bson.Document> rawCollection = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.concurrent.ConcurrentHashMap<java.util.UUID, java.util.List<net.minebo.basalt.models.sessions.Session>> cache;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.service.session.SessionService INSTANCE = null;
    
    private SessionService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.sessions.Session> getHandler() {
        return null;
    }
    
    public final void setHandler(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.sessions.Session> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.util.UUID, java.util.List<net.minebo.basalt.models.sessions.Session>> getCache() {
        return null;
    }
    
    public final void setCache(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.util.UUID, java.util.List<net.minebo.basalt.models.sessions.Session>> p0) {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.sessions.Session session) {
    }
    
    public final void loadIntoCache(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile profile) {
    }
}
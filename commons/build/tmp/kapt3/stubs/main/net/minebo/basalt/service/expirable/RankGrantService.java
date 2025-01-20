package net.minebo.basalt.service.expirable;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001e0\u001dJ\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u00132\u0006\u0010 \u001a\u00020\u0007J\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u001d2\u0006\u0010\"\u001a\u00020#J\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e2\u0006\u0010%\u001a\u00020\u0007J\u000e\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\u000e\u0010*\u001a\u00020'2\u0006\u0010(\u001a\u00020)J\u000e\u0010+\u001a\u00020'2\u0006\u0010(\u001a\u00020\u0007J\u000e\u0010,\u001a\u00020'2\u0006\u0010-\u001a\u00020\u0002J\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010/\u001a\u00020\u0002J\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d2\u0006\u0010/\u001a\u00020\u0002J\u001a\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u001d2\u0006\u00102\u001a\u00020\u0007J\b\u00103\u001a\u00020'H\u0016R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R,\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b\u00a8\u00064"}, d2 = {"Lnet/minebo/basalt/service/expirable/RankGrantService;", "Lnet/minebo/basalt/service/expirable/ExpiringService;", "Lnet/minebo/basalt/models/grant/types/RankGrant;", "<init>", "()V", "handler", "Lio/github/nosequel/data/store/StoreType;", "Ljava/util/UUID;", "getHandler", "()Lio/github/nosequel/data/store/StoreType;", "setHandler", "(Lio/github/nosequel/data/store/StoreType;)V", "collection", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "getCollection", "()Lcom/mongodb/client/MongoCollection;", "playerGrants", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getPlayerGrants", "()Ljava/util/concurrent/ConcurrentHashMap;", "setPlayerGrants", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "global", "Lnet/minebo/basalt/models/grant/types/scope/GrantScope;", "getGlobal", "()Lnet/minebo/basalt/models/grant/types/scope/GrantScope;", "getValues", "Ljava/util/concurrent/CompletableFuture;", "", "findExecutedBy", "executor", "findByRank", "id", "", "getFromCache", "uuid", "recalculatePlayer", "", "gameProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "recalculatePlayerSync", "recalculateUUID", "remove", "grant", "save", "rankGrant", "saveSync", "findByTarget", "target", "clearOutModels", "commons"})
public final class RankGrantService extends net.minebo.basalt.service.expirable.ExpiringService<net.minebo.basalt.models.grant.types.RankGrant> {
    @org.jetbrains.annotations.NotNull()
    private static io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.grant.types.RankGrant> handler;
    @org.jetbrains.annotations.NotNull()
    private static final com.mongodb.client.MongoCollection<org.bson.Document> collection = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.concurrent.ConcurrentHashMap<java.util.UUID, java.util.List<net.minebo.basalt.models.grant.types.RankGrant>> playerGrants;
    @org.jetbrains.annotations.NotNull()
    private static final net.minebo.basalt.models.grant.types.scope.GrantScope global = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.service.expirable.RankGrantService INSTANCE = null;
    
    private RankGrantService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.grant.types.RankGrant> getHandler() {
        return null;
    }
    
    public final void setHandler(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.grant.types.RankGrant> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.MongoCollection<org.bson.Document> getCollection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.util.UUID, java.util.List<net.minebo.basalt.models.grant.types.RankGrant>> getPlayerGrants() {
        return null;
    }
    
    public final void setPlayerGrants(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.util.UUID, java.util.List<net.minebo.basalt.models.grant.types.RankGrant>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.grant.types.scope.GrantScope getGlobal() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.Collection<net.minebo.basalt.models.grant.types.RankGrant>> getValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.models.grant.types.RankGrant> findExecutedBy(@org.jetbrains.annotations.NotNull()
    java.util.UUID executor) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.List<net.minebo.basalt.models.grant.types.RankGrant>> findByRank(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<net.minebo.basalt.models.grant.types.RankGrant> getFromCache(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    public final void recalculatePlayer(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile) {
    }
    
    public final void recalculatePlayerSync(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile) {
    }
    
    public final void recalculateUUID(@org.jetbrains.annotations.NotNull()
    java.util.UUID gameProfile) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.RankGrant grant) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<net.minebo.basalt.models.grant.types.RankGrant> save(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.RankGrant rankGrant) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<net.minebo.basalt.models.grant.types.RankGrant> saveSync(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.RankGrant rankGrant) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.List<net.minebo.basalt.models.grant.types.RankGrant>> findByTarget(@org.jetbrains.annotations.NotNull()
    java.util.UUID target) {
        return null;
    }
    
    @java.lang.Override()
    public void clearOutModels() {
    }
}
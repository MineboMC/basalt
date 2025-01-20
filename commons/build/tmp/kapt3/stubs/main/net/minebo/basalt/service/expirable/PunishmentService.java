package net.minebo.basalt.service.expirable;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u001a0\u0019J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0002J\u000e\u0010\u001e\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0002J\u0014\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001a2\u0006\u0010 \u001a\u00020\u0007J\u000e\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#J\u000e\u0010$\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#J\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\u0007J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00020(2\u0006\u0010)\u001a\u00020\u0007J\u0010\u0010*\u001a\u0004\u0018\u00010\u00022\u0006\u0010+\u001a\u00020,J\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u00192\u0006\u0010.\u001a\u00020\u0007J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00020(2\u0006\u00100\u001a\u000201J\u0014\u00102\u001a\b\u0012\u0004\u0012\u00020\u00020(2\u0006\u00103\u001a\u000204J\b\u00105\u001a\u00020\u001cH\u0016R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R,\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00130\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u00066"}, d2 = {"Lnet/minebo/basalt/service/expirable/PunishmentService;", "Lnet/minebo/basalt/service/expirable/ExpiringService;", "Lnet/minebo/basalt/models/grant/types/Punishment;", "<init>", "()V", "handler", "Lio/github/nosequel/data/store/StoreType;", "Ljava/util/UUID;", "getHandler", "()Lio/github/nosequel/data/store/StoreType;", "setHandler", "(Lio/github/nosequel/data/store/StoreType;)V", "collection", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "getCollection", "()Lcom/mongodb/client/MongoCollection;", "grants", "Ljava/util/concurrent/ConcurrentHashMap;", "", "getGrants", "()Ljava/util/concurrent/ConcurrentHashMap;", "setGrants", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "getValues", "Ljava/util/concurrent/CompletableFuture;", "", "save", "", "punishment", "saveSync", "getFromCache", "uuid", "recalculatePlayer", "gameProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "recalculatePlayerSync", "recalculateUUID", "playerId", "findExecutorPunishments", "", "executor", "searchFromId", "punishmentId", "", "findByTarget", "target", "sortByActorType", "actorType", "Lnet/minebo/basalt/punishments/actor/ActorType;", "sortByPunishmentType", "punishmentType", "Lnet/minebo/basalt/punishments/PunishmentType;", "clearOutModels", "commons"})
public final class PunishmentService extends net.minebo.basalt.service.expirable.ExpiringService<net.minebo.basalt.models.grant.types.Punishment> {
    @org.jetbrains.annotations.NotNull()
    private static io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.grant.types.Punishment> handler;
    @org.jetbrains.annotations.NotNull()
    private static final com.mongodb.client.MongoCollection<org.bson.Document> collection = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.concurrent.ConcurrentHashMap<java.util.UUID, java.util.List<net.minebo.basalt.models.grant.types.Punishment>> grants;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.service.expirable.PunishmentService INSTANCE = null;
    
    private PunishmentService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.grant.types.Punishment> getHandler() {
        return null;
    }
    
    public final void setHandler(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.grant.types.Punishment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.MongoCollection<org.bson.Document> getCollection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.util.UUID, java.util.List<net.minebo.basalt.models.grant.types.Punishment>> getGrants() {
        return null;
    }
    
    public final void setGrants(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.util.UUID, java.util.List<net.minebo.basalt.models.grant.types.Punishment>> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.Collection<net.minebo.basalt.models.grant.types.Punishment>> getValues() {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.Punishment punishment) {
    }
    
    public final void saveSync(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.Punishment punishment) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<net.minebo.basalt.models.grant.types.Punishment> getFromCache(@org.jetbrains.annotations.NotNull()
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
    java.util.UUID playerId) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.models.grant.types.Punishment> findExecutorPunishments(@org.jetbrains.annotations.NotNull()
    java.util.UUID executor) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.grant.types.Punishment searchFromId(@org.jetbrains.annotations.NotNull()
    java.lang.String punishmentId) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.List<net.minebo.basalt.models.grant.types.Punishment>> findByTarget(@org.jetbrains.annotations.NotNull()
    java.util.UUID target) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.models.grant.types.Punishment> sortByActorType(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.actor.ActorType actorType) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.models.grant.types.Punishment> sortByPunishmentType(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.PunishmentType punishmentType) {
        return null;
    }
    
    @java.lang.Override()
    public void clearOutModels() {
    }
}
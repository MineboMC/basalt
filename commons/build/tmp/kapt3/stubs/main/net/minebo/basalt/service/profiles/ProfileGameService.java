package net.minebo.basalt.service.profiles;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0017\u001a\u00020\u0018J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u001b\u001a\u00020\u0006J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u0006J\u001a\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070!0 2\u0006\u0010\"\u001a\u00020#J\u001a\u0010$\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070%0 2\u0006\u0010&\u001a\u00020\u0007J\u0014\u0010'\u001a\b\u0012\u0004\u0012\u00020(0 2\u0006\u0010)\u001a\u00020\u0007J\u000e\u0010*\u001a\u00020\u00182\u0006\u0010)\u001a\u00020\u0007J\u0016\u0010+\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u00062\u0006\u0010,\u001a\u00020#R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006-"}, d2 = {"Lnet/minebo/basalt/service/profiles/ProfileGameService;", "Lnet/minebo/basalt/service/GeneralizedService;", "<init>", "()V", "handler", "Lio/github/nosequel/data/store/StoreType;", "Ljava/util/UUID;", "Lnet/minebo/basalt/models/profile/GameProfile;", "getHandler", "()Lio/github/nosequel/data/store/StoreType;", "setHandler", "(Lio/github/nosequel/data/store/StoreType;)V", "collection", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "getCollection", "()Lcom/mongodb/client/MongoCollection;", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "getCache", "()Ljava/util/concurrent/ConcurrentHashMap;", "setCache", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "loadIndexes", "", "getHighestGrant", "Lnet/minebo/basalt/models/grant/types/RankGrant;", "uuid", "byId", "getHighestRank", "Lnet/minebo/basalt/models/ranks/Rank;", "byUsernameWithList", "Ljava/util/concurrent/CompletableFuture;", "", "name", "", "getAllOutgoingFriendRequests", "", "prof", "save", "Ljava/lang/Void;", "gameProfile", "saveSync", "loadProfile", "username", "commons"})
public final class ProfileGameService implements net.minebo.basalt.service.GeneralizedService {
    @org.jetbrains.annotations.NotNull()
    private static io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.profile.GameProfile> handler;
    @org.jetbrains.annotations.NotNull()
    private static final com.mongodb.client.MongoCollection<org.bson.Document> collection = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.concurrent.ConcurrentHashMap<java.util.UUID, net.minebo.basalt.models.profile.GameProfile> cache;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.service.profiles.ProfileGameService INSTANCE = null;
    
    private ProfileGameService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.profile.GameProfile> getHandler() {
        return null;
    }
    
    public final void setHandler(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.profile.GameProfile> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.MongoCollection<org.bson.Document> getCollection() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.util.UUID, net.minebo.basalt.models.profile.GameProfile> getCache() {
        return null;
    }
    
    public final void setCache(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.util.UUID, net.minebo.basalt.models.profile.GameProfile> p0) {
    }
    
    public final void loadIndexes() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.grant.types.RankGrant getHighestGrant(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.profile.GameProfile byId(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.ranks.Rank getHighestRank(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.List<net.minebo.basalt.models.profile.GameProfile>> byUsernameWithList(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.List<net.minebo.basalt.models.profile.GameProfile>> getAllOutgoingFriendRequests(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile prof) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> save(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile) {
        return null;
    }
    
    public final void saveSync(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.profile.GameProfile loadProfile(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid, @org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
}
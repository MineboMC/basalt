package net.minebo.basalt.service.ranks;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010%\u001a\u00020&J\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(2\u0006\u0010+\u001a\u00020\u0007J\u0012\u0010,\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070)0(J\u0014\u0010-\u001a\b\u0012\u0004\u0012\u00020.0(2\u0006\u0010+\u001a\u00020\u0007J\u0014\u0010/\u001a\b\u0012\u0004\u0012\u00020.0(2\u0006\u0010+\u001a\u00020\u0007J\f\u00100\u001a\b\u0012\u0004\u0012\u00020\u00070)J\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00070)J\b\u00102\u001a\u0004\u0018\u00010\u0007J\u0010\u00103\u001a\u0004\u0018\u00010\u00072\u0006\u00104\u001a\u00020\u0006J\u0010\u00105\u001a\u0004\u0018\u00010\u00072\u0006\u00104\u001a\u00020\u0006R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u00066"}, d2 = {"Lnet/minebo/basalt/service/ranks/RankService;", "Lnet/minebo/basalt/service/GeneralizedService;", "<init>", "()V", "handler", "Lio/github/nosequel/data/store/StoreType;", "", "Lnet/minebo/basalt/models/ranks/Rank;", "getHandler", "()Lio/github/nosequel/data/store/StoreType;", "setHandler", "(Lio/github/nosequel/data/store/StoreType;)V", "ranks", "Ljava/util/concurrent/ConcurrentHashMap;", "getRanks", "()Ljava/util/concurrent/ConcurrentHashMap;", "setRanks", "(Ljava/util/concurrent/ConcurrentHashMap;)V", "jsonFile", "Ljava/io/File;", "getJsonFile", "()Ljava/io/File;", "setJsonFile", "(Ljava/io/File;)V", "type", "Ljava/lang/reflect/Type;", "FALLBACK_RANK", "getFALLBACK_RANK", "()Lnet/minebo/basalt/models/ranks/Rank;", "setFALLBACK_RANK", "(Lnet/minebo/basalt/models/ranks/Rank;)V", "FALLBACK_GRANT", "Lnet/minebo/basalt/models/grant/types/RankGrant;", "getFALLBACK_GRANT", "()Lnet/minebo/basalt/models/grant/types/RankGrant;", "setFALLBACK_GRANT", "(Lnet/minebo/basalt/models/grant/types/RankGrant;)V", "loadRanks", "", "scanRank", "Ljava/util/concurrent/CompletableFuture;", "", "Lnet/minebo/basalt/models/profile/GameProfile;", "rank", "getValues", "save", "Ljava/lang/Void;", "delete", "getAllRanksInOrder", "getRanksInOrder", "findFirstAvailableDefaultRank", "byId", "id", "byIdAnyCase", "commons"})
public final class RankService implements net.minebo.basalt.service.GeneralizedService {
    @org.jetbrains.annotations.NotNull()
    private static io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.ranks.Rank> handler;
    @org.jetbrains.annotations.NotNull()
    private static java.util.concurrent.ConcurrentHashMap<java.lang.String, net.minebo.basalt.models.ranks.Rank> ranks;
    public static java.io.File jsonFile;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.reflect.Type type = null;
    @org.jetbrains.annotations.NotNull()
    private static net.minebo.basalt.models.ranks.Rank FALLBACK_RANK;
    @org.jetbrains.annotations.NotNull()
    private static net.minebo.basalt.models.grant.types.RankGrant FALLBACK_GRANT;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.service.ranks.RankService INSTANCE = null;
    
    private RankService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.ranks.Rank> getHandler() {
        return null;
    }
    
    public final void setHandler(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.ranks.Rank> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, net.minebo.basalt.models.ranks.Rank> getRanks() {
        return null;
    }
    
    public final void setRanks(@org.jetbrains.annotations.NotNull()
    java.util.concurrent.ConcurrentHashMap<java.lang.String, net.minebo.basalt.models.ranks.Rank> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getJsonFile() {
        return null;
    }
    
    public final void setJsonFile(@org.jetbrains.annotations.NotNull()
    java.io.File p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.ranks.Rank getFALLBACK_RANK() {
        return null;
    }
    
    public final void setFALLBACK_RANK(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.grant.types.RankGrant getFALLBACK_GRANT() {
        return null;
    }
    
    public final void setFALLBACK_GRANT(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.RankGrant p0) {
    }
    
    public final void loadRanks() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.Collection<net.minebo.basalt.models.profile.GameProfile>> scanRank(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.Collection<net.minebo.basalt.models.ranks.Rank>> getValues() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> save(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> delete(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<net.minebo.basalt.models.ranks.Rank> getAllRanksInOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Collection<net.minebo.basalt.models.ranks.Rank> getRanksInOrder() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.ranks.Rank findFirstAvailableDefaultRank() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.ranks.Rank byId(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.ranks.Rank byIdAnyCase(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
}
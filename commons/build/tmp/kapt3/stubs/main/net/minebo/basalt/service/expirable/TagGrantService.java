package net.minebo.basalt.service.expirable;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000e0\rJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0016R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lnet/minebo/basalt/service/expirable/TagGrantService;", "Lnet/minebo/basalt/service/expirable/ExpiringService;", "Lnet/minebo/basalt/models/grant/types/TagGrant;", "<init>", "()V", "handler", "Lio/github/nosequel/data/store/StoreType;", "Ljava/util/UUID;", "getHandler", "()Lio/github/nosequel/data/store/StoreType;", "setHandler", "(Lio/github/nosequel/data/store/StoreType;)V", "getValues", "Ljava/util/concurrent/CompletableFuture;", "", "save", "", "tagGrant", "clearOutModels", "commons"})
public final class TagGrantService extends net.minebo.basalt.service.expirable.ExpiringService<net.minebo.basalt.models.grant.types.TagGrant> {
    @org.jetbrains.annotations.NotNull()
    private static io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.grant.types.TagGrant> handler;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.service.expirable.TagGrantService INSTANCE = null;
    
    private TagGrantService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.grant.types.TagGrant> getHandler() {
        return null;
    }
    
    public final void setHandler(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.grant.types.TagGrant> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.Collection<net.minebo.basalt.models.grant.types.TagGrant>> getValues() {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.TagGrant tagGrant) {
    }
    
    @java.lang.Override()
    public void clearOutModels() {
    }
}
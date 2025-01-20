package net.minebo.basalt.service.website;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0016"}, d2 = {"Lnet/minebo/basalt/service/website/WebProfileService;", "Lnet/minebo/basalt/service/GeneralizedService;", "<init>", "()V", "handler", "Lio/github/nosequel/data/store/StoreType;", "Ljava/util/UUID;", "Lnet/minebo/basalt/models/website/BasaltUser;", "getHandler", "()Lio/github/nosequel/data/store/StoreType;", "setHandler", "(Lio/github/nosequel/data/store/StoreType;)V", "collection", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "getCollection", "()Lcom/mongodb/client/MongoCollection;", "byId", "uuid", "save", "", "user", "commons"})
public final class WebProfileService implements net.minebo.basalt.service.GeneralizedService {
    @org.jetbrains.annotations.NotNull()
    private static io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.website.BasaltUser> handler;
    @org.jetbrains.annotations.NotNull()
    private static final com.mongodb.client.MongoCollection<org.bson.Document> collection = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.service.website.WebProfileService INSTANCE = null;
    
    private WebProfileService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.website.BasaltUser> getHandler() {
        return null;
    }
    
    public final void setHandler(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.website.BasaltUser> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.MongoCollection<org.bson.Document> getCollection() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.website.BasaltUser byId(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.website.BasaltUser user) {
    }
}
package net.minebo.basalt.service.vouchers;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u001bJ\u0010\u0010\u001d\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\fJ\u000e\u0010\u001f\u001a\u00020\u001b2\u0006\u0010 \u001a\u00020\rJ\u0016\u0010!\u001a\u00020\u001b2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\bJ\u0014\u0010$\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010%\u001a\u00020\u0006R#\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\nR\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006&"}, d2 = {"Lnet/minebo/basalt/service/vouchers/VoucherService;", "Lnet/minebo/basalt/service/GeneralizedService;", "<init>", "()V", "voucherGrants", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/UUID;", "", "Lnet/minebo/basalt/models/vouchers/VoucherGrant;", "getVoucherGrants", "()Ljava/util/concurrent/ConcurrentHashMap;", "voucherTemplates", "", "Lnet/minebo/basalt/models/vouchers/VoucherTemplate;", "getVoucherTemplates", "handler", "Lio/github/nosequel/data/store/StoreType;", "getHandler", "()Lio/github/nosequel/data/store/StoreType;", "handlerTemplates", "getHandlerTemplates", "collection", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "getCollection", "()Lcom/mongodb/client/MongoCollection;", "loadVoucherGrants", "", "loadVoucherTemplates", "findVoucherTemplate", "id", "insertTemplate", "voucherTemplate", "insertGrant", "target", "newVoucher", "allGrantsFromPlayer", "player", "commons"})
public final class VoucherService implements net.minebo.basalt.service.GeneralizedService {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.ConcurrentHashMap<java.util.UUID, java.util.List<net.minebo.basalt.models.vouchers.VoucherGrant>> voucherGrants = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.concurrent.ConcurrentHashMap<java.lang.String, net.minebo.basalt.models.vouchers.VoucherTemplate> voucherTemplates = null;
    @org.jetbrains.annotations.NotNull()
    private static final io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.vouchers.VoucherGrant> handler = null;
    @org.jetbrains.annotations.NotNull()
    private static final io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.vouchers.VoucherTemplate> handlerTemplates = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.mongodb.client.MongoCollection<org.bson.Document> collection = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.service.vouchers.VoucherService INSTANCE = null;
    
    private VoucherService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.util.UUID, java.util.List<net.minebo.basalt.models.vouchers.VoucherGrant>> getVoucherGrants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.ConcurrentHashMap<java.lang.String, net.minebo.basalt.models.vouchers.VoucherTemplate> getVoucherTemplates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.vouchers.VoucherGrant> getHandler() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.lang.String, net.minebo.basalt.models.vouchers.VoucherTemplate> getHandlerTemplates() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.MongoCollection<org.bson.Document> getCollection() {
        return null;
    }
    
    public final void loadVoucherGrants() {
    }
    
    public final void loadVoucherTemplates() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.vouchers.VoucherTemplate findVoucherTemplate(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public final void insertTemplate(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.vouchers.VoucherTemplate voucherTemplate) {
    }
    
    public final void insertGrant(@org.jetbrains.annotations.NotNull()
    java.util.UUID target, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.vouchers.VoucherGrant newVoucher) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.models.vouchers.VoucherGrant> allGrantsFromPlayer(@org.jetbrains.annotations.NotNull()
    java.util.UUID player) {
        return null;
    }
}
package net.minebo.basalt.service.party;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0010\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00112\u0006\u0010\u0012\u001a\u00020\u0006R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0013"}, d2 = {"Lnet/minebo/basalt/service/party/PartyService;", "Lnet/minebo/basalt/service/GeneralizedService;", "<init>", "()V", "handler", "Lio/github/nosequel/data/store/StoreType;", "Ljava/util/UUID;", "Lnet/minebo/basalt/models/party/Party;", "getHandler", "()Lio/github/nosequel/data/store/StoreType;", "setHandler", "(Lio/github/nosequel/data/store/StoreType;)V", "backingPartyCache", "", "getBackingPartyCache", "()Ljava/util/Map;", "getParty", "Ljava/util/concurrent/CompletableFuture;", "uuid", "commons"})
public final class PartyService implements net.minebo.basalt.service.GeneralizedService {
    @org.jetbrains.annotations.NotNull()
    private static io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.party.Party> handler;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.util.UUID, net.minebo.basalt.models.party.Party> backingPartyCache = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.service.party.PartyService INSTANCE = null;
    
    private PartyService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.party.Party> getHandler() {
        return null;
    }
    
    public final void setHandler(@org.jetbrains.annotations.NotNull()
    io.github.nosequel.data.store.StoreType<java.util.UUID, net.minebo.basalt.models.party.Party> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, net.minebo.basalt.models.party.Party> getBackingPartyCache() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<net.minebo.basalt.models.party.Party> getParty(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
}
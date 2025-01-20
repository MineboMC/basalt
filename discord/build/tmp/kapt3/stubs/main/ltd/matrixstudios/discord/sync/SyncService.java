package ltd.matrixstudios.discord.sync;

/**
 * Class created on 2/14/2024
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\b2\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lltd/matrixstudios/discord/sync/SyncService;", "", "<init>", "()V", "collection", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "getSyncCodeForUser", "Ljava/util/concurrent/CompletableFuture;", "", "username", "discord"})
public final class SyncService {
    @org.jetbrains.annotations.NotNull()
    private static final com.mongodb.client.MongoCollection<org.bson.Document> collection = null;
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.discord.sync.SyncService INSTANCE = null;
    
    private SyncService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.String> getSyncCodeForUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username) {
        return null;
    }
}
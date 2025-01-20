package net.minebo.basalt.tasks;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\b\u001a\u00020\tH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/tasks/ClearOutExpirablesTask;", "Lorg/bukkit/scheduler/BukkitRunnable;", "<init>", "()V", "rankGrantCollection", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "punishmentCollection", "run", "", "spigot"})
public final class ClearOutExpirablesTask extends org.bukkit.scheduler.BukkitRunnable {
    @org.jetbrains.annotations.NotNull()
    private static final com.mongodb.client.MongoCollection<org.bson.Document> rankGrantCollection = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.mongodb.client.MongoCollection<org.bson.Document> punishmentCollection = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.tasks.ClearOutExpirablesTask INSTANCE = null;
    
    private ClearOutExpirablesTask() {
        super();
    }
    
    @java.lang.Override()
    public void run() {
    }
}
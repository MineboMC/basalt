package net.minebo.basalt.filter.packet;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\b\u0010%\u001a\u00020&H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$\u00a8\u0006'"}, d2 = {"Lnet/minebo/basalt/filter/packet/FilterBroadcastWithTooltipPacket;", "Lnet/minebo/basalt/redis/RedisPacket;", "uniqueServer", "Lnet/minebo/basalt/models/server/UniqueServer;", "target", "Ljava/util/UUID;", "mutes", "", "bans", "alreadyPunished", "", "message", "", "<init>", "(Lnet/minebo/basalt/models/server/UniqueServer;Ljava/util/UUID;IIZLjava/lang/String;)V", "getUniqueServer", "()Lnet/minebo/basalt/models/server/UniqueServer;", "setUniqueServer", "(Lnet/minebo/basalt/models/server/UniqueServer;)V", "getTarget", "()Ljava/util/UUID;", "setTarget", "(Ljava/util/UUID;)V", "getMutes", "()I", "setMutes", "(I)V", "getBans", "setBans", "getAlreadyPunished", "()Z", "setAlreadyPunished", "(Z)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "action", "", "spigot"})
public final class FilterBroadcastWithTooltipPacket extends net.minebo.basalt.redis.RedisPacket {
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.models.server.UniqueServer uniqueServer;
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID target;
    private int mutes;
    private int bans;
    private boolean alreadyPunished;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String message;
    
    public FilterBroadcastWithTooltipPacket(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.server.UniqueServer uniqueServer, @org.jetbrains.annotations.NotNull()
    java.util.UUID target, int mutes, int bans, boolean alreadyPunished, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.server.UniqueServer getUniqueServer() {
        return null;
    }
    
    public final void setUniqueServer(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.server.UniqueServer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getTarget() {
        return null;
    }
    
    public final void setTarget(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    public final int getMutes() {
        return 0;
    }
    
    public final void setMutes(int p0) {
    }
    
    public final int getBans() {
        return 0;
    }
    
    public final void setBans(int p0) {
    }
    
    public final boolean getAlreadyPunished() {
        return false;
    }
    
    public final void setAlreadyPunished(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void action() {
    }
}
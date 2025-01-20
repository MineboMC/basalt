package net.minebo.basalt.models.sessions;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\b\u00a2\u0006\u0004\b\f\u0010\rJ\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\u0015\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007H\u00c6\u0003J\t\u0010#\u001a\u00020\bH\u00c6\u0003J\t\u0010$\u001a\u00020\bH\u00c6\u0003JG\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u00072\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\bH\u00c6\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010)\u001a\u00020*H\u00d6\u0001J\t\u0010+\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R&\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\n\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u000b\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001d\u00a8\u0006,"}, d2 = {"Lnet/minebo/basalt/models/sessions/Session;", "", "randomId", "", "player", "Ljava/util/UUID;", "serversJoined", "", "", "Lnet/minebo/basalt/models/server/UniqueServer;", "loggedInAt", "leftAt", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/Map;JJ)V", "getRandomId", "()Ljava/lang/String;", "setRandomId", "(Ljava/lang/String;)V", "getPlayer", "()Ljava/util/UUID;", "setPlayer", "(Ljava/util/UUID;)V", "getServersJoined", "()Ljava/util/Map;", "setServersJoined", "(Ljava/util/Map;)V", "getLoggedInAt", "()J", "setLoggedInAt", "(J)V", "getLeftAt", "setLeftAt", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "commons"})
public final class Session {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String randomId;
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID player;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.lang.Long, net.minebo.basalt.models.server.UniqueServer> serversJoined;
    private long loggedInAt;
    private long leftAt;
    
    public Session(@org.jetbrains.annotations.NotNull()
    java.lang.String randomId, @org.jetbrains.annotations.NotNull()
    java.util.UUID player, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Long, net.minebo.basalt.models.server.UniqueServer> serversJoined, long loggedInAt, long leftAt) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRandomId() {
        return null;
    }
    
    public final void setRandomId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getPlayer() {
        return null;
    }
    
    public final void setPlayer(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Long, net.minebo.basalt.models.server.UniqueServer> getServersJoined() {
        return null;
    }
    
    public final void setServersJoined(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Long, net.minebo.basalt.models.server.UniqueServer> p0) {
    }
    
    public final long getLoggedInAt() {
        return 0L;
    }
    
    public final void setLoggedInAt(long p0) {
    }
    
    public final long getLeftAt() {
        return 0L;
    }
    
    public final void setLeftAt(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Long, net.minebo.basalt.models.server.UniqueServer> component3() {
        return null;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final long component5() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.sessions.Session copy(@org.jetbrains.annotations.NotNull()
    java.lang.String randomId, @org.jetbrains.annotations.NotNull()
    java.util.UUID player, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Long, net.minebo.basalt.models.server.UniqueServer> serversJoined, long loggedInAt, long leftAt) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}
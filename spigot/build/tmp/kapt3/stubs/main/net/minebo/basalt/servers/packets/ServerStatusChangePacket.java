package net.minebo.basalt.servers.packets;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lnet/minebo/basalt/servers/packets/ServerStatusChangePacket;", "Lnet/minebo/basalt/redis/RedisPacket;", "message", "", "server", "Lnet/minebo/basalt/models/server/UniqueServer;", "<init>", "(Ljava/lang/String;Lnet/minebo/basalt/models/server/UniqueServer;)V", "getMessage", "()Ljava/lang/String;", "setMessage", "(Ljava/lang/String;)V", "getServer", "()Lnet/minebo/basalt/models/server/UniqueServer;", "setServer", "(Lnet/minebo/basalt/models/server/UniqueServer;)V", "action", "", "spigot"})
public final class ServerStatusChangePacket extends net.minebo.basalt.redis.RedisPacket {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String message;
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.models.server.UniqueServer server;
    
    public ServerStatusChangePacket(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.server.UniqueServer server) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    public final void setMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.server.UniqueServer getServer() {
        return null;
    }
    
    public final void setServer(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.server.UniqueServer p0) {
    }
    
    @java.lang.Override()
    public void action() {
    }
}
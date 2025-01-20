package net.minebo.basalt.models.server.software;

/**
 * Class created on 7/29/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e\u00a8\u0006\u000f"}, d2 = {"Lnet/minebo/basalt/models/server/software/ServerSoftware;", "", "serverVersion", "", "plugins", "", "Lnet/minebo/basalt/models/server/software/ServerPlugin;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getServerVersion", "()Ljava/lang/String;", "setServerVersion", "(Ljava/lang/String;)V", "getPlugins", "()Ljava/util/List;", "commons"})
public final class ServerSoftware {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String serverVersion;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<net.minebo.basalt.models.server.software.ServerPlugin> plugins = null;
    
    public ServerSoftware(@org.jetbrains.annotations.NotNull()
    java.lang.String serverVersion, @org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.models.server.software.ServerPlugin> plugins) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getServerVersion() {
        return null;
    }
    
    public final void setServerVersion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.models.server.software.ServerPlugin> getPlugins() {
        return null;
    }
}
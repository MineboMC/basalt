package net.minebo.basalt.servers;

/**
 * Class created on 7/21/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bJ\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0016J\b\u0010\f\u001a\u00020\rH\u0016\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/servers/ServerModule;", "Lnet/minebo/basalt/module/PluginModule;", "<init>", "()V", "onLoad", "", "setupPluginSoftware", "server", "Lnet/minebo/basalt/models/server/UniqueServer;", "getCommands", "", "Lco/aikar/commands/BaseCommand;", "getModularConfigOption", "", "spigot"})
public final class ServerModule implements net.minebo.basalt.module.PluginModule {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.servers.ServerModule INSTANCE = null;
    
    private ServerModule() {
        super();
    }
    
    @java.lang.Override()
    public void onLoad() {
    }
    
    public final void setupPluginSoftware(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.server.UniqueServer server) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<co.aikar.commands.BaseCommand> getCommands() {
        return null;
    }
    
    @java.lang.Override()
    public boolean getModularConfigOption() {
        return false;
    }
}
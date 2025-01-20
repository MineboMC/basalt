package net.minebo.basalt.listeners;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0007\u00a8\u0006\u000f"}, d2 = {"Lnet/minebo/basalt/listeners/BungeeListener;", "Lnet/md_5/bungee/api/plugin/Listener;", "<init>", "()V", "switch", "", "event", "Lnet/md_5/bungee/api/event/ServerSwitchEvent;", "handlePermissions", "Lnet/md_5/bungee/api/event/ServerConnectEvent;", "login", "Lnet/md_5/bungee/api/event/LoginEvent;", "dc", "Lnet/md_5/bungee/api/event/PlayerDisconnectEvent;", "checkClearance", "bungee"})
public final class BungeeListener implements net.md_5.bungee.api.plugin.Listener {
    
    public BungeeListener() {
        super();
    }
    
    @net.md_5.bungee.event.EventHandler()
    public final void handlePermissions(@org.jetbrains.annotations.NotNull()
    net.md_5.bungee.api.event.ServerConnectEvent event) {
    }
    
    @net.md_5.bungee.event.EventHandler()
    public final void login(@org.jetbrains.annotations.NotNull()
    net.md_5.bungee.api.event.LoginEvent event) {
    }
    
    @net.md_5.bungee.event.EventHandler()
    public final void dc(@org.jetbrains.annotations.NotNull()
    net.md_5.bungee.api.event.PlayerDisconnectEvent event) {
    }
    
    @net.md_5.bungee.event.EventHandler()
    public final void checkClearance(@org.jetbrains.annotations.NotNull()
    net.md_5.bungee.api.event.ServerConnectEvent event) {
    }
}
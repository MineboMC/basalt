package net.minebo.basalt.network.listener;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/network/listener/NetworkJoinAndLeaveListener;", "Lorg/bukkit/event/Listener;", "<init>", "()V", "disconnect", "", "e", "Lorg/bukkit/event/player/PlayerQuitEvent;", "asyncJoin", "Lorg/bukkit/event/player/AsyncPlayerPreLoginEvent;", "spigot"})
public final class NetworkJoinAndLeaveListener implements org.bukkit.event.Listener {
    
    public NetworkJoinAndLeaveListener() {
        super();
    }
    
    @org.bukkit.event.EventHandler()
    public final void disconnect(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.player.PlayerQuitEvent e) {
    }
    
    @org.bukkit.event.EventHandler()
    public final void asyncJoin(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.player.AsyncPlayerPreLoginEvent e) {
    }
}
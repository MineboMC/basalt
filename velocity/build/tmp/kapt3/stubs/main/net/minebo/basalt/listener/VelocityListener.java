package net.minebo.basalt.listener;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u000e\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0010\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0018\u0010\u0012\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000bH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lnet/minebo/basalt/listener/VelocityListener;", "", "plugin", "Lnet/minebo/basalt/BasaltVelocity;", "<init>", "(Lnet/minebo/basalt/BasaltVelocity;)V", "onSwitch", "", "event", "Lcom/velocitypowered/api/event/player/ServerConnectedEvent;", "continuation", "Lcom/velocitypowered/api/event/Continuation;", "setupPermissions", "Lcom/velocitypowered/api/event/permission/PermissionsSetupEvent;", "login", "Lcom/velocitypowered/api/event/connection/PostLoginEvent;", "dc", "Lcom/velocitypowered/api/event/connection/DisconnectEvent;", "checkClearance", "velocity"})
public final class VelocityListener {
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.BasaltVelocity plugin = null;
    
    public VelocityListener(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.BasaltVelocity plugin) {
        super();
    }
    
    @com.velocitypowered.api.event.Subscribe()
    public final void onSwitch(@org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.event.player.ServerConnectedEvent event, @org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.event.Continuation continuation) {
    }
    
    @com.velocitypowered.api.event.Subscribe()
    public final void setupPermissions(@org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.event.permission.PermissionsSetupEvent event, @org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.event.Continuation continuation) {
    }
    
    @com.velocitypowered.api.event.Subscribe()
    public final void login(@org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.event.connection.PostLoginEvent event, @org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.event.Continuation continuation) {
    }
    
    @com.velocitypowered.api.event.Subscribe(order = com.velocitypowered.api.event.PostOrder.LAST)
    public final void dc(@org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.event.connection.DisconnectEvent event, @org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.event.Continuation continuation) {
    }
    
    @com.velocitypowered.api.event.Subscribe(order = com.velocitypowered.api.event.PostOrder.FIRST)
    public final void checkClearance(@org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.event.connection.PostLoginEvent event, @org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.event.Continuation continuation) {
    }
}
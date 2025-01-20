package net.minebo.basalt.servers.menu;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0006\u0010\u0010\u001a\u00020\u000fJ\u0010\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005\u00a8\u0006\u001a"}, d2 = {"Lnet/minebo/basalt/servers/menu/UniqueServerButton;", "Lnet/minebo/basalt/util/menu/Button;", "server", "Lnet/minebo/basalt/models/server/UniqueServer;", "<init>", "(Lnet/minebo/basalt/models/server/UniqueServer;)V", "getServer", "()Lnet/minebo/basalt/models/server/UniqueServer;", "setServer", "getMaterial", "Lorg/bukkit/Material;", "player", "Lorg/bukkit/entity/Player;", "getDescription", "", "", "getFormattedLockRank", "getDisplayName", "getData", "", "onClick", "", "slot", "", "type", "Lorg/bukkit/event/inventory/ClickType;", "spigot"})
public final class UniqueServerButton extends net.minebo.basalt.util.menu.Button {
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.models.server.UniqueServer server;
    
    public UniqueServerButton(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.server.UniqueServer server) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.server.UniqueServer getServer() {
        return null;
    }
    
    public final void setServer(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.server.UniqueServer p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.bukkit.Material getMaterial(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.lang.String> getDescription(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFormattedLockRank() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getDisplayName(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @java.lang.Override()
    public short getData(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return 0;
    }
    
    @java.lang.Override()
    public void onClick(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, int slot, @org.jetbrains.annotations.NotNull()
    org.bukkit.event.inventory.ClickType type) {
    }
}
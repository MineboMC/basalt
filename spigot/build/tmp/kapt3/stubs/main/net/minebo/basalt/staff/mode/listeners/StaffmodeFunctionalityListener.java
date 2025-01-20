package net.minebo.basalt.staff.mode.listeners;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0013H\u0007R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t\u00a8\u0006\u0014"}, d2 = {"Lnet/minebo/basalt/staff/mode/listeners/StaffmodeFunctionalityListener;", "Lorg/bukkit/event/Listener;", "<init>", "()V", "timestamps", "", "Ljava/util/UUID;", "", "getTimestamps", "()Ljava/util/Map;", "entityInteractTimestamps", "getEntityInteractTimestamps", "interact", "", "e", "Lorg/bukkit/event/player/PlayerInteractEvent;", "inventoryClickEvent", "Lorg/bukkit/event/inventory/InventoryClickEvent;", "interactWithEntity", "Lorg/bukkit/event/player/PlayerInteractEntityEvent;", "spigot"})
public final class StaffmodeFunctionalityListener implements org.bukkit.event.Listener {
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.util.UUID, java.lang.Long> timestamps = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.Map<java.util.UUID, java.lang.Long> entityInteractTimestamps = null;
    
    public StaffmodeFunctionalityListener() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, java.lang.Long> getTimestamps() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, java.lang.Long> getEntityInteractTimestamps() {
        return null;
    }
    
    @org.bukkit.event.EventHandler(priority = org.bukkit.event.EventPriority.HIGHEST)
    public final void interact(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.player.PlayerInteractEvent e) {
    }
    
    @org.bukkit.event.EventHandler()
    public final void inventoryClickEvent(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.inventory.InventoryClickEvent e) {
    }
    
    @org.bukkit.event.EventHandler()
    public final void interactWithEntity(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.player.PlayerInteractEntityEvent e) {
    }
}
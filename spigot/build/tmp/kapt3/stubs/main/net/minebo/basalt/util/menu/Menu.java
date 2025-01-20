package net.minebo.basalt.util.menu;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0010\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u001d2\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0002\u001a\u00020\u0003H&J\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u001dJ\u001c\u0010\"\u001a\u00020\u00072\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0$H\u0016J\u0006\u0010%\u001a\u00020&R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b\u00a8\u0006'"}, d2 = {"Lnet/minebo/basalt/util/menu/Menu;", "", "player", "Lorg/bukkit/entity/Player;", "<init>", "(Lorg/bukkit/entity/Player;)V", "staticSize", "", "getStaticSize", "()Ljava/lang/Integer;", "setStaticSize", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "placeholder", "", "getPlaceholder", "()Z", "setPlaceholder", "(Z)V", "stealable", "getStealable", "setStealable", "customType", "Lorg/bukkit/event/inventory/InventoryType;", "getCustomType", "()Lorg/bukkit/event/inventory/InventoryType;", "setCustomType", "(Lorg/bukkit/event/inventory/InventoryType;)V", "getButtons", "", "Lnet/minebo/basalt/util/menu/Button;", "getTitle", "", "getAllButtons", "size", "buttons", "", "openMenu", "", "spigot"})
public abstract class Menu {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.entity.Player player = null;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer staticSize;
    private boolean placeholder = false;
    private boolean stealable = false;
    @org.jetbrains.annotations.Nullable()
    private org.bukkit.event.inventory.InventoryType customType;
    
    public Menu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStaticSize() {
        return null;
    }
    
    public final void setStaticSize(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    public final boolean getPlaceholder() {
        return false;
    }
    
    public final void setPlaceholder(boolean p0) {
    }
    
    public final boolean getStealable() {
        return false;
    }
    
    public final void setStealable(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.bukkit.event.inventory.InventoryType getCustomType() {
        return null;
    }
    
    public final void setCustomType(@org.jetbrains.annotations.Nullable()
    org.bukkit.event.inventory.InventoryType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getButtons(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player);
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getAllButtons() {
        return null;
    }
    
    public int size(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends net.minebo.basalt.util.menu.Button> buttons) {
        return 0;
    }
    
    public final void openMenu() {
    }
}
package net.minebo.basalt.staff.mode;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001bJ\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bRF\u0010\u0004\u001a.\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0005j\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007`\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rRF\u0010\u000e\u001a.\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u0005j\u0016\u0012\u0004\u0012\u00020\u0006\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007`\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR*\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0012j\b\u0012\u0004\u0012\u00020\u0006`\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006!"}, d2 = {"Lnet/minebo/basalt/staff/mode/StaffSuiteManager;", "", "<init>", "()V", "modInventories", "Ljava/util/HashMap;", "Ljava/util/UUID;", "", "Lorg/bukkit/inventory/ItemStack;", "Lkotlin/collections/HashMap;", "getModInventories", "()Ljava/util/HashMap;", "setModInventories", "(Ljava/util/HashMap;)V", "modArmor", "getModArmor", "setModArmor", "modModePlayers", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getModModePlayers", "()Ljava/util/ArrayList;", "setModModePlayers", "(Ljava/util/ArrayList;)V", "isModMode", "", "player", "Lorg/bukkit/entity/Player;", "removeStaffMode", "", "hasStaffchatEnabled", "isModModeOnJoin", "setStaffMode", "spigot"})
public final class StaffSuiteManager {
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.util.UUID, org.bukkit.inventory.ItemStack[]> modInventories;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.util.UUID, org.bukkit.inventory.ItemStack[]> modArmor;
    @org.jetbrains.annotations.NotNull()
    private static java.util.ArrayList<java.util.UUID> modModePlayers;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.staff.mode.StaffSuiteManager INSTANCE = null;
    
    private StaffSuiteManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.util.UUID, org.bukkit.inventory.ItemStack[]> getModInventories() {
        return null;
    }
    
    public final void setModInventories(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.util.UUID, org.bukkit.inventory.ItemStack[]> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.util.UUID, org.bukkit.inventory.ItemStack[]> getModArmor() {
        return null;
    }
    
    public final void setModArmor(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.util.UUID, org.bukkit.inventory.ItemStack[]> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.util.UUID> getModModePlayers() {
        return null;
    }
    
    public final void setModModePlayers(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.UUID> p0) {
    }
    
    public final boolean isModMode(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return false;
    }
    
    public final void removeStaffMode(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    public final boolean hasStaffchatEnabled(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return false;
    }
    
    public final boolean isModModeOnJoin(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return false;
    }
    
    public final void setStaffMode(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
}
package net.minebo.basalt.util.menu.pagination;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0016J\u0006\u0010\u0012\u001a\u00020\fJ\u0006\u0010\u0013\u001a\u00020\fJ\u0014\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\u001c\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0004\u001a\u00020\u0005J\u0006\u0010\u001b\u001a\u00020\u001aJ\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0003X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001f"}, d2 = {"Lnet/minebo/basalt/util/menu/pagination/PaginatedMenu;", "", "displaySize", "", "player", "Lorg/bukkit/entity/Player;", "<init>", "(ILorg/bukkit/entity/Player;)V", "currentPage", "maxPages", "getPagesButtons", "", "Lnet/minebo/basalt/util/menu/Button;", "getTitle", "", "getButtonsInRange", "getButtonPositions", "", "getPreviousPageButton", "getNextPageButton", "getPageButtonPositions", "Lkotlin/Pair;", "getButtonsStartAt", "getButtonsPerPage", "getHeaderItems", "handleAutoUpdate", "", "updateMenu", "retrieveInventory", "Ljava/util/concurrent/CompletableFuture;", "Lorg/bukkit/inventory/Inventory;", "spigot"})
public abstract class PaginatedMenu {
    private final int displaySize = 0;
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.entity.Player player = null;
    private int currentPage = 1;
    private int maxPages = 1;
    
    public PaginatedMenu(int displaySize, @org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getPagesButtons(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player);
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getButtonsInRange(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.lang.Integer> getButtonPositions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.util.menu.Button getPreviousPageButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.util.menu.Button getNextPageButton() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public kotlin.Pair<java.lang.Integer, java.lang.Integer> getPageButtonPositions() {
        return null;
    }
    
    public int getButtonsStartAt() {
        return 0;
    }
    
    public int getButtonsPerPage() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getHeaderItems(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    public final void handleAutoUpdate(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    public final void updateMenu() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<org.bukkit.inventory.Inventory> retrieveInventory() {
        return null;
    }
}
package net.minebo.basalt.util.menu;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0007R6\u0010\u0004\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR6\u0010\r\u001a\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e0\u0005j\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000e`\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\f\u00a8\u0006\u0016"}, d2 = {"Lnet/minebo/basalt/util/menu/MenuController;", "", "<init>", "()V", "menuMap", "Ljava/util/HashMap;", "Ljava/util/UUID;", "Lnet/minebo/basalt/util/menu/Menu;", "Lkotlin/collections/HashMap;", "getMenuMap", "()Ljava/util/HashMap;", "setMenuMap", "(Ljava/util/HashMap;)V", "paginatedMenuMap", "Lnet/minebo/basalt/util/menu/pagination/PaginatedMenu;", "getPaginatedMenuMap", "setPaginatedMenuMap", "addToMenuMap", "", "player", "Lorg/bukkit/entity/Player;", "menu", "spigot"})
public final class MenuController {
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.util.UUID, net.minebo.basalt.util.menu.Menu> menuMap;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.util.UUID, net.minebo.basalt.util.menu.pagination.PaginatedMenu> paginatedMenuMap;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.util.menu.MenuController INSTANCE = null;
    
    private MenuController() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.util.UUID, net.minebo.basalt.util.menu.Menu> getMenuMap() {
        return null;
    }
    
    public final void setMenuMap(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.util.UUID, net.minebo.basalt.util.menu.Menu> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.util.UUID, net.minebo.basalt.util.menu.pagination.PaginatedMenu> getPaginatedMenuMap() {
        return null;
    }
    
    public final void setPaginatedMenuMap(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.util.UUID, net.minebo.basalt.util.menu.pagination.PaginatedMenu> p0) {
    }
    
    public final void addToMenuMap(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.util.menu.Menu menu) {
    }
}
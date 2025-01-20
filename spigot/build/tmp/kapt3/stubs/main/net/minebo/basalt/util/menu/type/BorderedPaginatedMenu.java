package net.minebo.basalt.util.menu.type;

/**
 * Class created on 7/26/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\b\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\u0003H\u0016J\b\u0010\r\u001a\u00020\bH\u0016\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/util/menu/type/BorderedPaginatedMenu;", "Lnet/minebo/basalt/util/menu/pagination/PaginatedMenu;", "other", "Lorg/bukkit/entity/Player;", "<init>", "(Lorg/bukkit/entity/Player;)V", "getButtonPositions", "", "", "getHeaderItems", "", "Lnet/minebo/basalt/util/menu/Button;", "player", "getButtonsPerPage", "spigot"})
public abstract class BorderedPaginatedMenu extends net.minebo.basalt.util.menu.pagination.PaginatedMenu {
    
    public BorderedPaginatedMenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player other) {
        super(0, null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.lang.Integer> getButtonPositions() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getHeaderItems(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @java.lang.Override()
    public int getButtonsPerPage() {
        return 0;
    }
}
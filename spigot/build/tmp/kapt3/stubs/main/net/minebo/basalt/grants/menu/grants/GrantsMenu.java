package net.minebo.basalt.grants.menu.grants;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001c\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00170\u001aH\u0016J\u001c\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0007J\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006 "}, d2 = {"Lnet/minebo/basalt/grants/menu/grants/GrantsMenu;", "Lnet/minebo/basalt/util/menu/pagination/PaginatedMenu;", "player", "Lorg/bukkit/entity/Player;", "gameProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "grants", "", "Lnet/minebo/basalt/models/grant/types/RankGrant;", "grantFilter", "Lnet/minebo/basalt/grants/menu/grants/filter/GrantFilter;", "<init>", "(Lorg/bukkit/entity/Player;Lnet/minebo/basalt/models/profile/GameProfile;Ljava/util/List;Lnet/minebo/basalt/grants/menu/grants/filter/GrantFilter;)V", "getPlayer", "()Lorg/bukkit/entity/Player;", "getGameProfile", "()Lnet/minebo/basalt/models/profile/GameProfile;", "getGrants", "()Ljava/util/List;", "getGrantFilter", "()Lnet/minebo/basalt/grants/menu/grants/filter/GrantFilter;", "getPagesButtons", "", "", "Lnet/minebo/basalt/util/menu/Button;", "getButtonPositions", "", "getHeaderItems", "getFilterDesc", "", "getButtonsPerPage", "getTitle", "spigot"})
public final class GrantsMenu extends net.minebo.basalt.util.menu.pagination.PaginatedMenu {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.entity.Player player = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.profile.GameProfile gameProfile = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<net.minebo.basalt.models.grant.types.RankGrant> grants = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.grants.menu.grants.filter.GrantFilter grantFilter = null;
    
    public GrantsMenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile, @org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.models.grant.types.RankGrant> grants, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.grants.menu.grants.filter.GrantFilter grantFilter) {
        super(0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.entity.Player getPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.profile.GameProfile getGameProfile() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.models.grant.types.RankGrant> getGrants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.grants.menu.grants.filter.GrantFilter getGrantFilter() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getPagesButtons(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
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
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getFilterDesc() {
        return null;
    }
    
    @java.lang.Override()
    public int getButtonsPerPage() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
}
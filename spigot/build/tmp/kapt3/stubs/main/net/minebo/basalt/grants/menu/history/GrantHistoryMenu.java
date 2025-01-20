package net.minebo.basalt.grants.menu.history;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00140\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lnet/minebo/basalt/grants/menu/history/GrantHistoryMenu;", "Lnet/minebo/basalt/util/menu/pagination/PaginatedMenu;", "player", "Lorg/bukkit/entity/Player;", "grants", "", "Lnet/minebo/basalt/models/grant/types/RankGrant;", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "<init>", "(Lorg/bukkit/entity/Player;Ljava/util/List;Lnet/minebo/basalt/models/profile/GameProfile;)V", "getPlayer", "()Lorg/bukkit/entity/Player;", "getGrants", "()Ljava/util/List;", "getTarget", "()Lnet/minebo/basalt/models/profile/GameProfile;", "getPagesButtons", "", "", "Lnet/minebo/basalt/util/menu/Button;", "getTitle", "", "RankButton", "spigot"})
public final class GrantHistoryMenu extends net.minebo.basalt.util.menu.pagination.PaginatedMenu {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.entity.Player player = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<net.minebo.basalt.models.grant.types.RankGrant> grants = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.profile.GameProfile target = null;
    
    public GrantHistoryMenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.models.grant.types.RankGrant> grants, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target) {
        super(0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.entity.Player getPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.models.grant.types.RankGrant> getGrants() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.profile.GameProfile getTarget() {
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
    public java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\u00072\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\"\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u0004\u001a\u00020\u0005J\u0010\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lnet/minebo/basalt/grants/menu/history/GrantHistoryMenu$RankButton;", "Lnet/minebo/basalt/util/menu/Button;", "player", "Lorg/bukkit/entity/Player;", "rank", "Lnet/minebo/basalt/models/ranks/Rank;", "grants", "", "Lnet/minebo/basalt/models/grant/types/RankGrant;", "<init>", "(Lorg/bukkit/entity/Player;Lnet/minebo/basalt/models/ranks/Rank;Ljava/util/List;)V", "getPlayer", "()Lorg/bukkit/entity/Player;", "getRank", "()Lnet/minebo/basalt/models/ranks/Rank;", "getGrants", "()Ljava/util/List;", "getMaterial", "Lorg/bukkit/Material;", "getDescription", "", "filterRank", "getDisplayName", "getData", "", "onClick", "", "slot", "", "type", "Lorg/bukkit/event/inventory/ClickType;", "spigot"})
    public static final class RankButton extends net.minebo.basalt.util.menu.Button {
        @org.jetbrains.annotations.NotNull()
        private final org.bukkit.entity.Player player = null;
        @org.jetbrains.annotations.NotNull()
        private final net.minebo.basalt.models.ranks.Rank rank = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<net.minebo.basalt.models.grant.types.RankGrant> grants = null;
        
        public RankButton(@org.jetbrains.annotations.NotNull()
        org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
        net.minebo.basalt.models.ranks.Rank rank, @org.jetbrains.annotations.NotNull()
        java.util.List<net.minebo.basalt.models.grant.types.RankGrant> grants) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final org.bukkit.entity.Player getPlayer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.models.ranks.Rank getRank() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<net.minebo.basalt.models.grant.types.RankGrant> getGrants() {
            return null;
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
        public final java.util.List<net.minebo.basalt.models.grant.types.RankGrant> filterRank(@org.jetbrains.annotations.NotNull()
        java.util.List<net.minebo.basalt.models.grant.types.RankGrant> grants, @org.jetbrains.annotations.NotNull()
        net.minebo.basalt.models.ranks.Rank rank) {
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
}
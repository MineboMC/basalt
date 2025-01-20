package net.minebo.basalt.commands.rank.menu;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0017B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u001c\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u00132\u0006\u0010\u0014\u001a\u00020\bH\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lnet/minebo/basalt/commands/rank/menu/RankEditorMenu;", "Lnet/minebo/basalt/util/menu/type/BorderedPaginatedMenu;", "player", "Lorg/bukkit/entity/Player;", "ranks", "", "Lnet/minebo/basalt/models/ranks/Rank;", "rankListFilter", "Lnet/minebo/basalt/commands/rank/menu/filter/RankListFilter;", "<init>", "(Lorg/bukkit/entity/Player;Ljava/util/List;Lnet/minebo/basalt/commands/rank/menu/filter/RankListFilter;)V", "getHeaderItems", "", "", "Lnet/minebo/basalt/util/menu/Button;", "getPagesButtons", "getTitle", "", "getRanksBasedOnFilter", "", "filter", "generateRankListFilterLore", "", "RankButton", "spigot"})
public final class RankEditorMenu extends net.minebo.basalt.util.menu.type.BorderedPaginatedMenu {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<net.minebo.basalt.models.ranks.Rank> ranks = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.commands.rank.menu.filter.RankListFilter rankListFilter = null;
    
    public RankEditorMenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.models.ranks.Rank> ranks, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.commands.rank.menu.filter.RankListFilter rankListFilter) {
        super(null);
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getHeaderItems(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
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
    
    private final java.util.Collection<net.minebo.basalt.models.ranks.Rank> getRanksBasedOnFilter(net.minebo.basalt.commands.rank.menu.filter.RankListFilter filter) {
        return null;
    }
    
    private final java.util.List<java.lang.String> generateRankListFilterLore() {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u001a"}, d2 = {"Lnet/minebo/basalt/commands/rank/menu/RankEditorMenu$RankButton;", "Lnet/minebo/basalt/util/menu/Button;", "player", "Lorg/bukkit/entity/Player;", "rank", "Lnet/minebo/basalt/models/ranks/Rank;", "<init>", "(Lorg/bukkit/entity/Player;Lnet/minebo/basalt/models/ranks/Rank;)V", "getPlayer", "()Lorg/bukkit/entity/Player;", "getRank", "()Lnet/minebo/basalt/models/ranks/Rank;", "getMaterial", "Lorg/bukkit/Material;", "getDescription", "", "", "getDisplayName", "getData", "", "onClick", "", "slot", "", "type", "Lorg/bukkit/event/inventory/ClickType;", "spigot"})
    public static final class RankButton extends net.minebo.basalt.util.menu.Button {
        @org.jetbrains.annotations.NotNull()
        private final org.bukkit.entity.Player player = null;
        @org.jetbrains.annotations.NotNull()
        private final net.minebo.basalt.models.ranks.Rank rank = null;
        
        public RankButton(@org.jetbrains.annotations.NotNull()
        org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
        net.minebo.basalt.models.ranks.Rank rank) {
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
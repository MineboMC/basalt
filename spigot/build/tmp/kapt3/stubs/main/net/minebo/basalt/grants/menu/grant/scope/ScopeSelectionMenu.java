package net.minebo.basalt.grants.menu.grant.scope;

/**
 * Class created on 6/21/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001&BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u001c\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u001c\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020#0!2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006'"}, d2 = {"Lnet/minebo/basalt/grants/menu/grant/scope/ScopeSelectionMenu;", "Lnet/minebo/basalt/util/menu/pagination/PaginatedMenu;", "player", "Lorg/bukkit/entity/Player;", "rank", "Lnet/minebo/basalt/models/ranks/Rank;", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "duration", "", "reason", "", "equipped", "", "global", "", "<init>", "(Lorg/bukkit/entity/Player;Lnet/minebo/basalt/models/ranks/Rank;Lnet/minebo/basalt/models/profile/GameProfile;JLjava/lang/String;Ljava/util/List;Z)V", "getPlayer", "()Lorg/bukkit/entity/Player;", "getRank", "()Lnet/minebo/basalt/models/ranks/Rank;", "getTarget", "()Lnet/minebo/basalt/models/profile/GameProfile;", "getDuration", "()J", "getReason", "()Ljava/lang/String;", "getEquipped", "()Ljava/util/List;", "getGlobal", "()Z", "getHeaderItems", "", "", "Lnet/minebo/basalt/util/menu/Button;", "getPagesButtons", "getTitle", "ScopeButton", "spigot"})
public final class ScopeSelectionMenu extends net.minebo.basalt.util.menu.pagination.PaginatedMenu {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.entity.Player player = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.ranks.Rank rank = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.profile.GameProfile target = null;
    private final long duration = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String reason = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> equipped = null;
    private final boolean global = false;
    
    public ScopeSelectionMenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target, long duration, @org.jetbrains.annotations.NotNull()
    java.lang.String reason, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> equipped, boolean global) {
        super(0, null);
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
    public final net.minebo.basalt.models.profile.GameProfile getTarget() {
        return null;
    }
    
    public final long getDuration() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReason() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getEquipped() {
        return null;
    }
    
    public final boolean getGlobal() {
        return false;
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
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010!\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u0016\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010%\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020#H\u0016J\u0010\u0010&\u001a\u00020'2\u0006\u0010\"\u001a\u00020#H\u0016J \u0010(\u001a\u00020)2\u0006\u0010\"\u001a\u00020#2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001f\u00a8\u0006."}, d2 = {"Lnet/minebo/basalt/grants/menu/grant/scope/ScopeSelectionMenu$ScopeButton;", "Lnet/minebo/basalt/util/menu/Button;", "uniqueServer", "Lnet/minebo/basalt/models/server/UniqueServer;", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "rank", "Lnet/minebo/basalt/models/ranks/Rank;", "duration", "", "reason", "", "global", "", "equipped", "", "<init>", "(Lnet/minebo/basalt/models/server/UniqueServer;Lnet/minebo/basalt/models/profile/GameProfile;Lnet/minebo/basalt/models/ranks/Rank;JLjava/lang/String;ZLjava/util/List;)V", "getUniqueServer", "()Lnet/minebo/basalt/models/server/UniqueServer;", "getTarget", "()Lnet/minebo/basalt/models/profile/GameProfile;", "getRank", "()Lnet/minebo/basalt/models/ranks/Rank;", "getDuration", "()J", "getReason", "()Ljava/lang/String;", "getGlobal", "()Z", "getEquipped", "()Ljava/util/List;", "getMaterial", "Lorg/bukkit/Material;", "player", "Lorg/bukkit/entity/Player;", "getDescription", "getDisplayName", "getData", "", "onClick", "", "slot", "", "type", "Lorg/bukkit/event/inventory/ClickType;", "spigot"})
    public static final class ScopeButton extends net.minebo.basalt.util.menu.Button {
        @org.jetbrains.annotations.NotNull()
        private final net.minebo.basalt.models.server.UniqueServer uniqueServer = null;
        @org.jetbrains.annotations.NotNull()
        private final net.minebo.basalt.models.profile.GameProfile target = null;
        @org.jetbrains.annotations.NotNull()
        private final net.minebo.basalt.models.ranks.Rank rank = null;
        private final long duration = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final boolean global = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.List<java.lang.String> equipped = null;
        
        public ScopeButton(@org.jetbrains.annotations.NotNull()
        net.minebo.basalt.models.server.UniqueServer uniqueServer, @org.jetbrains.annotations.NotNull()
        net.minebo.basalt.models.profile.GameProfile target, @org.jetbrains.annotations.NotNull()
        net.minebo.basalt.models.ranks.Rank rank, long duration, @org.jetbrains.annotations.NotNull()
        java.lang.String reason, boolean global, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.String> equipped) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.models.server.UniqueServer getUniqueServer() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.models.profile.GameProfile getTarget() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.models.ranks.Rank getRank() {
            return null;
        }
        
        public final long getDuration() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final boolean getGlobal() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.String> getEquipped() {
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
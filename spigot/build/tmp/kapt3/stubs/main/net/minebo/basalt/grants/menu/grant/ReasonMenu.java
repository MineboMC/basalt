package net.minebo.basalt.grants.menu.grant;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001aB'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u00152\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001b"}, d2 = {"Lnet/minebo/basalt/grants/menu/grant/ReasonMenu;", "Lnet/minebo/basalt/util/menu/Menu;", "player", "Lorg/bukkit/entity/Player;", "rank", "Lnet/minebo/basalt/models/ranks/Rank;", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "duration", "", "<init>", "(Lorg/bukkit/entity/Player;Lnet/minebo/basalt/models/ranks/Rank;Lnet/minebo/basalt/models/profile/GameProfile;J)V", "getPlayer", "()Lorg/bukkit/entity/Player;", "getRank", "()Lnet/minebo/basalt/models/ranks/Rank;", "getTarget", "()Lnet/minebo/basalt/models/profile/GameProfile;", "getDuration", "()J", "getButtons", "", "", "Lnet/minebo/basalt/util/menu/Button;", "getTitle", "", "ReasonButton", "spigot"})
public final class ReasonMenu extends net.minebo.basalt.util.menu.Menu {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.entity.Player player = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.ranks.Rank rank = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.profile.GameProfile target = null;
    private final long duration = 0L;
    
    public ReasonMenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.ranks.Rank rank, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target, long duration) {
        super(null);
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
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getButtons(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030#2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u0010\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0016J \u0010$\u001a\u00020%2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010&\u001a\u00020'2\u0006\u0010(\u001a\u00020)H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0011\u0010\r\u001a\u00020\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000f\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0013\u00a8\u0006*"}, d2 = {"Lnet/minebo/basalt/grants/menu/grant/ReasonMenu$ReasonButton;", "Lnet/minebo/basalt/util/menu/Button;", "reason", "", "data", "", "displayName", "rank", "Lnet/minebo/basalt/models/ranks/Rank;", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "player", "Lorg/bukkit/entity/Player;", "duration", "", "item", "<init>", "(Ljava/lang/String;SLjava/lang/String;Lnet/minebo/basalt/models/ranks/Rank;Lnet/minebo/basalt/models/profile/GameProfile;Lorg/bukkit/entity/Player;JLjava/lang/String;)V", "getReason", "()Ljava/lang/String;", "getData", "()S", "getDisplayName", "getRank", "()Lnet/minebo/basalt/models/ranks/Rank;", "getTarget", "()Lnet/minebo/basalt/models/profile/GameProfile;", "getPlayer", "()Lorg/bukkit/entity/Player;", "getDuration", "()J", "getItem", "getMaterial", "Lorg/bukkit/Material;", "getDescription", "", "onClick", "", "slot", "", "type", "Lorg/bukkit/event/inventory/ClickType;", "spigot"})
    public static final class ReasonButton extends net.minebo.basalt.util.menu.Button {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String reason = null;
        private final short data = 0;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String displayName = null;
        @org.jetbrains.annotations.NotNull()
        private final net.minebo.basalt.models.ranks.Rank rank = null;
        @org.jetbrains.annotations.NotNull()
        private final net.minebo.basalt.models.profile.GameProfile target = null;
        @org.jetbrains.annotations.NotNull()
        private final org.bukkit.entity.Player player = null;
        private final long duration = 0L;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String item = null;
        
        public ReasonButton(@org.jetbrains.annotations.NotNull()
        java.lang.String reason, short data, @org.jetbrains.annotations.NotNull()
        java.lang.String displayName, @org.jetbrains.annotations.NotNull()
        net.minebo.basalt.models.ranks.Rank rank, @org.jetbrains.annotations.NotNull()
        net.minebo.basalt.models.profile.GameProfile target, @org.jetbrains.annotations.NotNull()
        org.bukkit.entity.Player player, long duration, @org.jetbrains.annotations.NotNull()
        java.lang.String item) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReason() {
            return null;
        }
        
        public final short getData() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDisplayName() {
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
        
        @org.jetbrains.annotations.NotNull()
        public final org.bukkit.entity.Player getPlayer() {
            return null;
        }
        
        public final long getDuration() {
            return 0L;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getItem() {
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
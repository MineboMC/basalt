package net.minebo.basalt.commands.alts.menu;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u001cB%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001d"}, d2 = {"Lnet/minebo/basalt/commands/alts/menu/AltsMenu;", "Lnet/minebo/basalt/util/menu/pagination/PaginatedMenu;", "player", "Lorg/bukkit/entity/Player;", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "alts", "", "<init>", "(Lorg/bukkit/entity/Player;Lnet/minebo/basalt/models/profile/GameProfile;Ljava/util/List;)V", "getPlayer", "()Lorg/bukkit/entity/Player;", "setPlayer", "(Lorg/bukkit/entity/Player;)V", "getTarget", "()Lnet/minebo/basalt/models/profile/GameProfile;", "setTarget", "(Lnet/minebo/basalt/models/profile/GameProfile;)V", "getAlts", "()Ljava/util/List;", "setAlts", "(Ljava/util/List;)V", "getPagesButtons", "", "", "Lnet/minebo/basalt/util/menu/Button;", "getTitle", "", "AltButton", "spigot"})
public final class AltsMenu extends net.minebo.basalt.util.menu.pagination.PaginatedMenu {
    @org.jetbrains.annotations.NotNull()
    private org.bukkit.entity.Player player;
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.models.profile.GameProfile target;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<net.minebo.basalt.models.profile.GameProfile> alts;
    
    public AltsMenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target, @org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.models.profile.GameProfile> alts) {
        super(0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.entity.Player getPlayer() {
        return null;
    }
    
    public final void setPlayer(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.profile.GameProfile getTarget() {
        return null;
    }
    
    public final void setTarget(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.models.profile.GameProfile> getAlts() {
        return null;
    }
    
    public final void setAlts(@org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.models.profile.GameProfile> p0) {
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
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\f\u001a\u00020\rH\u0016J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b\u00a8\u0006\u001a"}, d2 = {"Lnet/minebo/basalt/commands/alts/menu/AltsMenu$AltButton;", "Lnet/minebo/basalt/util/menu/Button;", "gameProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "target", "<init>", "(Lnet/minebo/basalt/models/profile/GameProfile;Lnet/minebo/basalt/models/profile/GameProfile;)V", "getGameProfile", "()Lnet/minebo/basalt/models/profile/GameProfile;", "getTarget", "getMaterial", "Lorg/bukkit/Material;", "player", "Lorg/bukkit/entity/Player;", "getDescription", "", "", "getDisplayName", "getData", "", "onClick", "", "slot", "", "type", "Lorg/bukkit/event/inventory/ClickType;", "spigot"})
    public static final class AltButton extends net.minebo.basalt.util.menu.Button {
        @org.jetbrains.annotations.NotNull()
        private final net.minebo.basalt.models.profile.GameProfile gameProfile = null;
        @org.jetbrains.annotations.NotNull()
        private final net.minebo.basalt.models.profile.GameProfile target = null;
        
        public AltButton(@org.jetbrains.annotations.NotNull()
        net.minebo.basalt.models.profile.GameProfile gameProfile, @org.jetbrains.annotations.NotNull()
        net.minebo.basalt.models.profile.GameProfile target) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.models.profile.GameProfile getGameProfile() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.models.profile.GameProfile getTarget() {
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
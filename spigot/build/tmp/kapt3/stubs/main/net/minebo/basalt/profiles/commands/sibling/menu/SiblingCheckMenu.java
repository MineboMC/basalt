package net.minebo.basalt.profiles.commands.sibling.menu;

/**
 * Class created on 7/4/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u000e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0016J\b\u0010\u0012\u001a\u00020\u000eH\u0016J\u001c\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0017"}, d2 = {"Lnet/minebo/basalt/profiles/commands/sibling/menu/SiblingCheckMenu;", "Lnet/minebo/basalt/util/menu/pagination/PaginatedMenu;", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "player", "Lorg/bukkit/entity/Player;", "<init>", "(Lnet/minebo/basalt/models/profile/GameProfile;Lorg/bukkit/entity/Player;)V", "getTarget", "()Lnet/minebo/basalt/models/profile/GameProfile;", "getPlayer", "()Lorg/bukkit/entity/Player;", "getPagesButtons", "", "", "Lnet/minebo/basalt/util/menu/Button;", "getButtonPositions", "", "getButtonsPerPage", "getHeaderItems", "getTitle", "", "SiblingButton", "spigot"})
public final class SiblingCheckMenu extends net.minebo.basalt.util.menu.pagination.PaginatedMenu {
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.profile.GameProfile target = null;
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.entity.Player player = null;
    
    public SiblingCheckMenu(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target, @org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        super(0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.profile.GameProfile getTarget() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.entity.Player getPlayer() {
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
    public int getButtonsPerPage() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getHeaderItems(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J \u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b\u00a8\u0006\u001e"}, d2 = {"Lnet/minebo/basalt/profiles/commands/sibling/menu/SiblingCheckMenu$SiblingButton;", "Lnet/minebo/basalt/util/menu/Button;", "uuid", "Ljava/util/UUID;", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "<init>", "(Ljava/util/UUID;Lnet/minebo/basalt/models/profile/GameProfile;)V", "getUuid", "()Ljava/util/UUID;", "getTarget", "()Lnet/minebo/basalt/models/profile/GameProfile;", "profile", "getProfile", "getMaterial", "Lorg/bukkit/Material;", "player", "Lorg/bukkit/entity/Player;", "getDescription", "", "", "getDisplayName", "getData", "", "onClick", "", "slot", "", "type", "Lorg/bukkit/event/inventory/ClickType;", "spigot"})
    public static final class SiblingButton extends net.minebo.basalt.util.menu.Button {
        @org.jetbrains.annotations.NotNull()
        private final java.util.UUID uuid = null;
        @org.jetbrains.annotations.NotNull()
        private final net.minebo.basalt.models.profile.GameProfile target = null;
        @org.jetbrains.annotations.NotNull()
        private final net.minebo.basalt.models.profile.GameProfile profile = null;
        
        public SiblingButton(@org.jetbrains.annotations.NotNull()
        java.util.UUID uuid, @org.jetbrains.annotations.NotNull()
        net.minebo.basalt.models.profile.GameProfile target) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.UUID getUuid() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.models.profile.GameProfile getTarget() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.models.profile.GameProfile getProfile() {
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
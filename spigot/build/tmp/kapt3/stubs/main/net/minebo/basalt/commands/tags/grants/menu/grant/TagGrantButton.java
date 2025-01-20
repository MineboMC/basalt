package net.minebo.basalt.commands.tags.grants.menu.grant;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J \u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010!\u001a\u00020\u001b2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006#"}, d2 = {"Lnet/minebo/basalt/commands/tags/grants/menu/grant/TagGrantButton;", "Lnet/minebo/basalt/util/menu/Button;", "tag", "Lnet/minebo/basalt/models/tags/Tag;", "gameProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "<init>", "(Lnet/minebo/basalt/models/tags/Tag;Lnet/minebo/basalt/models/profile/GameProfile;)V", "getTag", "()Lnet/minebo/basalt/models/tags/Tag;", "setTag", "(Lnet/minebo/basalt/models/tags/Tag;)V", "getGameProfile", "()Lnet/minebo/basalt/models/profile/GameProfile;", "setGameProfile", "(Lnet/minebo/basalt/models/profile/GameProfile;)V", "getMaterial", "Lorg/bukkit/Material;", "player", "Lorg/bukkit/entity/Player;", "getDescription", "", "", "getDisplayName", "getData", "", "onClick", "", "slot", "", "type", "Lorg/bukkit/event/inventory/ClickType;", "reasonConvo", "durationConversation", "reason", "spigot"})
public final class TagGrantButton extends net.minebo.basalt.util.menu.Button {
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.models.tags.Tag tag;
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.models.profile.GameProfile gameProfile;
    
    public TagGrantButton(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.tags.Tag tag, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.tags.Tag getTag() {
        return null;
    }
    
    public final void setTag(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.tags.Tag p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.profile.GameProfile getGameProfile() {
        return null;
    }
    
    public final void setGameProfile(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile p0) {
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
    
    public final void reasonConvo(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    public final void durationConversation(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
    }
}
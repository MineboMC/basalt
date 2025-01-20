package net.minebo.basalt.util.skull;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ(\u0010\u001b\u001a\u00020\u00002 \u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0014J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015H\u0016J\u0010\u0010 \u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u0015H\u0016J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\u0006\u0010\u001f\u001a\u00020\u0015H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u001f\u001a\u00020\u0015H\u0016J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u001f\u001a\u00020\u0015H\u0016J \u0010%\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010&\u001a\u00020\u00162\u0006\u0010'\u001a\u00020\u0017H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\fR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R4\u0010\u0013\u001a\u001c\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0014X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c\u00a8\u0006("}, d2 = {"Lnet/minebo/basalt/util/skull/SkullButtonOnlyName;", "Lnet/minebo/basalt/util/menu/Button;", "owner", "", "displayName", "lore", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getOwner", "()Ljava/lang/String;", "setOwner", "(Ljava/lang/String;)V", "getDisplayName", "setDisplayName", "getLore", "()Ljava/util/List;", "setLore", "(Ljava/util/List;)V", "body", "Lkotlin/Function3;", "Lorg/bukkit/entity/Player;", "", "Lorg/bukkit/event/inventory/ClickType;", "", "getBody", "()Lkotlin/jvm/functions/Function3;", "setBody", "(Lkotlin/jvm/functions/Function3;)V", "getButtonItem", "Lorg/bukkit/inventory/ItemStack;", "player", "getMaterial", "Lorg/bukkit/Material;", "getDescription", "getData", "", "onClick", "slot", "type", "spigot"})
public final class SkullButtonOnlyName extends net.minebo.basalt.util.menu.Button {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String owner;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String displayName;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> lore;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function3<? super org.bukkit.entity.Player, ? super java.lang.Integer, ? super org.bukkit.event.inventory.ClickType, kotlin.Unit> body;
    
    public SkullButtonOnlyName(@org.jetbrains.annotations.NotNull()
    java.lang.String owner, @org.jetbrains.annotations.NotNull()
    java.lang.String displayName, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> lore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOwner() {
        return null;
    }
    
    public final void setOwner(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    public final void setDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getLore() {
        return null;
    }
    
    public final void setLore(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<org.bukkit.entity.Player, java.lang.Integer, org.bukkit.event.inventory.ClickType, kotlin.Unit> getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super org.bukkit.entity.Player, ? super java.lang.Integer, ? super org.bukkit.event.inventory.ClickType, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.util.skull.SkullButtonOnlyName setBody(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super org.bukkit.entity.Player, ? super java.lang.Integer, ? super org.bukkit.event.inventory.ClickType, kotlin.Unit> body) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public org.bukkit.inventory.ItemStack getButtonItem(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
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
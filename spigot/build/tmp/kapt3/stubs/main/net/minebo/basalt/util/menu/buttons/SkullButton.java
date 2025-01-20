package net.minebo.basalt.util.menu.buttons;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0007\u0010\bJ(\u0010\u0016\u001a\u00020\u00002 \u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0010\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u0010H\u0016J \u0010 \u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u00102\u0006\u0010!\u001a\u00020\u00112\u0006\u0010\"\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\nR4\u0010\u000e\u001a\u001c\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lnet/minebo/basalt/util/menu/buttons/SkullButton;", "Lnet/minebo/basalt/util/menu/Button;", "texture", "", "description", "", "name", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V", "getTexture", "()Ljava/lang/String;", "getDescription", "()Ljava/util/List;", "getName", "body", "Lkotlin/Function3;", "Lorg/bukkit/entity/Player;", "", "Lorg/bukkit/event/inventory/ClickType;", "", "getBody", "()Lkotlin/jvm/functions/Function3;", "setBody", "(Lkotlin/jvm/functions/Function3;)V", "getButtonItem", "Lorg/bukkit/inventory/ItemStack;", "player", "getMaterial", "Lorg/bukkit/Material;", "getDisplayName", "getData", "", "onClick", "slot", "type", "spigot"})
public final class SkullButton extends net.minebo.basalt.util.menu.Button {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String texture = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function3<? super org.bukkit.entity.Player, ? super java.lang.Integer, ? super org.bukkit.event.inventory.ClickType, kotlin.Unit> body;
    
    public SkullButton(@org.jetbrains.annotations.NotNull()
    java.lang.String texture, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> description, @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTexture() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<org.bukkit.entity.Player, java.lang.Integer, org.bukkit.event.inventory.ClickType, kotlin.Unit> getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super org.bukkit.entity.Player, ? super java.lang.Integer, ? super org.bukkit.event.inventory.ClickType, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.util.menu.buttons.SkullButton setBody(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super org.bukkit.entity.Player, ? super java.lang.Integer, ? super org.bukkit.event.inventory.ClickType, kotlin.Unit> body) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
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
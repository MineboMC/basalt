package net.minebo.basalt.util.menu.buttons;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ(\u0010\u001c\u001a\u00020\u00002 \u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u0010\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0016H\u0016J \u0010 \u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u00162\u0006\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\u0018H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R4\u0010\u0014\u001a\u001c\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d\u00a8\u0006#"}, d2 = {"Lnet/minebo/basalt/util/menu/buttons/SimpleActionButton;", "Lnet/minebo/basalt/util/menu/Button;", "material", "Lorg/bukkit/Material;", "description", "", "", "name", "data", "", "<init>", "(Lorg/bukkit/Material;Ljava/util/List;Ljava/lang/String;S)V", "getMaterial", "()Lorg/bukkit/Material;", "getDescription", "()Ljava/util/List;", "getName", "()Ljava/lang/String;", "getData", "()S", "body", "Lkotlin/Function3;", "Lorg/bukkit/entity/Player;", "", "Lorg/bukkit/event/inventory/ClickType;", "", "getBody", "()Lkotlin/jvm/functions/Function3;", "setBody", "(Lkotlin/jvm/functions/Function3;)V", "player", "getDisplayName", "onClick", "slot", "type", "spigot"})
public final class SimpleActionButton extends net.minebo.basalt.util.menu.Button {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.Material material = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.String> description = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final short data = 0;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function3<? super org.bukkit.entity.Player, ? super java.lang.Integer, ? super org.bukkit.event.inventory.ClickType, kotlin.Unit> body;
    
    public SimpleActionButton(@org.jetbrains.annotations.NotNull()
    org.bukkit.Material material, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> description, @org.jetbrains.annotations.NotNull()
    java.lang.String name, short data) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.Material getMaterial() {
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
    
    public final short getData() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final kotlin.jvm.functions.Function3<org.bukkit.entity.Player, java.lang.Integer, org.bukkit.event.inventory.ClickType, kotlin.Unit> getBody() {
        return null;
    }
    
    public final void setBody(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super org.bukkit.entity.Player, ? super java.lang.Integer, ? super org.bukkit.event.inventory.ClickType, kotlin.Unit> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.util.menu.buttons.SimpleActionButton setBody(@org.jetbrains.annotations.Nullable()
    kotlin.jvm.functions.Function3<? super org.bukkit.entity.Player, ? super java.lang.Integer, ? super org.bukkit.event.inventory.ClickType, kotlin.Unit> body) {
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
package net.minebo.basalt.commands.coins.cart.model;

/**
 * Class created on 8/23/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J#\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0001J\u0013\u0010\u0019\u001a\u00020\u00142\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u001cH\u00d6\u0001J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u001f"}, d2 = {"Lnet/minebo/basalt/commands/coins/cart/model/Cart;", "", "player", "Ljava/util/UUID;", "items", "", "Lnet/minebo/basalt/commands/coins/item/CoinShopItem;", "<init>", "(Ljava/util/UUID;Ljava/util/List;)V", "getPlayer", "()Ljava/util/UUID;", "setPlayer", "(Ljava/util/UUID;)V", "getItems", "()Ljava/util/List;", "setItems", "(Ljava/util/List;)V", "getCombinedPrice", "", "playerCanAfford", "", "Lorg/bukkit/entity/Player;", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "spigot"})
public final class Cart {
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID player;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<net.minebo.basalt.commands.coins.item.CoinShopItem> items;
    
    public Cart(@org.jetbrains.annotations.NotNull()
    java.util.UUID player, @org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.commands.coins.item.CoinShopItem> items) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getPlayer() {
        return null;
    }
    
    public final void setPlayer(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.commands.coins.item.CoinShopItem> getItems() {
        return null;
    }
    
    public final void setItems(@org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.commands.coins.item.CoinShopItem> p0) {
    }
    
    public final double getCombinedPrice() {
        return 0.0;
    }
    
    public final boolean playerCanAfford(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.commands.coins.item.CoinShopItem> component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.commands.coins.cart.model.Cart copy(@org.jetbrains.annotations.NotNull()
    java.util.UUID player, @org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.commands.coins.item.CoinShopItem> items) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}
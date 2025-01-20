package net.minebo.basalt.commands.coins.cart;

/**
 * Class created on 8/23/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u000f"}, d2 = {"Lnet/minebo/basalt/commands/coins/cart/CartHandler;", "", "<init>", "()V", "carts", "", "Ljava/util/UUID;", "Lnet/minebo/basalt/commands/coins/cart/model/Cart;", "getCarts", "()Ljava/util/Map;", "addToCart", "", "id", "item", "Lnet/minebo/basalt/commands/coins/item/CoinShopItem;", "spigot"})
public final class CartHandler {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.util.UUID, net.minebo.basalt.commands.coins.cart.model.Cart> carts = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.commands.coins.cart.CartHandler INSTANCE = null;
    
    private CartHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, net.minebo.basalt.commands.coins.cart.model.Cart> getCarts() {
        return null;
    }
    
    public final void addToCart(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.commands.coins.item.CoinShopItem item) {
    }
}
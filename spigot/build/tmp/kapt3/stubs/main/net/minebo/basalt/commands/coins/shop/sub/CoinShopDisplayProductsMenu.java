package net.minebo.basalt.commands.coins.shop.sub;

/**
 * Class created on 8/23/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0013"}, d2 = {"Lnet/minebo/basalt/commands/coins/shop/sub/CoinShopDisplayProductsMenu;", "Lnet/minebo/basalt/util/menu/type/BorderedPaginatedMenu;", "category", "Lnet/minebo/basalt/commands/coins/category/CoinShopCategory;", "player", "Lorg/bukkit/entity/Player;", "<init>", "(Lnet/minebo/basalt/commands/coins/category/CoinShopCategory;Lorg/bukkit/entity/Player;)V", "getCategory", "()Lnet/minebo/basalt/commands/coins/category/CoinShopCategory;", "getPlayer", "()Lorg/bukkit/entity/Player;", "getPagesButtons", "", "", "Lnet/minebo/basalt/util/menu/Button;", "getTitle", "", "CoinShopButton", "spigot"})
public final class CoinShopDisplayProductsMenu extends net.minebo.basalt.util.menu.type.BorderedPaginatedMenu {
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.commands.coins.category.CoinShopCategory category = null;
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.entity.Player player = null;
    
    public CoinShopDisplayProductsMenu(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.commands.coins.category.CoinShopCategory category, @org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.commands.coins.category.CoinShopCategory getCategory() {
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
    public java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u000bH\u0016J \u0010\u0012\u001a\u00020\u00132\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0018"}, d2 = {"Lnet/minebo/basalt/commands/coins/shop/sub/CoinShopDisplayProductsMenu$CoinShopButton;", "Lnet/minebo/basalt/util/menu/Button;", "item", "Lnet/minebo/basalt/commands/coins/item/CoinShopItem;", "<init>", "(Lnet/minebo/basalt/commands/coins/item/CoinShopItem;)V", "getItem", "()Lnet/minebo/basalt/commands/coins/item/CoinShopItem;", "getMaterial", "Lorg/bukkit/Material;", "player", "Lorg/bukkit/entity/Player;", "getDescription", "", "", "getDisplayName", "getData", "", "onClick", "", "slot", "", "type", "Lorg/bukkit/event/inventory/ClickType;", "spigot"})
    public static final class CoinShopButton extends net.minebo.basalt.util.menu.Button {
        @org.jetbrains.annotations.NotNull()
        private final net.minebo.basalt.commands.coins.item.CoinShopItem item = null;
        
        public CoinShopButton(@org.jetbrains.annotations.NotNull()
        net.minebo.basalt.commands.coins.item.CoinShopItem item) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.commands.coins.item.CoinShopItem getItem() {
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
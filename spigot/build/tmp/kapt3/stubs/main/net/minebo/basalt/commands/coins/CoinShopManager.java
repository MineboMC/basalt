package net.minebo.basalt.commands.coins;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001b\u001a\u00020\u001cJ\u0014\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00190\u001e2\u0006\u0010\u001f\u001a\u00020\u0019J\u0014\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00100\u001e2\u0006\u0010!\u001a\u00020\u0010J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0010J\u0010\u0010#\u001a\u0004\u0018\u00010\u00142\u0006\u0010$\u001a\u00020\u000fJ\u000e\u0010%\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\u0014J\u0014\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00140\u001e2\u0006\u0010!\u001a\u00020\u0014J\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u001e2\u0006\u0010(\u001a\u00020\u0017J\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010*\u001a\u00020\u0017J\u0014\u0010+\u001a\u00020,2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\bR\u001d\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00140\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0012R#\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012\u00a8\u0006."}, d2 = {"Lnet/minebo/basalt/commands/coins/CoinShopManager;", "", "<init>", "()V", "transactions", "Lcom/mongodb/client/MongoCollection;", "Lorg/bson/Document;", "getTransactions", "()Lcom/mongodb/client/MongoCollection;", "items", "getItems", "categories", "getCategories", "itemMap", "", "", "Lnet/minebo/basalt/commands/coins/item/CoinShopItem;", "getItemMap", "()Ljava/util/Map;", "categoryMap", "Lnet/minebo/basalt/commands/coins/category/CoinShopCategory;", "getCategoryMap", "transactionMap", "Ljava/util/UUID;", "", "Lnet/minebo/basalt/commands/coins/transactions/Transaction;", "getTransactionMap", "loadCoinShopAssets", "", "addTransaction", "Ljava/util/concurrent/CompletableFuture;", "transaction", "saveItem", "item", "deleteItem", "findCategory", "id", "deleteCategory", "saveCategory", "lookupTransactions", "user", "findAllTransactions", "uuid", "getTotalPriceOfTransactions", "", "list", "spigot"})
public final class CoinShopManager {
    @org.jetbrains.annotations.NotNull()
    private static final com.mongodb.client.MongoCollection<org.bson.Document> transactions = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.mongodb.client.MongoCollection<org.bson.Document> items = null;
    @org.jetbrains.annotations.NotNull()
    private static final com.mongodb.client.MongoCollection<org.bson.Document> categories = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, net.minebo.basalt.commands.coins.item.CoinShopItem> itemMap = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.lang.String, net.minebo.basalt.commands.coins.category.CoinShopCategory> categoryMap = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.util.UUID, java.util.List<net.minebo.basalt.commands.coins.transactions.Transaction>> transactionMap = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.commands.coins.CoinShopManager INSTANCE = null;
    
    private CoinShopManager() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.MongoCollection<org.bson.Document> getTransactions() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.MongoCollection<org.bson.Document> getItems() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.mongodb.client.MongoCollection<org.bson.Document> getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, net.minebo.basalt.commands.coins.item.CoinShopItem> getItemMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, net.minebo.basalt.commands.coins.category.CoinShopCategory> getCategoryMap() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, java.util.List<net.minebo.basalt.commands.coins.transactions.Transaction>> getTransactionMap() {
        return null;
    }
    
    public final void loadCoinShopAssets() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<net.minebo.basalt.commands.coins.transactions.Transaction> addTransaction(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.commands.coins.transactions.Transaction transaction) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<net.minebo.basalt.commands.coins.item.CoinShopItem> saveItem(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.commands.coins.item.CoinShopItem item) {
        return null;
    }
    
    public final void deleteItem(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.commands.coins.item.CoinShopItem item) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.commands.coins.category.CoinShopCategory findCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String id) {
        return null;
    }
    
    public final void deleteCategory(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.commands.coins.category.CoinShopCategory item) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<net.minebo.basalt.commands.coins.category.CoinShopCategory> saveCategory(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.commands.coins.category.CoinShopCategory item) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.List<net.minebo.basalt.commands.coins.transactions.Transaction>> lookupTransactions(@org.jetbrains.annotations.NotNull()
    java.util.UUID user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.commands.coins.transactions.Transaction> findAllTransactions(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    public final double getTotalPriceOfTransactions(@org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.commands.coins.transactions.Transaction> list) {
        return 0.0;
    }
}
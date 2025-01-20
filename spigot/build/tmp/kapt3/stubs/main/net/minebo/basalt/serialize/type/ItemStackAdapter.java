package net.minebo.basalt.serialize.type;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0010\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\u0005J\u001d\u0010\n\u001a\u0004\u0018\u00010\u00052\u000e\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f\u00a2\u0006\u0002\u0010\rJ\u001b\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\f2\u0006\u0010\t\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lnet/minebo/basalt/serialize/type/ItemStackAdapter;", "", "<init>", "()V", "itemTo64", "", "stack", "Lorg/bukkit/inventory/ItemStack;", "itemFrom64", "data", "itemStackArrayToBase64", "items", "", "([Lorg/bukkit/inventory/ItemStack;)Ljava/lang/String;", "itemStackArrayFromBase64", "(Ljava/lang/String;)[Lorg/bukkit/inventory/ItemStack;", "spigot"})
public final class ItemStackAdapter {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.serialize.type.ItemStackAdapter INSTANCE = null;
    
    private ItemStackAdapter() {
        super();
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalStateException.class})
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String itemTo64(@org.jetbrains.annotations.NotNull()
    org.bukkit.inventory.ItemStack stack) throws java.lang.IllegalStateException {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.Nullable()
    public final org.bukkit.inventory.ItemStack itemFrom64(@org.jetbrains.annotations.NotNull()
    java.lang.String data) throws java.io.IOException {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.IllegalStateException.class})
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String itemStackArrayToBase64(@org.jetbrains.annotations.NotNull()
    org.bukkit.inventory.ItemStack[] items) throws java.lang.IllegalStateException {
        return null;
    }
    
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.inventory.ItemStack[] itemStackArrayFromBase64(@org.jetbrains.annotations.NotNull()
    java.lang.String data) throws java.io.IOException {
        return null;
    }
}
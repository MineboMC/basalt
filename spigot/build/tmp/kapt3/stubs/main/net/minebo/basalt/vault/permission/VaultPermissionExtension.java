package net.minebo.basalt.vault.permission;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0006\u001a\u00020\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J&\u0010\r\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0011\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0012\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0013\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0014\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0015\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0016\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0017\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J&\u0010\u0018\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\tH\u0016J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\u001a2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016\u00a2\u0006\u0002\u0010\u001bJ\u001c\u0010\u001c\u001a\u00020\t2\b\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\u0010\u000f\u001a\u0004\u0018\u00010\tH\u0016J\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u001aH\u0016\u00a2\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"Lnet/minebo/basalt/vault/permission/VaultPermissionExtension;", "Lnet/milkbowl/vault/permission/Permission;", "<init>", "()V", "basalt", "Lnet/minebo/basalt/BasaltSpigotPlugin;", "init", "", "getName", "", "isEnabled", "", "hasSuperPermsCompat", "playerHas", "p0", "p1", "p2", "playerAdd", "playerRemove", "groupHas", "groupAdd", "groupRemove", "playerInGroup", "playerAddGroup", "playerRemoveGroup", "getPlayerGroups", "", "(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;", "getPrimaryGroup", "getGroups", "()[Ljava/lang/String;", "hasGroupSupport", "spigot"})
public final class VaultPermissionExtension extends net.milkbowl.vault.permission.Permission {
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.BasaltSpigotPlugin basalt = null;
    
    public VaultPermissionExtension() {
        super();
    }
    
    public final void init() {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getName() {
        return null;
    }
    
    @java.lang.Override()
    public boolean isEnabled() {
        return false;
    }
    
    @java.lang.Override()
    public boolean hasSuperPermsCompat() {
        return false;
    }
    
    @java.lang.Override()
    public boolean playerHas(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2) {
        return false;
    }
    
    @java.lang.Override()
    public boolean playerAdd(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2) {
        return false;
    }
    
    @java.lang.Override()
    public boolean playerRemove(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2) {
        return false;
    }
    
    @java.lang.Override()
    public boolean groupHas(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2) {
        return false;
    }
    
    @java.lang.Override()
    public boolean groupAdd(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2) {
        return false;
    }
    
    @java.lang.Override()
    public boolean groupRemove(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2) {
        return false;
    }
    
    @java.lang.Override()
    public boolean playerInGroup(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2) {
        return false;
    }
    
    @java.lang.Override()
    public boolean playerAddGroup(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2) {
        return false;
    }
    
    @java.lang.Override()
    public boolean playerRemoveGroup(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2) {
        return false;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String[] getPlayerGroups(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPrimaryGroup(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String[] getGroups() {
        return null;
    }
    
    @java.lang.Override()
    public boolean hasGroupSupport() {
        return false;
    }
}
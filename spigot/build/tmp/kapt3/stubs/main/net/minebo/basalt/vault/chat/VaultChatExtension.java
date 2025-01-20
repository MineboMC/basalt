package net.minebo.basalt.vault.chat;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u0013\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u0016\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u0017\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u0018\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u0019\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0016J\u001c\u0010\u001a\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016J&\u0010\u001b\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0016J.\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J.\u0010\u001f\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J.\u0010 \u001a\u00020\u001d2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J.\u0010!\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J.\u0010\"\u001a\u00020#2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020#H\u0016J.\u0010$\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020#H\u0016J.\u0010%\u001a\u00020#2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020#H\u0016J.\u0010&\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020#H\u0016J.\u0010'\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J.\u0010(\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J.\u0010)\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J.\u0010*\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\u0006\u0010\u001e\u001a\u00020\u000fH\u0016J0\u0010+\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0016J0\u0010,\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0016J0\u0010-\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0016J0\u0010.\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\r2\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006/"}, d2 = {"Lnet/minebo/basalt/vault/chat/VaultChatExtension;", "Lnet/milkbowl/vault/chat/Chat;", "perms", "Lnet/milkbowl/vault/permission/Permission;", "plugin", "Lorg/bukkit/plugin/Plugin;", "<init>", "(Lnet/milkbowl/vault/permission/Permission;Lorg/bukkit/plugin/Plugin;)V", "getPlugin", "()Lorg/bukkit/plugin/Plugin;", "setPlugin", "(Lorg/bukkit/plugin/Plugin;)V", "getName", "", "isEnabled", "", "getPlayerPrefix", "p0", "p1", "setPlayerPrefix", "", "p2", "getPlayerSuffix", "setPlayerSuffix", "getGroupPrefix", "setGroupPrefix", "getGroupSuffix", "setGroupSuffix", "getPlayerInfoInteger", "", "p3", "setPlayerInfoInteger", "getGroupInfoInteger", "setGroupInfoInteger", "getPlayerInfoDouble", "", "setPlayerInfoDouble", "getGroupInfoDouble", "setGroupInfoDouble", "getPlayerInfoBoolean", "setPlayerInfoBoolean", "getGroupInfoBoolean", "setGroupInfoBoolean", "getPlayerInfoString", "setPlayerInfoString", "getGroupInfoString", "setGroupInfoString", "spigot"})
public final class VaultChatExtension extends net.milkbowl.vault.chat.Chat {
    @org.jetbrains.annotations.NotNull()
    private org.bukkit.plugin.Plugin plugin;
    
    public VaultChatExtension(@org.jetbrains.annotations.NotNull()
    net.milkbowl.vault.permission.Permission perms, @org.jetbrains.annotations.NotNull()
    org.bukkit.plugin.Plugin plugin) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.plugin.Plugin getPlugin() {
        return null;
    }
    
    public final void setPlugin(@org.jetbrains.annotations.NotNull()
    org.bukkit.plugin.Plugin p0) {
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
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPlayerPrefix(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
        return null;
    }
    
    @java.lang.Override()
    public void setPlayerPrefix(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPlayerSuffix(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
        return null;
    }
    
    @java.lang.Override()
    public void setPlayerSuffix(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getGroupPrefix(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
        return null;
    }
    
    @java.lang.Override()
    public void setGroupPrefix(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getGroupSuffix(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1) {
        return null;
    }
    
    @java.lang.Override()
    public void setGroupSuffix(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2) {
    }
    
    @java.lang.Override()
    public int getPlayerInfoInteger(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, int p3) {
        return 0;
    }
    
    @java.lang.Override()
    public void setPlayerInfoInteger(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, int p3) {
    }
    
    @java.lang.Override()
    public int getGroupInfoInteger(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, int p3) {
        return 0;
    }
    
    @java.lang.Override()
    public void setGroupInfoInteger(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, int p3) {
    }
    
    @java.lang.Override()
    public double getPlayerInfoDouble(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, double p3) {
        return 0.0;
    }
    
    @java.lang.Override()
    public void setPlayerInfoDouble(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, double p3) {
    }
    
    @java.lang.Override()
    public double getGroupInfoDouble(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, double p3) {
        return 0.0;
    }
    
    @java.lang.Override()
    public void setGroupInfoDouble(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, double p3) {
    }
    
    @java.lang.Override()
    public boolean getPlayerInfoBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, boolean p3) {
        return false;
    }
    
    @java.lang.Override()
    public void setPlayerInfoBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, boolean p3) {
    }
    
    @java.lang.Override()
    public boolean getGroupInfoBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, boolean p3) {
        return false;
    }
    
    @java.lang.Override()
    public void setGroupInfoBoolean(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, boolean p3) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPlayerInfoString(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, @org.jetbrains.annotations.Nullable()
    java.lang.String p3) {
        return null;
    }
    
    @java.lang.Override()
    public void setPlayerInfoString(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, @org.jetbrains.annotations.Nullable()
    java.lang.String p3) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getGroupInfoString(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, @org.jetbrains.annotations.Nullable()
    java.lang.String p3) {
        return null;
    }
    
    @java.lang.Override()
    public void setGroupInfoString(@org.jetbrains.annotations.Nullable()
    java.lang.String p0, @org.jetbrains.annotations.Nullable()
    java.lang.String p1, @org.jetbrains.annotations.Nullable()
    java.lang.String p2, @org.jetbrains.annotations.Nullable()
    java.lang.String p3) {
    }
}
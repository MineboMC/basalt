package net.minebo.basalt.api;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u001aJ\u0016\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0 2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\"\u001a\u0004\u0018\u00010!2\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010#\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u001aJ\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020'0&0 J\u000e\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u0005J\u0010\u0010+\u001a\u0004\u0018\u00010)2\u0006\u0010*\u001a\u00020\u0005R$\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR$\u0010\f\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\r\u0010\b\"\u0004\b\u000e\u0010\nR$\u0010\u000f\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0010\u0010\b\"\u0004\b\u0011\u0010\nR$\u0010\u0012\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u000b\u001a\u0004\b\u0013\u0010\b\"\u0004\b\u0014\u0010\nR\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\b\"\u0004\b\u0017\u0010\n\u00a8\u0006,"}, d2 = {"Lnet/minebo/basalt/api/BasaltAPI;", "", "<init>", "()V", "SERVER_NAME", "", "kotlin.jvm.PlatformType", "getSERVER_NAME", "()Ljava/lang/String;", "setSERVER_NAME", "(Ljava/lang/String;)V", "Ljava/lang/String;", "GENERIC_NAME", "getGENERIC_NAME", "setGENERIC_NAME", "SC_FORMAT", "getSC_FORMAT", "setSC_FORMAT", "AC_FORMAT", "getAC_FORMAT", "setAC_FORMAT", "CONSOLE_COLOR", "getCONSOLE_COLOR", "setCONSOLE_COLOR", "getRankDisplay", "uuid", "Ljava/util/UUID;", "getPlayerRankString", "getRankWeight", "", "getRankWithPrefix", "quickFindProfile", "Ljava/util/concurrent/CompletableFuture;", "Lnet/minebo/basalt/models/profile/GameProfile;", "syncFindProfile", "findRank", "Lnet/minebo/basalt/models/ranks/Rank;", "supplyColoredNames", "", "Lorg/bukkit/entity/Player;", "getWoolColor", "Lorg/bukkit/DyeColor;", "color", "getWoolColorStrict", "spigot"})
public final class BasaltAPI {
    private static java.lang.String SERVER_NAME;
    private static java.lang.String GENERIC_NAME;
    private static java.lang.String SC_FORMAT;
    private static java.lang.String AC_FORMAT;
    @org.jetbrains.annotations.NotNull()
    private static java.lang.String CONSOLE_COLOR;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.api.BasaltAPI INSTANCE = null;
    
    private BasaltAPI() {
        super();
    }
    
    public final java.lang.String getSERVER_NAME() {
        return null;
    }
    
    public final void setSERVER_NAME(java.lang.String p0) {
    }
    
    public final java.lang.String getGENERIC_NAME() {
        return null;
    }
    
    public final void setGENERIC_NAME(java.lang.String p0) {
    }
    
    public final java.lang.String getSC_FORMAT() {
        return null;
    }
    
    public final void setSC_FORMAT(java.lang.String p0) {
    }
    
    public final java.lang.String getAC_FORMAT() {
        return null;
    }
    
    public final void setAC_FORMAT(java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCONSOLE_COLOR() {
        return null;
    }
    
    public final void setCONSOLE_COLOR(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRankDisplay(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPlayerRankString(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    public final int getRankWeight(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRankWithPrefix(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<net.minebo.basalt.models.profile.GameProfile> quickFindProfile(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.profile.GameProfile syncFindProfile(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.ranks.Rank findRank(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.util.List<org.bukkit.entity.Player>> supplyColoredNames() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.DyeColor getWoolColor(@org.jetbrains.annotations.NotNull()
    java.lang.String color) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.bukkit.DyeColor getWoolColorStrict(@org.jetbrains.annotations.NotNull()
    java.lang.String color) {
        return null;
    }
}
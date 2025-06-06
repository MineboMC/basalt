package net.minebo.basalt.models.website;

/**
 * Class created on 11/24/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b)\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Ba\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\r\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\u0006J\u0006\u0010*\u001a\u00020\u0006J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\nH\u00c6\u0003J\t\u00101\u001a\u00020\nH\u00c6\u0003J\u000f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u00c6\u0003Jc\u00103\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rH\u00c6\u0001J\u0013\u00104\u001a\u00020\n2\b\u00105\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00106\u001a\u000207H\u00d6\u0001J\t\u00108\u001a\u00020\u0006H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\u000b\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'\u00a8\u00069"}, d2 = {"Lnet/minebo/basalt/models/website/BasaltUser;", "", "random_id", "Ljava/util/UUID;", "minecraft_uuid", "username", "", "password", "secret", "administrator", "", "authenticated", "permissions", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLjava/util/List;)V", "getRandom_id", "()Ljava/util/UUID;", "setRandom_id", "(Ljava/util/UUID;)V", "getMinecraft_uuid", "setMinecraft_uuid", "getUsername", "()Ljava/lang/String;", "setUsername", "(Ljava/lang/String;)V", "getPassword", "setPassword", "getSecret", "setSecret", "getAdministrator", "()Z", "setAdministrator", "(Z)V", "getAuthenticated", "setAuthenticated", "getPermissions", "()Ljava/util/List;", "setPermissions", "(Ljava/util/List;)V", "hasPermission", "permission", "getNiceUUID", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "commons"})
public final class BasaltUser {
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID random_id;
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID minecraft_uuid;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String username;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String password;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String secret;
    private boolean administrator;
    private boolean authenticated;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> permissions;
    
    public BasaltUser(@org.jetbrains.annotations.NotNull()
    java.util.UUID random_id, @org.jetbrains.annotations.NotNull()
    java.util.UUID minecraft_uuid, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String secret, boolean administrator, boolean authenticated, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> permissions) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getRandom_id() {
        return null;
    }
    
    public final void setRandom_id(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getMinecraft_uuid() {
        return null;
    }
    
    public final void setMinecraft_uuid(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPassword() {
        return null;
    }
    
    public final void setPassword(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSecret() {
        return null;
    }
    
    public final void setSecret(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    public final boolean getAdministrator() {
        return false;
    }
    
    public final void setAdministrator(boolean p0) {
    }
    
    public final boolean getAuthenticated() {
        return false;
    }
    
    public final void setAuthenticated(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getPermissions() {
        return null;
    }
    
    public final void setPermissions(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public final boolean hasPermission(@org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNiceUUID() {
        return null;
    }
    
    public BasaltUser() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    public final boolean component6() {
        return false;
    }
    
    public final boolean component7() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.website.BasaltUser copy(@org.jetbrains.annotations.NotNull()
    java.util.UUID random_id, @org.jetbrains.annotations.NotNull()
    java.util.UUID minecraft_uuid, @org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.Nullable()
    java.lang.String password, @org.jetbrains.annotations.Nullable()
    java.lang.String secret, boolean administrator, boolean authenticated, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> permissions) {
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
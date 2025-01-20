package net.minebo.basalt.profiles.permissions;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0018\u001a\u00020\u0019J&\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u00062\u0016\u0010\u001c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010J\u000e\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001fJ\u000e\u0010 \u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001fJ\"\u0010\"\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001f2\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rRV\u0010\u000e\u001a>\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00100\u000fj\u001e\u0012\u0004\u0012\u00020\u0006\u0012\u0014\u0012\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0011\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u0010`\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006#"}, d2 = {"Lnet/minebo/basalt/profiles/permissions/AccessiblePermissionHandler;", "", "<init>", "()V", "permissionAttachmentMap", "", "Ljava/util/UUID;", "Lorg/bukkit/permissions/PermissionAttachment;", "permissionField", "Ljava/lang/reflect/Field;", "getPermissionField", "()Ljava/lang/reflect/Field;", "setPermissionField", "(Ljava/lang/reflect/Field;)V", "pendingLoadPermissions", "Ljava/util/HashMap;", "", "", "", "Lkotlin/collections/HashMap;", "getPendingLoadPermissions", "()Ljava/util/HashMap;", "setPendingLoadPermissions", "(Ljava/util/HashMap;)V", "load", "", "setupPlayer", "uuid", "perms", "remove", "player", "Lorg/bukkit/entity/Player;", "findRankWeight", "", "update", "spigot"})
public final class AccessiblePermissionHandler {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.util.UUID, org.bukkit.permissions.PermissionAttachment> permissionAttachmentMap = null;
    public static java.lang.reflect.Field permissionField;
    @org.jetbrains.annotations.NotNull()
    private static java.util.HashMap<java.util.UUID, java.util.Map<java.lang.String, java.lang.Boolean>> pendingLoadPermissions;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.profiles.permissions.AccessiblePermissionHandler INSTANCE = null;
    
    private AccessiblePermissionHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.reflect.Field getPermissionField() {
        return null;
    }
    
    public final void setPermissionField(@org.jetbrains.annotations.NotNull()
    java.lang.reflect.Field p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.util.UUID, java.util.Map<java.lang.String, java.lang.Boolean>> getPendingLoadPermissions() {
        return null;
    }
    
    public final void setPendingLoadPermissions(@org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.util.UUID, java.util.Map<java.lang.String, java.lang.Boolean>> p0) {
    }
    
    public final void load() {
    }
    
    public final void setupPlayer(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Boolean> perms) {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    public final int findRankWeight(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return 0;
    }
    
    public final void update(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, java.lang.Boolean> perms) {
    }
}
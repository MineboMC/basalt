package net.minebo.basalt.permission;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lnet/minebo/basalt/permission/BasaltPermissionProvider;", "Lcom/velocitypowered/api/permission/PermissionProvider;", "Lcom/velocitypowered/api/permission/PermissionFunction;", "player", "Lcom/velocitypowered/api/proxy/Player;", "profile", "Lnet/minebo/basalt/models/profile/GameProfile;", "<init>", "(Lcom/velocitypowered/api/proxy/Player;Lnet/minebo/basalt/models/profile/GameProfile;)V", "createFunction", "subject", "Lcom/velocitypowered/api/permission/PermissionSubject;", "getPermissionValue", "Lcom/velocitypowered/api/permission/Tristate;", "permission", "", "velocity"})
public final class BasaltPermissionProvider implements com.velocitypowered.api.permission.PermissionProvider, com.velocitypowered.api.permission.PermissionFunction {
    @org.jetbrains.annotations.NotNull()
    private final com.velocitypowered.api.proxy.Player player = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.profile.GameProfile profile = null;
    
    public BasaltPermissionProvider(@org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.proxy.Player player, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile profile) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.velocitypowered.api.permission.PermissionFunction createFunction(@org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.permission.PermissionSubject subject) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.velocitypowered.api.permission.Tristate getPermissionValue(@org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return null;
    }
}
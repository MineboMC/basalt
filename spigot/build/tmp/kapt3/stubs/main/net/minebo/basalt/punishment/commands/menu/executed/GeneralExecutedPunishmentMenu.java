package net.minebo.basalt.punishment.commands.menu.executed;

/**
 * Class created on 5/7/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001c\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u00172\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0006\u001a\u00020\u0007H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\u001d"}, d2 = {"Lnet/minebo/basalt/punishment/commands/menu/executed/GeneralExecutedPunishmentMenu;", "Lnet/minebo/basalt/util/menu/pagination/PaginatedMenu;", "profile", "Lnet/minebo/basalt/models/profile/GameProfile;", "punishmentType", "Lnet/minebo/basalt/punishments/PunishmentType;", "player", "Lorg/bukkit/entity/Player;", "<init>", "(Lnet/minebo/basalt/models/profile/GameProfile;Lnet/minebo/basalt/punishments/PunishmentType;Lorg/bukkit/entity/Player;)V", "getProfile", "()Lnet/minebo/basalt/models/profile/GameProfile;", "setProfile", "(Lnet/minebo/basalt/models/profile/GameProfile;)V", "getPunishmentType", "()Lnet/minebo/basalt/punishments/PunishmentType;", "setPunishmentType", "(Lnet/minebo/basalt/punishments/PunishmentType;)V", "getPlayer", "()Lorg/bukkit/entity/Player;", "setPlayer", "(Lorg/bukkit/entity/Player;)V", "getHeaderItems", "", "", "Lnet/minebo/basalt/util/menu/Button;", "getPagesButtons", "getTitle", "", "spigot"})
public final class GeneralExecutedPunishmentMenu extends net.minebo.basalt.util.menu.pagination.PaginatedMenu {
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.models.profile.GameProfile profile;
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.punishments.PunishmentType punishmentType;
    @org.jetbrains.annotations.NotNull()
    private org.bukkit.entity.Player player;
    
    public GeneralExecutedPunishmentMenu(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile profile, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.PunishmentType punishmentType, @org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        super(0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.profile.GameProfile getProfile() {
        return null;
    }
    
    public final void setProfile(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.punishments.PunishmentType getPunishmentType() {
        return null;
    }
    
    public final void setPunishmentType(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.PunishmentType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.entity.Player getPlayer() {
        return null;
    }
    
    public final void setPlayer(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getHeaderItems(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
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
}
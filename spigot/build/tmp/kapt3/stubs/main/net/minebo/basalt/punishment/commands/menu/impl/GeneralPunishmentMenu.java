package net.minebo.basalt.punishment.commands.menu.impl;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u001c\u0010#\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\u000e\u0010'\u001a\b\u0012\u0004\u0012\u00020%0(H\u0016J\u001c\u0010)\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020&0$2\u0006\u0010\u000b\u001a\u00020\fH\u0016J\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0\u0007J\b\u0010,\u001a\u00020%H\u0016J\u0010\u0010-\u001a\u00020+2\u0006\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u0006."}, d2 = {"Lnet/minebo/basalt/punishment/commands/menu/impl/GeneralPunishmentMenu;", "Lnet/minebo/basalt/util/menu/pagination/PaginatedMenu;", "profile", "Lnet/minebo/basalt/models/profile/GameProfile;", "punishmentType", "Lnet/minebo/basalt/punishments/PunishmentType;", "punishments", "", "Lnet/minebo/basalt/models/grant/types/Punishment;", "punishmentFilter", "Lnet/minebo/basalt/punishment/commands/menu/impl/filter/PunishmentFilter;", "player", "Lorg/bukkit/entity/Player;", "<init>", "(Lnet/minebo/basalt/models/profile/GameProfile;Lnet/minebo/basalt/punishments/PunishmentType;Ljava/util/List;Lnet/minebo/basalt/punishment/commands/menu/impl/filter/PunishmentFilter;Lorg/bukkit/entity/Player;)V", "getProfile", "()Lnet/minebo/basalt/models/profile/GameProfile;", "setProfile", "(Lnet/minebo/basalt/models/profile/GameProfile;)V", "getPunishmentType", "()Lnet/minebo/basalt/punishments/PunishmentType;", "setPunishmentType", "(Lnet/minebo/basalt/punishments/PunishmentType;)V", "getPunishments", "()Ljava/util/List;", "setPunishments", "(Ljava/util/List;)V", "getPunishmentFilter", "()Lnet/minebo/basalt/punishment/commands/menu/impl/filter/PunishmentFilter;", "setPunishmentFilter", "(Lnet/minebo/basalt/punishment/commands/menu/impl/filter/PunishmentFilter;)V", "getPlayer", "()Lorg/bukkit/entity/Player;", "setPlayer", "(Lorg/bukkit/entity/Player;)V", "getPagesButtons", "", "", "Lnet/minebo/basalt/util/menu/Button;", "getButtonPositions", "", "getHeaderItems", "getFilterDesc", "", "getButtonsPerPage", "getTitle", "spigot"})
public final class GeneralPunishmentMenu extends net.minebo.basalt.util.menu.pagination.PaginatedMenu {
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.models.profile.GameProfile profile;
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.punishments.PunishmentType punishmentType;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<net.minebo.basalt.models.grant.types.Punishment> punishments;
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.punishment.commands.menu.impl.filter.PunishmentFilter punishmentFilter;
    @org.jetbrains.annotations.NotNull()
    private org.bukkit.entity.Player player;
    
    public GeneralPunishmentMenu(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile profile, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.PunishmentType punishmentType, @org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.models.grant.types.Punishment> punishments, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishment.commands.menu.impl.filter.PunishmentFilter punishmentFilter, @org.jetbrains.annotations.NotNull()
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
    public final java.util.List<net.minebo.basalt.models.grant.types.Punishment> getPunishments() {
        return null;
    }
    
    public final void setPunishments(@org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.models.grant.types.Punishment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.punishment.commands.menu.impl.filter.PunishmentFilter getPunishmentFilter() {
        return null;
    }
    
    public final void setPunishmentFilter(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishment.commands.menu.impl.filter.PunishmentFilter p0) {
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
    public java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getPagesButtons(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.List<java.lang.Integer> getButtonPositions() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getHeaderItems(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getFilterDesc() {
        return null;
    }
    
    @java.lang.Override()
    public int getButtonsPerPage() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getTitle(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
}
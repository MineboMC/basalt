package net.minebo.basalt.profiles.commands.player.menu;

/**
 * Class created on 6/4/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u000fH\u0016J\u001c\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00100\u00122\u0006\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0002\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0015"}, d2 = {"Lnet/minebo/basalt/profiles/commands/player/menu/PlayerInformationMenu;", "Lnet/minebo/basalt/util/menu/Menu;", "player", "Lorg/bukkit/entity/Player;", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "<init>", "(Lorg/bukkit/entity/Player;Lnet/minebo/basalt/models/profile/GameProfile;)V", "getPlayer", "()Lorg/bukkit/entity/Player;", "getTarget", "()Lnet/minebo/basalt/models/profile/GameProfile;", "size", "", "buttons", "", "Lnet/minebo/basalt/util/menu/Button;", "getButtons", "", "getTitle", "", "spigot"})
public final class PlayerInformationMenu extends net.minebo.basalt.util.menu.Menu {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.entity.Player player = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.profile.GameProfile target = null;
    
    public PlayerInformationMenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.entity.Player getPlayer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.profile.GameProfile getTarget() {
        return null;
    }
    
    @java.lang.Override()
    public int size(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.Integer, ? extends net.minebo.basalt.util.menu.Button> buttons) {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.util.Map<java.lang.Integer, net.minebo.basalt.util.menu.Button> getButtons(@org.jetbrains.annotations.NotNull()
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
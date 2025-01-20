package net.minebo.basalt.commands.notes.menu;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u0003H\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lnet/minebo/basalt/commands/notes/menu/PlayerNotesMenu;", "Lnet/minebo/basalt/util/menu/pagination/PaginatedMenu;", "p", "Lorg/bukkit/entity/Player;", "gameProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "<init>", "(Lorg/bukkit/entity/Player;Lnet/minebo/basalt/models/profile/GameProfile;)V", "getGameProfile", "()Lnet/minebo/basalt/models/profile/GameProfile;", "getPagesButtons", "", "", "Lnet/minebo/basalt/util/menu/Button;", "player", "getTitle", "", "spigot"})
public final class PlayerNotesMenu extends net.minebo.basalt.util.menu.pagination.PaginatedMenu {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.entity.Player p = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.profile.GameProfile gameProfile = null;
    
    public PlayerNotesMenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player p, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile) {
        super(0, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.profile.GameProfile getGameProfile() {
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
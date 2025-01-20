package net.minebo.basalt.broadcasts.menu.lines;

/**
 * Class created on 1/17/2024
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lnet/minebo/basalt/broadcasts/menu/lines/EditBroadcastLinesMenu;", "Lnet/minebo/basalt/util/menu/type/TextEditorMenu;", "player", "Lorg/bukkit/entity/Player;", "broadcast", "Lnet/minebo/basalt/broadcasts/model/BroadcastMessage;", "<init>", "(Lorg/bukkit/entity/Player;Lnet/minebo/basalt/broadcasts/model/BroadcastMessage;)V", "onSave", "", "lines", "Ljava/util/LinkedList;", "", "spigot"})
public final class EditBroadcastLinesMenu extends net.minebo.basalt.util.menu.type.TextEditorMenu {
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.broadcasts.model.BroadcastMessage broadcast = null;
    
    public EditBroadcastLinesMenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.broadcasts.model.BroadcastMessage broadcast) {
        super(null, null);
    }
    
    @java.lang.Override()
    public void onSave(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.util.LinkedList<java.lang.String> lines) {
    }
}
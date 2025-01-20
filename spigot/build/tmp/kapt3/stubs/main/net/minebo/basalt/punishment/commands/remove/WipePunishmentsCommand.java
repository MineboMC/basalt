package net.minebo.basalt.punishment.commands.remove;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/punishment/commands/remove/WipePunishmentsCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "wipePunishments", "", "player", "Lorg/bukkit/entity/Player;", "typestr", "", "spigot"})
public final class WipePunishmentsCommand extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.punishment.commands.remove.WipePunishmentsCommand INSTANCE = null;
    
    private WipePunishmentsCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "wipepunishments")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.punishments.wipe")
    public final void wipePunishments(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String typestr) {
    }
}
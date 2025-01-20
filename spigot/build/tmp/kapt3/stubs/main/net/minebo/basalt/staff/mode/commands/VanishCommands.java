package net.minebo.basalt.staff.mode.commands;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\t"}, d2 = {"Lnet/minebo/basalt/staff/mode/commands/VanishCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "vanish", "", "player", "Lorg/bukkit/entity/Player;", "qvis", "spigot"})
public final class VanishCommands extends co.aikar.commands.BaseCommand {
    
    public VanishCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "vanish|v|byebye")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.staffmode")
    public final void vanish(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "?vis|qvis|amivanished|visible")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.staffmode")
    public final void qvis(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
}
package net.minebo.basalt.profiles.commands.player;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/profiles/commands/player/SudoCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "sudoAll", "", "sender", "Lorg/bukkit/command/CommandSender;", "message", "", "spigot"})
public final class SudoCommand extends co.aikar.commands.BaseCommand {
    
    public SudoCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "sudoall")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.sudoall")
    public final void sudoAll(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "message")
    @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
}
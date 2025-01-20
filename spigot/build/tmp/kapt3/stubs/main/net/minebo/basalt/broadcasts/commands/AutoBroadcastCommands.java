package net.minebo.basalt.broadcasts.commands;

@co.aikar.commands.annotation.CommandAlias(value = "auto-broadcasts")
@co.aikar.commands.annotation.CommandPermission(value = "basalt.autobroadcasts")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lnet/minebo/basalt/broadcasts/commands/AutoBroadcastCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "onHelp", "", "command", "Lco/aikar/commands/CommandHelp;", "onCreate", "sender", "Lorg/bukkit/command/CommandSender;", "id", "", "onEditor", "Lorg/bukkit/entity/Player;", "spigot"})
public final class AutoBroadcastCommands extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.broadcasts.commands.AutoBroadcastCommands INSTANCE = null;
    
    private AutoBroadcastCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.HelpCommand()
    @co.aikar.commands.annotation.Syntax(value = "[page]")
    public final void onHelp(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.CommandHelp command) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "create")
    public final void onCreate(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "editor")
    public final void onEditor(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player sender) {
    }
}
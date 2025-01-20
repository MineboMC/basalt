package net.minebo.basalt.servers.commands;

@co.aikar.commands.annotation.CommandAlias(value = "senv|env|environment")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0010H\u0007J\u001a\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00102\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0007\u00a8\u0006\u0013"}, d2 = {"Lnet/minebo/basalt/servers/commands/ServerEnvironmentCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "help", "", "Lco/aikar/commands/CommandHelp;", "servermenu", "player", "Lorg/bukkit/entity/Player;", "delete", "sender", "id", "", "dump", "check", "Lorg/bukkit/command/CommandSender;", "release", "time", "spigot"})
public final class ServerEnvironmentCommand extends co.aikar.commands.BaseCommand {
    
    public ServerEnvironmentCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.HelpCommand()
    public final void help(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.CommandHelp help) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "menu")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.servers.admin")
    public final void servermenu(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "delete-model")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.servers.admin")
    public final void delete(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player sender, @co.aikar.commands.annotation.Name(value = "id")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "dump")
    public final void dump(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "checkrelease")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.servers.admin")
    public final void check(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender player) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "releasetimer")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.servers.admin")
    public final void release(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "duration")
    @org.jetbrains.annotations.NotNull()
    java.lang.String time) {
    }
}
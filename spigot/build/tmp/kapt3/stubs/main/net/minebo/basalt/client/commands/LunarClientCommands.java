package net.minebo.basalt.client.commands;

/**
 * Class created on 9/13/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@co.aikar.commands.annotation.CommandAlias(value = "lunarclient|lc")
@co.aikar.commands.annotation.CommandPermission(value = "basalt.clients.lunar")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lnet/minebo/basalt/client/commands/LunarClientCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "help", "", "Lco/aikar/commands/CommandHelp;", "players", "player", "Lorg/bukkit/command/CommandSender;", "check", "target", "Lco/aikar/commands/bukkit/contexts/OnlinePlayer;", "spigot"})
public final class LunarClientCommands extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.client.commands.LunarClientCommands INSTANCE = null;
    
    private LunarClientCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.HelpCommand()
    public final void help(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.CommandHelp help) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "players")
    public final void players(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender player) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "check")
    @co.aikar.commands.annotation.CommandCompletion(value = "@players")
    public final void check(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    co.aikar.commands.bukkit.contexts.OnlinePlayer target) {
    }
}
package net.minebo.basalt.servers.commands;

/**
 * Class created on 8/3/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/servers/commands/BroadcastCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "bc", "", "sender", "Lorg/bukkit/command/CommandSender;", "msg", "", "spigot"})
public final class BroadcastCommand extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.servers.commands.BroadcastCommand INSTANCE = null;
    
    private BroadcastCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "bc|broadcast|raw")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.broadcast")
    @co.aikar.commands.annotation.Syntax(value = "[-p\u2758-s] <message...>")
    public final void bc(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "message...")
    @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
}
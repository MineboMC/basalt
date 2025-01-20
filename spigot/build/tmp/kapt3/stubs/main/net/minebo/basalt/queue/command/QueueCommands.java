package net.minebo.basalt.queue.command;

/**
 * Class created on 7/12/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@co.aikar.commands.annotation.CommandAlias(value = "queue")
@co.aikar.commands.annotation.CommandPermission(value = "basalt.queues.admin")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lnet/minebo/basalt/queue/command/QueueCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "editor", "", "player", "Lorg/bukkit/entity/Player;", "pause", "queue", "", "spigot"})
public final class QueueCommands extends co.aikar.commands.BaseCommand {
    
    public QueueCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "editor")
    public final void editor(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "pause")
    public final void pause(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "queue")
    @org.jetbrains.annotations.NotNull()
    java.lang.String queue) {
    }
}
package net.minebo.basalt.queue.command;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\f"}, d2 = {"Lnet/minebo/basalt/queue/command/ModifyQueueCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "joinQueue", "", "player", "Lorg/bukkit/entity/Player;", "queue", "", "checkQueue", "leaveQueue", "spigot"})
public final class ModifyQueueCommands extends co.aikar.commands.BaseCommand {
    
    public ModifyQueueCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "joinqueue|jq|play|queuejoin")
    public final void joinQueue(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "queue")
    @org.jetbrains.annotations.NotNull()
    java.lang.String queue) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "checkqueue")
    public final void checkQueue(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "leavequeue|lq|queueleave")
    public final void leaveQueue(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
}
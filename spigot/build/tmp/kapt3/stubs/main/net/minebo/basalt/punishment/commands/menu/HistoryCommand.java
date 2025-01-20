package net.minebo.basalt.punishment.commands.menu;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lnet/minebo/basalt/punishment/commands/menu/HistoryCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "ban", "Ljava/util/concurrent/CompletableFuture;", "Ljava/lang/Void;", "sender", "Lorg/bukkit/entity/Player;", "gameProfile", "Lnet/minebo/basalt/profiles/AsyncGameProfile;", "spigot"})
public final class HistoryCommand extends co.aikar.commands.BaseCommand {
    
    public HistoryCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "c|history|checkpunishments")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.punishments.check")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> ban(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player sender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.profiles.AsyncGameProfile gameProfile) {
        return null;
    }
}
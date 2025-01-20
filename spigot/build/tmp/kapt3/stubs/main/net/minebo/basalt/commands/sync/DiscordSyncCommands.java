package net.minebo.basalt.commands.sync;

@co.aikar.commands.annotation.CommandAlias(value = "sync")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0007JC\u0010\u000b\u001a&\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r \u000e*\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\f0\f2\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007\u00a2\u0006\u0002\u0010\u0011\u00a8\u0006\u0012"}, d2 = {"Lnet/minebo/basalt/commands/sync/DiscordSyncCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "sync", "", "sender", "Lorg/bukkit/entity/Player;", "check", "gameProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "delete", "Ljava/util/concurrent/CompletableFuture;", "Ljava/lang/Void;", "kotlin.jvm.PlatformType", "targetUsername", "", "(Lorg/bukkit/entity/Player;Ljava/lang/String;)Ljava/util/concurrent/CompletableFuture;", "spigot"})
public final class DiscordSyncCommands extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.commands.sync.DiscordSyncCommands INSTANCE = null;
    
    private DiscordSyncCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.Default()
    public final void sync(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player sender) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "check")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.sync.admin")
    public final void check(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player sender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "delete")
    @co.aikar.commands.annotation.CommandCompletion(value = "@players")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.sync.admin")
    public final java.util.concurrent.CompletableFuture<java.lang.Void> delete(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player sender, @co.aikar.commands.annotation.Name(value = "username")
    @org.jetbrains.annotations.NotNull()
    java.lang.String targetUsername) {
        return null;
    }
}
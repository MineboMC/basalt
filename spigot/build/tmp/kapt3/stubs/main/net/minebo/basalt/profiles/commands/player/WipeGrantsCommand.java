package net.minebo.basalt.profiles.commands.player;

/**
 * Class created on 6/13/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\u000b"}, d2 = {"Lnet/minebo/basalt/profiles/commands/player/WipeGrantsCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "wipeGrants", "Ljava/util/concurrent/CompletableFuture;", "Ljava/lang/Void;", "sender", "Lorg/bukkit/command/CommandSender;", "gameProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "spigot"})
public final class WipeGrantsCommand extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.profiles.commands.player.WipeGrantsCommand INSTANCE = null;
    
    private WipeGrantsCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "wipegrants")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.profiles.admin")
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> wipeGrants(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile) {
        return null;
    }
}
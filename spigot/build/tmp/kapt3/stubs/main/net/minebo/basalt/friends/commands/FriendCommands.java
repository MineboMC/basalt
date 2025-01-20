package net.minebo.basalt.friends.commands;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\r"}, d2 = {"Lnet/minebo/basalt/friends/commands/FriendCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "friend", "", "player", "Lorg/bukkit/entity/Player;", "add", "gameProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "list", "accept", "spigot"})
public final class FriendCommands extends co.aikar.commands.BaseCommand {
    
    public FriendCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "f|friend|friends")
    public final void friend(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "add")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    public final void add(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "list")
    public final void list(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "accept")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    public final void accept(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile) {
    }
}
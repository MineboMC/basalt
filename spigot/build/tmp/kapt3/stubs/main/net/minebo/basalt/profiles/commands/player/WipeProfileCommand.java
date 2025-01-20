package net.minebo.basalt.profiles.commands.player;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/profiles/commands/player/WipeProfileCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "wipe", "", "player", "Lorg/bukkit/entity/Player;", "profile", "Lnet/minebo/basalt/models/profile/GameProfile;", "wipeUUID", "Lorg/bukkit/command/CommandSender;", "uuidString", "", "spigot"})
public final class WipeProfileCommand extends co.aikar.commands.BaseCommand {
    
    public WipeProfileCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "wipeprofile")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.profiles.admin")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    public final void wipe(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile profile) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "wipeprofileuuid")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.profiles.admin")
    public final void wipeUUID(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender player, @co.aikar.commands.annotation.Name(value = "uuid")
    @org.jetbrains.annotations.NotNull()
    java.lang.String uuidString) {
    }
}
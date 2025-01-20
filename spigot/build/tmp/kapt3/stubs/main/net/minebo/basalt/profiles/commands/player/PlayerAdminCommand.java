package net.minebo.basalt.profiles.commands.player;

@co.aikar.commands.annotation.CommandAlias(value = "useradmin|user|player|playeradmin")
@co.aikar.commands.annotation.CommandPermission(value = "basalt.profiles.admin")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006H\u0007J\u001a\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0007\u00a8\u0006\u000f"}, d2 = {"Lnet/minebo/basalt/profiles/commands/player/PlayerAdminCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "help", "", "Lco/aikar/commands/CommandHelp;", "info", "player", "Lorg/bukkit/entity/Player;", "gameProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "asyncTest", "target", "Lnet/minebo/basalt/profiles/AsyncGameProfile;", "spigot"})
public final class PlayerAdminCommand extends co.aikar.commands.BaseCommand {
    
    public PlayerAdminCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.HelpCommand()
    public final void help(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.CommandHelp help) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "info")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    public final void info(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile gameProfile) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "test-async")
    @co.aikar.commands.annotation.CommandCompletion(value = "@gameprofile")
    public final void asyncTest(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.profiles.AsyncGameProfile target) {
    }
}
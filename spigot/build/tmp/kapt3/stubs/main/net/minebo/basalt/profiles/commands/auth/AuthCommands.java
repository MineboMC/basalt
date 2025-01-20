package net.minebo.basalt.profiles.commands.auth;

@co.aikar.commands.annotation.CommandAlias(value = "auth|2fa")
@co.aikar.commands.annotation.CommandPermission(value = "basalt.auth")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J \u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0011\u001a\u00020\u000b2\b\b\u0001\u0010\u0012\u001a\u00020\rH\u0007J \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\u0017"}, d2 = {"Lnet/minebo/basalt/profiles/commands/auth/AuthCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "help", "", "Lco/aikar/commands/CommandHelp;", "onAuthStatus", "player", "Lorg/bukkit/entity/Player;", "onBypass", "Lorg/bukkit/command/CommandSender;", "gameProfile", "Lnet/minebo/basalt/profiles/AsyncGameProfile;", "onReset", "Ljava/util/concurrent/CompletableFuture;", "Ljava/lang/Void;", "commandSender", "target", "onVerify", "code", "", "onAuthSetup", "spigot"})
public final class AuthCommands extends co.aikar.commands.BaseCommand {
    
    public AuthCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.HelpCommand()
    public final void help(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.CommandHelp help) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "status")
    @co.aikar.commands.annotation.Description(value = "View your current authentication status.")
    public final void onAuthStatus(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "bypass")
    @co.aikar.commands.annotation.Description(value = "Allow a user to bypass authentication.")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.auth.admin")
    public final void onBypass(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.profiles.AsyncGameProfile gameProfile) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "reset")
    @co.aikar.commands.annotation.Description(value = "Reset a user's authentication status.")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.auth.admin")
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> onReset(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender commandSender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.profiles.AsyncGameProfile target) {
        return null;
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "verify")
    @co.aikar.commands.annotation.Description(value = "Verify with your code in order to gain access to the server.")
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> onVerify(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "code")
    @org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "setup")
    @co.aikar.commands.annotation.Description(value = "Set up your current Authentication Profile to match your needs.")
    public final void onAuthSetup(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
}
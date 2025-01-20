package net.minebo.basalt.commands.party;

@co.aikar.commands.annotation.CommandAlias(value = "party|p")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J \u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\b2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0011H\u0007\u00a8\u0006\u0012"}, d2 = {"Lnet/minebo/basalt/commands/party/PartyCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "create", "Ljava/util/concurrent/CompletableFuture;", "Ljava/lang/Void;", "player", "Lorg/bukkit/entity/Player;", "onDisband", "onInvite", "target", "Lnet/minebo/basalt/profiles/AsyncGameProfile;", "onPromote", "onInfo", "help", "", "Lco/aikar/commands/CommandHelp;", "spigot"})
public final class PartyCommands extends co.aikar.commands.BaseCommand {
    
    public PartyCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "create")
    @co.aikar.commands.annotation.Description(value = "Creates a new party.")
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> create(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "disband")
    @co.aikar.commands.annotation.Description(value = "Disbands your current party. Only works if you are a leader.")
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> onDisband(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "invite")
    @co.aikar.commands.annotation.Description(value = "Invites a given player to your party.")
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> onInvite(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.profiles.AsyncGameProfile target) {
        return null;
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "promote")
    @co.aikar.commands.annotation.Description(value = "Promotes a member of your party to a higher role.")
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> onPromote(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.profiles.AsyncGameProfile target) {
        return null;
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "info")
    @co.aikar.commands.annotation.Description(value = "View detailed information about your party.")
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> onInfo(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    @co.aikar.commands.annotation.HelpCommand()
    @co.aikar.commands.annotation.Description(value = "Displays the command help.")
    public final void help(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.CommandHelp help) {
    }
}
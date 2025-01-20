package net.minebo.basalt.essentials.messages;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u0004\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\b\b\u0001\u0010\u0004\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\fH\u0007J$\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\f2\b\b\u0001\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000f\u001a\u00020\nH\u0007J \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0006\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u0007J \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0006\u001a\u00020\f2\b\b\u0001\u0010\u0013\u001a\u00020\u0014H\u0007\u00a8\u0006\u0016"}, d2 = {"Lnet/minebo/basalt/essentials/messages/MessageCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "message", "", "player", "Lorg/bukkit/command/CommandSender;", "target", "Lco/aikar/commands/bukkit/contexts/OnlinePlayer;", "", "reply", "Lorg/bukkit/entity/Player;", "msgSettings", "staffMessage", "msg", "ignore", "Ljava/util/concurrent/CompletableFuture;", "Ljava/lang/Void;", "profile", "Lnet/minebo/basalt/profiles/AsyncGameProfile;", "unignore", "spigot"})
public final class MessageCommands extends co.aikar.commands.BaseCommand {
    
    public MessageCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "message|msg|m|tell")
    @co.aikar.commands.annotation.CommandCompletion(value = "@players")
    public final void message(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    co.aikar.commands.bukkit.contexts.OnlinePlayer target, @co.aikar.commands.annotation.Name(value = "message...")
    @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "reply|r")
    @co.aikar.commands.annotation.CommandCompletion(value = "@players")
    public final void reply(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "message...")
    @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "messagesettings|msgsettings")
    public final void msgSettings(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "staffmessage|staffmsg")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.messages.staff")
    public final void staffMessage(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    co.aikar.commands.bukkit.contexts.OnlinePlayer target, @co.aikar.commands.annotation.Name(value = "message...")
    @org.jetbrains.annotations.NotNull()
    java.lang.String msg) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "ignore|ignoreadd")
    @co.aikar.commands.annotation.CommandCompletion(value = "@players")
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> ignore(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.profiles.AsyncGameProfile profile) {
        return null;
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "unignore|removeignore")
    @co.aikar.commands.annotation.CommandCompletion(value = "@players")
    @org.jetbrains.annotations.NotNull()
    public final java.util.concurrent.CompletableFuture<java.lang.Void> unignore(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.profiles.AsyncGameProfile profile) {
        return null;
    }
}
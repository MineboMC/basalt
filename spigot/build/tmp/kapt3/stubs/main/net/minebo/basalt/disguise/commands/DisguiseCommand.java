package net.minebo.basalt.disguise.commands;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0007J\u001a\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H\u0007\u00a8\u0006\u0011"}, d2 = {"Lnet/minebo/basalt/disguise/commands/DisguiseCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "reveal", "", "sender", "Lorg/bukkit/command/CommandSender;", "target", "Lco/aikar/commands/bukkit/contexts/OnlinePlayer;", "unDisguise", "player", "Lorg/bukkit/entity/Player;", "onDisguise", "onManualDisguise", "name", "", "spigot"})
public final class DisguiseCommand extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.disguise.commands.DisguiseCommand INSTANCE = null;
    
    private DisguiseCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "reveal|realname|disguiseinfo")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.disguise.reveal")
    public final void reveal(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    co.aikar.commands.bukkit.contexts.OnlinePlayer target) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "undisguise|unnick")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.disguise")
    public final void unDisguise(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "disguise|nick")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.disguise")
    public final void onDisguise(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "manualdisguise|manualnick")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.disguise.manual")
    public final void onManualDisguise(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
}
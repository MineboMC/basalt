package net.minebo.basalt.essentials.commands;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J.\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\r2\b\b\u0001\u0010\u000f\u001a\u00020\rH\u0007\u00a8\u0006\u0010"}, d2 = {"Lnet/minebo/basalt/essentials/commands/TeleportationCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "teleport", "", "player", "Lorg/bukkit/entity/Player;", "target", "Lco/aikar/commands/bukkit/contexts/OnlinePlayer;", "teleportHere", "teleportPos", "x", "", "y", "z", "spigot"})
public final class TeleportationCommands extends co.aikar.commands.BaseCommand {
    
    public TeleportationCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "teleport|tp")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.essentials.teleport.other")
    public final void teleport(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    co.aikar.commands.bukkit.contexts.OnlinePlayer target) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "tphere|s")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.essentials.teleport.here")
    public final void teleportHere(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    co.aikar.commands.bukkit.contexts.OnlinePlayer target) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "tppos")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.essentials.teleport.position")
    public final void teleportPos(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "x")
    int x, @co.aikar.commands.annotation.Name(value = "y")
    int y, @co.aikar.commands.annotation.Name(value = "z")
    int z) {
    }
}
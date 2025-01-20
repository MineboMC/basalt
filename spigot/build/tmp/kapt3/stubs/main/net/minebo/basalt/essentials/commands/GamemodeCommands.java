package net.minebo.basalt.essentials.commands;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u001c\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u00a8\u0006\u000b"}, d2 = {"Lnet/minebo/basalt/essentials/commands/GamemodeCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "gmc", "", "player", "Lorg/bukkit/entity/Player;", "target", "Lco/aikar/commands/bukkit/contexts/OnlinePlayer;", "gms", "spigot"})
public final class GamemodeCommands extends co.aikar.commands.BaseCommand {
    
    public GamemodeCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "gmc")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.essentials.gamemode")
    public final void gmc(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @co.aikar.commands.annotation.Optional()
    @org.jetbrains.annotations.Nullable()
    co.aikar.commands.bukkit.contexts.OnlinePlayer target) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "gms")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.essentials.gamemode")
    public final void gms(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @co.aikar.commands.annotation.Optional()
    @org.jetbrains.annotations.Nullable()
    co.aikar.commands.bukkit.contexts.OnlinePlayer target) {
    }
}
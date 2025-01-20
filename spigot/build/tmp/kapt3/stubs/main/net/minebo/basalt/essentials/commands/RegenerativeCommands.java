package net.minebo.basalt.essentials.commands;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J\u001c\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\tH\u0007\u00a8\u0006\u000b"}, d2 = {"Lnet/minebo/basalt/essentials/commands/RegenerativeCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "heal", "", "sender", "Lorg/bukkit/entity/Player;", "target", "Lco/aikar/commands/bukkit/contexts/OnlinePlayer;", "feed", "spigot"})
public final class RegenerativeCommands extends co.aikar.commands.BaseCommand {
    
    public RegenerativeCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "heal")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.essentials.heal")
    public final void heal(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player sender, @co.aikar.commands.annotation.Name(value = "target")
    @co.aikar.commands.annotation.Optional()
    @org.jetbrains.annotations.Nullable()
    co.aikar.commands.bukkit.contexts.OnlinePlayer target) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "feed")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.essentials.feed")
    public final void feed(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player sender, @co.aikar.commands.annotation.Name(value = "target")
    @co.aikar.commands.annotation.Optional()
    @org.jetbrains.annotations.Nullable()
    co.aikar.commands.bukkit.contexts.OnlinePlayer target) {
    }
}
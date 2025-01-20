package net.minebo.basalt.essentials.commands;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\u000b"}, d2 = {"Lnet/minebo/basalt/essentials/commands/InventoryCopyingCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "cpInv", "", "sender", "Lorg/bukkit/entity/Player;", "online", "Lco/aikar/commands/bukkit/contexts/OnlinePlayer;", "cpTo", "spigot"})
public final class InventoryCopyingCommands extends co.aikar.commands.BaseCommand {
    
    public InventoryCopyingCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "cpinv|cpfrom")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.essentials.cpinv")
    public final void cpInv(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player sender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    co.aikar.commands.bukkit.contexts.OnlinePlayer online) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "cpto")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.essentials.cpto")
    public final void cpTo(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player sender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    co.aikar.commands.bukkit.contexts.OnlinePlayer online) {
    }
}
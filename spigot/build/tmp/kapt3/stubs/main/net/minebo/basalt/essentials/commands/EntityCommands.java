package net.minebo.basalt.essentials.commands;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u000e\u001a\u00020\u000fH\u0007J\u0010\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u000bH\u0007R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\u0012"}, d2 = {"Lnet/minebo/basalt/essentials/commands/EntityCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "item", "Lorg/bukkit/inventory/ItemStack;", "getItem", "()Lorg/bukkit/inventory/ItemStack;", "spawnEntity", "", "sender", "Lorg/bukkit/entity/Player;", "typeString", "Lorg/bukkit/entity/EntityType;", "name", "", "editEntity", "player", "spigot"})
public final class EntityCommands extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    private static final org.bukkit.inventory.ItemStack item = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.essentials.commands.EntityCommands INSTANCE = null;
    
    private EntityCommands() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.bukkit.inventory.ItemStack getItem() {
        return null;
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "spawnentity")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.essentials.spawnentity")
    public final void spawnEntity(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player sender, @co.aikar.commands.annotation.Name(value = "entity")
    @org.jetbrains.annotations.NotNull()
    org.bukkit.entity.EntityType typeString, @co.aikar.commands.annotation.Name(value = "name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "editentity")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.essentials.editentity")
    public final void editEntity(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
}
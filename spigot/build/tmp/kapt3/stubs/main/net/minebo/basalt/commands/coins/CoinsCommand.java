package net.minebo.basalt.commands.coins;

@co.aikar.commands.annotation.CommandAlias(value = "coins|coin")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J$\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007J$\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000f"}, d2 = {"Lnet/minebo/basalt/commands/coins/CoinsCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "coinsCommand", "", "player", "Lorg/bukkit/entity/Player;", "coinsEditor", "coinsSetCommand", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "amount", "", "coinsGiveCommand", "spigot"})
public final class CoinsCommand extends co.aikar.commands.BaseCommand {
    
    public CoinsCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.Default()
    public final void coinsCommand(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "editor")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.coins.owner")
    public final void coinsEditor(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "set")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.coins.admin")
    public final void coinsSetCommand(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target, @co.aikar.commands.annotation.Name(value = "amount")
    int amount) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "give")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.coins.admin")
    public final void coinsGiveCommand(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target, @co.aikar.commands.annotation.Name(value = "amount")
    int amount) {
    }
}
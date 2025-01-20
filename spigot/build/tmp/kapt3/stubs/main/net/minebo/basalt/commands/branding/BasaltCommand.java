package net.minebo.basalt.commands.branding;

@co.aikar.commands.annotation.CommandAlias(value = "basalt")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\f"}, d2 = {"Lnet/minebo/basalt/commands/branding/BasaltCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "basalt", "", "player", "Lorg/bukkit/entity/Player;", "reload", "sender", "Lorg/bukkit/command/CommandSender;", "reloadPlaceholders", "spigot"})
public final class BasaltCommand extends co.aikar.commands.BaseCommand {
    
    public BasaltCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.Default()
    public final void basalt(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "reload")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.owner")
    public final void reload(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "refreshplaceholders")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.owner")
    public final void reloadPlaceholders(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender) {
    }
}
package net.minebo.basalt.grants.configure;

/**
 * Class created on 8/3/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007\u00a8\u0006\f"}, d2 = {"Lnet/minebo/basalt/grants/configure/GrantConfigureCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "grantConfig", "", "player", "Lorg/bukkit/entity/Player;", "resetDurations", "sender", "Lorg/bukkit/command/CommandSender;", "resetReasons", "spigot"})
public final class GrantConfigureCommand extends co.aikar.commands.BaseCommand {
    
    public GrantConfigureCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "configuregrants|grantconfig")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.grants.config")
    public final void grantConfig(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "resetgrantdurations")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.grants.config")
    public final void resetDurations(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "resetgrantreasons")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.grants.config")
    public final void resetReasons(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender) {
    }
}
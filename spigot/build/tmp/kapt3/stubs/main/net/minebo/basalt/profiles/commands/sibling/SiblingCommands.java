package net.minebo.basalt.profiles.commands.sibling;

/**
 * Class created on 7/4/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@co.aikar.commands.annotation.CommandAlias(value = "sibling")
@co.aikar.commands.annotation.CommandPermission(value = "basalt.siblings")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006H\u0007J$\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\b\b\u0001\u0010\f\u001a\u00020\u000bH\u0007J\u001a\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\u0010"}, d2 = {"Lnet/minebo/basalt/profiles/commands/sibling/SiblingCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "help", "", "Lco/aikar/commands/CommandHelp;", "add", "sender", "Lorg/bukkit/command/CommandSender;", "target", "Lnet/minebo/basalt/models/profile/GameProfile;", "sibling", "check", "player", "Lorg/bukkit/entity/Player;", "spigot"})
public final class SiblingCommands extends co.aikar.commands.BaseCommand {
    
    public SiblingCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.HelpCommand()
    public final void help(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.CommandHelp help) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "add")
    public final void add(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target, @co.aikar.commands.annotation.Name(value = "sibling")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile sibling) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "check")
    public final void check(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "target")
    @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target) {
    }
}
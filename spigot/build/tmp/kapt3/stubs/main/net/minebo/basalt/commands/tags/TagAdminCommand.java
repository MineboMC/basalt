package net.minebo.basalt.commands.tags;

@co.aikar.commands.annotation.CommandAlias(value = "tagadmin")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/commands/tags/TagAdminCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "create", "", "sender", "Lorg/bukkit/command/CommandSender;", "name", "", "delete", "edit", "player", "Lorg/bukkit/entity/Player;", "spigot"})
public final class TagAdminCommand extends co.aikar.commands.BaseCommand {
    
    public TagAdminCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "create")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.tags.admin")
    public final void create(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "delete")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.tags.admin")
    public final void delete(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "edit")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.tags.admin")
    public final void edit(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
}
package net.minebo.basalt.commands.uuid;

@co.aikar.commands.annotation.CommandAlias(value = "uuidcache|uuid")
@co.aikar.commands.annotation.CommandPermission(value = "basalt.cache.uuid")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006H\u0007J\u001a\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000bH\u0007J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u000bH\u0007\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/commands/uuid/UUIDCacheCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "help", "", "Lco/aikar/commands/CommandHelp;", "checkId", "sender", "Lorg/bukkit/command/CommandSender;", "id", "", "checkName", "name", "spigot"})
public final class UUIDCacheCommands extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.commands.uuid.UUIDCacheCommands INSTANCE = null;
    
    private UUIDCacheCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.HelpCommand()
    @co.aikar.commands.annotation.CommandPermission(value = "rank.admin")
    public final void help(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.CommandHelp help) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "checkId")
    public final void checkId(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "uuid")
    @org.jetbrains.annotations.NotNull()
    java.lang.String id) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "checkname")
    public final void checkName(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "name")
    @org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
}
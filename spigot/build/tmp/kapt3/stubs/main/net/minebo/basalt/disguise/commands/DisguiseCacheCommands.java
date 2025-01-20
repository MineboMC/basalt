package net.minebo.basalt.disguise.commands;

@co.aikar.commands.annotation.CommandAlias(value = "disguisecache")
@co.aikar.commands.annotation.CommandPermission(value = "basalt.disguise.admin")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0007J\u001a\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\f\u001a\u00020\rH\u0007\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/disguise/commands/DisguiseCacheCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "help", "", "helpCommand", "Lco/aikar/commands/CommandHelp;", "clearSkins", "sender", "Lorg/bukkit/command/CommandSender;", "addSkin", "skinName", "", "spigot"})
public final class DisguiseCacheCommands extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.disguise.commands.DisguiseCacheCommands INSTANCE = null;
    
    private DisguiseCacheCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.HelpCommand()
    public final void help(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.CommandHelp helpCommand) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "skin clear")
    @co.aikar.commands.annotation.Description(value = "Remove all skins from the disguise skin cache")
    public final void clearSkins(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "skin add")
    @co.aikar.commands.annotation.Description(value = "Add a skin to the disguise skin cache")
    public final void addSkin(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @co.aikar.commands.annotation.Name(value = "skin")
    @org.jetbrains.annotations.NotNull()
    java.lang.String skinName) {
    }
}
package net.minebo.basalt.commands.filter;

@co.aikar.commands.annotation.CommandAlias(value = "filters|filter")
@co.aikar.commands.annotation.CommandPermission(value = "basalt.filters.admin")
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0007J\u001a\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0007\u00a8\u0006\r"}, d2 = {"Lnet/minebo/basalt/commands/filter/FilterCommands;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "help", "", "Lco/aikar/commands/CommandHelp;", "create", "player", "Lorg/bukkit/entity/Player;", "delete", "word", "", "spigot"})
public final class FilterCommands extends co.aikar.commands.BaseCommand {
    
    public FilterCommands() {
        super();
    }
    
    @co.aikar.commands.annotation.HelpCommand()
    public final void help(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.CommandHelp help) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "editor")
    public final void create(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.Subcommand(value = "delete")
    public final void delete(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "word")
    @org.jetbrains.annotations.NotNull()
    java.lang.String word) {
    }
}
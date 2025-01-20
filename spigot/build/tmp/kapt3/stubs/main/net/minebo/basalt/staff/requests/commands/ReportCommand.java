package net.minebo.basalt.staff.requests.commands;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J$\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\nH\u0007\u00a8\u0006\f"}, d2 = {"Lnet/minebo/basalt/staff/requests/commands/ReportCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "viewReports", "", "player", "Lorg/bukkit/entity/Player;", "request", "other", "", "rzn", "spigot"})
public final class ReportCommand extends co.aikar.commands.BaseCommand {
    
    public ReportCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "reports|viewreports")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.staff")
    public final void viewReports(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "report")
    public final void request(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "player")
    @org.jetbrains.annotations.NotNull()
    java.lang.String other, @co.aikar.commands.annotation.Name(value = "reason")
    @org.jetbrains.annotations.NotNull()
    java.lang.String rzn) {
    }
}
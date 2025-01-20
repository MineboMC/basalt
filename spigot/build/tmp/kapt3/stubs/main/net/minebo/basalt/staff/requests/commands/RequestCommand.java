package net.minebo.basalt.staff.requests.commands;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/staff/requests/commands/RequestCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "request", "", "player", "Lorg/bukkit/entity/Player;", "rzn", "", "spigot"})
public final class RequestCommand extends co.aikar.commands.BaseCommand {
    
    public RequestCommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "request|helpop")
    public final void request(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @co.aikar.commands.annotation.Name(value = "reason")
    @org.jetbrains.annotations.NotNull()
    java.lang.String rzn) {
    }
}
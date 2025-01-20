package net.minebo.basalt.servers.commands;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\b"}, d2 = {"Lnet/minebo/basalt/servers/commands/WhereAmICommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "whereAmI", "", "sender", "Lorg/bukkit/entity/Player;", "spigot"})
public final class WhereAmICommand extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.servers.commands.WhereAmICommand INSTANCE = null;
    
    private WhereAmICommand() {
        super();
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "whereami|whatamion")
    public final void whereAmI(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player sender) {
    }
}
package net.minebo.basalt.grants.view;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eH\u0007R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000f"}, d2 = {"Lnet/minebo/basalt/grants/view/AuditCommand;", "Lco/aikar/commands/BaseCommand;", "<init>", "()V", "auditedPlayers", "", "Ljava/util/UUID;", "getAuditedPlayers", "()Ljava/util/List;", "setAuditedPlayers", "(Ljava/util/List;)V", "audit", "", "player", "Lorg/bukkit/entity/Player;", "spigot"})
public final class AuditCommand extends co.aikar.commands.BaseCommand {
    @org.jetbrains.annotations.NotNull()
    private static java.util.List<java.util.UUID> auditedPlayers;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.grants.view.AuditCommand INSTANCE = null;
    
    private AuditCommand() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.UUID> getAuditedPlayers() {
        return null;
    }
    
    public final void setAuditedPlayers(@org.jetbrains.annotations.NotNull()
    java.util.List<java.util.UUID> p0) {
    }
    
    @co.aikar.commands.annotation.CommandAlias(value = "audits|auditlog|watchgrants|watchactivity|audit|watchpunishments")
    @co.aikar.commands.annotation.CommandPermission(value = "basalt.audit")
    public final void audit(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
}
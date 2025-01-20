package net.minebo.basalt.punishment;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u0007J&\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u0016\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0016\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0017J\u001a\u0010\u0019\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u0012\u00a8\u0006\u001b"}, d2 = {"Lnet/minebo/basalt/punishment/BukkitPunishmentFunctions;", "", "<init>", "()V", "getSenderUUID", "Ljava/util/UUID;", "sender", "Lorg/bukkit/command/CommandSender;", "getExecutorFromSender", "Lnet/minebo/basalt/punishments/actor/executor/Executor;", "remove", "", "executor", "punishment", "Lnet/minebo/basalt/models/grant/types/Punishment;", "silent", "", "reason", "", "dispatch", "dispatchKick", "isSilent", "playerCanPunishOther", "Lnet/minebo/basalt/models/profile/GameProfile;", "target", "parseReason", "fallback", "spigot"})
public final class BukkitPunishmentFunctions {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.punishment.BukkitPunishmentFunctions INSTANCE = null;
    
    private BukkitPunishmentFunctions() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getSenderUUID(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.punishments.actor.executor.Executor getExecutorFromSender(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender) {
        return null;
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    java.util.UUID executor, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.Punishment punishment, boolean silent, @org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
    }
    
    public final void dispatch(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.Punishment punishment, boolean silent) {
    }
    
    public final void dispatchKick(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.Punishment punishment, boolean silent) {
    }
    
    public final boolean isSilent(@org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
        return false;
    }
    
    public final boolean playerCanPunishOther(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile executor, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.profile.GameProfile target) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String parseReason(@org.jetbrains.annotations.Nullable()
    java.lang.String reason, @org.jetbrains.annotations.NotNull()
    java.lang.String fallback) {
        return null;
    }
}
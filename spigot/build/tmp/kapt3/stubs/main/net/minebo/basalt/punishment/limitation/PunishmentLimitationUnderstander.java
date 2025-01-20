package net.minebo.basalt.punishment.limitation;

/**
 * Class created on 6/17/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u000b\u001a\u00020\fJ\u000e\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0006R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lnet/minebo/basalt/punishment/limitation/PunishmentLimitationUnderstander;", "", "<init>", "()V", "punishmentTimes", "Lcom/google/common/collect/HashBasedTable;", "Ljava/util/UUID;", "", "", "runnable", "Lorg/bukkit/scheduler/BukkitRunnable;", "load", "", "getTimes", "player", "canApplyPunishment", "", "getDurationString", "", "equipCooldown", "spigot"})
public final class PunishmentLimitationUnderstander {
    @org.jetbrains.annotations.NotNull()
    private static final com.google.common.collect.HashBasedTable<java.util.UUID, java.lang.Integer, java.lang.Long> punishmentTimes = null;
    private static org.bukkit.scheduler.BukkitRunnable runnable;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.punishment.limitation.PunishmentLimitationUnderstander INSTANCE = null;
    
    private PunishmentLimitationUnderstander() {
        super();
    }
    
    public final void load() {
    }
    
    public final int getTimes(@org.jetbrains.annotations.NotNull()
    java.util.UUID player) {
        return 0;
    }
    
    public final boolean canApplyPunishment(@org.jetbrains.annotations.NotNull()
    java.util.UUID player) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDurationString(@org.jetbrains.annotations.NotNull()
    java.util.UUID player) {
        return null;
    }
    
    public final void equipCooldown(@org.jetbrains.annotations.NotNull()
    java.util.UUID player) {
    }
}
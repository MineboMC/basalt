package net.minebo.basalt.punishment.packets;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u001f\u001a\u00020 H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\t\u001a\u00020\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006!"}, d2 = {"Lnet/minebo/basalt/punishment/packets/PunishmentDispatchPacket;", "Lnet/minebo/basalt/redis/RedisPacket;", "punishmentType", "Lnet/minebo/basalt/punishments/PunishmentType;", "target", "Ljava/util/UUID;", "executor", "silent", "", "reason", "", "<init>", "(Lnet/minebo/basalt/punishments/PunishmentType;Ljava/util/UUID;Ljava/util/UUID;ZLjava/lang/String;)V", "getPunishmentType", "()Lnet/minebo/basalt/punishments/PunishmentType;", "setPunishmentType", "(Lnet/minebo/basalt/punishments/PunishmentType;)V", "getTarget", "()Ljava/util/UUID;", "setTarget", "(Ljava/util/UUID;)V", "getExecutor", "setExecutor", "getSilent", "()Z", "setSilent", "(Z)V", "getReason", "()Ljava/lang/String;", "setReason", "(Ljava/lang/String;)V", "action", "", "spigot"})
public final class PunishmentDispatchPacket extends net.minebo.basalt.redis.RedisPacket {
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.punishments.PunishmentType punishmentType;
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID target;
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID executor;
    private boolean silent;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String reason;
    
    public PunishmentDispatchPacket(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.PunishmentType punishmentType, @org.jetbrains.annotations.NotNull()
    java.util.UUID target, @org.jetbrains.annotations.NotNull()
    java.util.UUID executor, boolean silent, @org.jetbrains.annotations.NotNull()
    java.lang.String reason) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.punishments.PunishmentType getPunishmentType() {
        return null;
    }
    
    public final void setPunishmentType(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.PunishmentType p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getTarget() {
        return null;
    }
    
    public final void setTarget(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getExecutor() {
        return null;
    }
    
    public final void setExecutor(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    public final boolean getSilent() {
        return false;
    }
    
    public final void setSilent(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReason() {
        return null;
    }
    
    public final void setReason(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    public void action() {
    }
}
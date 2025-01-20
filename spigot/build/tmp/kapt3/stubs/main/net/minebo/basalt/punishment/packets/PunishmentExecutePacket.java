package net.minebo.basalt.punishment.packets;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019\u00a8\u0006\u001c"}, d2 = {"Lnet/minebo/basalt/punishment/packets/PunishmentExecutePacket;", "Lnet/minebo/basalt/redis/RedisPacket;", "punishmentType", "Lnet/minebo/basalt/punishments/PunishmentType;", "target", "Ljava/util/UUID;", "reason", "", "punishment", "Lnet/minebo/basalt/models/grant/types/Punishment;", "<init>", "(Lnet/minebo/basalt/punishments/PunishmentType;Ljava/util/UUID;Ljava/lang/String;Lnet/minebo/basalt/models/grant/types/Punishment;)V", "getPunishmentType", "()Lnet/minebo/basalt/punishments/PunishmentType;", "setPunishmentType", "(Lnet/minebo/basalt/punishments/PunishmentType;)V", "getTarget", "()Ljava/util/UUID;", "setTarget", "(Ljava/util/UUID;)V", "getReason", "()Ljava/lang/String;", "setReason", "(Ljava/lang/String;)V", "getPunishment", "()Lnet/minebo/basalt/models/grant/types/Punishment;", "action", "", "spigot"})
public final class PunishmentExecutePacket extends net.minebo.basalt.redis.RedisPacket {
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.punishments.PunishmentType punishmentType;
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID target;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String reason;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.models.grant.types.Punishment punishment = null;
    
    public PunishmentExecutePacket(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.PunishmentType punishmentType, @org.jetbrains.annotations.NotNull()
    java.util.UUID target, @org.jetbrains.annotations.NotNull()
    java.lang.String reason, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.grant.types.Punishment punishment) {
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
    public final java.lang.String getReason() {
        return null;
    }
    
    public final void setReason(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.grant.types.Punishment getPunishment() {
        return null;
    }
    
    @java.lang.Override()
    public void action() {
    }
}
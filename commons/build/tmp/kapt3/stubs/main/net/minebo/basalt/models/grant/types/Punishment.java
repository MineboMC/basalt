package net.minebo.basalt.models.grant.types;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u0006\u0010!\u001a\u00020\u0004J\b\u0010\"\u001a\u0004\u0018\u00010#J\b\u0010$\u001a\u00020\u0002H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0014\"\u0004\b\u001c\u0010\u0016R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 \u00a8\u0006%"}, d2 = {"Lnet/minebo/basalt/models/grant/types/Punishment;", "Lnet/minebo/basalt/models/grant/Grantable;", "Lnet/minebo/basalt/punishments/PunishmentType;", "punishmentType", "", "easyFindId", "proof", "", "Lnet/minebo/basalt/models/grant/types/proof/ProofEntry;", "addedTo", "Ljava/util/UUID;", "addedBy", "addedReason", "duration", "", "actor", "Lnet/minebo/basalt/punishments/actor/DefaultActor;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;JLnet/minebo/basalt/punishments/actor/DefaultActor;)V", "getPunishmentType", "()Ljava/lang/String;", "setPunishmentType", "(Ljava/lang/String;)V", "getActor", "()Lnet/minebo/basalt/punishments/actor/DefaultActor;", "setActor", "(Lnet/minebo/basalt/punishments/actor/DefaultActor;)V", "getEasyFindId", "setEasyFindId", "getProof", "()Ljava/util/List;", "setProof", "(Ljava/util/List;)V", "getIssuedByName", "getTargetProfile", "Lnet/minebo/basalt/models/profile/GameProfile;", "getGrantable", "commons"})
public final class Punishment extends net.minebo.basalt.models.grant.Grantable<net.minebo.basalt.punishments.PunishmentType> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String punishmentType;
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.punishments.actor.DefaultActor actor;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String easyFindId;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<net.minebo.basalt.models.grant.types.proof.ProofEntry> proof;
    
    public Punishment(@org.jetbrains.annotations.NotNull()
    java.lang.String punishmentType, @org.jetbrains.annotations.NotNull()
    java.lang.String easyFindId, @org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.models.grant.types.proof.ProofEntry> proof, @org.jetbrains.annotations.NotNull()
    java.util.UUID addedTo, @org.jetbrains.annotations.NotNull()
    java.util.UUID addedBy, @org.jetbrains.annotations.NotNull()
    java.lang.String addedReason, long duration, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.actor.DefaultActor actor) {
        super(null, null, null, null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPunishmentType() {
        return null;
    }
    
    public final void setPunishmentType(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.punishments.actor.DefaultActor getActor() {
        return null;
    }
    
    public final void setActor(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.actor.DefaultActor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEasyFindId() {
        return null;
    }
    
    public final void setEasyFindId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.models.grant.types.proof.ProofEntry> getProof() {
        return null;
    }
    
    public final void setProof(@org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.models.grant.types.proof.ProofEntry> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIssuedByName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.profile.GameProfile getTargetProfile() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public net.minebo.basalt.punishments.PunishmentType getGrantable() {
        return null;
    }
}
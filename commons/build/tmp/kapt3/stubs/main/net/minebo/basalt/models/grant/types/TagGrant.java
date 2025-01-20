package net.minebo.basalt.models.grant.types;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0018\u001a\u0004\u0018\u00010\u0002H\u0016R\u001a\u0010\u000f\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017\u00a8\u0006\u0019"}, d2 = {"Lnet/minebo/basalt/models/grant/types/TagGrant;", "Lnet/minebo/basalt/models/grant/Grantable;", "Lnet/minebo/basalt/models/tags/Tag;", "id", "", "addedTo", "Ljava/util/UUID;", "addedBy", "addedReason", "duration", "", "actor", "Lnet/minebo/basalt/punishments/actor/DefaultActor;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;JLnet/minebo/basalt/punishments/actor/DefaultActor;)V", "internalActor", "getInternalActor", "()Lnet/minebo/basalt/punishments/actor/DefaultActor;", "setInternalActor", "(Lnet/minebo/basalt/punishments/actor/DefaultActor;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getGrantable", "commons"})
public final class TagGrant extends net.minebo.basalt.models.grant.Grantable<net.minebo.basalt.models.tags.Tag> {
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.punishments.actor.DefaultActor internalActor;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    
    public TagGrant(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.UUID addedTo, @org.jetbrains.annotations.NotNull()
    java.util.UUID addedBy, @org.jetbrains.annotations.NotNull()
    java.lang.String addedReason, long duration, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.actor.DefaultActor actor) {
        super(null, null, null, null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.punishments.actor.DefaultActor getInternalActor() {
        return null;
    }
    
    public final void setInternalActor(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.actor.DefaultActor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public net.minebo.basalt.models.tags.Tag getGrantable() {
        return null;
    }
}
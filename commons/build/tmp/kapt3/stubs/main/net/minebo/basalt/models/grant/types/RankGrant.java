package net.minebo.basalt.models.grant.types;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b'\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010*\u001a\u00020\u000eJ\u0006\u0010+\u001a\u00020\u0004J\b\u0010,\u001a\u00020\u0002H\u0016J\t\u0010-\u001a\u00020\u0004H\u00c6\u0003J\t\u0010.\u001a\u00020\u0006H\u00c6\u0003J\t\u0010/\u001a\u00020\u0006H\u00c6\u0003J\t\u00100\u001a\u00020\u0004H\u00c6\u0003J\t\u00101\u001a\u00020\nH\u00c6\u0003J\t\u00102\u001a\u00020\fH\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003JQ\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00c6\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u000108H\u00d6\u0003J\t\u00109\u001a\u00020:H\u00d6\u0001J\t\u0010;\u001a\u00020\u0004H\u00d6\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u001c\"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0012\"\u0004\b%\u0010\u0014R\u001c\u0010&\u001a\u0004\u0018\u00010\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u001e\"\u0004\b(\u0010)\u00a8\u0006<"}, d2 = {"Lnet/minebo/basalt/models/grant/types/RankGrant;", "Lnet/minebo/basalt/models/grant/Grantable;", "Lnet/minebo/basalt/models/ranks/Rank;", "rankId", "", "addedTo", "Ljava/util/UUID;", "addedBy", "addedReason", "duration", "", "actor", "Lnet/minebo/basalt/punishments/actor/DefaultActor;", "constructorScope", "Lnet/minebo/basalt/models/grant/types/scope/GrantScope;", "<init>", "(Ljava/lang/String;Ljava/util/UUID;Ljava/util/UUID;Ljava/lang/String;JLnet/minebo/basalt/punishments/actor/DefaultActor;Lnet/minebo/basalt/models/grant/types/scope/GrantScope;)V", "getRankId", "()Ljava/lang/String;", "setRankId", "(Ljava/lang/String;)V", "getAddedTo", "()Ljava/util/UUID;", "getAddedBy", "getAddedReason", "getDuration", "()J", "getActor", "()Lnet/minebo/basalt/punishments/actor/DefaultActor;", "getConstructorScope", "()Lnet/minebo/basalt/models/grant/types/scope/GrantScope;", "internalActor", "getInternalActor", "setInternalActor", "(Lnet/minebo/basalt/punishments/actor/DefaultActor;)V", "rank", "getRank", "setRank", "scope", "getScope", "setScope", "(Lnet/minebo/basalt/models/grant/types/scope/GrantScope;)V", "verifyGrantScope", "getIssuedByName", "getGrantable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "", "hashCode", "", "toString", "commons"})
public final class RankGrant extends net.minebo.basalt.models.grant.Grantable<net.minebo.basalt.models.ranks.Rank> {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String rankId;
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID addedTo = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.UUID addedBy = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String addedReason = null;
    private final long duration = 0L;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.punishments.actor.DefaultActor actor = null;
    @org.jetbrains.annotations.Nullable()
    private final net.minebo.basalt.models.grant.types.scope.GrantScope constructorScope = null;
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.punishments.actor.DefaultActor internalActor;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String rank;
    @org.jetbrains.annotations.Nullable()
    private net.minebo.basalt.models.grant.types.scope.GrantScope scope;
    
    public RankGrant(@org.jetbrains.annotations.NotNull()
    java.lang.String rankId, @org.jetbrains.annotations.NotNull()
    java.util.UUID addedTo, @org.jetbrains.annotations.NotNull()
    java.util.UUID addedBy, @org.jetbrains.annotations.NotNull()
    java.lang.String addedReason, long duration, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.actor.DefaultActor actor, @org.jetbrains.annotations.Nullable()
    net.minebo.basalt.models.grant.types.scope.GrantScope constructorScope) {
        super(null, null, null, null, null, null, null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRankId() {
        return null;
    }
    
    public final void setRankId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getAddedTo() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getAddedBy() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAddedReason() {
        return null;
    }
    
    public final long getDuration() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.punishments.actor.DefaultActor getActor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.grant.types.scope.GrantScope getConstructorScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.punishments.actor.DefaultActor getInternalActor() {
        return null;
    }
    
    public final void setInternalActor(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.actor.DefaultActor p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRank() {
        return null;
    }
    
    public final void setRank(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.grant.types.scope.GrantScope getScope() {
        return null;
    }
    
    public final void setScope(@org.jetbrains.annotations.Nullable()
    net.minebo.basalt.models.grant.types.scope.GrantScope p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.grant.types.scope.GrantScope verifyGrantScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIssuedByName() {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public net.minebo.basalt.models.ranks.Rank getGrantable() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.punishments.actor.DefaultActor component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.grant.types.scope.GrantScope component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.grant.types.RankGrant copy(@org.jetbrains.annotations.NotNull()
    java.lang.String rankId, @org.jetbrains.annotations.NotNull()
    java.util.UUID addedTo, @org.jetbrains.annotations.NotNull()
    java.util.UUID addedBy, @org.jetbrains.annotations.NotNull()
    java.lang.String addedReason, long duration, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.punishments.actor.DefaultActor actor, @org.jetbrains.annotations.Nullable()
    net.minebo.basalt.models.grant.types.scope.GrantScope constructorScope) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String toString() {
        return null;
    }
}
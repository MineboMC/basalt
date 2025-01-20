package net.minebo.basalt.models.party;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u00a2\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003J\u000e\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0003J\u0006\u0010'\u001a\u00020(J\u000e\u0010)\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u00c6\u0003J\u0015\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0006H\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\fH\u00c6\u0003J]\u00100\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00062\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u00c6\u0001J\u0013\u00101\u001a\u00020\f2\b\u00102\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u00103\u001a\u000204H\u00d6\u0001J\t\u00105\u001a\u00020(H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0010\"\u0004\b\u0014\u0010\u0012R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R&\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001a\u0010\n\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"\u00a8\u00066"}, d2 = {"Lnet/minebo/basalt/models/party/Party;", "", "id", "Ljava/util/UUID;", "leader", "members", "", "Lnet/minebo/basalt/models/party/PartyElevation;", "invited", "", "createdAt", "alive", "", "<init>", "(Ljava/util/UUID;Ljava/util/UUID;Ljava/util/Map;Ljava/util/Map;JZ)V", "getId", "()Ljava/util/UUID;", "setId", "(Ljava/util/UUID;)V", "getLeader", "setLeader", "getMembers", "()Ljava/util/Map;", "setMembers", "(Ljava/util/Map;)V", "getInvited", "setInvited", "getCreatedAt", "()J", "setCreatedAt", "(J)V", "getAlive", "()Z", "setAlive", "(Z)V", "removeMember", "", "uuid", "isMember", "getPartyMembersString", "", "isLeader", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "commons"})
public final class Party {
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID id;
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID leader;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.util.UUID, net.minebo.basalt.models.party.PartyElevation> members;
    @org.jetbrains.annotations.NotNull()
    private java.util.Map<java.util.UUID, java.lang.Long> invited;
    private long createdAt;
    private boolean alive;
    
    public Party(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    java.util.UUID leader, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.util.UUID, net.minebo.basalt.models.party.PartyElevation> members, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.util.UUID, java.lang.Long> invited, long createdAt, boolean alive) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getLeader() {
        return null;
    }
    
    public final void setLeader(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, net.minebo.basalt.models.party.PartyElevation> getMembers() {
        return null;
    }
    
    public final void setMembers(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.util.UUID, net.minebo.basalt.models.party.PartyElevation> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, java.lang.Long> getInvited() {
        return null;
    }
    
    public final void setInvited(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.util.UUID, java.lang.Long> p0) {
    }
    
    public final long getCreatedAt() {
        return 0L;
    }
    
    public final void setCreatedAt(long p0) {
    }
    
    public final boolean getAlive() {
        return false;
    }
    
    public final void setAlive(boolean p0) {
    }
    
    public final void removeMember(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
    }
    
    public final boolean isMember(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPartyMembersString() {
        return null;
    }
    
    public final boolean isLeader(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, net.minebo.basalt.models.party.PartyElevation> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, java.lang.Long> component4() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final boolean component6() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.party.Party copy(@org.jetbrains.annotations.NotNull()
    java.util.UUID id, @org.jetbrains.annotations.NotNull()
    java.util.UUID leader, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.util.UUID, net.minebo.basalt.models.party.PartyElevation> members, @org.jetbrains.annotations.NotNull()
    java.util.Map<java.util.UUID, java.lang.Long> invited, long createdAt, boolean alive) {
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
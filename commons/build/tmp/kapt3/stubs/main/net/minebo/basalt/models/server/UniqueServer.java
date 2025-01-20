package net.minebo.basalt.models.server;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001B\u007f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0004\b\u0016\u0010\u0017J\u0006\u0010<\u001a\u00020\u0015J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\u0019\u0010@\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tH\u00c6\u0003J\t\u0010A\u001a\u00020\u000bH\u00c6\u0003J\t\u0010B\u001a\u00020\rH\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0010H\u00c6\u0003J\t\u0010E\u001a\u00020\u000bH\u00c6\u0003J\t\u0010F\u001a\u00020\u0003H\u00c6\u0003J\t\u0010G\u001a\u00020\u0010H\u00c6\u0003J\u000b\u0010H\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u0093\u0001\u0010I\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u00c6\u0001J\u0013\u0010J\u001a\u00020\u000b2\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010L\u001a\u00020\rH\u00d6\u0001J\t\u0010M\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0019\"\u0004\b\u001d\u0010\u001bR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0019\"\u0004\b\u001f\u0010\u001bR*\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0019\"\u0004\b-\u0010\u001bR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u001a\u0010\u0011\u001a\u00020\u000bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010%\"\u0004\b3\u0010'R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0019\"\u0004\b5\u0010\u001bR\u001a\u0010\u0013\u001a\u00020\u0010X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b6\u0010/\"\u0004\b7\u00101R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;\u00a8\u0006N"}, d2 = {"Lnet/minebo/basalt/models/server/UniqueServer;", "", "id", "", "displayName", "queueName", "players", "Ljava/util/ArrayList;", "Ljava/util/UUID;", "Lkotlin/collections/ArrayList;", "online", "", "ramAllocated", "", "bungeeName", "setToRelease", "", "lockedWithRank", "lockRank", "lastHeartbeat", "serverSoftware", "Lnet/minebo/basalt/models/server/software/ServerSoftware;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ZILjava/lang/String;JZLjava/lang/String;JLnet/minebo/basalt/models/server/software/ServerSoftware;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getDisplayName", "setDisplayName", "getQueueName", "setQueueName", "getPlayers", "()Ljava/util/ArrayList;", "setPlayers", "(Ljava/util/ArrayList;)V", "getOnline", "()Z", "setOnline", "(Z)V", "getRamAllocated", "()I", "setRamAllocated", "(I)V", "getBungeeName", "setBungeeName", "getSetToRelease", "()J", "setSetToRelease", "(J)V", "getLockedWithRank", "setLockedWithRank", "getLockRank", "setLockRank", "getLastHeartbeat", "setLastHeartbeat", "getServerSoftware", "()Lnet/minebo/basalt/models/server/software/ServerSoftware;", "setServerSoftware", "(Lnet/minebo/basalt/models/server/software/ServerSoftware;)V", "findServerSoftware", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "copy", "equals", "other", "hashCode", "toString", "commons"})
public final class UniqueServer {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String displayName;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String queueName;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.util.UUID> players;
    private boolean online;
    private int ramAllocated;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String bungeeName;
    private long setToRelease;
    private boolean lockedWithRank;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String lockRank;
    private long lastHeartbeat;
    @org.jetbrains.annotations.Nullable()
    private net.minebo.basalt.models.server.software.ServerSoftware serverSoftware;
    
    public UniqueServer(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String displayName, @org.jetbrains.annotations.NotNull()
    java.lang.String queueName, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.UUID> players, boolean online, int ramAllocated, @org.jetbrains.annotations.NotNull()
    java.lang.String bungeeName, long setToRelease, boolean lockedWithRank, @org.jetbrains.annotations.NotNull()
    java.lang.String lockRank, long lastHeartbeat, @org.jetbrains.annotations.Nullable()
    net.minebo.basalt.models.server.software.ServerSoftware serverSoftware) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    public final void setDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getQueueName() {
        return null;
    }
    
    public final void setQueueName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.util.UUID> getPlayers() {
        return null;
    }
    
    public final void setPlayers(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.UUID> p0) {
    }
    
    public final boolean getOnline() {
        return false;
    }
    
    public final void setOnline(boolean p0) {
    }
    
    public final int getRamAllocated() {
        return 0;
    }
    
    public final void setRamAllocated(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBungeeName() {
        return null;
    }
    
    public final void setBungeeName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getSetToRelease() {
        return 0L;
    }
    
    public final void setSetToRelease(long p0) {
    }
    
    public final boolean getLockedWithRank() {
        return false;
    }
    
    public final void setLockedWithRank(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLockRank() {
        return null;
    }
    
    public final void setLockRank(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getLastHeartbeat() {
        return 0L;
    }
    
    public final void setLastHeartbeat(long p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.server.software.ServerSoftware getServerSoftware() {
        return null;
    }
    
    public final void setServerSoftware(@org.jetbrains.annotations.Nullable()
    net.minebo.basalt.models.server.software.ServerSoftware p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.server.software.ServerSoftware findServerSoftware() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    public final long component11() {
        return 0L;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.server.software.ServerSoftware component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.util.UUID> component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    public final int component6() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final long component8() {
        return 0L;
    }
    
    public final boolean component9() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.server.UniqueServer copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String displayName, @org.jetbrains.annotations.NotNull()
    java.lang.String queueName, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.util.UUID> players, boolean online, int ramAllocated, @org.jetbrains.annotations.NotNull()
    java.lang.String bungeeName, long setToRelease, boolean lockedWithRank, @org.jetbrains.annotations.NotNull()
    java.lang.String lockRank, long lastHeartbeat, @org.jetbrains.annotations.Nullable()
    net.minebo.basalt.models.server.software.ServerSoftware serverSoftware) {
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
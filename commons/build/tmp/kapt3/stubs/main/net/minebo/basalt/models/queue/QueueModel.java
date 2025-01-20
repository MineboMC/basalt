package net.minebo.basalt.models.queue;

/**
 * Class created on 7/12/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\u0004\b\u0011\u0010\u0012J\u000e\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/J\u0010\u00100\u001a\u0004\u0018\u00010\u00102\u0006\u00101\u001a\u00020\u0006J\u000e\u00102\u001a\u00020-2\u0006\u0010.\u001a\u00020/J\u000e\u00103\u001a\u0002042\u0006\u0010.\u001a\u00020/J\u000e\u00105\u001a\u00020\u00062\u0006\u0010.\u001a\u00020/J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0003H\u00c6\u0003J\t\u00108\u001a\u00020\u0006H\u00c6\u0003J\t\u00109\u001a\u00020\bH\u00c6\u0003J\t\u0010:\u001a\u00020\u0006H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\fH\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0003Ji\u0010?\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00062\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00032\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u00c6\u0001J\u0013\u0010@\u001a\u00020-2\b\u0010A\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010B\u001a\u00020\u0006H\u00d6\u0001J\t\u0010C\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0014\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\t\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0019\"\u0004\b!\u0010\u001bR\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0014\"\u0004\b#\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\r\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0014\"\u0004\b)\u0010\u0017R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+\u00a8\u0006D"}, d2 = {"Lnet/minebo/basalt/models/queue/QueueModel;", "", "id", "", "displayName", "sendDelay", "", "status", "Lnet/minebo/basalt/models/queue/QueueStatus;", "limit", "uniqueServerId", "lastPull", "", "material", "playersInQueue", "Ljava/util/PriorityQueue;", "Lnet/minebo/basalt/models/queue/player/QueueEntry;", "<init>", "(Ljava/lang/String;Ljava/lang/String;ILnet/minebo/basalt/models/queue/QueueStatus;ILjava/lang/String;JLjava/lang/String;Ljava/util/PriorityQueue;)V", "getId", "()Ljava/lang/String;", "getDisplayName", "setDisplayName", "(Ljava/lang/String;)V", "getSendDelay", "()I", "setSendDelay", "(I)V", "getStatus", "()Lnet/minebo/basalt/models/queue/QueueStatus;", "setStatus", "(Lnet/minebo/basalt/models/queue/QueueStatus;)V", "getLimit", "setLimit", "getUniqueServerId", "setUniqueServerId", "getLastPull", "()J", "setLastPull", "(J)V", "getMaterial", "setMaterial", "getPlayersInQueue", "()Ljava/util/PriorityQueue;", "isAvailable", "", "uuid", "Ljava/util/UUID;", "getPlayerAt", "i", "containsPlayer", "removePlayer", "", "getPosition", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "commons"})
public final class QueueModel {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String id = null;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String displayName;
    private int sendDelay;
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.models.queue.QueueStatus status;
    private int limit;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String uniqueServerId;
    private long lastPull;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String material;
    @org.jetbrains.annotations.NotNull()
    private final java.util.PriorityQueue<net.minebo.basalt.models.queue.player.QueueEntry> playersInQueue = null;
    
    public QueueModel(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String displayName, int sendDelay, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.queue.QueueStatus status, int limit, @org.jetbrains.annotations.NotNull()
    java.lang.String uniqueServerId, long lastPull, @org.jetbrains.annotations.NotNull()
    java.lang.String material, @org.jetbrains.annotations.NotNull()
    java.util.PriorityQueue<net.minebo.basalt.models.queue.player.QueueEntry> playersInQueue) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    public final void setDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getSendDelay() {
        return 0;
    }
    
    public final void setSendDelay(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.queue.QueueStatus getStatus() {
        return null;
    }
    
    public final void setStatus(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.queue.QueueStatus p0) {
    }
    
    public final int getLimit() {
        return 0;
    }
    
    public final void setLimit(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUniqueServerId() {
        return null;
    }
    
    public final void setUniqueServerId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final long getLastPull() {
        return 0L;
    }
    
    public final void setLastPull(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMaterial() {
        return null;
    }
    
    public final void setMaterial(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.PriorityQueue<net.minebo.basalt.models.queue.player.QueueEntry> getPlayersInQueue() {
        return null;
    }
    
    public final boolean isAvailable(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return false;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.queue.player.QueueEntry getPlayerAt(int i) {
        return null;
    }
    
    public final boolean containsPlayer(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return false;
    }
    
    public final void removePlayer(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
    }
    
    public final int getPosition(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.queue.QueueStatus component4() {
        return null;
    }
    
    public final int component5() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    public final long component7() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.PriorityQueue<net.minebo.basalt.models.queue.player.QueueEntry> component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.queue.QueueModel copy(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String displayName, int sendDelay, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.queue.QueueStatus status, int limit, @org.jetbrains.annotations.NotNull()
    java.lang.String uniqueServerId, long lastPull, @org.jetbrains.annotations.NotNull()
    java.lang.String material, @org.jetbrains.annotations.NotNull()
    java.util.PriorityQueue<net.minebo.basalt.models.queue.player.QueueEntry> playersInQueue) {
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
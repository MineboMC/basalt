package net.minebo.basalt.models.vouchers;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b&\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u00a2\u0006\u0004\b\r\u0010\u000eJ\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\t\u0010&\u001a\u00020\u0005H\u00c6\u0003J\t\u0010'\u001a\u00020\u0007H\u00c6\u0003J\t\u0010(\u001a\u00020\tH\u00c6\u0003J\t\u0010)\u001a\u00020\u0007H\u00c6\u0003J\t\u0010*\u001a\u00020\u0003H\u00c6\u0003J\t\u0010+\u001a\u00020\u0003H\u00c6\u0003JO\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010-\u001a\u00020\u00072\b\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u000202H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0010\"\u0004\b\"\u0010\u0012R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0010\"\u0004\b$\u0010\u0012\u00a8\u00063"}, d2 = {"Lnet/minebo/basalt/models/vouchers/VoucherGrant;", "", "uniqueId", "Ljava/util/UUID;", "template", "Lnet/minebo/basalt/models/vouchers/VoucherTemplate;", "mustRedeemByTime", "", "redeemByDuration", "", "completed", "executedBy", "givenTo", "<init>", "(Ljava/util/UUID;Lnet/minebo/basalt/models/vouchers/VoucherTemplate;ZJZLjava/util/UUID;Ljava/util/UUID;)V", "getUniqueId", "()Ljava/util/UUID;", "setUniqueId", "(Ljava/util/UUID;)V", "getTemplate", "()Lnet/minebo/basalt/models/vouchers/VoucherTemplate;", "setTemplate", "(Lnet/minebo/basalt/models/vouchers/VoucherTemplate;)V", "getMustRedeemByTime", "()Z", "setMustRedeemByTime", "(Z)V", "getRedeemByDuration", "()J", "setRedeemByDuration", "(J)V", "getCompleted", "setCompleted", "getExecutedBy", "setExecutedBy", "getGivenTo", "setGivenTo", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "", "commons"})
public final class VoucherGrant {
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID uniqueId;
    @org.jetbrains.annotations.NotNull()
    private net.minebo.basalt.models.vouchers.VoucherTemplate template;
    private boolean mustRedeemByTime;
    private long redeemByDuration;
    private boolean completed;
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID executedBy;
    @org.jetbrains.annotations.NotNull()
    private java.util.UUID givenTo;
    
    public VoucherGrant(@org.jetbrains.annotations.NotNull()
    java.util.UUID uniqueId, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.vouchers.VoucherTemplate template, boolean mustRedeemByTime, long redeemByDuration, boolean completed, @org.jetbrains.annotations.NotNull()
    java.util.UUID executedBy, @org.jetbrains.annotations.NotNull()
    java.util.UUID givenTo) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getUniqueId() {
        return null;
    }
    
    public final void setUniqueId(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.vouchers.VoucherTemplate getTemplate() {
        return null;
    }
    
    public final void setTemplate(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.vouchers.VoucherTemplate p0) {
    }
    
    public final boolean getMustRedeemByTime() {
        return false;
    }
    
    public final void setMustRedeemByTime(boolean p0) {
    }
    
    public final long getRedeemByDuration() {
        return 0L;
    }
    
    public final void setRedeemByDuration(long p0) {
    }
    
    public final boolean getCompleted() {
        return false;
    }
    
    public final void setCompleted(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getExecutedBy() {
        return null;
    }
    
    public final void setExecutedBy(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID getGivenTo() {
        return null;
    }
    
    public final void setGivenTo(@org.jetbrains.annotations.NotNull()
    java.util.UUID p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.vouchers.VoucherTemplate component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    public final long component4() {
        return 0L;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.UUID component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.vouchers.VoucherGrant copy(@org.jetbrains.annotations.NotNull()
    java.util.UUID uniqueId, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.vouchers.VoucherTemplate template, boolean mustRedeemByTime, long redeemByDuration, boolean completed, @org.jetbrains.annotations.NotNull()
    java.util.UUID executedBy, @org.jetbrains.annotations.NotNull()
    java.util.UUID givenTo) {
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
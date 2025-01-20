package net.minebo.basalt.models.expirables;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0013\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0004\b\b\u0010\tJ\u0006\u0010\u0016\u001a\u00020\u0003J\u0006\u0010\u0017\u001a\u00020\u0005R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000f\"\u0004\b\u0015\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lnet/minebo/basalt/models/expirables/Expirable;", "", "expired", "", "addedAt", "", "duration", "removedAt", "<init>", "(ZJJJ)V", "getExpired", "()Z", "setExpired", "(Z)V", "getAddedAt", "()J", "setAddedAt", "(J)V", "getDuration", "setDuration", "getRemovedAt", "setRemovedAt", "isActive", "getActiveUntil", "commons"})
public final class Expirable {
    private boolean expired;
    private long addedAt;
    private long duration;
    private long removedAt;
    
    public Expirable(boolean expired, long addedAt, long duration, long removedAt) {
        super();
    }
    
    public final boolean getExpired() {
        return false;
    }
    
    public final void setExpired(boolean p0) {
    }
    
    public final long getAddedAt() {
        return 0L;
    }
    
    public final void setAddedAt(long p0) {
    }
    
    public final long getDuration() {
        return 0L;
    }
    
    public final void setDuration(long p0) {
    }
    
    public final long getRemovedAt() {
        return 0L;
    }
    
    public final void setRemovedAt(long p0) {
    }
    
    public final boolean isActive() {
        return false;
    }
    
    public final long getActiveUntil() {
        return 0L;
    }
}
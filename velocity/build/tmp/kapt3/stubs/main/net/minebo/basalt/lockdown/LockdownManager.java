package net.minebo.basalt.lockdown;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\u000e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b\u00a8\u0006\t"}, d2 = {"Lnet/minebo/basalt/lockdown/LockdownManager;", "", "<init>", "()V", "serverIsOnLockdown", "", "hasClearance", "player", "Lcom/velocitypowered/api/proxy/Player;", "velocity"})
public final class LockdownManager {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.lockdown.LockdownManager INSTANCE = null;
    
    private LockdownManager() {
        super();
    }
    
    public final boolean serverIsOnLockdown() {
        return false;
    }
    
    public final boolean hasClearance(@org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.proxy.Player player) {
        return false;
    }
}
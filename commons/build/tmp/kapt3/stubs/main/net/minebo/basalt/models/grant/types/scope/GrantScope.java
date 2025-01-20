package net.minebo.basalt.models.grant.types.scope;

/**
 * Class created on 6/20/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0018J\t\u0010\u0019\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0007H\u00c6\u0003J-\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u00c6\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001f\u001a\u00020 H\u00d6\u0001J\t\u0010!\u001a\u00020\u0003H\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015\u00a8\u0006\""}, d2 = {"Lnet/minebo/basalt/models/grant/types/scope/GrantScope;", "", "scopeReason", "", "servers", "", "global", "", "<init>", "(Ljava/lang/String;Ljava/util/List;Z)V", "getScopeReason", "()Ljava/lang/String;", "setScopeReason", "(Ljava/lang/String;)V", "getServers", "()Ljava/util/List;", "setServers", "(Ljava/util/List;)V", "getGlobal", "()Z", "setGlobal", "(Z)V", "appliesOn", "server", "Lnet/minebo/basalt/models/server/UniqueServer;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "commons"})
public final class GrantScope {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String scopeReason;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> servers;
    private boolean global;
    
    public GrantScope(@org.jetbrains.annotations.NotNull()
    java.lang.String scopeReason, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> servers, boolean global) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getScopeReason() {
        return null;
    }
    
    public final void setScopeReason(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getServers() {
        return null;
    }
    
    public final void setServers(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public final boolean getGlobal() {
        return false;
    }
    
    public final void setGlobal(boolean p0) {
    }
    
    public final boolean appliesOn(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.server.UniqueServer server) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component2() {
        return null;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.grant.types.scope.GrantScope copy(@org.jetbrains.annotations.NotNull()
    java.lang.String scopeReason, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> servers, boolean global) {
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
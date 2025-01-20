package net.minebo.basalt.models.profile.auth;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0002\b\u001d\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B=\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n\u00a2\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\t\u0010!\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\"\u001a\u00020\bH\u00c6\u0003J\u000f\u0010#\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u00c6\u0003JA\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nH\u00c6\u0001J\u0013\u0010%\u001a\u00020\u00052\b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010'\u001a\u00020(H\u00d6\u0001J\t\u0010)\u001a\u00020\bH\u00d6\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0012\"\u0004\b\u0016\u0010\u0014R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006*"}, d2 = {"Lnet/minebo/basalt/models/profile/auth/AuthStatus;", "", "lastAuthenticated", "", "hasSetup2fa", "", "authBypassed", "secret", "", "allowedIps", "", "<init>", "(JZZLjava/lang/String;Ljava/util/List;)V", "getLastAuthenticated", "()J", "setLastAuthenticated", "(J)V", "getHasSetup2fa", "()Z", "setHasSetup2fa", "(Z)V", "getAuthBypassed", "setAuthBypassed", "getSecret", "()Ljava/lang/String;", "setSecret", "(Ljava/lang/String;)V", "getAllowedIps", "()Ljava/util/List;", "setAllowedIps", "(Ljava/util/List;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "commons"})
public final class AuthStatus {
    private long lastAuthenticated;
    private boolean hasSetup2fa;
    private boolean authBypassed;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String secret;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> allowedIps;
    
    public AuthStatus(long lastAuthenticated, boolean hasSetup2fa, boolean authBypassed, @org.jetbrains.annotations.NotNull()
    java.lang.String secret, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> allowedIps) {
        super();
    }
    
    public final long getLastAuthenticated() {
        return 0L;
    }
    
    public final void setLastAuthenticated(long p0) {
    }
    
    public final boolean getHasSetup2fa() {
        return false;
    }
    
    public final void setHasSetup2fa(boolean p0) {
    }
    
    public final boolean getAuthBypassed() {
        return false;
    }
    
    public final void setAuthBypassed(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSecret() {
        return null;
    }
    
    public final void setSecret(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAllowedIps() {
        return null;
    }
    
    public final void setAllowedIps(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    public final long component1() {
        return 0L;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean component3() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.profile.auth.AuthStatus copy(long lastAuthenticated, boolean hasSetup2fa, boolean authBypassed, @org.jetbrains.annotations.NotNull()
    java.lang.String secret, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> allowedIps) {
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
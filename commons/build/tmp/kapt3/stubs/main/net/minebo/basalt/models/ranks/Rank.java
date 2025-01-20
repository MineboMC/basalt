package net.minebo.basalt.models.ranks;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b*\n\u0002\u0010!\n\u0000\u0018\u00002\u00020\u0001B\u008b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\t\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0014\u0010\u0015J\u0006\u0010:\u001a\u00020\u0012J\u0006\u0010;\u001a\u00020\u0003J\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00030=R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b&\u0010#\"\u0004\b'\u0010%R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0017\"\u0004\b)\u0010\u0019R\u001a\u0010\f\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0017\"\u0004\b+\u0010\u0019R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\u001a\u0010\u000f\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b0\u0010-\"\u0004\b1\u0010/R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0017\"\u0004\b3\u0010\u0019R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0017\"\u0004\b9\u0010\u0019\u00a8\u0006>"}, d2 = {"Lnet/minebo/basalt/models/ranks/Rank;", "", "id", "", "name", "displayName", "weight", "", "permissions", "Ljava/util/ArrayList;", "parents", "prefix", "color", "staff", "", "default", "woolColor", "scope", "Lnet/minebo/basalt/models/ranks/scope/RankScope;", "discordRoleId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/ArrayList;Ljava/util/ArrayList;Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Lnet/minebo/basalt/models/ranks/scope/RankScope;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getName", "setName", "getDisplayName", "setDisplayName", "getWeight", "()I", "setWeight", "(I)V", "getPermissions", "()Ljava/util/ArrayList;", "setPermissions", "(Ljava/util/ArrayList;)V", "getParents", "setParents", "getPrefix", "setPrefix", "getColor", "setColor", "getStaff", "()Z", "setStaff", "(Z)V", "getDefault", "setDefault", "getWoolColor", "setWoolColor", "getScope", "()Lnet/minebo/basalt/models/ranks/scope/RankScope;", "setScope", "(Lnet/minebo/basalt/models/ranks/scope/RankScope;)V", "getDiscordRoleId", "setDiscordRoleId", "getRankScope", "getHexCodeFromColorCode", "getAllPermissions", "", "commons"})
public final class Rank {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String displayName;
    private int weight;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> permissions;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> parents;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String prefix;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String color;
    private boolean staff;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String woolColor;
    @org.jetbrains.annotations.Nullable()
    private net.minebo.basalt.models.ranks.scope.RankScope scope;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String discordRoleId;
    
    public Rank(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String displayName, int weight, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> permissions, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> parents, @org.jetbrains.annotations.NotNull()
    java.lang.String prefix, @org.jetbrains.annotations.NotNull()
    java.lang.String color, boolean staff, boolean p9_772401952, @org.jetbrains.annotations.Nullable()
    java.lang.String woolColor, @org.jetbrains.annotations.Nullable()
    net.minebo.basalt.models.ranks.scope.RankScope scope, @org.jetbrains.annotations.Nullable()
    java.lang.String discordRoleId) {
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
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    public final void setDisplayName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getWeight() {
        return 0;
    }
    
    public final void setWeight(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getPermissions() {
        return null;
    }
    
    public final void setPermissions(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getParents() {
        return null;
    }
    
    public final void setParents(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPrefix() {
        return null;
    }
    
    public final void setPrefix(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getColor() {
        return null;
    }
    
    public final void setColor(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getStaff() {
        return false;
    }
    
    public final void setStaff(boolean p0) {
    }
    
    public final boolean getDefault() {
        return false;
    }
    
    public final void setDefault(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getWoolColor() {
        return null;
    }
    
    public final void setWoolColor(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.ranks.scope.RankScope getScope() {
        return null;
    }
    
    public final void setScope(@org.jetbrains.annotations.Nullable()
    net.minebo.basalt.models.ranks.scope.RankScope p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDiscordRoleId() {
        return null;
    }
    
    public final void setDiscordRoleId(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.models.ranks.scope.RankScope getRankScope() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHexCodeFromColorCode() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.String> getAllPermissions() {
        return null;
    }
}
package net.minebo.basalt.broadcasts.model;

/**
 * Class created on 6/17/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\u0004\b\b\u0010\tJ\u000e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0018R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lnet/minebo/basalt/broadcasts/model/BroadcastMessage;", "", "id", "", "lines", "", "conditions", "Lnet/minebo/basalt/broadcasts/condition/BroadcastCondition;", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "getLines", "()Ljava/util/List;", "setLines", "(Ljava/util/List;)V", "getConditions", "canBeSentToPlayer", "", "player", "Lorg/bukkit/entity/Player;", "save", "", "spigot"})
public final class BroadcastMessage {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> lines;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<net.minebo.basalt.broadcasts.condition.BroadcastCondition> conditions = null;
    
    public BroadcastMessage(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> lines, @org.jetbrains.annotations.NotNull()
    java.util.List<net.minebo.basalt.broadcasts.condition.BroadcastCondition> conditions) {
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
    public final java.util.List<java.lang.String> getLines() {
        return null;
    }
    
    public final void setLines(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.broadcasts.condition.BroadcastCondition> getConditions() {
        return null;
    }
    
    public final boolean canBeSentToPlayer(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return false;
    }
    
    public final void save() {
    }
}
package net.minebo.basalt.broadcasts.condition;

/**
 * Class created on 1/16/2024
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/broadcasts/condition/ConditionType;", "", "<init>", "()V", "testFor", "", "player", "Lorg/bukkit/entity/Player;", "value", "", "spigot"})
public abstract class ConditionType {
    
    public ConditionType() {
        super();
    }
    
    public abstract boolean testFor(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.lang.String value);
}
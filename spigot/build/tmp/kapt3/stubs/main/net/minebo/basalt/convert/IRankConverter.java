package net.minebo.basalt.convert;

/**
 * Class created on 6/13/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lnet/minebo/basalt/convert/IRankConverter;", "", "convert", "", "player", "Lorg/bukkit/entity/Player;", "spigot"})
public abstract interface IRankConverter {
    
    public abstract void convert(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player);
}
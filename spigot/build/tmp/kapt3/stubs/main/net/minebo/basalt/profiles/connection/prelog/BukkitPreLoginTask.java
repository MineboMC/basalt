package net.minebo.basalt.profiles.connection.prelog;

/**
 * Class created on 7/20/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\b"}, d2 = {"Lnet/minebo/basalt/profiles/connection/prelog/BukkitPreLoginTask;", "", "run", "", "event", "Lorg/bukkit/event/player/AsyncPlayerPreLoginEvent;", "shouldBeLazy", "", "spigot"})
public abstract interface BukkitPreLoginTask {
    
    public abstract void run(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.player.AsyncPlayerPreLoginEvent event);
    
    public abstract boolean shouldBeLazy();
}
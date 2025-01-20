package net.minebo.basalt.profiles.connection.prelog.tasks;

/**
 * Class created on 7/20/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0016\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/profiles/connection/prelog/tasks/LoadProfile;", "Lnet/minebo/basalt/profiles/connection/prelog/BukkitPreLoginTask;", "<init>", "()V", "run", "", "event", "Lorg/bukkit/event/player/AsyncPlayerPreLoginEvent;", "shouldBeLazy", "", "spigot"})
public final class LoadProfile implements net.minebo.basalt.profiles.connection.prelog.BukkitPreLoginTask {
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.profiles.connection.prelog.tasks.LoadProfile INSTANCE = null;
    
    private LoadProfile() {
        super();
    }
    
    @java.lang.Override()
    public void run(@org.jetbrains.annotations.NotNull()
    org.bukkit.event.player.AsyncPlayerPreLoginEvent event) {
    }
    
    @java.lang.Override()
    public boolean shouldBeLazy() {
        return false;
    }
}
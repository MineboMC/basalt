package net.minebo.basalt;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\u0006\u0010\u001b\u001a\u00020\u001aJ\u0006\u0010\u001c\u001a\u00020\u001aR+\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u00058F@FX\u0086\u008e\u0002\u00a2\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\u00020\u000eX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006\u001e"}, d2 = {"Lnet/minebo/basalt/BasaltSpigotPlugin;", "Lorg/bukkit/plugin/java/JavaPlugin;", "<init>", "()V", "<set-?>", "", "launchedAt", "getLaunchedAt", "()J", "setLaunchedAt", "(J)V", "launchedAt$delegate", "Lkotlin/properties/ReadWriteProperty;", "commandManager", "Lco/aikar/commands/PaperCommandManager;", "getCommandManager", "()Lco/aikar/commands/PaperCommandManager;", "setCommandManager", "(Lco/aikar/commands/PaperCommandManager;)V", "audience", "Lnet/kyori/adventure/platform/bukkit/BukkitAudiences;", "getAudience", "()Lnet/kyori/adventure/platform/bukkit/BukkitAudiences;", "setAudience", "(Lnet/kyori/adventure/platform/bukkit/BukkitAudiences;)V", "onEnable", "", "sendStartupMSG", "registerExpansion", "Companion", "spigot"})
public final class BasaltSpigotPlugin extends org.bukkit.plugin.java.JavaPlugin {
    public static net.minebo.basalt.BasaltSpigotPlugin instance;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.properties.ReadWriteProperty launchedAt$delegate = null;
    public co.aikar.commands.PaperCommandManager commandManager;
    public net.kyori.adventure.platform.bukkit.BukkitAudiences audience;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.BasaltSpigotPlugin.Companion Companion = null;
    
    public BasaltSpigotPlugin() {
        super();
    }
    
    public final void setLaunchedAt(long p0) {
    }
    
    public final long getLaunchedAt() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final co.aikar.commands.PaperCommandManager getCommandManager() {
        return null;
    }
    
    public final void setCommandManager(@org.jetbrains.annotations.NotNull()
    co.aikar.commands.PaperCommandManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.kyori.adventure.platform.bukkit.BukkitAudiences getAudience() {
        return null;
    }
    
    public final void setAudience(@org.jetbrains.annotations.NotNull()
    net.kyori.adventure.platform.bukkit.BukkitAudiences p0) {
    }
    
    @java.lang.Override()
    public void onEnable() {
    }
    
    public final void sendStartupMSG() {
    }
    
    public final void registerExpansion() {
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lnet/minebo/basalt/BasaltSpigotPlugin$Companion;", "", "<init>", "()V", "instance", "Lnet/minebo/basalt/BasaltSpigotPlugin;", "getInstance", "()Lnet/minebo/basalt/BasaltSpigotPlugin;", "setInstance", "(Lnet/minebo/basalt/BasaltSpigotPlugin;)V", "spigot"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.BasaltSpigotPlugin getInstance() {
            return null;
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        net.minebo.basalt.BasaltSpigotPlugin p0) {
        }
    }
}
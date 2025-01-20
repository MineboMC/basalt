package net.minebo.basalt;

@com.velocitypowered.api.plugin.Plugin(id = "basalt", name = "AlchemisVelocity", version = "1.0", authors = {"98ping", "AndyReckt", "Ian Rich"})
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB#\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0019H\u0007J\b\u0010\u001a\u001a\u00020\u0015H\u0002R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001c"}, d2 = {"Lnet/minebo/basalt/BasaltVelocity;", "", "server", "Lcom/velocitypowered/api/proxy/ProxyServer;", "logger", "Ljava/util/logging/Logger;", "dataDirectory", "Ljava/nio/file/Path;", "<init>", "(Lcom/velocitypowered/api/proxy/ProxyServer;Ljava/util/logging/Logger;Ljava/nio/file/Path;)V", "getServer", "()Lcom/velocitypowered/api/proxy/ProxyServer;", "getLogger", "()Ljava/util/logging/Logger;", "getDataDirectory", "()Ljava/nio/file/Path;", "config", "Lorg/simpleyaml/configuration/file/YamlFile;", "getConfig", "()Lorg/simpleyaml/configuration/file/YamlFile;", "initPlugin", "", "event", "Lcom/velocitypowered/api/event/proxy/ProxyInitializeEvent;", "onProxyShutdown", "Lcom/velocitypowered/api/event/proxy/ProxyShutdownEvent;", "setupDatabases", "Companion", "velocity"})
public final class BasaltVelocity {
    @org.jetbrains.annotations.NotNull()
    private final com.velocitypowered.api.proxy.ProxyServer server = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.logging.Logger logger = null;
    @org.jetbrains.annotations.NotNull()
    private final java.nio.file.Path dataDirectory = null;
    @org.jetbrains.annotations.NotNull()
    private final org.simpleyaml.configuration.file.YamlFile config = null;
    public static net.minebo.basalt.BasaltVelocity instance;
    @org.jetbrains.annotations.NotNull()
    private static net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer serializer;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.BasaltVelocity.Companion Companion = null;
    
    @com.google.inject.Inject()
    public BasaltVelocity(@org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.proxy.ProxyServer server, @org.jetbrains.annotations.NotNull()
    java.util.logging.Logger logger, @com.velocitypowered.api.plugin.annotation.DataDirectory()
    @org.jetbrains.annotations.NotNull()
    java.nio.file.Path dataDirectory) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.velocitypowered.api.proxy.ProxyServer getServer() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.logging.Logger getLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.nio.file.Path getDataDirectory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.simpleyaml.configuration.file.YamlFile getConfig() {
        return null;
    }
    
    @com.velocitypowered.api.event.Subscribe(order = com.velocitypowered.api.event.PostOrder.FIRST)
    public final void initPlugin(@org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.event.proxy.ProxyInitializeEvent event) {
    }
    
    @com.velocitypowered.api.event.Subscribe()
    public final void onProxyShutdown(@org.jetbrains.annotations.NotNull()
    com.velocitypowered.api.event.proxy.ProxyShutdownEvent event) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.BasaltVelocity getInstance() {
        return null;
    }
    
    public static final void setInstance(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.BasaltVelocity p0) {
    }
    
    @kotlin.jvm.JvmStatic()
    @org.jetbrains.annotations.NotNull()
    public static final net.kyori.adventure.text.TextComponent color(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
        return null;
    }
    
    private final void setupDatabases() {
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007R$\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u0014\n\u0000\u0012\u0004\b\u0006\u0010\u0003\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lnet/minebo/basalt/BasaltVelocity$Companion;", "", "<init>", "()V", "instance", "Lnet/minebo/basalt/BasaltVelocity;", "getInstance$annotations", "getInstance", "()Lnet/minebo/basalt/BasaltVelocity;", "setInstance", "(Lnet/minebo/basalt/BasaltVelocity;)V", "serializer", "Lnet/kyori/adventure/text/serializer/legacy/LegacyComponentSerializer;", "color", "Lnet/kyori/adventure/text/TextComponent;", "message", "", "velocity"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.BasaltVelocity getInstance() {
            return null;
        }
        
        @kotlin.jvm.JvmStatic()
        @java.lang.Deprecated()
        public static void getInstance$annotations() {
        }
        
        public final void setInstance(@org.jetbrains.annotations.NotNull()
        net.minebo.basalt.BasaltVelocity p0) {
        }
        
        @kotlin.jvm.JvmStatic()
        @org.jetbrains.annotations.NotNull()
        public final net.kyori.adventure.text.TextComponent color(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            return null;
        }
    }
}
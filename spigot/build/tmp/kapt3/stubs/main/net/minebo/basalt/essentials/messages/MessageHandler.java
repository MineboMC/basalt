package net.minebo.basalt.essentials.messages;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u000f\u001a\u00020\nJ\u001e\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\nJ\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u00172\u0006\u0010\u0018\u001a\u00020\u0012J\u0016\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0006J\u0016\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0006J\u0016\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u0006J\u000e\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\u001f\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0006J\u000e\u0010!\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0006J\u0016\u0010\"\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006#"}, d2 = {"Lnet/minebo/basalt/essentials/messages/MessageHandler;", "", "<init>", "()V", "replyMap", "", "Ljava/util/UUID;", "getReplyMap", "()Ljava/util/Map;", "MESSAGE_FORMAT_FROM", "", "MESSAGE_FORMAT_TO", "STAFF_MESSAGE_FORMAT_FROM", "STAFF_MESSAGE_FORMAT_TO", "SOUND", "message", "", "to", "Lorg/bukkit/entity/Player;", "from", "Lorg/bukkit/command/CommandSender;", "staffMessage", "getPlayersIgnored", "", "player", "hasPlayerIgnored", "", "ignored", "addIgnoredPlayer", "removeIgnoredPlayer", "hasSoundsOn", "toggleSounds", "value", "hasMessagesOn", "toggleMessages", "spigot"})
public final class MessageHandler {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.util.UUID, java.util.UUID> replyMap = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MESSAGE_FORMAT_FROM = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String MESSAGE_FORMAT_TO = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String STAFF_MESSAGE_FORMAT_FROM = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String STAFF_MESSAGE_FORMAT_TO = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String SOUND = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.essentials.messages.MessageHandler INSTANCE = null;
    
    private MessageHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, java.util.UUID> getReplyMap() {
        return null;
    }
    
    public final void message(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player to, @org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender from, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void staffMessage(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player to, @org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player from, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.util.UUID> getPlayersIgnored(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return null;
    }
    
    public final boolean hasPlayerIgnored(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.util.UUID ignored) {
        return false;
    }
    
    public final void addIgnoredPlayer(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.util.UUID ignored) {
    }
    
    public final void removeIgnoredPlayer(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player, @org.jetbrains.annotations.NotNull()
    java.util.UUID ignored) {
    }
    
    public final boolean hasSoundsOn(@org.jetbrains.annotations.NotNull()
    java.util.UUID player) {
        return false;
    }
    
    public final void toggleSounds(boolean value, @org.jetbrains.annotations.NotNull()
    java.util.UUID player) {
    }
    
    public final boolean hasMessagesOn(@org.jetbrains.annotations.NotNull()
    java.util.UUID player) {
        return false;
    }
    
    public final void toggleMessages(boolean value, @org.jetbrains.annotations.NotNull()
    java.util.UUID player) {
    }
}
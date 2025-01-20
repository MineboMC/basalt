package net.minebo.basalt.util;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u0005J\u000e\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u0011\u001a\u00020\u0007J\u000e\u0010\u0012\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\u0013\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bJ\u001a\u0010\u0014\u001a\u00020\u00002\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f0\u000bJ\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u001a\u0010\u0013\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0005H\u0016J\u000e\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"}, d2 = {"Lnet/minebo/basalt/util/InputPrompt;", "Lorg/bukkit/conversations/StringPrompt;", "<init>", "()V", "promptText", "", "charLimit", "", "regex", "Lkotlin/text/Regex;", "use", "Lkotlin/Function1;", "", "fail", "withText", "text", "withLimit", "limit", "withRegex", "acceptInput", "onFail", "getPromptText", "context", "Lorg/bukkit/conversations/ConversationContext;", "Lorg/bukkit/conversations/Prompt;", "input", "start", "player", "Lorg/bukkit/entity/Player;", "spigot"})
public final class InputPrompt extends org.bukkit.conversations.StringPrompt {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String promptText;
    private int charLimit = -1;
    @org.jetbrains.annotations.Nullable()
    private kotlin.text.Regex regex;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> use;
    @org.jetbrains.annotations.Nullable()
    private kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> fail;
    
    public InputPrompt() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.util.InputPrompt withText(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.util.InputPrompt withLimit(int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.util.InputPrompt withRegex(@org.jetbrains.annotations.NotNull()
    kotlin.text.Regex regex) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.util.InputPrompt acceptInput(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> use) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.util.InputPrompt onFail(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> use) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getPromptText(@org.jetbrains.annotations.NotNull()
    org.bukkit.conversations.ConversationContext context) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public org.bukkit.conversations.Prompt acceptInput(@org.jetbrains.annotations.NotNull()
    org.bukkit.conversations.ConversationContext context, @org.jetbrains.annotations.NotNull()
    java.lang.String input) {
        return null;
    }
    
    public final void start(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public java.lang.Object clone() {
        return null;
    }
}
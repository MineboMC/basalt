package net.minebo.basalt.util;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\r\u001a\u00020\u0004J$\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\r\u001a\u00020\u0004J\u001e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004H&J\u001d\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0004H&\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lnet/minebo/basalt/util/PaginatedOutput;", "T", "", "resultsPerPage", "", "<init>", "(I)V", "display", "", "sender", "Lorg/bukkit/command/CommandSender;", "results", "", "page", "", "getHeader", "", "maxPages", "format", "result", "resultIndex", "(Ljava/lang/Object;I)Ljava/lang/String;", "spigot"})
public abstract class PaginatedOutput<T extends java.lang.Object> {
    private final int resultsPerPage = 0;
    
    @kotlin.jvm.JvmOverloads()
    public PaginatedOutput() {
        super();
    }
    
    @kotlin.jvm.JvmOverloads()
    public PaginatedOutput(int resultsPerPage) {
        super();
    }
    
    public final void display(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @org.jetbrains.annotations.NotNull()
    java.util.Collection<? extends T> results, int page) {
    }
    
    public final void display(@org.jetbrains.annotations.NotNull()
    org.bukkit.command.CommandSender sender, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends T> results, int page) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<java.lang.String> getHeader(int page, int maxPages);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.lang.String format(T result, int resultIndex);
}
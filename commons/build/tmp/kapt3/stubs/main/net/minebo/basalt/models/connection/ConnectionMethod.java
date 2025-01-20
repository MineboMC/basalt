package net.minebo.basalt.models.connection;

/**
 * Class created on 5/27/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\r\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007J\u001a\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u0007R#\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lnet/minebo/basalt/models/connection/ConnectionMethod;", "T", "", "<init>", "()V", "allCallbacks", "", "Lkotlin/Function1;", "", "getAllCallbacks", "()Ljava/util/List;", "allLazyCallbacks", "getAllLazyCallbacks", "registerNewCallback", "", "call", "registerNewLazyCallback", "commons"})
public abstract class ConnectionMethod<T extends java.lang.Object> {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<kotlin.jvm.functions.Function1<T, kotlin.Unit>> allCallbacks = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<kotlin.jvm.functions.Function1<T, kotlin.Unit>> allLazyCallbacks = null;
    
    public ConnectionMethod() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.jvm.functions.Function1<T, kotlin.Unit>> getAllCallbacks() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<kotlin.jvm.functions.Function1<T, kotlin.Unit>> getAllLazyCallbacks() {
        return null;
    }
    
    public final boolean registerNewCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> call) {
        return false;
    }
    
    public final boolean registerNewLazyCallback(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super T, kotlin.Unit> call) {
        return false;
    }
}
package net.minebo.basalt.punishment.commands.menu.impl.filter;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u000f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B1\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u001e\u0010\u0004\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0005\u00a2\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR)\u0010\u0004\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\b0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016\u00a8\u0006\u0017"}, d2 = {"Lnet/minebo/basalt/punishment/commands/menu/impl/filter/PunishmentFilter;", "", "displayName", "", "lambda", "Lkotlin/Function1;", "", "Lnet/minebo/basalt/models/grant/types/Punishment;", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getDisplayName", "()Ljava/lang/String;", "getLambda", "()Lkotlin/jvm/functions/Function1;", "ALL", "ACTIVE", "REMOVED", "EXPIRED", "TEMPORARY", "GAME_GRANTED", "CONSOLE_GRANTED", "GAME_ACTOR", "spigot"})
public enum PunishmentFilter {
    /*public static final*/ ALL /* = new ALL(null, null) */,
    /*public static final*/ ACTIVE /* = new ACTIVE(null, null) */,
    /*public static final*/ REMOVED /* = new REMOVED(null, null) */,
    /*public static final*/ EXPIRED /* = new EXPIRED(null, null) */,
    /*public static final*/ TEMPORARY /* = new TEMPORARY(null, null) */,
    /*public static final*/ GAME_GRANTED /* = new GAME_GRANTED(null, null) */,
    /*public static final*/ CONSOLE_GRANTED /* = new CONSOLE_GRANTED(null, null) */,
    /*public static final*/ GAME_ACTOR /* = new GAME_ACTOR(null, null) */;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String displayName = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.util.Collection<net.minebo.basalt.models.grant.types.Punishment>, java.util.List<net.minebo.basalt.models.grant.types.Punishment>> lambda = null;
    
    PunishmentFilter(java.lang.String displayName, kotlin.jvm.functions.Function1<? super java.util.Collection<net.minebo.basalt.models.grant.types.Punishment>, ? extends java.util.List<net.minebo.basalt.models.grant.types.Punishment>> lambda) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDisplayName() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.jvm.functions.Function1<java.util.Collection<net.minebo.basalt.models.grant.types.Punishment>, java.util.List<net.minebo.basalt.models.grant.types.Punishment>> getLambda() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static kotlin.enums.EnumEntries<net.minebo.basalt.punishment.commands.menu.impl.filter.PunishmentFilter> getEntries() {
        return null;
    }
}
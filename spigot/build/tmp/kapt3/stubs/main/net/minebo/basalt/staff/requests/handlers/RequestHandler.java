package net.minebo.basalt.staff.requests.handlers;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u001d\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\r0\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\t\u00a8\u0006\u0015"}, d2 = {"Lnet/minebo/basalt/staff/requests/handlers/RequestHandler;", "", "<init>", "()V", "requestCooldowns", "", "Ljava/util/UUID;", "", "getRequestCooldowns", "()Ljava/util/Map;", "reportCooldowns", "getReportCooldowns", "activeReports", "Lnet/minebo/basalt/staff/requests/report/ReportModel;", "getActiveReports", "isOnRequestCooldown", "", "player", "Lorg/bukkit/entity/Player;", "isOnReportCooldown", "hasReportsEnabled", "spigot"})
public final class RequestHandler {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.util.UUID, java.lang.Long> requestCooldowns = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.util.UUID, java.lang.Long> reportCooldowns = null;
    @org.jetbrains.annotations.NotNull()
    private static final java.util.Map<java.util.UUID, net.minebo.basalt.staff.requests.report.ReportModel> activeReports = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.staff.requests.handlers.RequestHandler INSTANCE = null;
    
    private RequestHandler() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, java.lang.Long> getRequestCooldowns() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, java.lang.Long> getReportCooldowns() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.util.UUID, net.minebo.basalt.staff.requests.report.ReportModel> getActiveReports() {
        return null;
    }
    
    public final boolean isOnRequestCooldown(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return false;
    }
    
    public final boolean isOnReportCooldown(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return false;
    }
    
    public final boolean hasReportsEnabled(@org.jetbrains.annotations.NotNull()
    org.bukkit.entity.Player player) {
        return false;
    }
}
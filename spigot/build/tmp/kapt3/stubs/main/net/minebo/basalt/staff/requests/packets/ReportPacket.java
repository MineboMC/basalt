package net.minebo.basalt.staff.requests.packets;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/staff/requests/packets/ReportPacket;", "Lnet/minebo/basalt/redis/RedisPacket;", "message", "", "reportModel", "Lnet/minebo/basalt/staff/requests/report/ReportModel;", "<init>", "(Ljava/lang/String;Lnet/minebo/basalt/staff/requests/report/ReportModel;)V", "getMessage", "()Ljava/lang/String;", "getReportModel", "()Lnet/minebo/basalt/staff/requests/report/ReportModel;", "action", "", "spigot"})
public final class ReportPacket extends net.minebo.basalt.redis.RedisPacket {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String message = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.staff.requests.report.ReportModel reportModel = null;
    
    public ReportPacket(@org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.staff.requests.report.ReportModel reportModel) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getMessage() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final net.minebo.basalt.staff.requests.report.ReportModel getReportModel() {
        return null;
    }
    
    @java.lang.Override()
    public void action() {
    }
}
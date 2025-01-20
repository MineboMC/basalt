package net.minebo.basalt.metric;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\r\u001a\u00020\u0006J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\bJ\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\r\u001a\u00020\u0006R9\u0010\u0004\u001a*\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0005j\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u0007`\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\u0014"}, d2 = {"Lnet/minebo/basalt/metric/MetricService;", "", "<init>", "()V", "metrics", "Ljava/util/HashMap;", "", "", "Lnet/minebo/basalt/metric/Metric;", "Lkotlin/collections/HashMap;", "getMetrics", "()Ljava/util/HashMap;", "getLast10", "category", "addMetric", "", "service", "metric", "averageMS", "", "commons"})
public final class MetricService {
    @org.jetbrains.annotations.NotNull()
    private static final java.util.HashMap<java.lang.String, java.util.List<net.minebo.basalt.metric.Metric>> metrics = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.metric.MetricService INSTANCE = null;
    
    private MetricService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.HashMap<java.lang.String, java.util.List<net.minebo.basalt.metric.Metric>> getMetrics() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<net.minebo.basalt.metric.Metric> getLast10(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
        return null;
    }
    
    public final void addMetric(@org.jetbrains.annotations.NotNull()
    java.lang.String service, @org.jetbrains.annotations.NotNull()
    net.minebo.basalt.metric.Metric metric) {
    }
    
    public final long averageMS(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
        return 0L;
    }
}
package net.minebo.basalt.servers.statistic;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001:\n\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001fB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0010\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002J\u0010\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002R\u000e\u0010\u0002\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015\u00a8\u0006 "}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric;", "", "plugin", "Lorg/bukkit/plugin/java/JavaPlugin;", "serviceId", "", "<init>", "(Lorg/bukkit/plugin/java/JavaPlugin;I)V", "Lorg/bukkit/plugin/Plugin;", "metricsBase", "Lnet/minebo/basalt/servers/statistic/Metric$MetricsBase;", "addCustomChart", "", "chart", "Lnet/minebo/basalt/servers/statistic/Metric$CustomChart;", "appendPlatformData", "builder", "Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder;", "appendServiceData", "playerAmount", "getPlayerAmount", "()I", "MetricsBase", "DrilldownPie", "AdvancedPie", "MultiLineChart", "SimpleBarChart", "CustomChart", "SimplePie", "AdvancedBarChart", "SingleLineChart", "JsonObjectBuilder", "spigot"})
public final class Metric {
    @org.jetbrains.annotations.NotNull()
    private final org.bukkit.plugin.Plugin plugin = null;
    @org.jetbrains.annotations.NotNull()
    private final net.minebo.basalt.servers.statistic.Metric.MetricsBase metricsBase = null;
    
    public Metric(@org.jetbrains.annotations.NotNull()
    org.bukkit.plugin.java.JavaPlugin plugin, int serviceId) {
        super();
    }
    
    /**
     * Adds a custom chart.
     *
     * @param chart The chart to add.
     */
    public final void addCustomChart(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.servers.statistic.Metric.CustomChart chart) {
    }
    
    private final void appendPlatformData(net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder builder) {
    }
    
    private final void appendServiceData(net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder builder) {
    }
    
    private final int getPlayerAmount() {
        return 0;
    }
    
    /**
     * Class constructor.
     *
     * @param chartId The id of the chart.
     * @param callable The callable which is used to request the chart data.
     */
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric$AdvancedBarChart;", "Lnet/minebo/basalt/servers/statistic/Metric$CustomChart;", "chartId", "", "callable", "Ljava/util/concurrent/Callable;", "", "", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/Callable;)V", "chartData", "Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "getChartData", "()Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "spigot"})
    public static final class AdvancedBarChart extends net.minebo.basalt.servers.statistic.Metric.CustomChart {
        @org.jetbrains.annotations.NotNull()
        private final java.util.concurrent.Callable<java.util.Map<java.lang.String, int[]>> callable = null;
        
        public AdvancedBarChart(@org.jetbrains.annotations.Nullable()
        java.lang.String chartId, @org.jetbrains.annotations.NotNull()
        java.util.concurrent.Callable<java.util.Map<java.lang.String, int[]>> callable) {
            super(null);
        }
        
        @java.lang.Override()
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        @org.jetbrains.annotations.Nullable()
        protected net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.JsonObject getChartData() throws java.lang.Exception {
            return null;
        }
    }
    
    /**
     * Class constructor.
     *
     * @param chartId The id of the chart.
     * @param callable The callable which is used to request the chart data.
     */
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric$AdvancedPie;", "Lnet/minebo/basalt/servers/statistic/Metric$CustomChart;", "chartId", "", "callable", "Ljava/util/concurrent/Callable;", "", "", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/Callable;)V", "chartData", "Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "getChartData", "()Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "spigot"})
    public static final class AdvancedPie extends net.minebo.basalt.servers.statistic.Metric.CustomChart {
        @org.jetbrains.annotations.NotNull()
        private final java.util.concurrent.Callable<java.util.Map<java.lang.String, java.lang.Integer>> callable = null;
        
        public AdvancedPie(@org.jetbrains.annotations.Nullable()
        java.lang.String chartId, @org.jetbrains.annotations.NotNull()
        java.util.concurrent.Callable<java.util.Map<java.lang.String, java.lang.Integer>> callable) {
            super(null);
        }
        
        @java.lang.Override()
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        @org.jetbrains.annotations.Nullable()
        protected net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.JsonObject getChartData() throws java.lang.Exception {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0013\b\u0004\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J(\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\u0010\b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\n0\t2\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\u0004\u0018\u00010\u0007X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0010"}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric$CustomChart;", "", "chartId", "", "<init>", "(Ljava/lang/String;)V", "getRequestJsonObject", "Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "errorLogger", "Ljava/util/function/BiConsumer;", "", "logErrors", "", "chartData", "getChartData", "()Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "spigot"})
    public static abstract class CustomChart {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String chartId = null;
        
        protected CustomChart(@org.jetbrains.annotations.Nullable()
        java.lang.String chartId) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.JsonObject getRequestJsonObject(@org.jetbrains.annotations.NotNull()
        java.util.function.BiConsumer<java.lang.String, java.lang.Throwable> errorLogger, boolean logErrors) {
            return null;
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        @org.jetbrains.annotations.Nullable()
        protected abstract net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.JsonObject getChartData() throws java.lang.Exception;
    }
    
    /**
     * Class constructor.
     *
     * @param chartId The id of the chart.
     * @param callable The callable which is used to request the chart data.
     */
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012$\u0010\u0004\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u00060\u0005\u00a2\u0006\u0004\b\b\u0010\tR,\u0010\u0004\u001a \u0012\u001c\u0012\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric$DrilldownPie;", "Lnet/minebo/basalt/servers/statistic/Metric$CustomChart;", "chartId", "", "callable", "Ljava/util/concurrent/Callable;", "", "", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/Callable;)V", "chartData", "Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "getChartData", "()Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "spigot"})
    public static final class DrilldownPie extends net.minebo.basalt.servers.statistic.Metric.CustomChart {
        @org.jetbrains.annotations.NotNull()
        private final java.util.concurrent.Callable<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>>> callable = null;
        
        public DrilldownPie(@org.jetbrains.annotations.Nullable()
        java.lang.String chartId, @org.jetbrains.annotations.NotNull()
        java.util.concurrent.Callable<java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Integer>>> callable) {
            super(null);
        }
        
        @java.lang.Override()
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        @org.jetbrains.annotations.Nullable()
        protected net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.JsonObject getChartData() throws java.lang.Exception {
            return null;
        }
    }
    
    /**
     * An extremely simple JSON builder.
     *
     *
     * While this class is neither feature-rich nor the most performant one, it's sufficient enough
     * for its use-case.
     */
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001a\u001bB\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\t\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000bJ\u001a\u0010\f\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u000bJ\u0018\u0010\f\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\r\u001a\u00020\u000eJ\u001a\u0010\f\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J%\u0010\f\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0013J\u001a\u0010\f\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0014J%\u0010\f\u001a\u00020\u00002\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0012\u00a2\u0006\u0002\u0010\u0015J\u001a\u0010\u0016\u001a\u00020\u00172\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0018\u001a\u00020\u000bH\u0002J\u0006\u0010\u0019\u001a\u00020\u0010R\u0016\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder;", "", "<init>", "()V", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "hasAtLeastOneField", "", "appendNull", "key", "", "appendField", "value", "", "object", "Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "values", "", "(Ljava/lang/String;[Ljava/lang/String;)Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder;", "", "(Ljava/lang/String;[Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;)Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder;", "appendFieldUnescaped", "", "escapedValue", "build", "JsonObject", "Companion", "spigot"})
    public static final class JsonObjectBuilder {
        @org.jetbrains.annotations.Nullable()
        private java.lang.StringBuilder builder;
        private boolean hasAtLeastOneField = false;
        @org.jetbrains.annotations.NotNull()
        public static final net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.Companion Companion = null;
        
        public JsonObjectBuilder() {
            super();
        }
        
        /**
         * Appends a null field to the JSON.
         *
         * @param key The key of the field.
         * @return A reference to this object.
         */
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder appendNull(@org.jetbrains.annotations.Nullable()
        java.lang.String key) {
            return null;
        }
        
        /**
         * Appends a string field to the JSON.
         *
         * @param key The key of the field.
         * @param value The value of the field.
         * @return A reference to this object.
         */
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder appendField(@org.jetbrains.annotations.Nullable()
        java.lang.String key, @org.jetbrains.annotations.Nullable()
        java.lang.String value) {
            return null;
        }
        
        /**
         * Appends an integer field to the JSON.
         *
         * @param key The key of the field.
         * @param value The value of the field.
         * @return A reference to this object.
         */
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder appendField(@org.jetbrains.annotations.Nullable()
        java.lang.String key, int value) {
            return null;
        }
        
        /**
         * Appends an object to the JSON.
         *
         * @param key The key of the field.
         * @param object The object.
         * @return A reference to this object.
         */
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder appendField(@org.jetbrains.annotations.Nullable()
        java.lang.String key, @org.jetbrains.annotations.Nullable()
        net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.JsonObject object) {
            return null;
        }
        
        /**
         * Appends a string array to the JSON.
         *
         * @param key The key of the field.
         * @param values The string array.
         * @return A reference to this object.
         */
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder appendField(@org.jetbrains.annotations.Nullable()
        java.lang.String key, @org.jetbrains.annotations.Nullable()
        java.lang.String[] values) {
            return null;
        }
        
        /**
         * Appends an integer array to the JSON.
         *
         * @param key The key of the field.
         * @param values The integer array.
         * @return A reference to this object.
         */
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder appendField(@org.jetbrains.annotations.Nullable()
        java.lang.String key, @org.jetbrains.annotations.Nullable()
        int[] values) {
            return null;
        }
        
        /**
         * Appends an object array to the JSON.
         *
         * @param key The key of the field.
         * @param values The integer array.
         * @return A reference to this object.
         */
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder appendField(@org.jetbrains.annotations.Nullable()
        java.lang.String key, @org.jetbrains.annotations.Nullable()
        net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.JsonObject[] values) {
            return null;
        }
        
        /**
         * Appends a field to the object.
         *
         * @param key The key of the field.
         * @param escapedValue The escaped value of the field.
         */
        private final void appendFieldUnescaped(java.lang.String key, java.lang.String escapedValue) {
        }
        
        /**
         * Builds the JSON string and invalidates this builder.
         *
         * @return The built JSON string.
         */
        @org.jetbrains.annotations.NotNull()
        public final net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.JsonObject build() {
            return null;
        }
        
        @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\u00a8\u0006\u0007"}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$Companion;", "", "<init>", "()V", "escape", "", "value", "spigot"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            /**
             * Escapes the given string like stated in https://www.ietf.org/rfc/rfc4627.txt.
             *
             *
             * This method escapes only the necessary characters '"', '\'. and '\u0000' - '\u001F'.
             * Compact escapes are not used (e.g., '\n' is escaped as "\u000a" and not as "\n").
             *
             * @param value The value to escape.
             * @return The escaped value.
             */
            private final java.lang.String escape(java.lang.String value) {
                return null;
            }
        }
        
        /**
         * A super simple representation of a JSON object.
         *
         *
         * This class only exists to make methods of the [JsonObjectBuilder] type-safe and not
         * allow a raw string inputs for methods like [JsonObjectBuilder.appendField].
         */
        @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "", "value", "", "<init>", "(Ljava/lang/String;)V", "toString", "spigot"})
        public static final class JsonObject {
            @org.jetbrains.annotations.NotNull()
            private final java.lang.String value = null;
            
            public JsonObject(@org.jetbrains.annotations.NotNull()
            java.lang.String value) {
                super();
            }
            
            @java.lang.Override()
            @org.jetbrains.annotations.NotNull()
            public java.lang.String toString() {
                return null;
            }
        }
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 &2\u00020\u0001:\u0001&B\u00a3\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0010\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\n\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010\u0012\u0016\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012\u0012\u000e\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\n\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\b\u0012\u0006\u0010\u0017\u001a\u00020\b\u00a2\u0006\u0004\b\u0018\u0010\u0019J\u000e\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u001cJ\b\u0010 \u001a\u00020\u001eH\u0002J\b\u0010!\u001a\u00020\u001eH\u0002J\u0010\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010%\u001a\u00020\u001eH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006'"}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric$MetricsBase;", "", "platform", "", "serverUuid", "serviceId", "", "enabled", "", "appendPlatformDataConsumer", "Ljava/util/function/Consumer;", "Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder;", "appendServiceDataConsumer", "submitTaskConsumer", "Ljava/lang/Runnable;", "checkServiceEnabledSupplier", "Ljava/util/function/Supplier;", "errorLogger", "Ljava/util/function/BiConsumer;", "", "infoLogger", "logErrors", "logSentData", "logResponseStatusText", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZLjava/util/function/Consumer;Ljava/util/function/Consumer;Ljava/util/function/Consumer;Ljava/util/function/Supplier;Ljava/util/function/BiConsumer;Ljava/util/function/Consumer;ZZZ)V", "customCharts", "", "Lnet/minebo/basalt/servers/statistic/Metric$CustomChart;", "addCustomChart", "", "chart", "startSubmitting", "submitData", "sendData", "data", "Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "checkRelocation", "Companion", "spigot"})
    public static final class MetricsBase {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String platform = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String serverUuid = null;
        private final int serviceId = 0;
        private final boolean enabled = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.function.Consumer<net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder> appendPlatformDataConsumer = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.function.Consumer<net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder> appendServiceDataConsumer = null;
        @org.jetbrains.annotations.Nullable()
        private final java.util.function.Consumer<java.lang.Runnable> submitTaskConsumer = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.function.Supplier<java.lang.Boolean> checkServiceEnabledSupplier = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.function.BiConsumer<java.lang.String, java.lang.Throwable> errorLogger = null;
        @org.jetbrains.annotations.NotNull()
        private final java.util.function.Consumer<java.lang.String> infoLogger = null;
        private final boolean logErrors = false;
        private final boolean logSentData = false;
        private final boolean logResponseStatusText = false;
        @org.jetbrains.annotations.NotNull()
        private final java.util.Set<net.minebo.basalt.servers.statistic.Metric.CustomChart> customCharts = null;
        
        /**
         * The version of the Metrics class.
         */
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String METRICS_VERSION = "3.0.0";
        private static final java.util.concurrent.ScheduledExecutorService scheduler = null;
        @org.jetbrains.annotations.NotNull()
        private static final java.lang.String REPORT_URL = "https://bStats.org/api/v2/data/%s";
        @org.jetbrains.annotations.NotNull()
        public static final net.minebo.basalt.servers.statistic.Metric.MetricsBase.Companion Companion = null;
        
        public MetricsBase(@org.jetbrains.annotations.NotNull()
        java.lang.String platform, @org.jetbrains.annotations.NotNull()
        java.lang.String serverUuid, int serviceId, boolean enabled, @org.jetbrains.annotations.NotNull()
        java.util.function.Consumer<net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder> appendPlatformDataConsumer, @org.jetbrains.annotations.NotNull()
        java.util.function.Consumer<net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder> appendServiceDataConsumer, @org.jetbrains.annotations.Nullable()
        java.util.function.Consumer<java.lang.Runnable> submitTaskConsumer, @org.jetbrains.annotations.NotNull()
        java.util.function.Supplier<java.lang.Boolean> checkServiceEnabledSupplier, @org.jetbrains.annotations.NotNull()
        java.util.function.BiConsumer<java.lang.String, java.lang.Throwable> errorLogger, @org.jetbrains.annotations.NotNull()
        java.util.function.Consumer<java.lang.String> infoLogger, boolean logErrors, boolean logSentData, boolean logResponseStatusText) {
            super();
        }
        
        public final void addCustomChart(@org.jetbrains.annotations.NotNull()
        net.minebo.basalt.servers.statistic.Metric.CustomChart chart) {
        }
        
        private final void startSubmitting() {
        }
        
        private final void submitData() {
        }
        
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        private final void sendData(net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.JsonObject data) throws java.lang.Exception {
        }
        
        /**
         * Checks that the class was properly relocated.
         */
        private final void checkRelocation() {
        }
        
        @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005H\u0002R\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\n \n*\u0004\u0018\u00010\t0\tX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0005X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric$MetricsBase$Companion;", "", "<init>", "()V", "METRICS_VERSION", "", "getMETRICS_VERSION", "()Ljava/lang/String;", "scheduler", "Ljava/util/concurrent/ScheduledExecutorService;", "kotlin.jvm.PlatformType", "Ljava/util/concurrent/ScheduledExecutorService;", "REPORT_URL", "compress", "", "str", "spigot"})
        public static final class Companion {
            
            private Companion() {
                super();
            }
            
            /**
             * The version of the Metrics class.
             */
            @org.jetbrains.annotations.NotNull()
            public final java.lang.String getMETRICS_VERSION() {
                return null;
            }
            
            /**
             * Gzips the given string.
             *
             * @param str The string to gzip.
             * @return The gzipped string.
             */
            @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class})
            private final byte[] compress(java.lang.String str) throws java.io.IOException {
                return null;
            }
        }
    }
    
    /**
     * Class constructor.
     *
     * @param chartId The id of the chart.
     * @param callable The callable which is used to request the chart data.
     */
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric$MultiLineChart;", "Lnet/minebo/basalt/servers/statistic/Metric$CustomChart;", "chartId", "", "callable", "Ljava/util/concurrent/Callable;", "", "", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/Callable;)V", "chartData", "Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "getChartData", "()Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "spigot"})
    public static final class MultiLineChart extends net.minebo.basalt.servers.statistic.Metric.CustomChart {
        @org.jetbrains.annotations.NotNull()
        private final java.util.concurrent.Callable<java.util.Map<java.lang.String, java.lang.Integer>> callable = null;
        
        public MultiLineChart(@org.jetbrains.annotations.Nullable()
        java.lang.String chartId, @org.jetbrains.annotations.NotNull()
        java.util.concurrent.Callable<java.util.Map<java.lang.String, java.lang.Integer>> callable) {
            super(null);
        }
        
        @java.lang.Override()
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        @org.jetbrains.annotations.Nullable()
        protected net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.JsonObject getChartData() throws java.lang.Exception {
            return null;
        }
    }
    
    /**
     * Class constructor.
     *
     * @param chartId The id of the chart.
     * @param callable The callable which is used to request the chart data.
     */
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005\u00a2\u0006\u0004\b\b\u0010\tR \u0010\u0004\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\n\u001a\u0004\u0018\u00010\u000b8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\r\u00a8\u0006\u000e"}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric$SimpleBarChart;", "Lnet/minebo/basalt/servers/statistic/Metric$CustomChart;", "chartId", "", "callable", "Ljava/util/concurrent/Callable;", "", "", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/Callable;)V", "chartData", "Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "getChartData", "()Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "spigot"})
    public static final class SimpleBarChart extends net.minebo.basalt.servers.statistic.Metric.CustomChart {
        @org.jetbrains.annotations.NotNull()
        private final java.util.concurrent.Callable<java.util.Map<java.lang.String, java.lang.Integer>> callable = null;
        
        public SimpleBarChart(@org.jetbrains.annotations.Nullable()
        java.lang.String chartId, @org.jetbrains.annotations.NotNull()
        java.util.concurrent.Callable<java.util.Map<java.lang.String, java.lang.Integer>> callable) {
            super(null);
        }
        
        @java.lang.Override()
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        @org.jetbrains.annotations.Nullable()
        protected net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.JsonObject getChartData() throws java.lang.Exception {
            return null;
        }
    }
    
    /**
     * Class constructor.
     *
     * @param chartId The id of the chart.
     * @param callable The callable which is used to request the chart data.
     */
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\n\u0010\u000b\u00a8\u0006\f"}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric$SimplePie;", "Lnet/minebo/basalt/servers/statistic/Metric$CustomChart;", "chartId", "", "callable", "Ljava/util/concurrent/Callable;", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/Callable;)V", "chartData", "Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "getChartData", "()Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "spigot"})
    public static final class SimplePie extends net.minebo.basalt.servers.statistic.Metric.CustomChart {
        @org.jetbrains.annotations.NotNull()
        private final java.util.concurrent.Callable<java.lang.String> callable = null;
        
        public SimplePie(@org.jetbrains.annotations.Nullable()
        java.lang.String chartId, @org.jetbrains.annotations.NotNull()
        java.util.concurrent.Callable<java.lang.String> callable) {
            super(null);
        }
        
        @java.lang.Override()
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        @org.jetbrains.annotations.Nullable()
        protected net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.JsonObject getChartData() throws java.lang.Exception {
            return null;
        }
    }
    
    /**
     * Class constructor.
     *
     * @param chartId The id of the chart.
     * @param callable The callable which is used to request the chart data.
     */
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00010\n8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000b\u0010\f\u00a8\u0006\r"}, d2 = {"Lnet/minebo/basalt/servers/statistic/Metric$SingleLineChart;", "Lnet/minebo/basalt/servers/statistic/Metric$CustomChart;", "chartId", "", "callable", "Ljava/util/concurrent/Callable;", "", "<init>", "(Ljava/lang/String;Ljava/util/concurrent/Callable;)V", "chartData", "Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "getChartData", "()Lnet/minebo/basalt/servers/statistic/Metric$JsonObjectBuilder$JsonObject;", "spigot"})
    public static final class SingleLineChart extends net.minebo.basalt.servers.statistic.Metric.CustomChart {
        @org.jetbrains.annotations.NotNull()
        private final java.util.concurrent.Callable<java.lang.Integer> callable = null;
        
        public SingleLineChart(@org.jetbrains.annotations.Nullable()
        java.lang.String chartId, @org.jetbrains.annotations.NotNull()
        java.util.concurrent.Callable<java.lang.Integer> callable) {
            super(null);
        }
        
        @java.lang.Override()
        @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
        @org.jetbrains.annotations.Nullable()
        protected net.minebo.basalt.servers.statistic.Metric.JsonObjectBuilder.JsonObject getChartData() throws java.lang.Exception {
            return null;
        }
    }
}
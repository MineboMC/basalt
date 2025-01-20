package net.minebo.basalt.grants;

/**
 * Class created on 8/3/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011J\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0007J\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005J\u0006\u0010\u001d\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u0011J\u000e\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0018J\u0012\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u0005R&\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR&\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00180\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\t\"\u0004\b\u001a\u0010\u000bR\u0011\u0010\u001b\u001a\u00020\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000f\u00a8\u0006\""}, d2 = {"Lnet/minebo/basalt/grants/GrantConfigurationService;", "", "<init>", "()V", "grantDurationModels", "", "", "Lnet/minebo/basalt/grants/models/GrantDurationModel;", "getGrantDurationModels", "()Ljava/util/Map;", "setGrantDurationModels", "(Ljava/util/Map;)V", "grantDurationType", "Ljava/lang/reflect/Type;", "getGrantDurationType", "()Ljava/lang/reflect/Type;", "loadAllDurationModel", "", "saveAllDurations", "saveDurationModel", "model", "deleteDurationModel", "getDefaultGrantDurationModels", "grantReasonModels", "Lnet/minebo/basalt/grants/models/GrantReasonModel;", "getGrantReasonModels", "setGrantReasonModels", "grantReasonType", "getGrantReasonType", "loadAllReasonModel", "saveAllReasons", "saveReasonModel", "deleteReasonModel", "getDefaultGrantReasonModels", "spigot"})
public final class GrantConfigurationService {
    @org.jetbrains.annotations.NotNull()
    private static java.util.Map<java.lang.String, net.minebo.basalt.grants.models.GrantDurationModel> grantDurationModels;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.reflect.Type grantDurationType = null;
    @org.jetbrains.annotations.NotNull()
    private static java.util.Map<java.lang.String, net.minebo.basalt.grants.models.GrantReasonModel> grantReasonModels;
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.reflect.Type grantReasonType = null;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.grants.GrantConfigurationService INSTANCE = null;
    
    private GrantConfigurationService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, net.minebo.basalt.grants.models.GrantDurationModel> getGrantDurationModels() {
        return null;
    }
    
    public final void setGrantDurationModels(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, net.minebo.basalt.grants.models.GrantDurationModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.reflect.Type getGrantDurationType() {
        return null;
    }
    
    public final void loadAllDurationModel() {
    }
    
    public final void saveAllDurations() {
    }
    
    public final void saveDurationModel(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.grants.models.GrantDurationModel model) {
    }
    
    public final void deleteDurationModel(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.grants.models.GrantDurationModel model) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, net.minebo.basalt.grants.models.GrantDurationModel> getDefaultGrantDurationModels() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, net.minebo.basalt.grants.models.GrantReasonModel> getGrantReasonModels() {
        return null;
    }
    
    public final void setGrantReasonModels(@org.jetbrains.annotations.NotNull()
    java.util.Map<java.lang.String, net.minebo.basalt.grants.models.GrantReasonModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.reflect.Type getGrantReasonType() {
        return null;
    }
    
    public final void loadAllReasonModel() {
    }
    
    public final void saveAllReasons() {
    }
    
    public final void saveReasonModel(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.grants.models.GrantReasonModel model) {
    }
    
    public final void deleteReasonModel(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.grants.models.GrantReasonModel model) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.Map<java.lang.String, net.minebo.basalt.grants.models.GrantReasonModel> getDefaultGrantReasonModels() {
        return null;
    }
}
package net.minebo.basalt.repository;

/**
 * Class created on 1/11/2024
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\u000b2\u0006\u0010\u000e\u001a\u00020\u000fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\u0011"}, d2 = {"Lnet/minebo/basalt/repository/BasaltRepositoryService;", "", "<init>", "()V", "client", "Lokhttp3/OkHttpClient;", "getClient", "()Lokhttp3/OkHttpClient;", "setClient", "(Lokhttp3/OkHttpClient;)V", "checkLatestJarFile", "Lkotlin/Pair;", "Lnet/minebo/basalt/repository/BasaltRepositoryService$ResponseStatus;", "Lnet/minebo/basalt/repository/BasaltRepositoryOverview$BasaltJarFile;", "version", "Lorg/apache/maven/artifact/versioning/DefaultArtifactVersion;", "ResponseStatus", "commons"})
public final class BasaltRepositoryService {
    @org.jetbrains.annotations.NotNull()
    private static okhttp3.OkHttpClient client;
    @org.jetbrains.annotations.NotNull()
    public static final net.minebo.basalt.repository.BasaltRepositoryService INSTANCE = null;
    
    private BasaltRepositoryService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.OkHttpClient getClient() {
        return null;
    }
    
    public final void setClient(@org.jetbrains.annotations.NotNull()
    okhttp3.OkHttpClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlin.Pair<net.minebo.basalt.repository.BasaltRepositoryService.ResponseStatus, net.minebo.basalt.repository.BasaltRepositoryOverview.BasaltJarFile> checkLatestJarFile(@org.jetbrains.annotations.NotNull()
    org.apache.maven.artifact.versioning.DefaultArtifactVersion version) {
        return null;
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006\u00a8\u0006\u0007"}, d2 = {"Lnet/minebo/basalt/repository/BasaltRepositoryService$ResponseStatus;", "", "<init>", "(Ljava/lang/String;I)V", "NewerVersion", "CouldNotLoad", "Latest", "commons"})
    public static enum ResponseStatus {
        /*public static final*/ NewerVersion /* = new NewerVersion() */,
        /*public static final*/ CouldNotLoad /* = new CouldNotLoad() */,
        /*public static final*/ Latest /* = new Latest() */;
        
        ResponseStatus() {
        }
        
        @org.jetbrains.annotations.NotNull()
        public static kotlin.enums.EnumEntries<net.minebo.basalt.repository.BasaltRepositoryService.ResponseStatus> getEntries() {
            return null;
        }
    }
}
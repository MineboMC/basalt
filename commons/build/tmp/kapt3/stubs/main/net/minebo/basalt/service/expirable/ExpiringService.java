package net.minebo.basalt.service.expirable;

@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007\u00a2\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lnet/minebo/basalt/service/expirable/ExpiringService;", "T", "", "<init>", "()V", "clearOutModels", "", "commons"})
public abstract class ExpiringService<T extends java.lang.Object> {
    
    public ExpiringService() {
        super();
    }
    
    public abstract void clearOutModels();
}
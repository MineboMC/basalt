package ltd.matrixstudios.website.user.loader;

/**
 * Class created on 11/24/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007\u00a8\u0006\u0007"}, d2 = {"Lltd/matrixstudios/website/user/loader/UserServicesComponent;", "", "<init>", "()V", "postConstruct", "", "Companion", "website"})
public final class UserServicesComponent {
    public static ltd.matrixstudios.website.user.service.UserService userService;
    @org.jetbrains.annotations.NotNull()
    public static final ltd.matrixstudios.website.user.loader.UserServicesComponent.Companion Companion = null;
    
    public UserServicesComponent() {
        super();
    }
    
    @javax.annotation.PostConstruct()
    public final void postConstruct() {
    }
    
    @kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\n"}, d2 = {"Lltd/matrixstudios/website/user/loader/UserServicesComponent$Companion;", "", "<init>", "()V", "userService", "Lltd/matrixstudios/website/user/service/UserService;", "getUserService", "()Lltd/matrixstudios/website/user/service/UserService;", "setUserService", "(Lltd/matrixstudios/website/user/service/UserService;)V", "website"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final ltd.matrixstudios.website.user.service.UserService getUserService() {
            return null;
        }
        
        public final void setUserService(@org.jetbrains.annotations.NotNull()
        ltd.matrixstudios.website.user.service.UserService p0) {
        }
    }
}
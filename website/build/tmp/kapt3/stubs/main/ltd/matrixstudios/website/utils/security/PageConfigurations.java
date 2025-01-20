package ltd.matrixstudios.website.utils.security;

@org.springframework.context.annotation.Configuration()
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\b\u001a\u00020\tH\u0017J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lltd/matrixstudios/website/utils/security/PageConfigurations;", "Lorg/springframework/web/servlet/config/annotation/WebMvcConfigurer;", "<init>", "()V", "addViewControllers", "", "registry", "Lorg/springframework/web/servlet/config/annotation/ViewControllerRegistry;", "passwordEncoder", "Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "addInterceptors", "Lorg/springframework/web/servlet/config/annotation/InterceptorRegistry;", "website"})
public class PageConfigurations implements org.springframework.web.servlet.config.annotation.WebMvcConfigurer {
    
    public PageConfigurations() {
        super();
    }
    
    @java.lang.Override()
    public void addViewControllers(@org.jetbrains.annotations.NotNull()
    org.springframework.web.servlet.config.annotation.ViewControllerRegistry registry) {
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder passwordEncoder() {
        return null;
    }
    
    @java.lang.Override()
    public void addInterceptors(@org.jetbrains.annotations.NotNull()
    org.springframework.web.servlet.config.annotation.InterceptorRegistry registry) {
    }
}
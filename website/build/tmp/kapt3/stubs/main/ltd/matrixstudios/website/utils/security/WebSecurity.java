package ltd.matrixstudios.website.utils.security;

/**
 * Class created on 11/24/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@org.springframework.context.annotation.Configuration()
@org.springframework.security.config.annotation.web.configuration.EnableWebSecurity()
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\f\u001a\u00020\rH\u0017J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0014J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0017R\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000b\u00a8\u0006\u0018"}, d2 = {"Lltd/matrixstudios/website/utils/security/WebSecurity;", "Lorg/springframework/security/config/annotation/web/configuration/WebSecurityConfigurerAdapter;", "<init>", "()V", "bCryptPasswordEncoder", "Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "customizeAuthenticationSuccessHandler", "Lltd/matrixstudios/website/login/handling/AuthSuccessHandler;", "getCustomizeAuthenticationSuccessHandler", "()Lltd/matrixstudios/website/login/handling/AuthSuccessHandler;", "setCustomizeAuthenticationSuccessHandler", "(Lltd/matrixstudios/website/login/handling/AuthSuccessHandler;)V", "constructUserDetails", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "configure", "", "auth", "Lorg/springframework/security/config/annotation/authentication/builders/AuthenticationManagerBuilder;", "http", "Lorg/springframework/security/config/annotation/web/builders/HttpSecurity;", "web", "Lorg/springframework/security/config/annotation/web/builders/WebSecurity;", "corsConfigurationSource", "Lorg/springframework/web/cors/CorsConfigurationSource;", "website"})
public class WebSecurity extends org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter {
    @org.springframework.beans.factory.annotation.Autowired()
    @org.jetbrains.annotations.Nullable()
    private final org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder bCryptPasswordEncoder = null;
    @org.springframework.beans.factory.annotation.Autowired()
    @org.jetbrains.annotations.Nullable()
    private ltd.matrixstudios.website.login.handling.AuthSuccessHandler customizeAuthenticationSuccessHandler;
    
    public WebSecurity() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final ltd.matrixstudios.website.login.handling.AuthSuccessHandler getCustomizeAuthenticationSuccessHandler() {
        return null;
    }
    
    public final void setCustomizeAuthenticationSuccessHandler(@org.jetbrains.annotations.Nullable()
    ltd.matrixstudios.website.login.handling.AuthSuccessHandler p0) {
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.core.userdetails.UserDetailsService constructUserDetails() {
        return null;
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    protected void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder auth) throws java.lang.Exception {
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    protected void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.HttpSecurity http) throws java.lang.Exception {
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public void configure(@org.jetbrains.annotations.NotNull()
    org.springframework.security.config.annotation.web.builders.WebSecurity web) throws java.lang.Exception {
    }
    
    @org.springframework.context.annotation.Bean()
    @org.jetbrains.annotations.NotNull()
    public org.springframework.web.cors.CorsConfigurationSource corsConfigurationSource() {
        return null;
    }
}
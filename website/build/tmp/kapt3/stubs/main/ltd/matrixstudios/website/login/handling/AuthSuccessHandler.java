package ltd.matrixstudios.website.login.handling;

/**
 * Class created on 11/24/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@org.springframework.stereotype.Component()
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016\u00a8\u0006\f"}, d2 = {"Lltd/matrixstudios/website/login/handling/AuthSuccessHandler;", "Lorg/springframework/security/web/authentication/AuthenticationSuccessHandler;", "<init>", "()V", "onAuthenticationSuccess", "", "request", "Ljavax/servlet/http/HttpServletRequest;", "response", "Ljavax/servlet/http/HttpServletResponse;", "authentication", "Lorg/springframework/security/core/Authentication;", "website"})
public final class AuthSuccessHandler implements org.springframework.security.web.authentication.AuthenticationSuccessHandler {
    
    public AuthSuccessHandler() {
        super();
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {java.io.IOException.class, javax.servlet.ServletException.class})
    public void onAuthenticationSuccess(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletResponse response, @org.jetbrains.annotations.NotNull()
    org.springframework.security.core.Authentication authentication) throws java.io.IOException, javax.servlet.ServletException {
    }
}
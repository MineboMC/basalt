package ltd.matrixstudios.website.user.service;

/**
 * Class created on 11/24/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@org.springframework.stereotype.Service()
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\rJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\rJ\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bJ\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u000bJ\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\rH\u0016J\u0016\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c2\u0006\u0010\u0016\u001a\u00020\u000bH\u0002J\u001e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u000b2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006 "}, d2 = {"Lltd/matrixstudios/website/user/service/UserService;", "Lorg/springframework/security/core/userdetails/UserDetailsService;", "<init>", "()V", "encoder", "Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "getEncoder", "()Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;", "setEncoder", "(Lorg/springframework/security/crypto/bcrypt/BCryptPasswordEncoder;)V", "findUserByName", "Lnet/minebo/basalt/models/website/BasaltUser;", "name", "", "findUserByUniqueId", "uuid", "Ljava/util/UUID;", "findProfileByNiceUUID", "Lnet/minebo/basalt/models/profile/GameProfile;", "niceUUID", "save", "", "user", "createUser", "loadUserByUsername", "Lorg/springframework/security/core/userdetails/UserDetails;", "username", "getUserAuthority", "", "Lorg/springframework/security/core/GrantedAuthority;", "buildUserForAuthentication", "authorities", "website"})
public final class UserService implements org.springframework.security.core.userdetails.UserDetailsService {
    @org.springframework.beans.factory.annotation.Autowired()
    public org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder encoder;
    
    public UserService() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder getEncoder() {
        return null;
    }
    
    public final void setEncoder(@org.jetbrains.annotations.NotNull()
    org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.website.BasaltUser findUserByName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.website.BasaltUser findUserByUniqueId(@org.jetbrains.annotations.NotNull()
    java.util.UUID uuid) {
        return null;
    }
    
    /**
     * This is gonna be one incredibly intensive function
     * because we need to transform their uuid. Yikes!
     */
    @org.jetbrains.annotations.Nullable()
    public final net.minebo.basalt.models.profile.GameProfile findProfileByNiceUUID(@org.jetbrains.annotations.NotNull()
    java.lang.String niceUUID) {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.website.BasaltUser user) {
    }
    
    /**
     * Creating registered users for the first time
     *
     * @param user User to register
     */
    @kotlin.jvm.Throws(exceptionClasses = {java.lang.Exception.class})
    public final void createUser(@org.jetbrains.annotations.NotNull()
    net.minebo.basalt.models.website.BasaltUser user) throws java.lang.Exception {
    }
    
    @java.lang.Override()
    @kotlin.jvm.Throws(exceptionClasses = {org.springframework.security.core.userdetails.UsernameNotFoundException.class})
    @org.jetbrains.annotations.NotNull()
    public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(@org.jetbrains.annotations.NotNull()
    java.lang.String username) throws org.springframework.security.core.userdetails.UsernameNotFoundException {
        return null;
    }
    
    private final java.util.List<org.springframework.security.core.GrantedAuthority> getUserAuthority(net.minebo.basalt.models.website.BasaltUser user) {
        return null;
    }
    
    private final org.springframework.security.core.userdetails.UserDetails buildUserForAuthentication(net.minebo.basalt.models.website.BasaltUser user, java.util.List<? extends org.springframework.security.core.GrantedAuthority> authorities) {
        return null;
    }
}
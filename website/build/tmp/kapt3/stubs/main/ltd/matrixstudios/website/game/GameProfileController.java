package ltd.matrixstudios.website.game;

@org.springframework.stereotype.Controller()
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u001a\u0010\b\u001a\u00020\u00052\b\b\u0001\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007H\u0007\u00a8\u0006\u000b"}, d2 = {"Lltd/matrixstudios/website/game/GameProfileController;", "", "<init>", "()V", "getAllUsers", "Lorg/springframework/web/servlet/ModelAndView;", "request", "Ljavax/servlet/http/HttpServletRequest;", "onLookupProfile", "id", "", "website"})
public final class GameProfileController {
    
    public GameProfileController() {
        super();
    }
    
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/api/users"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.web.servlet.ModelAndView getAllUsers(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/api/users/lookup/{id}"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.web.servlet.ModelAndView onLookupProfile(@org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
}
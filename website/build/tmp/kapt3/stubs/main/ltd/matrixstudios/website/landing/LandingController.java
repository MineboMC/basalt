package ltd.matrixstudios.website.landing;

/**
 * Class created on 11/24/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@org.springframework.stereotype.Controller()
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\nH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lltd/matrixstudios/website/landing/LandingController;", "", "rankRepository", "Lltd/matrixstudios/website/ranks/RankRepository;", "<init>", "(Lltd/matrixstudios/website/ranks/RankRepository;)V", "onLandRequest", "Lorg/springframework/web/servlet/ModelAndView;", "onDashboardRequest", "request", "Ljavax/servlet/http/HttpServletRequest;", "website"})
public final class LandingController {
    @org.jetbrains.annotations.NotNull()
    private final ltd.matrixstudios.website.ranks.RankRepository rankRepository = null;
    
    @org.springframework.beans.factory.annotation.Autowired()
    public LandingController(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.website.ranks.RankRepository rankRepository) {
        super();
    }
    
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/", "/home"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.web.servlet.ModelAndView onLandRequest() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/dashboard", "/panel"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.web.servlet.ModelAndView onDashboardRequest(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
}
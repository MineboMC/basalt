package ltd.matrixstudios.website.ranks;

/**
 * Class created on 11/24/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@org.springframework.stereotype.Controller()
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007J\"\u0010\n\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\tH\u0007J$\u0010\u000f\u001a\u00020\u00072\b\b\u0001\u0010\u000b\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lltd/matrixstudios/website/ranks/RankController;", "", "repository", "Lltd/matrixstudios/website/ranks/RankRepository;", "<init>", "(Lltd/matrixstudios/website/ranks/RankRepository;)V", "getAllRanks", "Lorg/springframework/web/servlet/ModelAndView;", "request", "Ljavax/servlet/http/HttpServletRequest;", "onShowRankEditor", "id", "", "model", "Lorg/springframework/ui/Model;", "onAPIRankChange", "ref", "website"})
public final class RankController {
    @org.jetbrains.annotations.NotNull()
    private final ltd.matrixstudios.website.ranks.RankRepository repository = null;
    
    @org.springframework.beans.factory.annotation.Autowired()
    public RankController(@org.jetbrains.annotations.NotNull()
    ltd.matrixstudios.website.ranks.RankRepository repository) {
        super();
    }
    
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/api/ranks"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.web.servlet.ModelAndView getAllRanks(@org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/api/rank-editor/{id}"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.web.servlet.ModelAndView onShowRankEditor(@org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    org.springframework.ui.Model model, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
    
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/api/change-rank/{id}"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.web.servlet.ModelAndView onAPIRankChange(@org.springframework.web.bind.annotation.PathVariable()
    @org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.springframework.web.bind.annotation.RequestBody()
    @org.jetbrains.annotations.NotNull()
    java.lang.String ref, @org.jetbrains.annotations.NotNull()
    javax.servlet.http.HttpServletRequest request) {
        return null;
    }
}
package ltd.matrixstudios.website.login;

/**
 * Class created on 11/23/2023
 *
 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@org.springframework.stereotype.Controller()
@kotlin.Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\b\u0010\u0006\u001a\u00020\u0005H\u0007J\u001a\u0010\u0007\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007\u00a8\u0006\f"}, d2 = {"Lltd/matrixstudios/website/login/LoginController;", "", "<init>", "()V", "onLoginRequest", "Lorg/springframework/web/servlet/ModelAndView;", "onRegistrationRequest", "createNewUser", "form", "Lltd/matrixstudios/website/login/form/BasaltFormSubmission;", "bindingResult", "Lorg/springframework/validation/BindingResult;", "website"})
public final class LoginController {
    
    public LoginController() {
        super();
    }
    
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/login"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.web.servlet.ModelAndView onLoginRequest() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/register"}, method = {org.springframework.web.bind.annotation.RequestMethod.GET})
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.web.servlet.ModelAndView onRegistrationRequest() {
        return null;
    }
    
    @org.springframework.web.bind.annotation.RequestMapping(value = {"/register"}, method = {org.springframework.web.bind.annotation.RequestMethod.POST})
    @org.jetbrains.annotations.NotNull()
    public final org.springframework.web.servlet.ModelAndView createNewUser(@org.jetbrains.annotations.Nullable()
    ltd.matrixstudios.website.login.form.BasaltFormSubmission form, @org.jetbrains.annotations.NotNull()
    org.springframework.validation.BindingResult bindingResult) {
        return null;
    }
}
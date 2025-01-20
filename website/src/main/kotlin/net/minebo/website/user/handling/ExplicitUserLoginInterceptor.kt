package ltd.matrixstudios.website.user.handling

import net.minebo.basalt.models.website.BasaltUser
import org.springframework.stereotype.Service
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse
/**
 * Class created on 11/24/2023

 * @author 98ping
 * @project Basalt
 * @website https://solo.to/redis
 */
@Service
class ExplicitUserLoginInterceptor : HandlerInterceptorAdapter() {

    override fun preHandle(request: HttpServletRequest, response: HttpServletResponse, handler: Any): Boolean {
        val user = request.session.getAttribute("user") as BasaltUser?
        if (user != null) response.sendRedirect("/panel")
        return user == null
    }
}
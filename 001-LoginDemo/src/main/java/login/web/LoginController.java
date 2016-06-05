package login.web;

import login.domain.User;
import login.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * Created by Grady on 2016.5.14.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @RequestMapping("/index.html")
    public String loginPage(){
        return "login";
    }

    @RequestMapping("/loginCheck.html")
    public ModelAndView loginCheck(HttpServletRequest request,LoginCommand command){
        boolean isValid = userService.hasMatchUser(command.getUsername(),command.getPassword());
        if(isValid){
            User user = userService.findUserByUsername(command.getUsername());
            user.setLastIp(request.getRemoteAddr());
            user.setLastVisit(new Date());
            userService.loginSuccess(user);
            request.getSession().setAttribute("user",user);
            return new ModelAndView("index");
        }else{
            return new ModelAndView("login","error","用户名密码错误");
        }
    }
}

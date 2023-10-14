package san.edu.lab7.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
//@RequestMapping("/auth")
public class AuthController {

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/auth")
    @ResponseBody
    public Authentication getAUthentication(Authentication authentication){
//        SecurityContext context = SecurityContextHolder.getContext();
//        return context.getAuthentication();
        UserDetails u;
        return authentication;
    }

}

package com.codegym.controller;

import com.codegym.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
@SessionAttributes("user")
public class LoginController {
    @ModelAttribute("user")
    public User setupUser(){
        return new User();
    }

    @GetMapping("/login")
    public String Index(@CookieValue(value="setUser", defaultValue = "")String setUser, Model model){
       Cookie cookie = new Cookie("setUser", setUser);
       model.addAttribute("cookieValue", cookie);
       return "/login";
    }

    @PostMapping("/dologin")
    public String doLogin(@ModelAttribute("user") User user,Model model, @CookieValue(value="setUser", defaultValue = "") String setUser, HttpServletResponse response, HttpServletRequest request){
        if(user.getEmail().equals("admin@gmail.com") && user.getPassWord().equals("12345")){
            if(user.getEmail()!=null)
                setUser = user.getEmail();

            Cookie cookie = new Cookie("setUser", setUser);
            cookie.setMaxAge(5);
            response.addCookie(cookie);

            Cookie[] cookies= request.getCookies();
            for(Cookie ck:cookies){
                if (!ck.getName().equals("setUser")) {
                    ck.setValue("");
                }
                model.addAttribute("cookieValue",ck);
                break;
            }
            model.addAttribute("message","Login success. Welcome");
        } else{
            user.setEmail("");
            Cookie cookie = new Cookie("setUser", setUser);
            model.addAttribute("cookieValue",cookie);
            model.addAttribute("message", "Login failed. Try again");
        }
        return "/login";
    }

}
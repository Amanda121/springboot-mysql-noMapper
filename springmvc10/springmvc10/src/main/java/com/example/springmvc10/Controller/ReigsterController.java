package com.example.springmvc10.Controller;

import com.example.springmvc10.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReigsterController {

    @RequestMapping("/login")
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("register");
        return mv;
    }
    @PostMapping("/register")
    public ModelAndView login(@ModelAttribute User user){
       /* User user = new User();
        user.setUsername(username);
        user.setPassword(password);*/

        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }
}

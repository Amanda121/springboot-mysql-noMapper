package com.example.springmvc10.Controller;

import com.example.springmvc10.Entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ReigsterController {

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public ModelAndView home(){
        ModelAndView mv = new ModelAndView();
        mv.setViewName("register");
        return mv;
    }

    @PostMapping(value = "/register")
    public ModelAndView login(@ModelAttribute User user){
       /* User user = new User();
        user.setUsername(username);
        user.setPassword(password);*/

        ModelAndView mv = new ModelAndView();
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping("/test")
    public String test(){
        return "success!!";
    }
}

package com.example.mysql.Controller;

import com.example.mysql.Entity.User;
import com.example.mysql.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/selectUserInfo",method = RequestMethod.GET)
    @ResponseBody
    public List<User> selectUserInfo(){
        List<User> userList = userService.selectUserInfo();
        return userList;
    }

}

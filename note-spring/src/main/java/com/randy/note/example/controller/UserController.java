package com.randy.note.example.controller;

import com.randy.note.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

/**
 * 控制器类
 * @Controller 代替 @Component
 * Author: randy
 * Date: 2019/11/7 17:48
 */
// @Component
@Controller
public class UserController {
    private UserService userService;

    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

   public void add(){
        userService.add();
    }
}

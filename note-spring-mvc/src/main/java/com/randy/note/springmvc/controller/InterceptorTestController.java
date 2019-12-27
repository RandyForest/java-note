package com.randy.note.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 拦截器测试
 *
 * Author: randy
 * Date: 2019/12/26 22:03
 */
@Controller
@RequestMapping("/interceptor")
public class InterceptorTestController {
    @RequestMapping("/in")
    public String in(){
        System.out.println("in");
        return "redirect:/";
    }
}

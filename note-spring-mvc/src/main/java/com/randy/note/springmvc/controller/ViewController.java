package com.randy.note.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author: randy
 * Date: 2019/12/23 21:40
 */
@Controller
@RequestMapping("/view")
public class ViewController {
    /**
     * 默认转发拼串
     * 经过视图分解器拼串
     *
     * @return 视图
     */
    @RequestMapping("/default")
    public String defaultFun(){
        return "/";
    }

    /**
     * 转发
     * 不会被分解器拼串
     *
     * @return 视图
     */
    @RequestMapping("/forward")
    public String forward(){
        return "forward:/";
    }

    /**
     * 重定向
     * 不会被分解器拼串
     *
     * @return 视图
     */
    @RequestMapping("/redirect")
    public String redirect(){
        return "redirect:/";
    }


}

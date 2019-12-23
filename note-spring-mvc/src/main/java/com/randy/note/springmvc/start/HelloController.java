package com.randy.note.springmvc.start;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.net.http.HttpRequest;

/**
 * Author: randy
 * Date: 2019/12/16 23:00
 */
@Controller
public class HelloController {
    /**
     * 使用 @RequestMapping 配置请求映射
     * 路径被适配就会进入该方法（主机名/项目名/hello）
     *
     * @return 视图名
     */
    @RequestMapping(path = "/hello")
    public String sayHello(){
        System.out.println("Hello");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("a.html");
        return "WEB-INF/pages/a.html";
    }
}

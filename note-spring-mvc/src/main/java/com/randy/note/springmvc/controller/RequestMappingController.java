package com.randy.note.springmvc.controller;

import com.randy.note.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Author: randy
 * Date: 2019/12/19 23:34
 */
@Controller
@RequestMapping(path = "/requestMapping")
public class RequestMappingController {

    /**
     * 如果请求路径匹配竟会进入该方法
     *
     * @return 视图
     */
    @RequestMapping(path = "/path")
    public String path(){
        return "/";
    }

    /**
     * 匹配含有指定参数的请求
     * 在形参中定义与参数同名的变量就可以自动绑定到该形参中
     * 如：/params?name=aaa 形参name的值就为aaa
     *
     * 注解@RequestMapping的params属性可以限定形参：
     *  "参数名"：是否包含
     *  "参数名=值"：该参数是否等于指定值
     *  {"参数名=值","参数名2=值2"}：限定多个参数
     *
     * 在 String name 前添加 @RequestParam 注解与params属性效果一样
     *
     * @param name 参数
     * @return 视图
     */
    @RequestMapping(path = "/params",params = "name")
    public String params(String  name){
        System.out.println(name);
        return "/";
    }

    /**
     * 匹配路径变量请求
     * 使用 @PathVariable 注释指定
     *
     * @param name 参数
     * @return 视图
     */
    @RequestMapping(path = "/path/{name}")
    public String pathVariable(@PathVariable String name){
        System.out.println(name);
        return "/";
    }

    /**
     * 绑定参数到对象
     * 可以封装参数到指定对象中
     * 注解 @ModelAttribute 可以自定义对象
     *
     * @param user 用户
     * @return 视图
     */
    @RequestMapping(path = "/model")
    public String model(User user){
        System.out.println(user);
        return "/";
    }

    /**
     * 获取请求体
     * 与 @ModelAttribute 相似
     * 可以接收json请求
     * 可以将请求的键值对封装到Map里方便取用
     *
     * @param body 请求体
     * @return 视图
     */
    @RequestMapping(path = "/body")
    public String body(@RequestBody String body,@RequestBody List<String> map){
        System.out.println(body);
        System.out.println(map.get(0));
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        return "/";
    }


}

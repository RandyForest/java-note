package com.randy.note.springmvc.controller;

import com.randy.note.springmvc.model.User;
import org.springframework.http.HttpEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
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
    public String path() {
        return "/";
    }

    /**
     * 匹配含有指定参数的请求
     * 在形参中定义与参数同名的变量就可以自动绑定到该形参中
     * 如：/params?name=aaa 形参name的值就为aaa
     * <p>
     * 注解@RequestMapping的params属性可以限定形参：
     * "参数名"：是否包含
     * "参数名=值"：该参数是否等于指定值
     * {"参数名=值","参数名2=值2"}：限定多个参数
     * <p>
     * 在 String name 前添加 @RequestParam 注解与params属性效果一样
     *
     * @param name 参数
     * @return 视图
     */
    @RequestMapping(path = "/params", params = "name")
    public String params(String name) {
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
    public String pathVariable(@PathVariable String name) {
        System.out.println(name);
        return "/";
    }

    /**
     * 绑定参数到对象
     * 可以封装参数到指定对象中
     *
     * @param user 用户
     * @return 视图
     */
    @RequestMapping(path = "/user")
    public String user(User user) {
        System.out.println(user);
        return "/";
    }

    /**
     * 获取请求体
     * 可以接收json请求
     * 可以将请求的键值对封装到Map里方便取用
     *
     * @param body 请求体
     * @return 视图
     */
    @RequestMapping(path = "/body")
    public String body(@RequestBody String body) {
        System.out.println(body);

        return "/";
    }

    /**
     * 获取请求体
     * 可以接收json请求
     * 可以将请求的键值对封装到Map里方便取用
     * 如果要支持JSON需要导入解析JSON的包
     * 如：jackson-datatype-jdk8
     *
     * @param user 用户
     * @return 视图
     */
    @RequestMapping(path = "/json")
    public String json(@RequestBody User user) {
        System.out.println(user);

        return "/";
    }

    /**
     * 获取整个请求
     * 可以封装对象，把泛型String改成要封装的对象就行
     *
     * @param http HTTP 实体
     * @return 视图
     */
    @RequestMapping(path = "/request")
    public String request(HttpEntity<String> http) {
        System.out.println(http);

        return "/";
    }

    /**
     * 向 @ModelAttribute 中存入数据
     * 会在映射方法之前执行
     *
     * @return 存入的对象
     */
    @ModelAttribute
    public User model() {
        User user = new User();
        user.setUsername("usernnn");
        return user;
    }

    /**
     * 取出放入 @ModelAttribute 内的值
     * 可以使用URL中的键值对赋值
     *
     * @param user @ModelAttribute 内的用户对象
     * @return 主页
     */
    @RequestMapping("/model")
    public String modelAttribute(@ModelAttribute User user) {
        System.out.println(user);
        return "redirect:/";
    }

    /**
     * 向隐藏域（请求域）中加入数据
     * 可以通过返回视图传递给页面
     *
     * @param map 可以为 Map,Model,ModelMap类型
     * @return 取出对象
     */
    @RequestMapping("/mapPut")
    public String mapPut(Map<String, String> map){
        System.out.println("Put before: "+map);
        map.put("name", "jack");
        System.out.println("Put after: "+map);
        return "forward:/requestMapping/mapGet";
    }

    /**
     * 向隐藏域（请求域）中去除数据
     *
     * @param request 请求
     * @return 主页
     */
    @RequestMapping("mapGet")
    public String mapGet(Map<String,Object> map, HttpServletRequest request) {
        System.out.println("Get: "+map);
        System.out.println(request.getAttribute("name"));
        return "redirect:/";
    }
}

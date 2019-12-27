package com.randy.note.springmvc.controller;

import com.randy.note.springmvc.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * Author: randy
 * Date: 2019/12/26 23:13
 */
@Controller
@RequestMapping("/errortest")
public class ExceptionTestController {
    /**
     * 传入参数测试异常
     *
     * @param error true：制造异常，其它：正常跳转
     * @return 主页
     */
    @RequestMapping("")
    public String test(boolean error) {
        System.out.println("Test error");
        if (error) {
            System.out.println("error");
            throw new NullPointerException();
        }
        System.out.println("success");
        return "redirect:/";
    }

    /**
     * 如果定义了类异常操作器或全局异常操作器则会被这两个操作器优先处理
     *
     * @param error true：制造异常，其它：正常跳转
     * @return 主页
     */
    @RequestMapping("/myexception")
    public String test2(boolean error) {
        System.out.println("Test error");
        if (error) {
            System.out.println("error");
            throw new MyException();
        }
        System.out.println("success");
        return "redirect:/";
    }
}

package com.randy.note.springmvc.exceptioncontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 全局异常处理
 * 如果写在控制器中则优先使用控制器中的异常操作器优先
 *
 * Author: randy
 * Date: 2019/12/26 23:07
 */
@ControllerAdvice
public class ExceptionController {
    /**
     * 注解@ExceptionHandler指明捕获什么异常
     * @param exception 异常
     * @return 异常页面
     */
    @ExceptionHandler(Exception.class)
    public String handle(Exception exception) {
        System.out.println("全局异常处理："+exception);
        return "redirect:/error.html";
    }
}

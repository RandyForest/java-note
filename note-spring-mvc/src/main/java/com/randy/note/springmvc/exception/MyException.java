package com.randy.note.springmvc.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * 自定义异常
 * 属性：
 *   reason：错误信息
 *   code：状态码
 *
 * 如果定义了全局异常处理会被拦截
 *
 * Author: randy
 * Date: 2019/12/27 21:26
 */
    @ResponseStatus(reason = "自定义异常",code = HttpStatus.NOT_ACCEPTABLE)
public class MyException extends RuntimeException {
    /**
     * 如果是该异常则进入此方法
     *
     * @return 错误页面
     */
    public String notAcceptable(){
        System.out.println("进入自定义异常");
        return "redirect:/error.html";
    }
}

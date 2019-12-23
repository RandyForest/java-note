package com.randy.note.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Spring管理了一些Servlet原生API
 * 如：
 *  HttpServletRequest
 *  HttpServletResponse
 *  HttpSession
 *  java.security.Principal
 *  Locale InputStream
 *  OutputStream
 *  Reader
 *  Writer
 *
 * Author: randy
 * Date: 2019/12/22 13:35
 */
@Controller
@RequestMapping(path = "/servlet")
public class ServletController {

    @RequestMapping("/default")
    public void api(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, HttpSession httpSession){
        System.out.println(httpServletRequest);
        System.out.println(httpServletResponse);
        System.out.println(httpSession);
    }
}

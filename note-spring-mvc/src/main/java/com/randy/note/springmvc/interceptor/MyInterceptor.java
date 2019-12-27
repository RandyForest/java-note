package com.randy.note.springmvc.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Filter 加强版
 *
 * Author: randy
 * Date: 2019/12/26 21:56
 */
public class MyInterceptor implements HandlerInterceptor {
    /**
     * 前置
     * 进入映射的方法前
     *
     * @param request
     * @param response
     * @param handler
     * @return 是否允许放行
     * @throws Exception
     */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("preHandle");
        return true;
    }

    /**
     * 中
     * 执行映射的方法后
     * 进入页面前
     * 目标方法异常或被之后的拦截器拦截则不执行
     *
     * @param request
     * @param response
     * @param handler
     * @param modelAndView
     * @throws Exception
     */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle");
    }

    /**
     * 后
     * 进入页面后
     * 只要放行了，则总是执行
     * 已放行的拦截器此方法总是执行
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     * @throws Exception
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion");
    }
}

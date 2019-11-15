package com.randy.note.spring.lifecycle;

/**
 * 简单Bean
 * Author: randy
 * Date: 2019/11/15 23:21
 */
public class MyBean {
    /**
     * 初始化方法
     */
    void init(){
        System.out.println("MyBean.init()");
    }

    /**
     * 销毁方法
     */
    void destroy(){
        System.out.println("MyBean.destroy()");
    }
}

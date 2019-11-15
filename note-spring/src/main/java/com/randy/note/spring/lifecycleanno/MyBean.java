package com.randy.note.spring.lifecycleanno;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * 简单Bean
 * 注解方法定义生命周期
 *
 * Author: randy
 * Date: 2019/11/15 23:54
 */
@Component
public class MyBean {
    /**
     * 初始化方法
     */
    @PostConstruct
    void init(){
        System.out.println("MyBean.init()");
    }

    /**
     * 销毁方法
     */
    @PreDestroy
    void destroy(){
        System.out.println("MyBean.destroy()");
    }
}

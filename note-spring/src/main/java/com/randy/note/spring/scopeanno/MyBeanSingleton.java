package com.randy.note.spring.scopeanno;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Bean单例
 * 注解方式配置单例作用域
 * 三种配置单例作用域的方法
 *
 * Author: randy
 * Date: 2019/11/15 17:08
 */
@Component
// @Scope("singleton")
// @Scope(scopeName = "singleton")
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class MyBeanSingleton {
    public MyBeanSingleton() {
        System.out.println("MyBeanSingleton被实例。");
    }
}

package com.randy.note.spring.scopeconfig;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Bean单例
 *
 * Author: randy
 * Date: 2019/11/15 17:08
 */
public class MyBeanSingleton {
    public MyBeanSingleton() {
        System.out.println("MyBeanSingleton被实例。");
    }
}

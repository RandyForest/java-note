package com.randy.note.spring.scopeconfig;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: randy
 * Date: 2019/11/15 17:16
 */
@SpringJUnitConfig(Config.class)
class MainTest {
    /**
     * 单例作用域
     */
    @Autowired
    private MyBeanSingleton myBeanSingleton1;

    @Autowired
    private MyBeanSingleton myBeanSingleton2;

    @Test
    void testMyBeanSingleton(){
        System.out.println(myBeanSingleton1==myBeanSingleton2);
    }

    /**
     * 原型作用域
     */
    @Autowired
    private MyBeanPrototype myBeanPrototype1;

    @Autowired
    private MyBeanPrototype myBeanPrototype2;

    @Test
    void testMyBeanPrototype(){
        System.out.println(myBeanPrototype1==myBeanPrototype2);
    }
}

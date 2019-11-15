package com.randy.note.spring.lazyinit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: randy
 * Date: 2019/11/15 22:00
 */
@SpringJUnitConfig(locations = "classpath:lazy-init.xml")
class MyBeanSingletonTest {
    /**
     * 开启lazy-init后，如果注释掉这个自动装配，就不会自动实例myBeanPrototype
     */
    // @Autowired
    // private MyBeanSingleton myBeanSingleton;

    @Test
    void test(){
        // System.out.println(myBeanSingleton);
    }
}

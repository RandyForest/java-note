package com.randy.note.spring.lazyinit;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: randy
 * Date: 2019/11/15 22:00
 */
@SpringJUnitConfig(locations = "classpath:lazy-init.xml")
class MyBeanPrototypeTest {
    // @Autowired
    // private MyBeanPrototype myBeanPrototype;

    @Test
    void test(){
        // System.out.println(myBeanPrototype);
    }
}

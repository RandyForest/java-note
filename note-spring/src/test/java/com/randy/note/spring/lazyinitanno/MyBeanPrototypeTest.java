package com.randy.note.spring.lazyinitanno;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: randy
 * Date: 2019/11/15 22:32
 */
@SpringJUnitConfig(Config.class)
class MyBeanPrototypeTest {
    // @Autowired
    // MyBeanPrototype myBeanPrototype;

    @Test
    void test(){
        // 一个启动方法
    }
}

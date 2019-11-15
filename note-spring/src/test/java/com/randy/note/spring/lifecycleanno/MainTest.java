package com.randy.note.spring.lifecycleanno;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: randy
 * Date: 2019/11/15 23:56
 */
@SpringJUnitConfig(Config.class)
class MainTest {
    @Autowired
    MyBean myBean;

    /**
     * 一个启动方法
     */
    @Test
    void test(){
    }
}

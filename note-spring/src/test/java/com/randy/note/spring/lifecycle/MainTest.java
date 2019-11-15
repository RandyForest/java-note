package com.randy.note.spring.lifecycle;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: randy
 * Date: 2019/11/15 23:23
 */
@SpringJUnitConfig(locations = "classpath:life-cycle.xml")
class MainTest {
    @Autowired
    MyBean myBean;

    @Test
    void test(){

    }
}

package com.randy.note.spring.anno;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: randy
 * Date: 2019/11/7 11:07
 */
@SpringJUnitConfig(Config.class)
class SpringTest2 {
    @Autowired
    UserService userService;

    @Test
    void test(){
        userService.say();
    }
}

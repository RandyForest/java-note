package com.randy.note.spring.javacofig2;

import com.randy.note.spring.javaconfig2.service.UserService;
import com.randy.note.spring.javaconfig2.config.Config;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Date: 2019/11/8 13:57
 *
 * @author randy
 */
@SpringJUnitConfig(Config.class)
class MainTest {
    @Autowired
    UserService userService;

    @Test
    void test(){
        userService.doSomething();
    }
}

package com.randy.note.spring.javaconfig;

import com.randy.note.spring.javaconfig.config.Config;
import com.randy.note.spring.javaconfig.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Date: 2019/11/8 0:11
 *
 * @author randy
 */
@SpringJUnitConfig(Config.class)
class MainTest {
    @Autowired
    private UserService userService;

    @Test
    void test(){
        userService.doSomething();
    }
}

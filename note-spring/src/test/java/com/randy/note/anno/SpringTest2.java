package com.randy.note.anno;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: randy
 * Date: 2019/11/7 11:07
 */
@SpringJUnitConfig(Config.class)
public class SpringTest2 {
    @Autowired
    UserService userService;

    @Test
    void test(){
        userService.say();
    }
}

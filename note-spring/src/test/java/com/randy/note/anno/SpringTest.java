package com.randy.note.anno;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Author: randy
 * Date: 2019/11/7 11:07
 */
@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = Config.class)
class SpringTest {
    @Autowired
    UserService userService;

    @Test
    void test(){
        userService.say();
    }
}

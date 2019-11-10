package com.randy.note.spring.anno;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author: randy
 * Date: 2019/11/7 0:05
 */
class ConfigTest {
    @Test
    void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = applicationContext.getBean(UserServiceImpl.class);
        userService.say();
    }
}

package com.randy.note.spring.anno;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Java类配置测试
 *
 * Author: randy
 * Date: 2019/11/7 0:05
 */
class ConfigTest {
    /**
     * 使用Java类配置方法
     */
    @Test
    void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Config.class);
        UserService userService = applicationContext.getBean(UserServiceImpl.class);
        userService.say();
    }
}

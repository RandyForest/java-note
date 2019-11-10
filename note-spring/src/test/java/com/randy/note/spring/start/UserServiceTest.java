package com.randy.note.spring.start;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: randy
 * Date: 2019/10/8 14:55
 */
class UserServiceTest {
    /**
     * 测试UserService能否调用UserDao的方法
     */
    @Test
    void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./applicationContext.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.say();
    }
}

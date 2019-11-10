package com.randy.note.spring.anno;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * Author: randy
 * Date: 2019/11/6 21:53
 */
@ComponentScan
public class AnnoTest {
    @Test
   void test(){
        System.out.println("Application.main()");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
        UserService userService= applicationContext.getBean(UserServiceImpl.class);
        userService.say();
    }
}

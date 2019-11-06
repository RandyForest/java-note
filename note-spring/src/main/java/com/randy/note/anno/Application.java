package com.randy.note.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ComponentScan 扫描所有的@Component注释的类
 * Author: randy
 * Date: 2019/11/6 20:11
 */
@ComponentScan
public class Application {
    public static void main(String[] args) {
        System.out.println("Application.main()");
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Application.class);
        UserService userService= applicationContext.getBean(UserServiceImpl.class);
        userService.say();
    }
}

package com.randy.note.spring.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * 应用入口
 * 使用 @ComponentScan() 扫描所有的@Component注释的类，
 * 可以传入包名参数指定扫描哪个包下的组件，默认扫描类所在的包
 * 多个包使用basePackages关键字指定多个包
 * basePackageClasses关键字指定多个类
 *
 * 也可以用XML配置文件指定
 * 使用 context:component-scan 标签的 base-package 属性指定要扫描的包
 *
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

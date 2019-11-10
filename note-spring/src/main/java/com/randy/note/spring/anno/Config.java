package com.randy.note.spring.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Spring配置类
 * 只用在类上加入 @Configuration 与 @ComponentScan 两个注解，
 * 就可以在调用时解耦
 * 使用 @Configuration() 可以传入配置类，
 * 也可以传入XML配置文件路径，如：“classpath:applicationContext.xml”
 * Author: randy
 * Date: 2019/11/7 0:04
 */
@Configuration
@ComponentScan
public class Config {
}

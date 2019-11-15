package com.randy.note.spring.lazyinit;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Bean单例
 * 添加 @Lazy 注解开启懒实例化
 * 与 bean 的 lazy-init="true" 效果相同
 *
 * Author: randy
 * Date: 2019/11/15 17:08
 */
@Component
@Lazy
public class MyBeanSingleton {
    public MyBeanSingleton() {
        System.out.println("MyBeanSingleton被实例。");
    }
}

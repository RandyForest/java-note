package com.randy.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Author: randy
 * Date: 2019/6/15 14:30
 */

// 定义该注解可以用于什么地方
@Target({ElementType.METHOD, ElementType.TYPE})

// 定义生命周期级别
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    // 定义一个属性
    String color();

    // 定义一个属性并定义默认值
    int brightness() default 50;
}

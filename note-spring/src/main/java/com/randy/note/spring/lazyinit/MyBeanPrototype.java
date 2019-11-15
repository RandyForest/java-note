package com.randy.note.spring.lazyinit;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Bean原型作用域
 * ？无法通过设置Lazy为false关闭懒初始化
 *
 * Author: randy
 * Date: 2019/11/15 17:08
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Lazy(false)
public class MyBeanPrototype {
    public MyBeanPrototype() {
        System.out.println("MyBeanPrototype被实例。");
    }
}

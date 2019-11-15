package com.randy.note.spring.scopeanno;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Bean原型
 * 注解方式配置原型作用域
 * 在使用时创建，每创建一次，实例化一个新的对象
 *
 * Author: randy
 * Date: 2019/11/15 17:08
 */
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MyBeanPrototype {
    public MyBeanPrototype() {
        System.out.println("MyBeanPrototype被实例。");
    }
}

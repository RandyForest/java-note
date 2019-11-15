package com.randy.note.spring.scopeconfig;

import org.apache.logging.log4j.core.config.Configuration;
import org.apache.logging.log4j.core.config.ConfigurationFactory;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Bean原型
 * 在使用时创建，每创建一次，实例化一个新的对象
 *
 * Author: randy
 * Date: 2019/11/15 17:08
 */
public class MyBeanPrototype {
    public MyBeanPrototype() {
        System.out.println("MyBeanPrototype被实例。");
    }
}

package com.randy.note.spring.factory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: randy
 * Date: 2019/11/16 0:30
 */
@SpringJUnitConfig(locations = "classpath:factory.xml")
class MyBeanFactoryTest {
    /**
     * 加载配置完成时自动执行实例化 MyBeanFactory
     */
    @Test
    void testInit(){
    }

    @Autowired
    MyBean myBean;

    /**
     * 使用实例工厂方法创建实例
     * 会先实例化该工厂方法
     */
    @Test
    void test3(){
        myBean.setName("myBeanByFactory");
        System.out.println(myBean.getName());
    }

}

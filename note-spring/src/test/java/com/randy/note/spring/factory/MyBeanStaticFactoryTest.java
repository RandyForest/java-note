package com.randy.note.spring.factory;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: randy
 * Date: 2019/11/16 0:15
 */
@SpringJUnitConfig(locations = "classpath:static-factory.xml")
class MyBeanStaticFactoryTest {
    /**
     * 加载配置完成时自动执行 MyBeanStaticFactory.create()
     */
    @Test
    void testInit(){

    }

    @Autowired
    MyBean myBean;

    /**
     * 使用静态工厂方法创建实例
     */
    @Test
    void testCreate(){
        myBean.setName("myBeanByStaticFactory");
        System.out.println(myBean.getName());
    }

}

package com.randy.note.spring.scope;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: randy
 * Date: 2019/11/15 16:45
 */
class ScopeXmlTest {
    /**
     * XML方式配置单例作用域
     */
    @Test
    void testSingleton(){
         ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./scope.xml");

         MyBean myBeanSingleton1= (MyBean) applicationContext.getBean("myBeanSingleton");
         MyBean myBeanSingleton2= (MyBean) applicationContext.getBean("myBeanSingleton");

        System.out.println(myBeanSingleton1==myBeanSingleton2);
    }

    /**
     * XML方式配置原型作用域
     */
    @Test
    void testPrototype(){
         ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./scope.xml");

         MyBean myBeanPrototype1= (MyBean) applicationContext.getBean("myBeanPrototype");
         MyBean myBeanPrototype2= (MyBean) applicationContext.getBean("myBeanPrototype");

        System.out.println(myBeanPrototype1==myBeanPrototype2);
    }

}

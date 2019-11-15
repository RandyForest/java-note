package com.randy.note.spring.start;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: randy
 * Date: 2019/10/8 23:21
 */
class MyBeanTest {
    /**
     * 测试能否使用Spring创建的Bean实例并调用Bean的方法
     */
    @Test
    void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./applicationContext.xml");
        // 可以使用：指定类，指定配置的ID来设置
        MyBean myBean = (MyBean) applicationContext.getBean("myBean");
        myBean.setName("Beannnn");
        System.out.println(myBean.getName());
    }

}

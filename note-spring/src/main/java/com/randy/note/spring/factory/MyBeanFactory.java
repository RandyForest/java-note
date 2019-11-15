package com.randy.note.spring.factory;

/**
 * 定义一个实例化工厂
 *
 * Author: randy
 * Date: 2019/10/9 0:41
 */
public class MyBeanFactory {
    public MyBeanFactory(){
        System.out.println("MyBeanFactory被实例化");
    }

    /**
     * 创建一个MyBean对象
     *
     * @return MyBean对象
     */
    public MyBean create(){
        return new MyBean();
    }
}

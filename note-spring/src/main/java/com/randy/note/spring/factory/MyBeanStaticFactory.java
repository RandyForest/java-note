package com.randy.note.spring.factory;

/**
 * 定义一个静态工厂类实例MyBean
 * <p>
 * Author: randy
 * Date: 2019/10/9 0:31
 */
public class MyBeanStaticFactory {

    /**
     * 创建一个MyBean对象
     * 加载配置完成自动执行
     *
     * @return MyBean对象
     */
    public static MyBean create() {
        System.out.println("MyBeanStaticFactory.create()");
        return new MyBean();
    }
}

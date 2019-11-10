package com.randy.note.spring.start;

/**
 * 定义一个静态工厂类实例MyBean
 * <p>
 * Author: randy
 * Date: 2019/10/9 0:31
 */
public class MyBeanStaticFactory {
    /**
     * 创建一个MyBean对象
     *
     * @return MyBean对象
     */
    public static MyBean create() {
        return new MyBean();
    }
}

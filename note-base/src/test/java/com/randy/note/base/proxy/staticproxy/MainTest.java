package com.randy.note.base.proxy.staticproxy;

import org.junit.jupiter.api.Test;

/**
 * 静态代理测试
 *
 * Author: randy
 * Date: 2019/11/20 13:09
 */
public class MainTest {
    @Test
    void test(){
        ClassA classA = new ClassA();
        ClassAProxy classAProxy = new ClassAProxy();
        classAProxy.setTarget(classA);
        classAProxy.fun();
    }
}

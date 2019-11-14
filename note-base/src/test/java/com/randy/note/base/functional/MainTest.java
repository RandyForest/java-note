package com.randy.note.base.functional;

import org.junit.jupiter.api.Test;

/**
 * Author: randy
 * Date: 2019/10/21 19:30
 */
class MainTest {
    /**
     * 使用函数式接口
     * 在使用时实现接口中唯一的方法
     */
    @Test
    void test(){
        new FunctionalInterfaceA() {
            @Override
            public void fun() {
                System.out.println("FunctionalInterfaceA.fun()");
            }
        };
    }
}

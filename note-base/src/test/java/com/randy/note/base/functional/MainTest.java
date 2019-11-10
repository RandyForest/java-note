package com.randy.note.base.functional;

import org.junit.jupiter.api.Test;

/**
 * Author: randy
 * Date: 2019/10/21 19:30
 */
class MainTest {
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

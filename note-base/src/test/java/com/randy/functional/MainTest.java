package com.randy.functional;

import org.junit.jupiter.api.Test;

/**
 * Author: randy
 * Date: 2019/10/21 19:30
 */
public class MainTest {
    @Test
    void test(){
        new FunctionalInterfaceA() {
            @Override
            public void fun() {
                System.out.println("");
            }
        };
    }
}

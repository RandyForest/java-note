package com.randy.note.base.innerclass;


/**
 * Author: randy
 * Date: 2020/6/21 22:12
 */
public class A {

    void fun() {
        int a = 1;

        class InnerA {
            void fun() {
                // 使用内部类外部的变量，必须为final修饰，如果未被final修饰但之后未被修改，则被自动加上final修饰
                System.out.println(a);
            }
        }
    }
}

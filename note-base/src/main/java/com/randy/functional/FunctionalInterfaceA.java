package com.randy.functional;

/**
 * 函数式接口
 * 如果接口中只有一个方法，那么就是函数式接口。
 * 如果使用了注释 @FunctionalInterface 那么该接口中就只能定义一个方法。
 *
 * Author: randy
 * Date: 2019/6/17 17:20
 */
@FunctionalInterface
interface FunctionalInterfaceA {
    void fun();
}

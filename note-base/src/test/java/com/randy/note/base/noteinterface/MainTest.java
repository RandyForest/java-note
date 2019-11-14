package com.randy.note.base.noteinterface;

import org.junit.jupiter.api.Test;

/**
 * Author: randy
 * Date: 2019/10/21 19:00
 */
class MainTest {
    /**
     * 测试 InterfaceA
     */
    @Test
    void testInterfaceA() {
        // 调用接口 InterfaceA 的静态方法
        InterfaceA.staticFun();  // InterfaceA#staticFun()
    }

    /**
     * 测试 ClassA
     */
    @Test
    void testClassA() {
        // 调用 ClassA 中的自带的普通方法
        new ClassA().ClassAFun();    // ClassA#ClassAFun  InterfaceA#defaultFun()

        // 调用 ClassA 父接口 InterfaceA 中的默认方法 defaultFun()
        new ClassA().defaultFun();    // InterfaceA#defaultFun()

        // 调用 ClassA 父接口 InterfaceB 中的默认方法 BFun()
        new ClassA().BFun();    // InterfaceB#BFun()   InterfaceA#defaultFun()

    }
}

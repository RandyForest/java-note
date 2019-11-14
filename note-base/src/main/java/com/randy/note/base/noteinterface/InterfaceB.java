package com.randy.note.base.noteinterface;

public interface InterfaceB extends InterfaceA {
    /**
     * 定义一个默认方法
     */
    default void BFun() {
        System.out.println("InterfaceB#BFun()");

        /*
         * 调用父接口 InterfaceA 中的默认方法 defaultFun()
         * 说明默认方法可以被继承
         */
        defaultFun();
    }
}
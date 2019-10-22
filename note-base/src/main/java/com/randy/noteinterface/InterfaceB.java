package com.randy.noteinterface;

public interface InterfaceB extends InterfaceA {
    /**
     * 定义一个默认方法
     */
    default void BFun() {
        System.out.println("InterfaceB#BFun()");

        /*
         * 调用父接口 InterfaceA 中的方法 AFun2
         * 说明默认方法可以被继承
         */
        defaultFun();
    }

    @Override
    default void defaultFun() {

    }
}
package com.randy.note_interface;

public interface InterfaceB extends InterfaceA {
    default void BFun1() {
        System.out.println("InterfaceB#BFun1");

        /*
         * 调用父接口 InterfaceA 中的方法 AFun2
         */

        InterfaceA.super.AFun2();
    }
}
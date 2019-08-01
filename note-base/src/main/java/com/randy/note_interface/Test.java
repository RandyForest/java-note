package com.randy.note_interface;

/**
 * Author: randy
 * Date: 2019/6/17 16:59
 */
public class Test {
    public static void main(String[] args) {
        test1();
//        test2();
//        test3();
//        test4();
    }

    static void test1() {
        /*
         * 调用接口 InterfaceA 的静态方法
         */
        InterfaceA.AFun1();  // InterfaceA#AFun1
    }

    static void test2() {
        /*
         * 调用 ClassA 中的自带方法
         */
        new ClassA().ClassAFun1();    // ClassA#ClassAFun1  InterfaceA#AFun2

        /*
         * 调用 ClassA 父接口中的方法 AFun2
         */
        new ClassA().AFun2();    // InterfaceA#AFun2

        /*
         * 调用 ClassA 父接口中的方法 BFun1
         */
        new ClassA().BFun1();    // InterfaceB#BFun1  InterfaceA#AFun2
    }

    static void test3() {
        new InterfaceA() {
            @Override
            public void AFun3() {

            }
        }.AFun2();  // A#AFun2
    }

    static void test4() {
    }

}

package com.randy.noteinterface;

/**
 * 一个实现类
 * 实现 InterfaceA，InterfaceB 两个接口
 * 注意：两个接口中的默认方法不能重名，不然会出现二义性，调用时会报错
 */
public class ClassA implements InterfaceA, InterfaceB {

    /**
     * 定义一个普通方法
     */
    void ClassAFun() {
        System.out.println("ClassA#ClassAFun");
        // 调用父接口的父接口的方法
        InterfaceB.super.defaultFun();
    }


    /**
     * 实现时访问权限必须为 public ，因为接口的访问权限必须为 public
     */
    @Override
    public void abstractFun() {
        System.out.println("ClassA#abstractFun()");
    }

    /*
     * 普通方法中不能使用 default 修饰符
     */
    // default void d(){
    //
    // }
}
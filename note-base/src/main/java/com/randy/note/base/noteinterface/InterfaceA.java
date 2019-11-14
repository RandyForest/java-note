package com.randy.note.base.noteinterface;

/**
 * 接口中的所有方法权限修饰符隐式声明为 public
 * 接口中可以定义三种方法 静态方法，默认方法和抽象方法
 */
public interface InterfaceA {
    /**
     * 接口中的属性都隐式声明为 public static final
     * 实际为：
     * public static final int A = 1;
     */
    int A = 1;



    /**
     * 静态方法
     * 随接口存在，不能被继承
     */
    static void staticFun() {
        System.out.println("InterfaceA#staticFun()");
    }

    /**
     * 默认方法
     * 1.可以写具体实现
     * 2.调用方法：(1)实现类的实例来调用；(2)通过子接口或实现类来调用
     * 3.只能在接口中定义
     */
    default void defaultFun() {
        System.out.println("InterfaceA#defaultFun()");
    }

    /**
     * 抽象方法
     * 接口中的方法如果不是 静态方法或默认方法 就被隐式声明为 abstract
     * 实际为：
     * public abstract void abstractFun();
     */
    void abstractFun();

}
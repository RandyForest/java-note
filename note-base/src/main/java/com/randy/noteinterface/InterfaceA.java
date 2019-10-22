package com.randy.noteinterface;

public interface InterfaceA {
    /**
     * 接口中的属性都隐式声明为 public static final
     */
    public static final int A = 1;

    /*
     * 接口中的所有方法权限修饰符隐式声明为 public
     * 接口中可以定义三种方法 静态方法，默认方法和抽象方法
     */

    /**
     * 静态方法
     * 随接口存在
     */
    public static void staticFun() {
        System.out.println("InterfaceA#staticFun()");
    }

    /**
     * 默认方法
     * 可以写具体实现
     * 只能由实现类的实例来调用
     * 只能在接口中定义
     */
    public default void defaultFun() {
        System.out.println("InterfaceA#defaultFun()");
    }

    /**
     * 抽象方法
     * 接口中的方法如果不是 静态方法或默认方法 就被隐式声明为 abstract
     */
   public abstract void abstractFun();

}
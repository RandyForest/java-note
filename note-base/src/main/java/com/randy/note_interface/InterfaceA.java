package com.randy.note_interface;

public interface InterfaceA {
    /*
     * 接口中的属性都隐式声明为 public static final
     */
    public static final int A = 1;

    /*
     * 静态方法
     * 随接口存在
     */
    public static void AFun1() {
        System.out.println("InterfaceA#AFun1");
    }

    /*
     * 默认方法
     * 可以写具体实现
     */
    default void AFun2() {
        System.out.println("InterfaceA#AFun2");
    }

    void AFun3();

}
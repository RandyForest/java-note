package com.randy.note_interface;

public class ClassA implements InterfaceA, InterfaceB {

    void ClassAFun1() {
        System.out.println("ClassA#ClassAFun1");
        InterfaceB.super.AFun2();
    }


    /*
     * 实现时访问权限必须为 public ，因为接口的访问权限必须为 public
     */
    @Override
    public void AFun3() {

    }

}
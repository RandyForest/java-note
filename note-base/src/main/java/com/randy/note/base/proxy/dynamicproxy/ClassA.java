package com.randy.note.base.proxy.dynamicproxy;

/**
 * Author: randy
 * Date: 2019/11/19 13:11
 */
public class ClassA implements InterfaceA{
    @Override
    public void fun(){
        System.out.println("ClassA.fun()");
    }
}

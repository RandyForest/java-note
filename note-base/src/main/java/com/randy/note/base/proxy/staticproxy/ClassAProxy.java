package com.randy.note.base.proxy.staticproxy;

/**
 * 代理类
 * 要实现共同的接口
 * 1.传入要代理的对象
 * 2.在本类中增强方法
 *
 * Author: randy
 * Date: 2019/11/19 13:22
 */
public class ClassAProxy implements InterfaceA{

    private InterfaceA target;

    public void setTarget(ClassA target) {
        this.target = target;
    }

    @Override
    public void fun() {
        System.out.println("代理开始");
        target.fun();
        System.out.println("代理结束");
    }
}

package com.randy.note.base.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * JDK代理类
 *
 * Author: randy
 * Date: 2019/10/10 14:31
 */
public class JdkProxy implements InvocationHandler {
    private Object object;

    public void setObject(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    /**
     * 增强Object
     * 在每次调用Object方法时执行
     *
     * @param proxy 被代理的对象
     * @param method 被代理的方法
     * @param args 传入的参数
     * @return 代理后的对象
     * @throws Throwable 无法调用该方法
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(proxy);
        System.out.println(method);
        System.out.println(Arrays.toString(args));

        System.out.println("被代理前");
        // Object invoke = method.invoke(object, args);
        System.out.println("被代理后");

        return null;
    }

}

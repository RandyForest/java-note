package com.randy.note.base.proxy.dynamicproxy;

import com.randy.note.base.proxy.JdkProxy;
import org.junit.jupiter.api.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * Author: randy
 * Date: 2019/11/19 13:10
 */
public class MainTest {

    @Test
    void anonymousInnerClassProxy(){
        ClassA classA=new ClassA();
        ClassLoader classLoader = classA.getClass().getClassLoader();
        Class<?>[] interfaces = classA.getClass().getInterfaces();

        InterfaceA interfaceA = (InterfaceA) Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            /*
             * proxy 被代理的对象
             * method 被代理的接口中的方法
             * args 传入的参数
             */
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // System.out.println(proxy);
                System.out.println(method);
                System.out.println(Arrays.toString(args));

                System.out.println("代理前");
                Object invoke = method.invoke(proxy, args);
                System.out.println("代理后");
                return invoke;
            }
        });

        interfaceA.fun();
    }

    @Test
    void test(){
        JdkProxy jdkProxy = new JdkProxy();
        ClassA classA=new ClassA();
        jdkProxy.setObject(classA);

        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = jdkProxy.getObject().getClass().getInterfaces();
        // ClassA classAProxy = (ClassA) Proxy.newProxyInstance(classLoader, interfaces, jdkProxy);

        // classAProxy.fun();
    }
}

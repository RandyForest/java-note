package com.randy.note.dynamicagent;

import com.randy.note.dynamicagent.UserDao;
import com.randy.note.dynamicagent.UserDaoImpl;
import com.randy.note.dynamicagent.UserProxy;
import com.randy.note.dynamicagent.JdkProxy;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

/**
 * Author: randy
 * Date: 2019/10/10 13:40
 */
public class DynamicAgentTest {
    @Test
    void test1(){
        UserProxy userProxy = new UserProxy();
        UserDao userDao = new UserDaoImpl();
        UserDao userDaoProxy = (UserDao) userProxy.createUserDaoProxy(userDao);

        userDaoProxy.addUser();
        userDaoProxy.removeUser();
    }

    @Test
    void test2(){
        JdkProxy jdkProxy = new JdkProxy();
        UserDao userDao = new UserDaoImpl();
        jdkProxy.setObject(userDao);

        ClassLoader classLoader = this.getClass().getClassLoader();
        Class<?>[] interfaces = jdkProxy.getObject().getClass().getInterfaces();
        UserDao userDaoProxy = (UserDao) Proxy.newProxyInstance(classLoader, interfaces, jdkProxy);

        userDaoProxy.addUser();
        userDaoProxy.removeUser();
    }
}

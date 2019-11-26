package com.randy.note.spring.dynamicagent;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Proxy;

/**
 * Author: randy
 * Date: 2019/10/10 13:40
 */
class DynamicAgentTest {
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
        double f=Float.MAX_VALUE*1.1;
       long i= 2147483647+1;
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);
        System.out.println(f);
    }
}

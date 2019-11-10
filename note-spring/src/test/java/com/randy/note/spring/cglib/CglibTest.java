package com.randy.note.spring.cglib;

import org.junit.jupiter.api.Test;

/**
 * Author: randy
 * Date: 2019/10/10 15:01
 */
class CglibTest {
    @Test
    void test1() {
        CglibProxy cglibProxy = new CglibProxy();
        UserDao userDao = new UserDao();
        UserDao userDaoProxy = (UserDao) cglibProxy.create(userDao);

        userDaoProxy.addUser();
        userDaoProxy.removeUser();
    }
}

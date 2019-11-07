package com.randy.note.cglib;

import com.randy.note.cglib.CglibProxy;
import com.randy.note.cglib.UserDao;
import org.junit.jupiter.api.Test;

/**
 * Author: randy
 * Date: 2019/10/10 15:01
 */
public class CglibTest {
    @Test
    void test1() {
        CglibProxy cglibProxy = new CglibProxy();
        UserDao userDao = new UserDao();
        UserDao userDaoProxy = (UserDao) cglibProxy.create(userDao);

        userDaoProxy.addUser();
        userDaoProxy.removeUser();
    }
}

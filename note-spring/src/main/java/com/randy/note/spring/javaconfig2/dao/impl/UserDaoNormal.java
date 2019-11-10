package com.randy.note.spring.javaconfig2.dao.impl;

import com.randy.note.spring.javaconfig2.dao.UserDao;

/**
 * Date: 2019/11/8 13:49
 *
 * @author randy
 */
public class UserDaoNormal implements UserDao {
    @Override
    public void doSomething() {
        System.out.println("UserDaoNormal.doSomething()");
    }
}

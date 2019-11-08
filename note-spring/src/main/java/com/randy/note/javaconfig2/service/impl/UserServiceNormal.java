package com.randy.note.javaconfig2.service.impl;

import com.randy.note.javaconfig2.dao.UserDao;
import com.randy.note.javaconfig2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Date: 2019/11/8 0:06
 *
 * @author randy
 */
public class UserServiceNormal implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void doSomething() {
        System.out.println("UserServiceNormal.doSomething()");
        userDao.doSomething();
    }
}

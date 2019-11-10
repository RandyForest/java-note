package com.randy.note.spring.javaconfig.service.impl;

import com.randy.note.spring.javaconfig.service.UserService;

/**
 * Date: 2019/11/8 0:06
 *
 * @author randy
 */
public class UserServiceNormal implements UserService {

    @Override
    public void doSomething() {
        System.out.println("UserServiceNormal.doSomething()");
    }
}

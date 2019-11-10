package com.randy.note.spring.start;

/**
 * Author: randy
 * Date: 2019/10/8 14:12
 */
public class UserDaoImpl implements UserDao {
    /**
     * 一个简单的实现
     */
    @Override
    public void say() {
        System.out.println("UserDaoImpl.say()");
    }
}

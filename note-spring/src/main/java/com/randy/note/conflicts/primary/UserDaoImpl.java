package com.randy.note.conflicts.primary;

import org.springframework.stereotype.Component;

/**
 * 实现类1
 *
 * Author: randy
 * Date: 2019/10/8 14:12
 */
@Component
public class UserDaoImpl implements UserDao {

    public UserDaoImpl(){
        System.out.println("UserDaoImpl()");
    }

    /**
     * 一个简单的实现
     */
    @Override
    public void say() {
        System.out.println("UserDaoImpl.say()");
    }
}

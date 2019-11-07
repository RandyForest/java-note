package com.randy.note.conflicts.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 实现类1
 * @Qualifier("impl1") impl1 用于标识，在使用时指定
 *
 * Author: randy
 * Date: 2019/10/8 14:12
 */
@Component
@Qualifier("impl1")
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

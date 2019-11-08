package com.randy.note.conflicts.java;

import org.springframework.stereotype.Component;

/**
 * 实现类1
 * 使用 @Component("userDaoImpl") userDaoImpl 用于标识，
 * 默认为类名首字母小写
 * 在使用时指定，用方法与 @Qualifier 一样
 *
 * Author: randy
 * Date: 2019/10/8 14:12
 */
@Component("userDaoImpl")
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

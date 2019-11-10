package com.randy.note.spring.conflicts.java;

import org.springframework.stereotype.Component;

/**
 * 实现类2
 * 使用 @Component userDaoImpl2 用于标识，默认为类名首字母小写
 * 在使用时指定，用方法与 @Qualifier 一样
 *
 * Author: randy
 * Date: 2019/10/8 14:12
 */
@Component
public class UserDaoImpl2 implements UserDao {

    public UserDaoImpl2(){
        System.out.println("UserDaoImpl2()");
    }
    /**
     * 一个简单的实现
     */
    @Override
    public void say() {
        System.out.println("UserDaoImpl2.say()");
    }
}

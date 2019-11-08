package com.randy.note.conflicts.primary;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * 实现类2
 * 使用 @Primary 用于标识首选实现类，在使用时默认装载这个实例
 *
 * Author: randy
 * Date: 2019/10/8 14:12
 */
@Component
@Primary
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

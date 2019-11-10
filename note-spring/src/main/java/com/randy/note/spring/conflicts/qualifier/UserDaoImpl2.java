package com.randy.note.spring.conflicts.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 实现类2
 * 使用 @Qualifier("impl2") impl2 用于标识，在使用时指定
 * 未设置时默认命名为类名首字母小写
 * <p>
 * Author: randy
 * Date: 2019/10/8 14:12
 */
@Component
@Qualifier
public class UserDaoImpl2 implements UserDao {

    public UserDaoImpl2() {
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

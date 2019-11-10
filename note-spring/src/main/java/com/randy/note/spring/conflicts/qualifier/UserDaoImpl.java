package com.randy.note.spring.conflicts.qualifier;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * 实现类1
 * 使用 @Qualifier("impl1") impl1 用于标识，在使用时指定
 * 未设置时默认命名为类名首字母小写
 * 也可以不用 @Qualifier("impl1") 来定义标识，
 * 可以直接在 @Component 中定义标识，如：@Component("impl1")
 * 两种定义方法的使用方法一致
 * <p>
 * Author: randy
 * Date: 2019/10/8 14:12
 */
@Component
@Qualifier("impl1")
public class UserDaoImpl implements UserDao {

    public UserDaoImpl() {
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

package com.randy.note.spring.aspectjanno;

import org.springframework.stereotype.Repository;

/**
 * Author: randy
 * Date: 2019/10/10 13:23
 */
@Repository("userDao")
public class UserDaoImpl implements UserDao {
    @Override
    public void addUser() {
        System.out.println("添加用户");
    }

    @Override
    public void removeUser() {
        System.out.println("移除用户");

        // 制造一个异常
        // int i=1/0;
    }
}

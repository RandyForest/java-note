package com.randy.note.cglib;

/**
 * 使用CGLIB方法代理，可以不使用接口，直接使用实现类
 *
 * Author: randy
 * Date: 2019/10/10 13:23
 */
public class UserDao {
    public void addUser() {
        System.out.println("添加用户");
    }

    public void removeUser() {
        System.out.println("移除用户");
    }
}

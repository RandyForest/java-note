package com.randy.note.start;

/**
 * Author: randy
 * Date: 2019/10/8 14:47
 */
public class UserServiceImpl implements UserService {
    /**
     * 定义一个UserDao对象，Spring会根据配置给这个对象传值
     */
    private UserDao userDao;

    /**
     * 必须提供userDao的设置方法
     * @param userDao
     */
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * 调用UserDao.say()
     */
    @Override
    public void say() {
        System.out.println("UserServiceImpl.say()");

        this.userDao.say();
    }
}

package com.randy.note.conflicts.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * Author: randy
 * Date: 2019/10/8 14:47
 */
@Component
public class UserServiceImpl implements UserService {
    /**
     * 定义一个UserDao对象，Spring会根据配置给这个对象传值
     */
    private UserDao userDao;

    public UserServiceImpl(){
        System.out.println("UserServiceImpl()");
    }

    /**
     * 如果存在两个实现类，则会存在歧义，报运行时错误
     * Java方法替代@Qualifier("impl2")
     * @Resource 需要javax.annotation-api包依赖
     * @param userDao
     */
    @Autowired(required = true)
    @Resource(name = "userDaoImpl2")
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

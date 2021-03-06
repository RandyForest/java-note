package com.randy.note.spring.conflicts.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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

    public UserServiceImpl() {
        System.out.println("UserServiceImpl()");
    }

    /**
     * 如果存在两个实现类，则会存在歧义，报运行时错误
     * 当@Qualifier参数为 impl1 时，装载 UserDaoImpl 对象
     * 当@Qualifier参数为 userDaoImpl2 时，装载 UserDaoImpl2 对象
     * 注释@Qualifier也可以用于形参上
     *
     * @param userDao 用户数据访问对象
     */
    @Autowired
    @Qualifier("userDaoImpl2")
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

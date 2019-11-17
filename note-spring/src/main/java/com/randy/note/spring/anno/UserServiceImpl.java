package com.randy.note.spring.anno;

import org.springframework.beans.factory.annotation.Autowired;
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

    public UserServiceImpl(){
        System.out.println("UserServiceImpl()");
    }

    /**
     * 必须提供userDao的设置方法
     * 使用 @Autowired 为自动装载，在Spring创建这个实例时自动把UserDao装载进来
     * 自动装载一般用于属性，构造方法，set方法中，普通方法一样可以使用。
     * required关键字默认为true，当required为false时，表示不是必须的，有此组件时装载，无此组件时不装载（注意判空）
     * 如果想让没有UserDao对象时也能正常运行，改为：@Autowired(required = false)
     * 装载流程：
     * 1.先按类型匹配如果类型实例的对象唯一，则装载该对象
     * 2.如果不唯一，则按查找是否有与形参名一致的Bean的ID，如果有则装载该Bean
     *
     * @param userDao 用户数据访问对象
     */
    @Autowired()
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

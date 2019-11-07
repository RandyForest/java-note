package com.randy.note.aspectj;

import com.randy.note.aspectj.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: randy
 * Date: 2019/10/12 22:02
 */
public class AspectjTest {
    @Test
    void test1(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("./aspectj.xml");
        UserDao userDao = (UserDao) applicationContext.getBean("aspectjUserDao");

        userDao.addUser();
        System.out.println("================");
        userDao.removeUser();
    }
}

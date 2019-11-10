package com.randy.note.mybatis.example;

import com.randy.note.mybatis.example.dao.UserDao;
import com.randy.note.mybatis.example.dao.UserDaoAnno;
import com.randy.note.mybatis.example.dao.impl.UserDaoImpl;
import com.randy.note.mybatis.example.domain.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Author: randy
 * Date: 2019/7/31 23:37
 */
class MybatisTest {
    /**
     * 1. 读取配置文件
     * 2. 创建SqlSessionFactory工厂
     * 3. 使用工厂生产SqlSession对象
     * 4. 使用SqlSession创建Dao接口的代理对象
     * 5. 使用代理对象执行方法
     */
    @Test
    void test1() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();

        // 使用配置文件配置
        // UserDao userDao = session.getMapper(UserDao.class);
        // List<User> users = userDao.findAll();

        List<User> userList = session.selectList("com.randy.note.mybatis.example.mapper.UserMapper.findAll");
        for (User user : userList) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getUsername());
        }

        session.close();
        in.close();
    }

    @Test
    void test2() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();

        // 使用注解方式配置
        UserDaoAnno userDao =  session.getMapper(UserDaoAnno.class);

        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getUsername());
        }

        session.close();
        in.close();
    }

    @Test
    void test3() throws IOException {
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
        SqlSession session = factory.openSession();

        // 使用实现类方式配置
        UserDao userDao =  new UserDaoImpl(factory);

        List<User> users = userDao.findAll();
        for (User user : users) {
            System.out.println("ID: " + user.getId() + ", Name: " + user.getUsername());
        }

        session.close();
        in.close();
    }

}

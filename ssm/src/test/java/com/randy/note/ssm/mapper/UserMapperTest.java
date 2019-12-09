package com.randy.note.ssm.mapper;

import com.randy.note.ssm.dao.UserDao;
import com.randy.note.ssm.model.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Author: randy
 * Date: 2019/11/16 13:07
 */
class UserMapperTest {
    @Test
    void testQuery(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        SqlSessionFactory sqlSessionFactory =(SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("com.randy.note.ssm.dao.UserDao.query",1);
        System.out.println(user);
    }

    @Test
    void testSqlSessionFactory(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // ？ sqlSessionFactory 不是 org.mybatis.spring.SqlSessionFactoryBean
        SqlSessionFactory sqlSessionFactory =(SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);
        User user = sqlSessionTemplate.selectOne("com.randy.note.ssm.dao.UserDao.query",1);
        System.out.println(user);
    }

    @Test
    void testImpl(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao =(UserDao) applicationContext.getBean("userDao");
        User user = userDao.query(1);
        System.out.println(user);
    }

    @Test
    void testMapper(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserDao userDao =(UserDao) applicationContext.getBean("userMapper");
        User user = userDao.query(1);
        System.out.println(user);
    }

    @Test
    void testScannerMapper(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        // Bean的名称为接口名首字母小写
        UserDao userDao =(UserDao) applicationContext.getBean("userDao");
        User user = userDao.query(1);
        System.out.println(user);
    }
}

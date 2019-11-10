package com.randy.note.mybatis.start;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Author: randy
 * Date: 2019/10/23 15:28
 */
public class AliasTest {
    /**
     * 测试类别名
     * @throws IOException
     */
    @Test
    void test() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("./SqlMapConfigAlias.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("com.randy.note.mybatis.start.UserDao.queryAlias", 1);
        System.out.println(user);

        sqlSession.close();
    }

    /**
     * 测试包别名
     * @throws IOException
     */
    @Test
    void test2() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("./SqlMapConfigAlias.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("com.randy.note.mybatis.start.UserDao.queryPackage", 1);
        System.out.println(user);

        sqlSession.close();
    }
}

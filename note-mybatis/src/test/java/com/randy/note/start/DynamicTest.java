package com.randy.note.start;

import com.randy.note.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Author: randy
 * Date: 2019/10/25 20:04
 */
public class DynamicTest {
    @Test
    void test(){
        SqlSession sqlSession = MybatisUtils.OpenSqlSession();

        User user = new User();
        user.setName("a");
        user.setSex("中");

        List<User> userList = sqlSession.selectList("com.randy.note.start.UserDao.queryByFields", user);
        userList.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    void test2(){
        SqlSession sqlSession = MybatisUtils.OpenSqlSession();

        User user = new User();
        user.setName("a");
        user.setSex("中");

        List<User> userList = sqlSession.selectList("com.randy.note.start.UserDao.queryByFields2", user);
        userList.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    void test3(){
        SqlSession sqlSession = MybatisUtils.OpenSqlSession();

        User user = new User();
        // user.setId(1);
        user.setName("a");
        user.setSex("中");

        List<User> userList = sqlSession.selectList("com.randy.note.start.UserDao.queryByFields3", user);
        userList.forEach(System.out::println);
        sqlSession.close();
    }

    @Test
    void test4(){
        SqlSession sqlSession = MybatisUtils.OpenSqlSession();

        User user = new User();
        user.setId(25);
        user.setName("Ojojin");
        user.setSex("两");

        int update = sqlSession.update("com.randy.note.start.UserDao.updateByFields", user);
        sqlSession.commit();
        sqlSession.close();
        System.out.println("更新操作，更新 "+update+" 行数据。");
    }

    @Test
    void test5(){
        SqlSession sqlSession = MybatisUtils.OpenSqlSession();

        List<Integer> idList = List.of(1, 11, 22, 21, 20);
        List<User> userList= sqlSession.selectList("com.randy.note.start.UserDao.queryByIdList", idList);
        userList.forEach(System.out::println);
        sqlSession.close();
    }
}

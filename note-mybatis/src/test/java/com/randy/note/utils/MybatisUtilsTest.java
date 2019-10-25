package com.randy.note.utils;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import com.randy.note.start.User;

/**
 * Author: randy
 * Date: 2019/10/22 19:03
 */
public class MybatisUtilsTest {
    @Test
    void test() {
        SqlSession sqlSession = MybatisUtils.OpenSqlSession();
        User user = sqlSession.selectOne("com.randy.note.start.UserDao.query", 1);
        System.out.println(user);
    }
}

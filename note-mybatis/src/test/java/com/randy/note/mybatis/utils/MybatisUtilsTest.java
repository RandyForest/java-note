package com.randy.note.mybatis.utils;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import com.randy.note.mybatis.start.User;

/**
 * Author: randy
 * Date: 2019/10/22 19:03
 */
class MybatisUtilsTest {
    @Test
    void test() {
        SqlSession sqlSession = MybatisUtils.openSqlSession();
        User user = sqlSession.selectOne("com.randy.note.mybatis.start.UserDao.query", 1);
        System.out.println(user);
    }
}

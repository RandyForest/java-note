package com.randy.note.start;

import com.randy.note.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

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
    }
}

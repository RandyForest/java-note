package com.randy.note.association.manytomany;

import com.randy.note.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * Author: randy
 * Date: 2019/10/31 13:09
 */
public class MainTest {
    @Test
    void test(){
        SqlSession sqlSession = MybatisUtils.openSqlSession();
        User user = sqlSession.selectOne("com.randy.note.association.manytomany.UserMapper.query", 1);
        System.out.println(user);
    }
}

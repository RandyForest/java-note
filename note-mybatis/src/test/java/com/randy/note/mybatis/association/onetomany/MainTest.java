package com.randy.note.mybatis.association.onetomany;

import com.randy.note.mybatis.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * Author: randy
 * Date: 2019/10/31 13:09
 */
class MainTest {
    @Test
    void test(){
        SqlSession sqlSession = MybatisUtils.openSqlSession();
        User user = sqlSession.selectOne("com.randy.note.mybatis.association.onetomany.UserMapper.query", 1);
        System.out.println(user);
    }
}

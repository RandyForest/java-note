package com.randy.note.mybatis.resultmap;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import com.randy.note.mybatis.utils.MybatisUtils;

/**
 * Author: randy
 * Date: 2019/10/23 22:50
 */
class ResultMapTest {
    @Test
    void test(){
        SqlSession sqlSession = MybatisUtils.openSqlSession();
        Book book = sqlSession.selectOne("com.randy.note.mybatis.resultmap.BookDao.query", 1);
        System.out.println(book);
    }

    /**
     * 使用结果集映射方法
     */
    @Test
    void test2(){
        SqlSession sqlSession = MybatisUtils.openSqlSession();
        BookRM book = sqlSession.selectOne("com.randy.note.mybatis.resultmap.BookDao.queryRM", 1);
        System.out.println(book);
    }
}

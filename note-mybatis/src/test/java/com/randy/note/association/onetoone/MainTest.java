package com.randy.note.association.onetoone;

import com.randy.note.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Author: randy
 * Date: 2019/10/26 17:39
 */
public class MainTest {
    @Test
    void test(){
        SqlSession sqlSession = MybatisUtils.openSqlSession();
        Account account = sqlSession.selectOne("com.randy.note.association.onetoone.AccountDao.queryWithUser", 1);
        System.out.println(account);
        sqlSession.close();
    }

    @Test
    void test2(){
        SqlSession sqlSession = MybatisUtils.openSqlSession();
        Account account = sqlSession.selectOne("com.randy.note.association.onetoone.AccountDao.queryWithUser2", 1);
        System.out.println(account);
        sqlSession.close();
    }
}

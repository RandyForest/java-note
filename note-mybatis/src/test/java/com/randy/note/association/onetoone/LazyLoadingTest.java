package com.randy.note.association.onetoone;

import com.randy.note.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Author: randy
 * Date: 2019/10/27 18:46
 */
public class LazyLoadingTest {
    /**
     * 如果未配置延迟加载，两条语句都会执行
     * 如果配置了延迟加载，则只会执行一条
     * 配置了延迟加载只是用了一条SQL语句 select * from account where id = ?
     */
    @Test
    void test(){
        SqlSession sqlSession = MybatisUtils.openSqlSessionByConfig("./SqlMapConfigLazyLoading.xml");
        List<Account> accoutList = sqlSession.selectList("com.randy.note.association.onetoone.AccountDao.queryWithUser", 1);
        accoutList.forEach(account -> System.out.println(account.getId()));
        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 未配置延迟加载时使用的是两条SQL语句
     * select * from account where id = ? 和 select * from user where id=?
     */
    @Test
    void test2(){
        SqlSession sqlSession = MybatisUtils.openSqlSession();
        List<Account> accoutList = sqlSession.selectList("com.randy.note.association.onetoone.AccountDao.queryWithUser", 1);
        accoutList.forEach(account -> System.out.println(account.getId()));
        sqlSession.commit();
        sqlSession.close();
    }
}

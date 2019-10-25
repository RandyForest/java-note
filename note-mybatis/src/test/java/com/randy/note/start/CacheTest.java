package com.randy.note.start;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import com.randy.note.utils.MybatisUtils;

import java.io.IOException;
import java.io.InputStream;

/**
 * 在同个SqlSession中，查询语句相同的sql会被缓存，
 * 但是一旦执行新增或更新或删除操作，缓存就会被清除
 * <p>
 * 一级缓存
 * 本地的只在SqlSession对象中生效
 * 默认开启
 * test() 与 test2() 测试一级缓存
 * <p>
 * 二级缓存
 * 全局的，所有使用该Mapper配置文件的程序都生效
 * 需要手动开启
 * Bean类需要实现Serializable接口
  <p>
 * Author: randy
 * Date: 2019/10/22 23:01
 */
public class CacheTest {
    /**
     * 一级缓存
     */  @Test
    void test() {
        SqlSession sqlSession = MybatisUtils.OpenSqlSession();

        User user1 = sqlSession.selectOne("com.randy.note.start.UserDao.query", 1);
        System.out.println(user1);

        // 第二次查询读的是缓存
        User user2 = sqlSession.selectOne("com.randy.note.start.UserDao.query", 1);
        System.out.println(user2);

        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 一级缓存被提交时清空
     */
    @Test
    void test2() {
        SqlSession sqlSession = MybatisUtils.OpenSqlSession();

        User user1 = sqlSession.selectOne("com.randy.note.start.UserDao.query", 1);
        System.out.println(user1);

        // 提交，清缓存
        sqlSession.commit();

        // 第二次查询又用查询语句连接数据库
        User user2 = sqlSession.selectOne("com.randy.note.start.UserDao.query", 1);
        System.out.println(user2);

        sqlSession.commit();
        sqlSession.close();
    }

    /**
     * 重新创建SqlSession后一级缓存无用
     */
    @Test
    void test3(){
        SqlSession sqlSession = MybatisUtils.OpenSqlSession();

        User user1 = sqlSession.selectOne("com.randy.note.start.UserDao.query", 1);
        System.out.println(user1);

        sqlSession.commit();
        sqlSession.close();


        // 创建新SqlSession
        SqlSession sqlSession2 = MybatisUtils.OpenSqlSession();

        User user2 = sqlSession2.selectOne("com.randy.note.start.UserDao.query", 1);
        System.out.println(user2);

        sqlSession2.commit();
        sqlSession2.close();

    }

    /**
     * 使用二级缓存配置
     * 二级缓存不受SqlSession对象的影响
     * @throws IOException
     */
    @Test
    void test4() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("./SqlMapConfigCache.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        com.randy.note.cache.User user = sqlSession.selectOne("com.randy.note.cache.UserDao.query", 1);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();

        // 创建新SqlSession
        SqlSession sqlSession2 = sqlSessionFactory.openSession();
        com.randy.note.cache.User user2 = sqlSession2.selectOne("com.randy.note.cache.UserDao.query", 1);
        System.out.println(user2);
        sqlSession2.commit();
        sqlSession2.close();
    }
}

package start;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import utils.MybatisUtils;

/**
 * 在同个SqlSession中，查询语句相同的sql会被缓存，
 * 但是一旦执行新增或更新或删除操作，缓存就会被清除
 * Author: randy
 * Date: 2019/10/22 23:01
 */
public class CacheTest {
    @Test
    void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        User user1 = sqlSession.selectOne("start.UserDao.query", 1);
        System.out.println(user1);

        // 第二次查询读的是缓存
        User user2 = sqlSession.selectOne("start.UserDao.query", 1);
        System.out.println(user2);

        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    void test2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        User user1 = sqlSession.selectOne("start.UserDao.query", 1);
        System.out.println(user1);

        // 提交，清缓存
        sqlSession.commit();

        // 第二次查询又用查询语句连接数据库
        User user2 = sqlSession.selectOne("start.UserDao.query", 1);
        System.out.println(user2);

        sqlSession.commit();
        sqlSession.close();

    }
}

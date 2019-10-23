package resultmap;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import utils.MybatisUtils;

/**
 * Author: randy
 * Date: 2019/10/23 22:50
 */
public class ResultMapTest {
    @Test
    void test(){
        SqlSession sqlSession = MybatisUtils.OpenSqlSession();
        Book book = sqlSession.selectOne("resultmap.BookDao.query", 1);
        System.out.println(book);
    }

    /**
     * 使用结果集映射方法
     */
    @Test
    void test2(){
        SqlSession sqlSession = MybatisUtils.OpenSqlSession();
        BookRM book = sqlSession.selectOne("resultmap.BookDao.queryRM", 1);
        System.out.println(book);
    }
}

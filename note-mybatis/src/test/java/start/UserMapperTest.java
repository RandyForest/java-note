package start;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Author: randy
 * Date: 2019/10/19 18:08
 */
public class UserMapperTest {
    @Test
    void test() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("./SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 使用配置中的查询方法，传入 1
        User user = sqlSession.selectOne("start.UserDao.query", 1);
        System.out.println(user);

        sqlSession.close();
    }

    @Test
    void testQueryByName() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("./SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 查询名字是naa的用户
        List<Object> users = sqlSession.selectList("start.UserDao.queryByName","na");
        // 利用漏洞注入SQL
        // List<Object> users = sqlSession.selectList("start.UserDao.queryByName","na%' or 1=1#");
        // 使用代码内添加 % 的方法反注入
        // List<Object> users = sqlSession.selectList("start.UserDao.queryByName","%na% or 1=1");
        System.out.println(users);

        sqlSession.close();
    }
}

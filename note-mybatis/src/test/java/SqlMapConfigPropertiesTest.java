import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import start.User;

import java.io.IOException;
import java.io.Reader;

/**
 * Author: randy
 * Date: 2019/10/22 18:51
 */
public class SqlMapConfigPropertiesTest {
    @Test
    void test() throws IOException {
        Reader resourceAsReader = Resources.getResourceAsReader("./SqlMapConfigProperties.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsReader);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = sqlSession.selectOne("start.UserDao.query", 1);
        System.out.println(user);

        sqlSession.close();
    }
}

package start;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
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

    @Test
    void testAdd() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("./SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        // 如果数据库表的id设置为自增长，则无需定义
        // user.setId(17);
        user.setName("Naam");
        user.setPassword("nnn");
        user.setBirthday(new Date());
        user.setSex("中");
        user.setAddress("火星");

        int insert = sqlSession.insert("start.UserDao.add", user);
        System.out.println("插入操作，影响 "+insert+" 行");

        // 插入操作需要提交事务，不然不会生效
        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    void testUpdate() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("./SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        User user = new User();
        user.setId(17);
        user.setName("Naamaaa");
        user.setPassword("nnnaaa");
        user.setBirthday(new Date());
        user.setSex("两");
        user.setAddress("火星");

        int update = sqlSession.update("start.UserDao.update", user);
        System.out.println("更新操作，影响 "+update+" 行");

        sqlSession.commit();

        sqlSession.close();
    }

    @Test
    void testDelete() throws IOException {
        InputStream inputStream = Resources.getResourceAsStream("./SqlMapConfig.xml");
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        int delete = sqlSession.delete("start.UserDao.delete", 22);

        System.out.println("更新操作，影响 "+delete+" 行");

        sqlSession.commit();

        sqlSession.close();
    }
}

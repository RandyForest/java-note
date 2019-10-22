package utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * 创建一个 SqlSession 实例
 * SqlSession 的实例在同配置项目中只需要一个
 *
 * Author: randy
 * Date: 2019/10/22 18:54
 */
public class MybatisUtils {
    private static SqlSession sqlSession;

    static {
        try {
            Reader resourceAsReader = Resources.getResourceAsReader("./SqlMapConfig.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            SqlSessionFactory sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsReader);
            sqlSession = sqlSessionFactory.openSession();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession getSqlSession(){
        return sqlSession;
    }
}

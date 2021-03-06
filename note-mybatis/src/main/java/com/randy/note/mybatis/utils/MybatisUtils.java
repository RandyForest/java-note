package com.randy.note.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * 创建一个 SqlSession 实例
 * SqlSessionFactory 的实例在同配置项目中只需要一个
 * <p>
 * Author: randy
 * Date: 2019/10/22 18:54
 */
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;

    static {
        try {
            Reader resourceAsReader = Resources.getResourceAsReader("./SqlMapConfig.xml");
            SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
            sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsReader);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static SqlSession openSqlSession() {
        return sqlSessionFactory.openSession();
    }

    public static SqlSession openSqlSessionByConfig(String configPath) {
        Reader resourceAsReader = null;
        try {
            resourceAsReader = Resources.getResourceAsReader(configPath);
        } catch (IOException e) {
            System.out.println("读取配置文件出错！");
            e.printStackTrace();
        }
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        sqlSessionFactory = sqlSessionFactoryBuilder.build(resourceAsReader);

        return sqlSessionFactory.openSession();
    }
}

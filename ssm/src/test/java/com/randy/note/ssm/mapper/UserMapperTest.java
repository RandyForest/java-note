package com.randy.note.ssm.mapper;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Test;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: randy
 * Date: 2019/11/16 13:07
 */
class UserMapperTest {
    @Test
    void testQuery(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        SqlSessionFactory sqlSessionFactory =(SqlSessionFactory) applicationContext.getBean("sqlSessionFactory");
        SqlSessionTemplate sqlSessionTemplate = new SqlSessionTemplate(sqlSessionFactory);

    }
}

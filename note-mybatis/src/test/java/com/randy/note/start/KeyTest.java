package com.randy.note.start;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import com.randy.note.utils.MybatisUtils;

import java.util.Date;

/**
 * Author: randy
 * Date: 2019/10/23 16:06
 */
public class KeyTest {
    @Test
    void test(){
        SqlSession sqlSession = MybatisUtils.openSqlSession();

        User user = new User();
        // 如果数据库表的id设置为自增长，则无需定义
        // user.setId(17);
        user.setName("Wawoa");
        user.setPassword("nnnooo");
        user.setBirthday(new Date());
        user.setSex("中");
        user.setAddress("木星");

        int insert = sqlSession.insert("com.randy.note.start.UserDao.addAndGetKey", user);
        System.out.println("插入操作，影响 "+insert+" 行");
        System.out.println("新添加的用户ID为："+user.getId());

        sqlSession.commit();
        sqlSession.close();

    }
}

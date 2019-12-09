package com.randy.note.ssm.dao.impl;

import com.randy.note.ssm.dao.UserDao;
import com.randy.note.ssm.model.User;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

/**
 * Author: randy
 * Date: 2019/12/9 23:20
 */
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
    /**
     * 查询用户
     *
     * @param id 用户ID
     * @return 用户
     */
    @Override
    public User query(int id) {
        SqlSession sqlSession = getSqlSession();
        return (User) sqlSession.selectOne("com.randy.note.ssm.dao.UserDao.query", id);
    }
}

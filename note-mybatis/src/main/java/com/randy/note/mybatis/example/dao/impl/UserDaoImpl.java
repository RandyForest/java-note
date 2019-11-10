package com.randy.note.mybatis.example.dao.impl;

import com.randy.note.mybatis.example.domain.User;
import com.randy.note.mybatis.example.dao.UserDao;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * Author: randy
 * Date: 2019/8/1 22:57
 */
public class UserDaoImpl implements UserDao {
    private SqlSessionFactory factory;

    public UserDaoImpl(SqlSessionFactory factory) {
        this.factory = factory;
    }

    @Override
    public List<User> findAll() {
        SqlSession session = factory.openSession();

        // 传入的参数是配置文件中定义的 namespace + id
        return session.selectList("com.randy.note.mybatis.example.mapper.UserMapper.findAll");
    }
}


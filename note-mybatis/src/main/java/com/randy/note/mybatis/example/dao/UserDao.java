package com.randy.note.mybatis.example.dao;

import com.randy.note.mybatis.example.domain.User;

import java.util.List;

/**
 * Author: randy
 * Date: 2019/7/31 23:15
 */
public interface UserDao {
    /**
     * 查询所有操作
     * @return user 对象
     */
    List<User> findAll();
}

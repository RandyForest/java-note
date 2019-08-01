package com.randy.dao;

import com.randy.domain.User;

import java.util.List;

/**
 * Author: randy
 * Date: 2019/7/31 23:15
 */
public interface UserDao {
    /**
     * 查询所有操作
     * @return
     */
   public List<User> findAll();
}
